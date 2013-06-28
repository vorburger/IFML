/**
 */
package ifml.core.impl;

import ifml.core.CorePackage;
import ifml.core.Expression;
import ifml.core.SystemEvent;
import ifml.core.SystemEventTypeEnum;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifml.core.impl.SystemEventImpl#getTriggeringExpressions <em>Triggering Expressions</em>}</li>
 *   <li>{@link ifml.core.impl.SystemEventImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemEventImpl extends EventImpl implements SystemEvent
{
  /**
   * The cached value of the '{@link #getTriggeringExpressions() <em>Triggering Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggeringExpressions()
   * @generated
   * @ordered
   */
  protected EList<Expression> triggeringExpressions;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final SystemEventTypeEnum TYPE_EDEFAULT = SystemEventTypeEnum.TIME;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected SystemEventTypeEnum type = TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemEventImpl()
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
    return CorePackage.Literals.SYSTEM_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getTriggeringExpressions()
  {
    if (triggeringExpressions == null)
    {
      triggeringExpressions = new EObjectContainmentEList<Expression>(Expression.class, this, CorePackage.SYSTEM_EVENT__TRIGGERING_EXPRESSIONS);
    }
    return triggeringExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemEventTypeEnum getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(SystemEventTypeEnum newType)
  {
    SystemEventTypeEnum oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SYSTEM_EVENT__TYPE, oldType, type));
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
      case CorePackage.SYSTEM_EVENT__TRIGGERING_EXPRESSIONS:
        return ((InternalEList<?>)getTriggeringExpressions()).basicRemove(otherEnd, msgs);
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
      case CorePackage.SYSTEM_EVENT__TRIGGERING_EXPRESSIONS:
        return getTriggeringExpressions();
      case CorePackage.SYSTEM_EVENT__TYPE:
        return getType();
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
      case CorePackage.SYSTEM_EVENT__TRIGGERING_EXPRESSIONS:
        getTriggeringExpressions().clear();
        getTriggeringExpressions().addAll((Collection<? extends Expression>)newValue);
        return;
      case CorePackage.SYSTEM_EVENT__TYPE:
        setType((SystemEventTypeEnum)newValue);
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
      case CorePackage.SYSTEM_EVENT__TRIGGERING_EXPRESSIONS:
        getTriggeringExpressions().clear();
        return;
      case CorePackage.SYSTEM_EVENT__TYPE:
        setType(TYPE_EDEFAULT);
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
      case CorePackage.SYSTEM_EVENT__TRIGGERING_EXPRESSIONS:
        return triggeringExpressions != null && !triggeringExpressions.isEmpty();
      case CorePackage.SYSTEM_EVENT__TYPE:
        return type != TYPE_EDEFAULT;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //SystemEventImpl
