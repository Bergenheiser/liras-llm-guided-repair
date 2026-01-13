/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.Relation#getAgent <em>Agent</em>}</li>
 *   <li>{@link it.polimi.lIRAs.Relation#getTh <em>Th</em>}</li>
 * </ul>
 *
 * @see it.polimi.lIRAs.LIRAsPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject
{
  /**
   * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.lIRAs.Agent}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent</em>' containment reference list.
   * @see it.polimi.lIRAs.LIRAsPackage#getRelation_Agent()
   * @model containment="true"
   * @generated
   */
  EList<Agent> getAgent();

  /**
   * Returns the value of the '<em><b>Th</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Th</em>' attribute.
   * @see #setTh(int)
   * @see it.polimi.lIRAs.LIRAsPackage#getRelation_Th()
   * @model
   * @generated
   */
  int getTh();

  /**
   * Sets the value of the '{@link it.polimi.lIRAs.Relation#getTh <em>Th</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Th</em>' attribute.
   * @see #getTh()
   * @generated
   */
  void setTh(int value);

} // Relation
