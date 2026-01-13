/*
 * generated  by Xtext 2.41.0
 */
package it.polimi.LIRAs.ui.internal;

import com.google.inject.Guice;
import com.google.inject.Injector;
import it.polimi.LIRAsRuntimeModule;
import it.polimi.ui.LIRAsUiModule;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LIRAsActivator extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "it.polimi.LIRAs.ui";
	public static final String IT_POLIMI_LIRAS = "it.polimi.LIRAs";
	
	private static final Logger logger = Logger.getLogger(LIRAsActivator.class);
	
	private static LIRAsActivator INSTANCE;
	
	private Map<String, Injector> injectors = Collections.synchronizedMap(new HashMap<>(2));
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injectors.clear();
		INSTANCE = null;
		super.stop(context);
	}
	
	public static LIRAsActivator getInstance() {
		return INSTANCE;
	}
	
	public Injector getInjector(String language) {
		synchronized (injectors) {
			Injector injector = injectors.get(language);
			if (injector == null) {
				injectors.put(language, injector = createInjector(language));
			}
			return injector;
		}
	}
	
	protected Injector createInjector(String language) {
		try {
			com.google.inject.Module runtimeModule = getRuntimeModule(language);
			com.google.inject.Module sharedStateModule = getSharedStateModule();
			com.google.inject.Module uiModule = getUiModule(language);
			com.google.inject.Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
			return Guice.createInjector(mergedModule);
		} catch (Exception e) {
			logger.error("Failed to create injector for " + language);
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for " + language, e);
		}
	}
	
	protected com.google.inject.Module getRuntimeModule(String grammar) {
		if (IT_POLIMI_LIRAS.equals(grammar)) {
			return new LIRAsRuntimeModule();
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected com.google.inject.Module getUiModule(String grammar) {
		if (IT_POLIMI_LIRAS.equals(grammar)) {
			return new LIRAsUiModule(this);
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected com.google.inject.Module getSharedStateModule() {
		return new SharedStateModule();
	}
	
	
}
