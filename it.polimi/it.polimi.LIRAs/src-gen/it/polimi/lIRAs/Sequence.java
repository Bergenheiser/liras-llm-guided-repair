/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.Sequence#getAgent <em>Agent</em>}</li>
 *   <li>{@link it.polimi.lIRAs.Sequence#getAction <em>Action</em>}</li>
 *   <li>{@link it.polimi.lIRAs.Sequence#getSubSequence <em>Sub Sequence</em>}</li>
 * </ul>
 *
 * @see it.polimi.lIRAs.LIRAsPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends EObject
{
  /**
   * Returns the value of the '<em><b>Agent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent</em>' containment reference.
   * @see #setAgent(Agent)
   * @see it.polimi.lIRAs.LIRAsPackage#getSequence_Agent()
   * @model containment="true"
   * @generated
   */
  Agent getAgent();

  /**
   * Sets the value of the '{@link it.polimi.lIRAs.Sequence#getAgent <em>Agent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Agent</em>' containment reference.
   * @see #getAgent()
   * @generated
   */
  void setAgent(Agent value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(Action)
   * @see it.polimi.lIRAs.LIRAsPackage#getSequence_Action()
   * @model containment="true"
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link it.polimi.lIRAs.Sequence#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

  /**
   * Returns the value of the '<em><b>Sub Sequence</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.lIRAs.SubSequence}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Sequence</em>' containment reference list.
   * @see it.polimi.lIRAs.LIRAsPackage#getSequence_SubSequence()
   * @model containment="true"
   * @generated
   */
  EList<SubSequence> getSubSequence();

} // Sequence
