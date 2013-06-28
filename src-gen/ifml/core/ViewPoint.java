/**
 */
package ifml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.core.ViewPoint#getInteractionFlowModelElements <em>Interaction Flow Model Elements</em>}</li>
 *   <li>{@link ifml.core.ViewPoint#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.core.CorePackage#getViewPoint()
 * @model
 * @generated
 */
public interface ViewPoint extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Interaction Flow Model Elements</b></em>' reference list.
   * The list contents are of type {@link ifml.core.InteractionFlowModelElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interaction Flow Model Elements</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction Flow Model Elements</em>' reference list.
   * @see ifml.core.CorePackage#getViewPoint_InteractionFlowModelElements()
   * @model ordered="false"
   * @generated
   */
  EList<InteractionFlowModelElement> getInteractionFlowModelElements();

  /**
   * Returns the value of the '<em><b>Context</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' reference.
   * @see #setContext(Context)
   * @see ifml.core.CorePackage#getViewPoint_Context()
   * @model required="true"
   * @generated
   */
  Context getContext();

  /**
   * Sets the value of the '{@link ifml.core.ViewPoint#getContext <em>Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' reference.
   * @see #getContext()
   * @generated
   */
  void setContext(Context value);

} // ViewPoint
