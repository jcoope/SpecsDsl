package com.example.specs.builder.builder;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;
import org.osgi.framework.Bundle;

import com.example.library.LibraryPackage;

public class SpecsBuilder extends IncrementalProjectBuilder {

	public static final String BUILDER_ID = "com.example.specs.builder.specsBuilder";
	List<IFile> xmlModels = new ArrayList<>();

	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {
		if (kind == FULL_BUILD) {
			performTransformation();
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				performTransformation();
			} else {
				boolean onlyGenDirectoryChanged = true;
				for (IResourceDelta d : delta.getAffectedChildren()) {
					if (!d.getFullPath().lastSegment().equals("model-gen")){
						onlyGenDirectoryChanged = false;
					}
				}
				if (!onlyGenDirectoryChanged) {
					performTransformation();
				}			
			}
		}
		
		getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);

		return null;
	}

	private void performTransformation() throws CoreException {
		IProject project = getProject();
		xmlModels.clear();
		
		IFolder modelGenFolder = project.getFolder("model-gen");
		
		if (modelGenFolder.exists()) {
			modelGenFolder.delete(false, new NullProgressMonitor());
		}

		if (project.isAccessible()) {
			try {
				searchProject(project);
				
				for (IFile xmlModel : xmlModels) {
					PlainXmlModel x = new PlainXmlModel();
					x.setName("X");
					x.setFile(xmlModel.getLocation().toFile());
					x.setReadOnLoad(true);
					x.setStoredOnDisposal(false);
					x.load();

					EmfModel m = new EmfModel();
					m.setName("M");
					String emfFileName = project.getLocation().toOSString() + "\\model-gen\\" + xmlModel.getName() + ".library";
					m.setModelFile(emfFileName);
					File f = new File(emfFileName);
					if (f.exists()) {
						f.delete();
					}
					m.setMetamodelUri(LibraryPackage.eINSTANCE.getNsURI());
					m.setReadOnLoad(false);
					m.setStoredOnDisposal(true);
					m.load();

					EtlModule module = new EtlModule();
					module.getContext().getModelRepository().addModel(x);
					module.getContext().getModelRepository().addModel(m);

					Bundle bundle = Platform.getBundle("com.example.m2m");
					URL url = FileLocator.find(bundle, new Path("src/Xml2Ecore.etl"), null);

					module.parse(url.toURI());

					if (!module.getParseProblems().isEmpty()) {
						throw new Exception("Parse problems");
					}

					module.execute();

					for (IModel model : module.getContext().getModelRepository().getModels()) {
						model.dispose();
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void searchProject(IContainer container) throws CoreException, IOException {
		IResource[] members = container.members();
		for (IResource member : members) {
			if (member instanceof IContainer) {
				searchProject((IContainer) member);
			} else if (member instanceof IFile) {
				IFile f = ((IFile) member);
				if (f.getFileExtension() != null && f.getFileExtension().equals("xml")) {
					xmlModels.add(f);
				}
			}
		}
	}

}
