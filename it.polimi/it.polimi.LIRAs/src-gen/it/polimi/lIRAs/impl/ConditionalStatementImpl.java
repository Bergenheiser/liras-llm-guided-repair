/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs.impl;

import it.polimi.lIRAs.Action;
import it.polimi.lIRAs.Condition;
import it.polimi.lIRAs.ConditionalStatement;
import it.polimi.lIRAs.LIRAsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.impl.ConditionalStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.ConditionalStatementImpl#getAction <em>Action</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.ConditionalStatementImpl#getN <em>N</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalStatementImpl extends MinimalEObjectImpl.Container implements ConditionalStatement
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected EList<Condition> condition;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Action action;

  /**
   * The default value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected static final int N_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected int n = N_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalStatementImpl()
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
    return LIRAsPackage.Literals.CONDITIONAL_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Condition> getCondition()
  {
    if (condition == null)
    {
      condition = new EObjectContainmentEList<Condition>(Condition.class, this, LIRAsPackage.CONDITIONAL_STATEMENT__CONDITION);
    }
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(Action newAction, NotificationChain msgs)
  {
    Action oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LIRAsPackage.CONDITIONAL_STATEMENT__ACTION, oldAction, newAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAction(Action newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.CONDITIONAL_STATEMENT__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.CONDITIONAL_STATEMENT__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LIRAsPackage.CONDITIONAL_STATEMENT__ACTION, newAction, newAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setN(int newN)
  {
    int oldN = n;
    n = newN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LIRAsPackage.CONDITIONAL_STATEMENT__N, oldN, n));
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
      case LIRAsPackage.CONDITIONAL_STATEMENT__CONDITION:
        return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
      case LIRAsPackage.CONDITIONAL_STATEMENT__ACTION:
        return basicSetAction(null, msgs);
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
      case LIRAsPackage.CONDITIONAL_STATEMENT__CONDITION:
        return getCondition();
      case LIRAsPackage.CONDITIONAL_STATEMENT__ACTION:
        return getAction();
      case LIRAsPackage.CONDITIONAL_STATEMENT__N:
        return getN();
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
      case LIRAsPackage.CONDITIONAL_STATEMENT__CONDITION:
        getCondition().clear();
        getCondition().addAll((Collection<? extends Condition>)newValue);
        return;
      case LIRAsPackage.CONDITIONAL_STATEMENT__ACTION:
        setAction((Action)newValue);
        return;
      case LIRAsPackage.CONDITIONAL_STATEMENT__N:
        setN((Integer)newValue);
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
      case LIRAsPackage.CONDITIONAL_STATEMENT__CONDITION:
        getCondition().clear();
        return;
      case LIRAsPackage.CONDITIONAL_STATEMENT__ACTION:
        setAction((Action)null);
        return;
      case LIRAsPackage.CONDITIONAL_STATEMENT__N:
        setN(N_EDEFAULT);
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
      case LIRAsPackage.CONDITIONAL_STATEMENT__CONDITION:
        return condition != null && !condition.isEmpty();
      case LIRAsPackage.CONDITIONAL_STATEMENT__ACTION:
        return action != null;
      case LIRAsPackage.CONDITIONAL_STATEMENT__N:
        return n != N_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (n: ");
    result.append(n);
    result.append(')');
    return result.toString();
  }

} //ConditionalStatementImpl
