/**
 */
package ifml.extensions.impl;

import ifml.core.impl.ViewContainerImpl;

import ifml.extensions.ExtensionsPackage;
import ifml.extensions.Window;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifml.extensions.impl.WindowImpl#isIsXor <em>Is Xor</em>}</li>
 *   <li>{@link ifml.extensions.impl.WindowImpl#isIsModal <em>Is Modal</em>}</li>
 *   <li>{@link ifml.extensions.impl.WindowImpl#isIsNew <em>Is New</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WindowImpl extends ViewContainerImpl implements Window
{
  /**
   * The default value of the '{@link #isIsXor() <em>Is Xor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsXor()
   * @generated
   * @ordered
   */
  protected static final boolean IS_XOR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsXor() <em>Is Xor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsXor()
   * @generated
   * @ordered
   */
  protected boolean isXor = IS_XOR_EDEFAULT;

  /**
   * The default value of the '{@link #isIsModal() <em>Is Modal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsModal()
   * @generated
   * @ordered
   */
  protected static final boolean IS_MODAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsModal() <em>Is Modal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsModal()
   * @generated
   * @ordered
   */
  protected boolean isModal = IS_MODAL_EDEFAULT;

  /**
   * The default value of the '{@link #isIsNew() <em>Is New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsNew()
   * @generated
   * @ordered
   */
  protected static final boolean IS_NEW_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsNew() <em>Is New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsNew()
   * @generated
   * @ordered
   */
  protected boolean isNew = IS_NEW_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WindowImpl()
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
    return ExtensionsPackage.Literals.WINDOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsXor()
  {
    return isXor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsXor(boolean newIsXor)
  {
    boolean oldIsXor = isXor;
    isXor = newIsXor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WINDOW__IS_XOR, oldIsXor, isXor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsModal()
  {
    return isModal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsModal(boolean newIsModal)
  {
    boolean oldIsModal = isModal;
    isModal = newIsModal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WINDOW__IS_MODAL, oldIsModal, isModal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsNew()
  {
    return isNew;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsNew(boolean newIsNew)
  {
    boolean oldIsNew = isNew;
    isNew = newIsNew;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.WINDOW__IS_NEW, oldIsNew, isNew));
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
      case ExtensionsPackage.WINDOW__IS_XOR:
        return isIsXor();
      case ExtensionsPackage.WINDOW__IS_MODAL:
        return isIsModal();
      case ExtensionsPackage.WINDOW__IS_NEW:
        return isIsNew();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExtensionsPackage.WINDOW__IS_XOR:
        setIsXor((Boolean)newValue);
        return;
      case ExtensionsPackage.WINDOW__IS_MODAL:
        setIsModal((Boolean)newValue);
        return;
      case ExtensionsPackage.WINDOW__IS_NEW:
        setIsNew((Boolean)newValue);
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
      case ExtensionsPackage.WINDOW__IS_XOR:
        setIsXor(IS_XOR_EDEFAULT);
        return;
      case ExtensionsPackage.WINDOW__IS_MODAL:
        setIsModal(IS_MODAL_EDEFAULT);
        return;
      case ExtensionsPackage.WINDOW__IS_NEW:
        setIsNew(IS_NEW_EDEFAULT);
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
      case ExtensionsPackage.WINDOW__IS_XOR:
        return isXor != IS_XOR_EDEFAULT;
      case ExtensionsPackage.WINDOW__IS_MODAL:
        return isModal != IS_MODAL_EDEFAULT;
      case ExtensionsPackage.WINDOW__IS_NEW:
        return isNew != IS_NEW_EDEFAULT;
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
    result.append(" (isXor: ");
    result.append(isXor);
    result.append(", isModal: ");
    result.append(isModal);
    result.append(", isNew: ");
    result.append(isNew);
    result.append(')');
    return result.toString();
  }

} //WindowImpl
