/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.Condition#getAtomicPredicate <em>Atomic Predicate</em>}</li>
 * </ul>
 *
 * @see it.polimi.lIRAs.LIRAsPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Atomic Predicate</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.lIRAs.AtomicPredicate}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atomic Predicate</em>' containment reference list.
   * @see it.polimi.lIRAs.LIRAsPackage#getCondition_AtomicPredicate()
   * @model containment="true"
   * @generated
   */
  EList<AtomicPredicate> getAtomicPredicate();

} // Condition
