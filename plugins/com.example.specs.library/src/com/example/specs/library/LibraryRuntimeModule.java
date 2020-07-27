package com.example.specs.library;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class LibraryRuntimeModule extends AbstractGenericResourceRuntimeModule{

	@Override
	protected String getLanguageName() {
		return "com.example.specs.SpecsDsl";
	}

	@Override
	protected String getFileExtensions() {
		return "library";
	}

}
