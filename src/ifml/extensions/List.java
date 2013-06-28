/**
 */
package ifml.extensions;

import ifml.core.ViewComponent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.extensions.List#getSelectEvent <em>Select Event</em>}</li>
 *   <li>{@link ifml.extensions.List#getSubmitEvent <em>Submit Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.extensions.ExtensionsPackage#getList()
 * @model
 * @generated
 */
public interface List extends ViewComponent
{
  /**
   * Returns the value of the '<em><b>Select Event</b></em>' containment reference list.
   * The list contents are of type {@link ifml.extensions.SelectEvent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select Event</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select Event</em>' containment reference list.
   * @see ifml.extensions.ExtensionsPackage#getList_SelectEvent()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<SelectEvent> getSelectEvent();

  /**
   * Returns the value of the '<em><b>Submit Event</b></em>' reference list.
   * The list contents are of type {@link ifml.extensions.SubmitEvent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Submit Event</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Submit Event</em>' reference list.
   * @see ifml.extensions.ExtensionsPackage#getList_SubmitEvent()
   * @model
   * @generated
   */
  EList<SubmitEvent> getSubmitEvent();

} // List
