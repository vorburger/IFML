/**
 */
package uml;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uml.UmlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ifml/src' modelName='IFML' importerID='org.eclipse.emf.importer.ecore'"
 * @generated
 */
public interface UmlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "uml";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.omg.org/spec/UML";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "uml";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UmlPackage eINSTANCE = uml.impl.UmlPackageImpl.init();

  /**
   * The meta object id for the '{@link uml.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.ElementImpl
   * @see uml.impl.UmlPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 2;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link uml.impl.AssociationImpl <em>Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.AssociationImpl
   * @see uml.impl.UmlPackageImpl#getAssociation()
   * @generated
   */
  int ASSOCIATION = 0;

  /**
   * The number of structural features of the '<em>Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uml.impl.ClassifierImpl <em>Classifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.ClassifierImpl
   * @see uml.impl.UmlPackageImpl#getClassifier()
   * @generated
   */
  int CLASSIFIER = 1;

  /**
   * The number of structural features of the '<em>Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uml.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.BehavioralFeatureImpl
   * @see uml.impl.UmlPackageImpl#getBehavioralFeature()
   * @generated
   */
  int BEHAVIORAL_FEATURE = 3;

  /**
   * The number of structural features of the '<em>Behavioral Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Behavioral Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link uml.impl.BehaviorImpl <em>Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.BehaviorImpl
   * @see uml.impl.UmlPackageImpl#getBehavior()
   * @generated
   */
  int BEHAVIOR = 4;

  /**
   * The number of structural features of the '<em>Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link uml.impl.TemplaetableElementImpl <em>Templaetable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.TemplaetableElementImpl
   * @see uml.impl.UmlPackageImpl#getTemplaetableElement()
   * @generated
   */
  int TEMPLAETABLE_ELEMENT = 5;

  /**
   * The number of structural features of the '<em>Templaetable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLAETABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Templaetable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLAETABLE_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uml.impl.TypedElementImpl <em>Typed Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.TypedElementImpl
   * @see uml.impl.UmlPackageImpl#getTypedElement()
   * @generated
   */
  int TYPED_ELEMENT = 6;

  /**
   * The number of structural features of the '<em>Typed Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Typed Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uml.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.MultiplicityElementImpl
   * @see uml.impl.UmlPackageImpl#getMultiplicityElement()
   * @generated
   */
  int MULTIPLICITY_ELEMENT = 7;

  /**
   * The number of structural features of the '<em>Multiplicity Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Multiplicity Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link uml.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.StructuralFeatureImpl
   * @see uml.impl.UmlPackageImpl#getStructuralFeature()
   * @generated
   */
  int STRUCTURAL_FEATURE = 8;

  /**
   * The number of structural features of the '<em>Structural Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_FEATURE_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Structural Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_FEATURE_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link uml.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Association</em>'.
   * @see uml.Association
   * @generated
   */
  EClass getAssociation();

  /**
   * Returns the meta object for class '{@link uml.Classifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier</em>'.
   * @see uml.Classifier
   * @generated
   */
  EClass getClassifier();

  /**
   * Returns the meta object for class '{@link uml.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see uml.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for class '{@link uml.BehavioralFeature <em>Behavioral Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavioral Feature</em>'.
   * @see uml.BehavioralFeature
   * @generated
   */
  EClass getBehavioralFeature();

  /**
   * Returns the meta object for class '{@link uml.Behavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavior</em>'.
   * @see uml.Behavior
   * @generated
   */
  EClass getBehavior();

  /**
   * Returns the meta object for class '{@link uml.TemplaetableElement <em>Templaetable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Templaetable Element</em>'.
   * @see uml.TemplaetableElement
   * @generated
   */
  EClass getTemplaetableElement();

  /**
   * Returns the meta object for class '{@link uml.TypedElement <em>Typed Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typed Element</em>'.
   * @see uml.TypedElement
   * @generated
   */
  EClass getTypedElement();

  /**
   * Returns the meta object for class '{@link uml.MultiplicityElement <em>Multiplicity Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicity Element</em>'.
   * @see uml.MultiplicityElement
   * @generated
   */
  EClass getMultiplicityElement();

  /**
   * Returns the meta object for class '{@link uml.StructuralFeature <em>Structural Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structural Feature</em>'.
   * @see uml.StructuralFeature
   * @generated
   */
  EClass getStructuralFeature();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  UmlFactory getUmlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uml.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.AssociationImpl
     * @see uml.impl.UmlPackageImpl#getAssociation()
     * @generated
     */
    EClass ASSOCIATION = eINSTANCE.getAssociation();

    /**
     * The meta object literal for the '{@link uml.impl.ClassifierImpl <em>Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.ClassifierImpl
     * @see uml.impl.UmlPackageImpl#getClassifier()
     * @generated
     */
    EClass CLASSIFIER = eINSTANCE.getClassifier();

    /**
     * The meta object literal for the '{@link uml.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.ElementImpl
     * @see uml.impl.UmlPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '{@link uml.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.BehavioralFeatureImpl
     * @see uml.impl.UmlPackageImpl#getBehavioralFeature()
     * @generated
     */
    EClass BEHAVIORAL_FEATURE = eINSTANCE.getBehavioralFeature();

    /**
     * The meta object literal for the '{@link uml.impl.BehaviorImpl <em>Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.BehaviorImpl
     * @see uml.impl.UmlPackageImpl#getBehavior()
     * @generated
     */
    EClass BEHAVIOR = eINSTANCE.getBehavior();

    /**
     * The meta object literal for the '{@link uml.impl.TemplaetableElementImpl <em>Templaetable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.TemplaetableElementImpl
     * @see uml.impl.UmlPackageImpl#getTemplaetableElement()
     * @generated
     */
    EClass TEMPLAETABLE_ELEMENT = eINSTANCE.getTemplaetableElement();

    /**
     * The meta object literal for the '{@link uml.impl.TypedElementImpl <em>Typed Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.TypedElementImpl
     * @see uml.impl.UmlPackageImpl#getTypedElement()
     * @generated
     */
    EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

    /**
     * The meta object literal for the '{@link uml.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.MultiplicityElementImpl
     * @see uml.impl.UmlPackageImpl#getMultiplicityElement()
     * @generated
     */
    EClass MULTIPLICITY_ELEMENT = eINSTANCE.getMultiplicityElement();

    /**
     * The meta object literal for the '{@link uml.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.StructuralFeatureImpl
     * @see uml.impl.UmlPackageImpl#getStructuralFeature()
     * @generated
     */
    EClass STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeature();

  }

} //UmlPackage
