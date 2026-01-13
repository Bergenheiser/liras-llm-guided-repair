/*
 * generated  by Xtext 2.41.0
 */
package it.polimi.ui.tests;

import com.google.inject.Injector;
import it.polimi.LIRAs.ui.internal.LIRAsActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class LIRAsUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return LIRAsActivator.getInstance().getInjector("it.polimi.LIRAs");
	}

}
