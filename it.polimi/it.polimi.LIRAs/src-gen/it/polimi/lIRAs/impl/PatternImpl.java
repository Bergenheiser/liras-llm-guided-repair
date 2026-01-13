/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs.impl;

import it.polimi.lIRAs.Human;
import it.polimi.lIRAs.LIRAsPackage;
import it.polimi.lIRAs.Location;
import it.polimi.lIRAs.Pattern;
import it.polimi.lIRAs.Resource;
import it.polimi.lIRAs.Robot;

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
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.impl.PatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.PatternImpl#getHuman <em>Human</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.PatternImpl#getRobot <em>Robot</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.PatternImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.PatternImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternImpl extends MinimalEObjectImpl.Container implements Pattern
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getHuman() <em>Human</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHuman()
   * @generated
   * @ordered
   */
  protected EList<Human> human;

  /**
   * The cached value of the '{@link #getRobot() <em>Robot</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRobot()
   * @generated
   * @ordered
   */
  protected EList<Robot> robot;

  /**
   * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocations()
   * @generated
   * @ordered
   */
  protected EList<Location> locations;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<Resource> resources;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatternImpl()
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
    return LIRAsPackage.Literals.PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LIRAsPackage.PATTERN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Human> getHuman()
  {
    if (human == null)
    {
      human = new EObjectContainmentEList<Human>(Human.class, this, LIRAsPackage.PATTERN__HUMAN);
    }
    return human;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Robot> getRobot()
  {
    if (robot == null)
    {
      robot = new EObjectContainmentEList<Robot>(Robot.class, this, LIRAsPackage.PATTERN__ROBOT);
    }
    return robot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Location> getLocations()
  {
    if (locations == null)
    {
      locations = new EObjectContainmentEList<Location>(Location.class, this, LIRAsPackage.PATTERN__LOCATIONS);
    }
    return locations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Resource> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectContainmentEList<Resource>(Resource.class, this, LIRAsPackage.PATTERN__RESOURCES);
    }
    return resources;
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
      case LIRAsPackage.PATTERN__HUMAN:
        return ((InternalEList<?>)getHuman()).basicRemove(otherEnd, msgs);
      case LIRAsPackage.PATTERN__ROBOT:
        return ((InternalEList<?>)getRobot()).basicRemove(otherEnd, msgs);
      case LIRAsPackage.PATTERN__LOCATIONS:
        return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
      case LIRAsPackage.PATTERN__RESOURCES:
        return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
      case LIRAsPackage.PATTERN__NAME:
        return getName();
      case LIRAsPackage.PATTERN__HUMAN:
        return getHuman();
      case LIRAsPackage.PATTERN__ROBOT:
        return getRobot();
      case LIRAsPackage.PATTERN__LOCATIONS:
        return getLocations();
      case LIRAsPackage.PATTERN__RESOURCES:
        return getResources();
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
      case LIRAsPackage.PATTERN__NAME:
        setName((String)newValue);
        return;
      case LIRAsPackage.PATTERN__HUMAN:
        getHuman().clear();
        getHuman().addAll((Collection<? extends Human>)newValue);
        return;
      case LIRAsPackage.PATTERN__ROBOT:
        getRobot().clear();
        getRobot().addAll((Collection<? extends Robot>)newValue);
        return;
      case LIRAsPackage.PATTERN__LOCATIONS:
        getLocations().clear();
        getLocations().addAll((Collection<? extends Location>)newValue);
        return;
      case LIRAsPackage.PATTERN__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends Resource>)newValue);
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
      case LIRAsPackage.PATTERN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LIRAsPackage.PATTERN__HUMAN:
        getHuman().clear();
        return;
      case LIRAsPackage.PATTERN__ROBOT:
        getRobot().clear();
        return;
      case LIRAsPackage.PATTERN__LOCATIONS:
        getLocations().clear();
        return;
      case LIRAsPackage.PATTERN__RESOURCES:
        getResources().clear();
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
      case LIRAsPackage.PATTERN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LIRAsPackage.PATTERN__HUMAN:
        return human != null && !human.isEmpty();
      case LIRAsPackage.PATTERN__ROBOT:
        return robot != null && !robot.isEmpty();
      case LIRAsPackage.PATTERN__LOCATIONS:
        return locations != null && !locations.isEmpty();
      case LIRAsPackage.PATTERN__RESOURCES:
        return resources != null && !resources.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PatternImpl
