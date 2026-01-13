/*
 * generated  by Xtext 2.41.0
 */
package it.polimi.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractLIRAsValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(it.polimi.lIRAs.LIRAsPackage.eINSTANCE);
		return result;
	}
}
