/**
 */
package ifml.core;

import uml.Behavior;
import uml.BehavioralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.core.DynamicBehavior#getBehavioralFeature <em>Behavioral Feature</em>}</li>
 *   <li>{@link ifml.core.DynamicBehavior#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.core.CorePackage#getDynamicBehavior()
 * @model
 * @generated
 */
public interface DynamicBehavior extends ContentBinding
{
  /**
   * Returns the value of the '<em><b>Behavioral Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behavioral Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behavioral Feature</em>' reference.
   * @see #setBehavioralFeature(BehavioralFeature)
   * @see ifml.core.CorePackage#getDynamicBehavior_BehavioralFeature()
   * @model
   * @generated
   */
  BehavioralFeature getBehavioralFeature();

  /**
   * Sets the value of the '{@link ifml.core.DynamicBehavior#getBehavioralFeature <em>Behavioral Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Behavioral Feature</em>' reference.
   * @see #getBehavioralFeature()
   * @generated
   */
  void setBehavioralFeature(BehavioralFeature value);

  /**
   * Returns the value of the '<em><b>Behavior</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behavior</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behavior</em>' reference.
   * @see #setBehavior(Behavior)
   * @see ifml.core.CorePackage#getDynamicBehavior_Behavior()
   * @model
   * @generated
   */
  Behavior getBehavior();

  /**
   * Sets the value of the '{@link ifml.core.DynamicBehavior#getBehavior <em>Behavior</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Behavior</em>' reference.
   * @see #getBehavior()
   * @generated
   */
  void setBehavior(Behavior value);

} // DynamicBehavior
