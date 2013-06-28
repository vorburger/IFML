/**
 */
package ifml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.core.Action#getActionEvents <em>Action Events</em>}</li>
 *   <li>{@link ifml.core.Action#getDynamicBehavior <em>Dynamic Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.core.CorePackage#getAction()
 * @model
 * @generated
 */
public interface Action extends InteractionFlowElement
{
  /**
   * Returns the value of the '<em><b>Action Events</b></em>' containment reference list.
   * The list contents are of type {@link ifml.core.ActionEvent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Events</em>' containment reference list.
   * @see ifml.core.CorePackage#getAction_ActionEvents()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<ActionEvent> getActionEvents();

  /**
   * Returns the value of the '<em><b>Dynamic Behavior</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dynamic Behavior</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dynamic Behavior</em>' reference.
   * @see #setDynamicBehavior(DynamicBehavior)
   * @see ifml.core.CorePackage#getAction_DynamicBehavior()
   * @model
   * @generated
   */
  DynamicBehavior getDynamicBehavior();

  /**
   * Sets the value of the '{@link ifml.core.Action#getDynamicBehavior <em>Dynamic Behavior</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dynamic Behavior</em>' reference.
   * @see #getDynamicBehavior()
   * @generated
   */
  void setDynamicBehavior(DynamicBehavior value);

} // Action
