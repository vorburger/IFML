/**
 */
package ifml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.core.ViewElement#getViewElementEvents <em>View Element Events</em>}</li>
 *   <li>{@link ifml.core.ViewElement#getActivationExpression <em>Activation Expression</em>}</li>
 *   <li>{@link ifml.core.ViewElement#getViewContainer <em>View Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.core.CorePackage#getViewElement()
 * @model
 * @generated
 */
public interface ViewElement extends InteractionFlowElement
{
  /**
   * Returns the value of the '<em><b>View Element Events</b></em>' containment reference list.
   * The list contents are of type {@link ifml.core.ViewElementEvent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View Element Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View Element Events</em>' containment reference list.
   * @see ifml.core.CorePackage#getViewElement_ViewElementEvents()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<ViewElementEvent> getViewElementEvents();

  /**
   * Returns the value of the '<em><b>Activation Expression</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activation Expression</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activation Expression</em>' reference.
   * @see #setActivationExpression(ActivationExpression)
   * @see ifml.core.CorePackage#getViewElement_ActivationExpression()
   * @model ordered="false"
   * @generated
   */
  ActivationExpression getActivationExpression();

  /**
   * Sets the value of the '{@link ifml.core.ViewElement#getActivationExpression <em>Activation Expression</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activation Expression</em>' reference.
   * @see #getActivationExpression()
   * @generated
   */
  void setActivationExpression(ActivationExpression value);

  /**
   * Returns the value of the '<em><b>View Container</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View Container</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View Container</em>' reference.
   * @see #setViewContainer(ViewContainer)
   * @see ifml.core.CorePackage#getViewElement_ViewContainer()
   * @model
   * @generated
   */
  ViewContainer getViewContainer();

  /**
   * Sets the value of the '{@link ifml.core.ViewElement#getViewContainer <em>View Container</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View Container</em>' reference.
   * @see #getViewContainer()
   * @generated
   */
  void setViewContainer(ViewContainer value);

} // ViewElement
