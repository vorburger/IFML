/**
 */
package ifml.extensions;

import ifml.core.ViewContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.extensions.Window#isIsXor <em>Is Xor</em>}</li>
 *   <li>{@link ifml.extensions.Window#isIsModal <em>Is Modal</em>}</li>
 *   <li>{@link ifml.extensions.Window#isIsNew <em>Is New</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.extensions.ExtensionsPackage#getWindow()
 * @model
 * @generated
 */
public interface Window extends ViewContainer
{
  /**
   * Returns the value of the '<em><b>Is Xor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Xor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Xor</em>' attribute.
   * @see #setIsXor(boolean)
   * @see ifml.extensions.ExtensionsPackage#getWindow_IsXor()
   * @model unique="false"
   * @generated
   */
  boolean isIsXor();

  /**
   * Sets the value of the '{@link ifml.extensions.Window#isIsXor <em>Is Xor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Xor</em>' attribute.
   * @see #isIsXor()
   * @generated
   */
  void setIsXor(boolean value);

  /**
   * Returns the value of the '<em><b>Is Modal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Modal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Modal</em>' attribute.
   * @see #setIsModal(boolean)
   * @see ifml.extensions.ExtensionsPackage#getWindow_IsModal()
   * @model unique="false"
   * @generated
   */
  boolean isIsModal();

  /**
   * Sets the value of the '{@link ifml.extensions.Window#isIsModal <em>Is Modal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Modal</em>' attribute.
   * @see #isIsModal()
   * @generated
   */
  void setIsModal(boolean value);

  /**
   * Returns the value of the '<em><b>Is New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is New</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is New</em>' attribute.
   * @see #setIsNew(boolean)
   * @see ifml.extensions.ExtensionsPackage#getWindow_IsNew()
   * @model unique="false"
   * @generated
   */
  boolean isIsNew();

  /**
   * Sets the value of the '{@link ifml.extensions.Window#isIsNew <em>Is New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is New</em>' attribute.
   * @see #isIsNew()
   * @generated
   */
  void setIsNew(boolean value);

} // Window
