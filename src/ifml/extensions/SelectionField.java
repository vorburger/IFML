/**
 */
package ifml.extensions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.extensions.SelectionField#isIsMultiSelection <em>Is Multi Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.extensions.ExtensionsPackage#getSelectionField()
 * @model
 * @generated
 */
public interface SelectionField extends Field
{
  /**
   * Returns the value of the '<em><b>Is Multi Selection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Multi Selection</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Multi Selection</em>' attribute.
   * @see #setIsMultiSelection(boolean)
   * @see ifml.extensions.ExtensionsPackage#getSelectionField_IsMultiSelection()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
  boolean isIsMultiSelection();

  /**
   * Sets the value of the '{@link ifml.extensions.SelectionField#isIsMultiSelection <em>Is Multi Selection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Multi Selection</em>' attribute.
   * @see #isIsMultiSelection()
   * @generated
   */
  void setIsMultiSelection(boolean value);

} // SelectionField
