/**
 */
package ifml.extensions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.extensions.SortAttribute#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.extensions.ExtensionsPackage#getSortAttribute()
 * @model
 * @generated
 */
public interface SortAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Order</b></em>' attribute.
   * The literals are from the enumeration {@link ifml.extensions.SortOrderEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order</em>' attribute.
   * @see ifml.extensions.SortOrderEnum
   * @see #setOrder(SortOrderEnum)
   * @see ifml.extensions.ExtensionsPackage#getSortAttribute_Order()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
  SortOrderEnum getOrder();

  /**
   * Sets the value of the '{@link ifml.extensions.SortAttribute#getOrder <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Order</em>' attribute.
   * @see ifml.extensions.SortOrderEnum
   * @see #getOrder()
   * @generated
   */
  void setOrder(SortOrderEnum value);

} // SortAttribute
