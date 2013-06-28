/**
 */
package ifml.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.core.Element#getId <em>Id</em>}</li>
 *   <li>{@link ifml.core.Element#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link ifml.core.Element#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.core.CorePackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see ifml.core.CorePackage#getElement_Id()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link ifml.core.Element#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link ifml.core.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see ifml.core.CorePackage#getElement_Constraints()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Constraint> getConstraints();

  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link ifml.core.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see ifml.core.CorePackage#getElement_Annotations()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Annotation> getAnnotations();

} // Element
