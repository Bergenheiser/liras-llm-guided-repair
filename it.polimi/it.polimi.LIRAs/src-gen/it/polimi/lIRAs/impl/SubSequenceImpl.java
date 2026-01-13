/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs.impl;

import it.polimi.lIRAs.Action;
import it.polimi.lIRAs.ConditionalStatement;
import it.polimi.lIRAs.LIRAsPackage;
import it.polimi.lIRAs.Loop;
import it.polimi.lIRAs.SubSequence;

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
 * An implementation of the model object '<em><b>Sub Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.impl.SubSequenceImpl#getI <em>I</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.SubSequenceImpl#getJ <em>J</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.SubSequenceImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.SubSequenceImpl#getAction <em>Action</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.SubSequenceImpl#getConditionalStatement <em>Conditional Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubSequenceImpl extends MinimalEObjectImpl.Container implements SubSequence
{
  /**
   * The default value of the '{@link #getI() <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected static final int I_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getI() <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected int i = I_EDEFAULT;

  /**
   * The default value of the '{@link #getJ() <em>J</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJ()
   * @generated
   * @ordered
   */
  protected static final int J_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getJ() <em>J</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJ()
   * @generated
   * @ordered
   */
  protected int j = J_EDEFAULT;

  /**
   * The cached value of the '{@link #getLoop() <em>Loop</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoop()
   * @generated
   * @ordered
   */
  protected EList<Loop> loop;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected EList<Action> action;

  /**
   * The cached value of the '{@link #getConditionalStatement() <em>Conditional Statement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionalStatement()
   * @generated
   * @ordered
   */
  protected EList<ConditionalStatement> conditionalStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubSequenceImpl()
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
    return LIRAsPackage.Literals.SUB_SEQUENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getI()
  {
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setI(int newI)
  {
    int oldI = i;
    i = newI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LIRAsPackage.SUB_SEQUENCE__I, oldI, i));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getJ()
  {
    return j;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setJ(int newJ)
  {
    int oldJ = j;
    j = newJ;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LIRAsPackage.SUB_SEQUENCE__J, oldJ, j));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Loop> getLoop()
  {
    if (loop == null)
    {
      loop = new EObjectContainmentEList<Loop>(Loop.class, this, LIRAsPackage.SUB_SEQUENCE__LOOP);
    }
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Action> getAction()
  {
    if (action == null)
    {
      action = new EObjectContainmentEList<Action>(Action.class, this, LIRAsPackage.SUB_SEQUENCE__ACTION);
    }
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ConditionalStatement> getConditionalStatement()
  {
    if (conditionalStatement == null)
    {
      conditionalStatement = new EObjectContainmentEList<ConditionalStatement>(ConditionalStatement.class, this, LIRAsPackage.SUB_SEQUENCE__CONDITIONAL_STATEMENT);
    }
    return conditionalStatement;
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
      case LIRAsPackage.SUB_SEQUENCE__LOOP:
        return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
      case LIRAsPackage.SUB_SEQUENCE__ACTION:
        return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
      case LIRAsPackage.SUB_SEQUENCE__CONDITIONAL_STATEMENT:
        return ((InternalEList<?>)getConditionalStatement()).basicRemove(otherEnd, msgs);
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
      case LIRAsPackage.SUB_SEQUENCE__I:
        return getI();
      case LIRAsPackage.SUB_SEQUENCE__J:
        return getJ();
      case LIRAsPackage.SUB_SEQUENCE__LOOP:
        return getLoop();
      case LIRAsPackage.SUB_SEQUENCE__ACTION:
        return getAction();
      case LIRAsPackage.SUB_SEQUENCE__CONDITIONAL_STATEMENT:
        return getConditionalStatement();
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
      case LIRAsPackage.SUB_SEQUENCE__I:
        setI((Integer)newValue);
        return;
      case LIRAsPackage.SUB_SEQUENCE__J:
        setJ((Integer)newValue);
        return;
      case LIRAsPackage.SUB_SEQUENCE__LOOP:
        getLoop().clear();
        getLoop().addAll((Collection<? extends Loop>)newValue);
        return;
      case LIRAsPackage.SUB_SEQUENCE__ACTION:
        getAction().clear();
        getAction().addAll((Collection<? extends Action>)newValue);
        return;
      case LIRAsPackage.SUB_SEQUENCE__CONDITIONAL_STATEMENT:
        getConditionalStatement().clear();
        getConditionalStatement().addAll((Collection<? extends ConditionalStatement>)newValue);
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
      case LIRAsPackage.SUB_SEQUENCE__I:
        setI(I_EDEFAULT);
        return;
      case LIRAsPackage.SUB_SEQUENCE__J:
        setJ(J_EDEFAULT);
        return;
      case LIRAsPackage.SUB_SEQUENCE__LOOP:
        getLoop().clear();
        return;
      case LIRAsPackage.SUB_SEQUENCE__ACTION:
        getAction().clear();
        return;
      case LIRAsPackage.SUB_SEQUENCE__CONDITIONAL_STATEMENT:
        getConditionalStatement().clear();
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
      case LIRAsPackage.SUB_SEQUENCE__I:
        return i != I_EDEFAULT;
      case LIRAsPackage.SUB_SEQUENCE__J:
        return j != J_EDEFAULT;
      case LIRAsPackage.SUB_SEQUENCE__LOOP:
        return loop != null && !loop.isEmpty();
      case LIRAsPackage.SUB_SEQUENCE__ACTION:
        return action != null && !action.isEmpty();
      case LIRAsPackage.SUB_SEQUENCE__CONDITIONAL_STATEMENT:
        return conditionalStatement != null && !conditionalStatement.isEmpty();
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
    result.append(" (i: ");
    result.append(i);
    result.append(", j: ");
    result.append(j);
    result.append(')');
    return result.toString();
  }

} //SubSequenceImpl
