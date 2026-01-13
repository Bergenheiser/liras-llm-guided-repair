/*
 * generated  by Xtext 2.41.0
 */
package it.polimi.ui;

import com.google.inject.Injector;
import it.polimi.LIRAs.ui.internal.LIRAsActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LIRAsExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(LIRAsActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		LIRAsActivator activator = LIRAsActivator.getInstance();
		return activator != null ? activator.getInjector(LIRAsActivator.IT_POLIMI_LIRAS) : null;
	}

}
