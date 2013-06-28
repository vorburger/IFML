/**
 */
package ifml.core.impl;

import ifml.core.CorePackage;
import ifml.core.ViewContainer;
import ifml.core.ViewElement;

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
 * An implementation of the model object '<em><b>View Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifml.core.impl.ViewContainerImpl#isIsLandMark <em>Is Land Mark</em>}</li>
 *   <li>{@link ifml.core.impl.ViewContainerImpl#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link ifml.core.impl.ViewContainerImpl#getViewElements <em>View Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewContainerImpl extends ViewElementImpl implements ViewContainer
{
  /**
   * The default value of the '{@link #isIsLandMark() <em>Is Land Mark</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsLandMark()
   * @generated
   * @ordered
   */
  protected static final boolean IS_LAND_MARK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsLandMark() <em>Is Land Mark</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsLandMark()
   * @generated
   * @ordered
   */
  protected boolean isLandMark = IS_LAND_MARK_EDEFAULT;

  /**
   * The default value of the '{@link #isIsDefault() <em>Is Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDefault()
   * @generated
   * @ordered
   */
  protected static final boolean IS_DEFAULT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsDefault() <em>Is Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDefault()
   * @generated
   * @ordered
   */
  protected boolean isDefault = IS_DEFAULT_EDEFAULT;

  /**
   * The cached value of the '{@link #getViewElements() <em>View Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewElements()
   * @generated
   * @ordered
   */
  protected EList<ViewElement> viewElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewContainerImpl()
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
    return CorePackage.Literals.VIEW_CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsLandMark()
  {
    return isLandMark;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsLandMark(boolean newIsLandMark)
  {
    boolean oldIsLandMark = isLandMark;
    isLandMark = newIsLandMark;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIEW_CONTAINER__IS_LAND_MARK, oldIsLandMark, isLandMark));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsDefault()
  {
    return isDefault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsDefault(boolean newIsDefault)
  {
    boolean oldIsDefault = isDefault;
    isDefault = newIsDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIEW_CONTAINER__IS_DEFAULT, oldIsDefault, isDefault));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ViewElement> getViewElements()
  {
    if (viewElements == null)
    {
      viewElements = new EObjectContainmentEList<ViewElement>(ViewElement.class, this, CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS);
    }
    return viewElements;
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
      case CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS:
        return ((InternalEList<?>)getViewElements()).basicRemove(otherEnd, msgs);
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
      case CorePackage.VIEW_CONTAINER__IS_LAND_MARK:
        return isIsLandMark();
      case CorePackage.VIEW_CONTAINER__IS_DEFAULT:
        return isIsDefault();
      case CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS:
        return getViewElements();
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
      case CorePackage.VIEW_CONTAINER__IS_LAND_MARK:
        setIsLandMark((Boolean)newValue);
        return;
      case CorePackage.VIEW_CONTAINER__IS_DEFAULT:
        setIsDefault((Boolean)newValue);
        return;
      case CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS:
        getViewElements().clear();
        getViewElements().addAll((Collection<? extends ViewElement>)newValue);
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
      case CorePackage.VIEW_CONTAINER__IS_LAND_MARK:
        setIsLandMark(IS_LAND_MARK_EDEFAULT);
        return;
      case CorePackage.VIEW_CONTAINER__IS_DEFAULT:
        setIsDefault(IS_DEFAULT_EDEFAULT);
        return;
      case CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS:
        getViewElements().clear();
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
      case CorePackage.VIEW_CONTAINER__IS_LAND_MARK:
        return isLandMark != IS_LAND_MARK_EDEFAULT;
      case CorePackage.VIEW_CONTAINER__IS_DEFAULT:
        return isDefault != IS_DEFAULT_EDEFAULT;
      case CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS:
        return viewElements != null && !viewElements.isEmpty();
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
    result.append(" (isLandMark: ");
    result.append(isLandMark);
    result.append(", isDefault: ");
    result.append(isDefault);
    result.append(')');
    return result.toString();
  }

} //ViewContainerImpl
