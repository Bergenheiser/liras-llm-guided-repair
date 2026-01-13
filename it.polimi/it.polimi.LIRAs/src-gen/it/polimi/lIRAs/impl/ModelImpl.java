/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs.impl;

import it.polimi.lIRAs.Conclusion;
import it.polimi.lIRAs.LIRAsPackage;
import it.polimi.lIRAs.Model;
import it.polimi.lIRAs.Pattern;
import it.polimi.lIRAs.Sequence;

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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.impl.ModelImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.ModelImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.ModelImpl#getConclusion <em>Conclusion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected Pattern pattern;

  /**
   * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequence()
   * @generated
   * @ordered
   */
  protected EList<Sequence> sequence;

  /**
   * The cached value of the '{@link #getConclusion() <em>Conclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConclusion()
   * @generated
   * @ordered
   */
  protected Conclusion conclusion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return LIRAsPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pattern getPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs)
  {
    Pattern oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LIRAsPackage.MODEL__PATTERN, oldPattern, newPattern);
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
  public void setPattern(Pattern newPattern)
  {
    if (newPattern != pattern)
    {
      NotificationChain msgs = null;
      if (pattern != null)
        msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.MODEL__PATTERN, null, msgs);
      if (newPattern != null)
        msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.MODEL__PATTERN, null, msgs);
      msgs = basicSetPattern(newPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LIRAsPackage.MODEL__PATTERN, newPattern, newPattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Sequence> getSequence()
  {
    if (sequence == null)
    {
      sequence = new EObjectContainmentEList<Sequence>(Sequence.class, this, LIRAsPackage.MODEL__SEQUENCE);
    }
    return sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Conclusion getConclusion()
  {
    return conclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConclusion(Conclusion newConclusion, NotificationChain msgs)
  {
    Conclusion oldConclusion = conclusion;
    conclusion = newConclusion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LIRAsPackage.MODEL__CONCLUSION, oldConclusion, newConclusion);
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
  public void setConclusion(Conclusion newConclusion)
  {
    if (newConclusion != conclusion)
    {
      NotificationChain msgs = null;
      if (conclusion != null)
        msgs = ((InternalEObject)conclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.MODEL__CONCLUSION, null, msgs);
      if (newConclusion != null)
        msgs = ((InternalEObject)newConclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.MODEL__CONCLUSION, null, msgs);
      msgs = basicSetConclusion(newConclusion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LIRAsPackage.MODEL__CONCLUSION, newConclusion, newConclusion));
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
      case LIRAsPackage.MODEL__PATTERN:
        return basicSetPattern(null, msgs);
      case LIRAsPackage.MODEL__SEQUENCE:
        return ((InternalEList<?>)getSequence()).basicRemove(otherEnd, msgs);
      case LIRAsPackage.MODEL__CONCLUSION:
        return basicSetConclusion(null, msgs);
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
      case LIRAsPackage.MODEL__PATTERN:
        return getPattern();
      case LIRAsPackage.MODEL__SEQUENCE:
        return getSequence();
      case LIRAsPackage.MODEL__CONCLUSION:
        return getConclusion();
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
      case LIRAsPackage.MODEL__PATTERN:
        setPattern((Pattern)newValue);
        return;
      case LIRAsPackage.MODEL__SEQUENCE:
        getSequence().clear();
        getSequence().addAll((Collection<? extends Sequence>)newValue);
        return;
      case LIRAsPackage.MODEL__CONCLUSION:
        setConclusion((Conclusion)newValue);
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
      case LIRAsPackage.MODEL__PATTERN:
        setPattern((Pattern)null);
        return;
      case LIRAsPackage.MODEL__SEQUENCE:
        getSequence().clear();
        return;
      case LIRAsPackage.MODEL__CONCLUSION:
        setConclusion((Conclusion)null);
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
      case LIRAsPackage.MODEL__PATTERN:
        return pattern != null;
      case LIRAsPackage.MODEL__SEQUENCE:
        return sequence != null && !sequence.isEmpty();
      case LIRAsPackage.MODEL__CONCLUSION:
        return conclusion != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
