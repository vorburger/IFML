/**
 */
package ifml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.core.ViewComponent#getViewComponentParts <em>View Component Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.core.CorePackage#getViewComponent()
 * @model
 * @generated
 */
public interface ViewComponent extends ViewElement
{
  /**
   * Returns the value of the '<em><b>View Component Parts</b></em>' containment reference list.
   * The list contents are of type {@link ifml.core.ViewComponentPart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View Component Parts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View Component Parts</em>' containment reference list.
   * @see ifml.core.CorePackage#getViewComponent_ViewComponentParts()
   * @model containment="true"
   * @generated
   */
  EList<ViewComponentPart> getViewComponentParts();

} // ViewComponent
