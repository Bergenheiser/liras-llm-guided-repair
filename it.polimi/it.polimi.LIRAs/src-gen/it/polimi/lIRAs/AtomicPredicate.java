/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.AtomicPredicate#getN <em>N</em>}</li>
 *   <li>{@link it.polimi.lIRAs.AtomicPredicate#getAgent <em>Agent</em>}</li>
 *   <li>{@link it.polimi.lIRAs.AtomicPredicate#getLocation <em>Location</em>}</li>
 *   <li>{@link it.polimi.lIRAs.AtomicPredicate#getResource <em>Resource</em>}</li>
 *   <li>{@link it.polimi.lIRAs.AtomicPredicate#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @see it.polimi.lIRAs.LIRAsPackage#getAtomicPredicate()
 * @model
 * @generated
 */
public interface AtomicPredicate extends EObject
{
  /**
   * Returns the value of the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute.
   * @see #setN(int)
   * @see it.polimi.lIRAs.LIRAsPackage#getAtomicPredicate_N()
   * @model
   * @generated
   */
  int getN();

  /**
   * Sets the value of the '{@link it.polimi.lIRAs.AtomicPredicate#getN <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' attribute.
   * @see #getN()
   * @generated
   */
  void setN(int value);

  /**
   * Returns the value of the '<em><b>Agent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent</em>' containment reference.
   * @see #setAgent(Agent)
   * @see it.polimi.lIRAs.LIRAsPackage#getAtomicPredicate_Agent()
   * @model containment="true"
   * @generated
   */
  Agent getAgent();

  /**
   * Sets the value of the '{@link it.polimi.lIRAs.AtomicPredicate#getAgent <em>Agent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Agent</em>' containment reference.
   * @see #getAgent()
   * @generated
   */
  void setAgent(Agent value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' containment reference.
   * @see #setLocation(Location)
   * @see it.polimi.lIRAs.LIRAsPackage#getAtomicPredicate_Location()
   * @model containment="true"
   * @generated
   */
  Location getLocation();

  /**
   * Sets the value of the '{@link it.polimi.lIRAs.AtomicPredicate#getLocation <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' containment reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(Location value);

  /**
   * Returns the value of the '<em><b>Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' containment reference.
   * @see #setResource(Resource)
   * @see it.polimi.lIRAs.LIRAsPackage#getAtomicPredicate_Resource()
   * @model containment="true"
   * @generated
   */
  Resource getResource();

  /**
   * Sets the value of the '{@link it.polimi.lIRAs.AtomicPredicate#getResource <em>Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' containment reference.
   * @see #getResource()
   * @generated
   */
  void setResource(Resource value);

  /**
   * Returns the value of the '<em><b>Relation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' containment reference.
   * @see #setRelation(Relation)
   * @see it.polimi.lIRAs.LIRAsPackage#getAtomicPredicate_Relation()
   * @model containment="true"
   * @generated
   */
  Relation getRelation();

  /**
   * Sets the value of the '{@link it.polimi.lIRAs.AtomicPredicate#getRelation <em>Relation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation</em>' containment reference.
   * @see #getRelation()
   * @generated
   */
  void setRelation(Relation value);

} // AtomicPredicate
