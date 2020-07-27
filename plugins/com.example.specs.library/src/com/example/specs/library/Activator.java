package com.example.specs.library;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.util.Modules;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.example.specs.integration"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private Injector injector;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		try {
			initialiseEcoreInjector();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		injector = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	public Injector getInjector() {
		return injector;
	}

	private void initialiseEcoreInjector() {
		injector = Guice
				.createInjector(Modules.override(Modules.override(new LibraryRuntimeModule()).with(new LibraryUiModule(plugin)))
						.with(new SharedStateModule()));
	}
	

}
