/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.Conclusion#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see it.polimi.lIRAs.LIRAsPackage#getConclusion()
 * @model
 * @generated
 */
public interface Conclusion extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.lIRAs.Condition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference list.
   * @see it.polimi.lIRAs.LIRAsPackage#getConclusion_Condition()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getCondition();

} // Conclusion
