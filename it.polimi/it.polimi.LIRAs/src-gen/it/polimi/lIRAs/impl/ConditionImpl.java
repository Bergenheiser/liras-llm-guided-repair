/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs.impl;

import it.polimi.lIRAs.AtomicPredicate;
import it.polimi.lIRAs.Condition;
import it.polimi.lIRAs.LIRAsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.impl.ConditionImpl#getAtomicPredicate <em>Atomic Predicate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition
{
  /**
   * The cached value of the '{@link #getAtomicPredicate() <em>Atomic Predicate</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtomicPredicate()
   * @generated
   * @ordered
   */
  protected EList<AtomicPredicate> atomicPredicate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LIRAsPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AtomicPredicate> getAtomicPredicate()
  {
    if (atomicPredicate == null)
    {
      atomicPredicate = new EObjectContainmentEList<AtomicPredicate>(AtomicPredicate.class, this, LIRAsPackage.CONDITION__ATOMIC_PREDICATE);
    }
    return atomicPredicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LIRAsPackage.CONDITION__ATOMIC_PREDICATE:
        return ((InternalEList<?>)getAtomicPredicate()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LIRAsPackage.CONDITION__ATOMIC_PREDICATE:
        return getAtomicPredicate();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LIRAsPackage.CONDITION__ATOMIC_PREDICATE:
        getAtomicPredicate().clear();
        getAtomicPredicate().addAll((Collection<? extends AtomicPredicate>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LIRAsPackage.CONDITION__ATOMIC_PREDICATE:
        getAtomicPredicate().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LIRAsPackage.CONDITION__ATOMIC_PREDICATE:
        return atomicPredicate != null && !atomicPredicate.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConditionImpl
