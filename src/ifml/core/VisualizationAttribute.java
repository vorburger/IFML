/**
 */
package ifml.core;

import uml.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.core.VisualizationAttribute#getStructuralFeature <em>Structural Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.core.CorePackage#getVisualizationAttribute()
 * @model
 * @generated
 */
public interface VisualizationAttribute extends ViewComponentPart
{
  /**
   * Returns the value of the '<em><b>Structural Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structural Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structural Feature</em>' reference.
   * @see #setStructuralFeature(StructuralFeature)
   * @see ifml.core.CorePackage#getVisualizationAttribute_StructuralFeature()
   * @model
   * @generated
   */
  StructuralFeature getStructuralFeature();

  /**
   * Sets the value of the '{@link ifml.core.VisualizationAttribute#getStructuralFeature <em>Structural Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Structural Feature</em>' reference.
   * @see #getStructuralFeature()
   * @generated
   */
  void setStructuralFeature(StructuralFeature value);

} // VisualizationAttribute
