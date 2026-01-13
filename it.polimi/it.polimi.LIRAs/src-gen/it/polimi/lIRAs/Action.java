/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.Action#getTarget <em>Target</em>}</li>
 *   <li>{@link it.polimi.lIRAs.Action#getResource <em>Resource</em>}</li>
 *   <li>{@link it.polimi.lIRAs.Action#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @see it.polimi.lIRAs.LIRAsPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(Target)
   * @see it.polimi.lIRAs.LIRAsPackage#getAction_Target()
   * @model containment="true"
   * @generated
   */
  Target getTarget();

  /**
   * Sets the value of the '{@link it.polimi.lIRAs.Action#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Target value);

  /**
   * Returns the value of the '<em><b>Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' containment reference.
   * @see #setResource(Resource)
   * @see it.polimi.lIRAs.LIRAsPackage#getAction_Resource()
   * @model containment="true"
   * @generated
   */
  Resource getResource();

  /**
   * Sets the value of the '{@link it.polimi.lIRAs.Action#getResource <em>Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' containment reference.
   * @see #getResource()
   * @generated
   */
  void setResource(Resource value);

  /**
   * Returns the value of the '<em><b>Agent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent</em>' containment reference.
   * @see #setAgent(Agent)
   * @see it.polimi.lIRAs.LIRAsPackage#getAction_Agent()
   * @model containment="true"
   * @generated
   */
  Agent getAgent();

  /**
   * Sets the value of the '{@link it.polimi.lIRAs.Action#getAgent <em>Agent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Agent</em>' containment reference.
   * @see #getAgent()
   * @generated
   */
  void setAgent(Agent value);

} // Action
