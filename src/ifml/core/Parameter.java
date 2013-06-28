/**
 */
package ifml.core;

import uml.MultiplicityElement;
import uml.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.core.Parameter#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.core.CorePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends InteractionFlowModelElement, MultiplicityElement, TypedElement, NamedElement
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The default value is <code>"ordinary"</code>.
   * The literals are from the enumeration {@link ifml.core.ParameterKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see ifml.core.ParameterKind
   * @see #setKind(ParameterKind)
   * @see ifml.core.CorePackage#getParameter_Kind()
   * @model default="ordinary" unique="false" required="true" ordered="false"
   * @generated
   */
  ParameterKind getKind();

  /**
   * Sets the value of the '{@link ifml.core.Parameter#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see ifml.core.ParameterKind
   * @see #getKind()
   * @generated
   */
  void setKind(ParameterKind value);

} // Parameter
