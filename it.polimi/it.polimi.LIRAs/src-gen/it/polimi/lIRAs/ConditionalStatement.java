/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.ConditionalStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link it.polimi.lIRAs.ConditionalStatement#getAction <em>Action</em>}</li>
 *   <li>{@link it.polimi.lIRAs.ConditionalStatement#getN <em>N</em>}</li>
 * </ul>
 *
 * @see it.polimi.lIRAs.LIRAsPackage#getConditionalStatement()
 * @model
 * @generated
 */
public interface ConditionalStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.lIRAs.Condition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference list.
   * @see it.polimi.lIRAs.LIRAsPackage#getConditionalStatement_Condition()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getCondition();

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(Action)
   * @see it.polimi.lIRAs.LIRAsPackage#getConditionalStatement_Action()
   * @model containment="true"
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link it.polimi.lIRAs.ConditionalStatement#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

  /**
   * Returns the value of the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute.
   * @see #setN(int)
   * @see it.polimi.lIRAs.LIRAsPackage#getConditionalStatement_N()
   * @model
   * @generated
   */
  int getN();

  /**
   * Sets the value of the '{@link it.polimi.lIRAs.ConditionalStatement#getN <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' attribute.
   * @see #getN()
   * @generated
   */
  void setN(int value);

} // ConditionalStatement
