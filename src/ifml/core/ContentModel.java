/**
 */
package ifml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.core.ContentModel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.core.CorePackage#getContentModel()
 * @model
 * @generated
 */
public interface ContentModel extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' reference list.
   * The list contents are of type {@link uml.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' reference list.
   * @see ifml.core.CorePackage#getContentModel_Elements()
   * @model
   * @generated
   */
  EList<Element> getElements();

} // ContentModel
