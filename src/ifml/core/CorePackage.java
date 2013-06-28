/**
 */
package ifml.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see ifml.core.CoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ifml/src' modelName='IFML' importerID='org.eclipse.emf.importer.ecore' basePackage='ifml'"
 * @generated
 */
public interface CorePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "core";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.omg.org/spec/IFML/core";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "core";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CorePackage eINSTANCE = ifml.core.impl.CorePackageImpl.init();

  /**
   * The meta object id for the '{@link ifml.core.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ElementImpl
   * @see ifml.core.impl.CorePackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__ID = 0;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__CONSTRAINTS = 1;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__ANNOTATIONS = 2;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.NamedElementImpl
   * @see ifml.core.impl.CorePackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 16;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__ID = ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__CONSTRAINTS = ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__ANNOTATIONS = ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ViewPointImpl <em>View Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ViewPointImpl
   * @see ifml.core.impl.CorePackageImpl#getViewPoint()
   * @generated
   */
  int VIEW_POINT = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_POINT__ID = NAMED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_POINT__CONSTRAINTS = NAMED_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_POINT__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_POINT__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Interaction Flow Model Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_POINT__INTERACTION_FLOW_MODEL_ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Context</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_POINT__CONTEXT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>View Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_POINT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>View Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_POINT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.InteractionFlowElementImpl <em>Interaction Flow Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.InteractionFlowElementImpl
   * @see ifml.core.impl.CorePackageImpl#getInteractionFlowElement()
   * @generated
   */
  int INTERACTION_FLOW_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_ELEMENT__ID = NAMED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_ELEMENT__CONSTRAINTS = NAMED_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_ELEMENT__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_ELEMENT__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_ELEMENT__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Interaction Flow Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Interaction Flow Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.InteractionFlowModelElementImpl <em>Interaction Flow Model Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.InteractionFlowModelElementImpl
   * @see ifml.core.impl.CorePackageImpl#getInteractionFlowModelElement()
   * @generated
   */
  int INTERACTION_FLOW_MODEL_ELEMENT = 15;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_MODEL_ELEMENT__ID = ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS = ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS = ELEMENT__ANNOTATIONS;

  /**
   * The number of structural features of the '<em>Interaction Flow Model Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Interaction Flow Model Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.InteractionFlowImpl <em>Interaction Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.InteractionFlowImpl
   * @see ifml.core.impl.CorePackageImpl#getInteractionFlow()
   * @generated
   */
  int INTERACTION_FLOW = 13;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW__ID = INTERACTION_FLOW_MODEL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW__CONSTRAINTS = INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW__ANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Src Interaction Flow Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW__SRC_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Trgt Interaction Flow Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW__TRGT_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameter Binding Group</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW__PARAMETER_BINDING_GROUP = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Interaction Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Interaction Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.NavigationFlowImpl <em>Navigation Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.NavigationFlowImpl
   * @see ifml.core.impl.CorePackageImpl#getNavigationFlow()
   * @generated
   */
  int NAVIGATION_FLOW = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_FLOW__ID = INTERACTION_FLOW__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_FLOW__CONSTRAINTS = INTERACTION_FLOW__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_FLOW__ANNOTATIONS = INTERACTION_FLOW__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Src Interaction Flow Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_FLOW__SRC_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW__SRC_INTERACTION_FLOW_ELEMENT;

  /**
   * The feature id for the '<em><b>Trgt Interaction Flow Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_FLOW__TRGT_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW__TRGT_INTERACTION_FLOW_ELEMENT;

  /**
   * The feature id for the '<em><b>Parameter Binding Group</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_FLOW__PARAMETER_BINDING_GROUP = INTERACTION_FLOW__PARAMETER_BINDING_GROUP;

  /**
   * The feature id for the '<em><b>Data Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_FLOW__DATA_FLOWS = INTERACTION_FLOW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Navigation Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_FLOW_FEATURE_COUNT = INTERACTION_FLOW_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Navigation Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_FLOW_OPERATION_COUNT = INTERACTION_FLOW_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.EventImpl
   * @see ifml.core.impl.CorePackageImpl#getEvent()
   * @generated
   */
  int EVENT = 22;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__ID = INTERACTION_FLOW_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__CONSTRAINTS = INTERACTION_FLOW_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__ANNOTATIONS = INTERACTION_FLOW_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = INTERACTION_FLOW_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__PARAMETERS = INTERACTION_FLOW_ELEMENT__PARAMETERS;

  /**
   * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__IN_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Activation Expression</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__ACTIVATION_EXPRESSION = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Navigation Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAVIGATION_FLOWS = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__INTERACTION_FLOW_EXPRESSION = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ActionEventImpl <em>Action Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ActionEventImpl
   * @see ifml.core.impl.CorePackageImpl#getActionEvent()
   * @generated
   */
  int ACTION_EVENT = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EVENT__ID = EVENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EVENT__CONSTRAINTS = EVENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EVENT__ANNOTATIONS = EVENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EVENT__NAME = EVENT__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EVENT__PARAMETERS = EVENT__PARAMETERS;

  /**
   * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EVENT__IN_INTERACTION_FLOWS = EVENT__IN_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EVENT__OUT_INTERACTION_FLOWS = EVENT__OUT_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Activation Expression</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EVENT__ACTIVATION_EXPRESSION = EVENT__ACTIVATION_EXPRESSION;

  /**
   * The feature id for the '<em><b>Navigation Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EVENT__NAVIGATION_FLOWS = EVENT__NAVIGATION_FLOWS;

  /**
   * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EVENT__INTERACTION_FLOW_EXPRESSION = EVENT__INTERACTION_FLOW_EXPRESSION;

  /**
   * The number of structural features of the '<em>Action Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Action Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.InteractionFlowModelImpl <em>Interaction Flow Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.InteractionFlowModelImpl
   * @see ifml.core.impl.CorePackageImpl#getInteractionFlowModel()
   * @generated
   */
  int INTERACTION_FLOW_MODEL = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_MODEL__ID = NAMED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_MODEL__CONSTRAINTS = NAMED_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_MODEL__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_MODEL__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Interaction Flow Model Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interaction Flow Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Interaction Flow Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ParameterBindingGroupImpl <em>Parameter Binding Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ParameterBindingGroupImpl
   * @see ifml.core.impl.CorePackageImpl#getParameterBindingGroup()
   * @generated
   */
  int PARAMETER_BINDING_GROUP = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_BINDING_GROUP__ID = INTERACTION_FLOW_MODEL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_BINDING_GROUP__CONSTRAINTS = INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_BINDING_GROUP__ANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Parameter Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_BINDING_GROUP__PARAMETER_BINDINGS = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter Binding Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_BINDING_GROUP_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Parameter Binding Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_BINDING_GROUP_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ParameterBindingImpl
   * @see ifml.core.impl.CorePackageImpl#getParameterBinding()
   * @generated
   */
  int PARAMETER_BINDING = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_BINDING__ID = INTERACTION_FLOW_MODEL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_BINDING__CONSTRAINTS = INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_BINDING__ANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Source Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_BINDING__SOURCE_PARAMETER = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_BINDING__TARGET_PARAMETER = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parameter Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_BINDING_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Parameter Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_BINDING_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ContentModelImpl <em>Content Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ContentModelImpl
   * @see ifml.core.impl.CorePackageImpl#getContentModel()
   * @generated
   */
  int CONTENT_MODEL = 7;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_MODEL__ID = NAMED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_MODEL__CONSTRAINTS = NAMED_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_MODEL__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_MODEL__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_MODEL__ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Content Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Content Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ViewElementImpl <em>View Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ViewElementImpl
   * @see ifml.core.impl.CorePackageImpl#getViewElement()
   * @generated
   */
  int VIEW_ELEMENT = 8;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT__ID = INTERACTION_FLOW_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT__CONSTRAINTS = INTERACTION_FLOW_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT__ANNOTATIONS = INTERACTION_FLOW_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT__NAME = INTERACTION_FLOW_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT__PARAMETERS = INTERACTION_FLOW_ELEMENT__PARAMETERS;

  /**
   * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT__IN_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT__VIEW_ELEMENT_EVENTS = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Activation Expression</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT__ACTIVATION_EXPRESSION = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>View Container</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT__VIEW_CONTAINER = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>View Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>View Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ActionImpl
   * @see ifml.core.impl.CorePackageImpl#getAction()
   * @generated
   */
  int ACTION = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ID = INTERACTION_FLOW_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__CONSTRAINTS = INTERACTION_FLOW_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ANNOTATIONS = INTERACTION_FLOW_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = INTERACTION_FLOW_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__PARAMETERS = INTERACTION_FLOW_ELEMENT__PARAMETERS;

  /**
   * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__IN_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Action Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ACTION_EVENTS = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__DYNAMIC_BEHAVIOR = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ViewComponentPartImpl <em>View Component Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ViewComponentPartImpl
   * @see ifml.core.impl.CorePackageImpl#getViewComponentPart()
   * @generated
   */
  int VIEW_COMPONENT_PART = 19;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT_PART__ID = INTERACTION_FLOW_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT_PART__CONSTRAINTS = INTERACTION_FLOW_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT_PART__ANNOTATIONS = INTERACTION_FLOW_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT_PART__NAME = INTERACTION_FLOW_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT_PART__PARAMETERS = INTERACTION_FLOW_ELEMENT__PARAMETERS;

  /**
   * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT_PART__IN_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT_PART__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Activation Expression</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sub View Component Parts</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>View Component Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT_PART_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of operations of the '<em>View Component Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT_PART_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ContentBindingImpl <em>Content Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ContentBindingImpl
   * @see ifml.core.impl.CorePackageImpl#getContentBinding()
   * @generated
   */
  int CONTENT_BINDING = 23;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_BINDING__ID = VIEW_COMPONENT_PART__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_BINDING__CONSTRAINTS = VIEW_COMPONENT_PART__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_BINDING__ANNOTATIONS = VIEW_COMPONENT_PART__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_BINDING__NAME = VIEW_COMPONENT_PART__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_BINDING__PARAMETERS = VIEW_COMPONENT_PART__PARAMETERS;

  /**
   * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_BINDING__IN_INTERACTION_FLOWS = VIEW_COMPONENT_PART__IN_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_BINDING__OUT_INTERACTION_FLOWS = VIEW_COMPONENT_PART__OUT_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_BINDING__VIEW_ELEMENT_EVENTS = VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS;

  /**
   * The feature id for the '<em><b>Activation Expression</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_BINDING__ACTIVATION_EXPRESSION = VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION;

  /**
   * The feature id for the '<em><b>Sub View Component Parts</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_BINDING__SUB_VIEW_COMPONENT_PARTS = VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS;

  /**
   * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_BINDING__PARENT_VIEW_COMPONENT_PART = VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART;

  /**
   * The feature id for the '<em><b>Uniform Resource Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER = VIEW_COMPONENT_PART_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Content Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_BINDING_FEATURE_COUNT = VIEW_COMPONENT_PART_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Content Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_BINDING_OPERATION_COUNT = VIEW_COMPONENT_PART_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.DynamicBehaviorImpl <em>Dynamic Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.DynamicBehaviorImpl
   * @see ifml.core.impl.CorePackageImpl#getDynamicBehavior()
   * @generated
   */
  int DYNAMIC_BEHAVIOR = 11;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_BEHAVIOR__ID = CONTENT_BINDING__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_BEHAVIOR__CONSTRAINTS = CONTENT_BINDING__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_BEHAVIOR__ANNOTATIONS = CONTENT_BINDING__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_BEHAVIOR__NAME = CONTENT_BINDING__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_BEHAVIOR__PARAMETERS = CONTENT_BINDING__PARAMETERS;

  /**
   * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_BEHAVIOR__IN_INTERACTION_FLOWS = CONTENT_BINDING__IN_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_BEHAVIOR__OUT_INTERACTION_FLOWS = CONTENT_BINDING__OUT_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_BEHAVIOR__VIEW_ELEMENT_EVENTS = CONTENT_BINDING__VIEW_ELEMENT_EVENTS;

  /**
   * The feature id for the '<em><b>Activation Expression</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_BEHAVIOR__ACTIVATION_EXPRESSION = CONTENT_BINDING__ACTIVATION_EXPRESSION;

  /**
   * The feature id for the '<em><b>Sub View Component Parts</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_BEHAVIOR__SUB_VIEW_COMPONENT_PARTS = CONTENT_BINDING__SUB_VIEW_COMPONENT_PARTS;

  /**
   * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_BEHAVIOR__PARENT_VIEW_COMPONENT_PART = CONTENT_BINDING__PARENT_VIEW_COMPONENT_PART;

  /**
   * The feature id for the '<em><b>Uniform Resource Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_BEHAVIOR__UNIFORM_RESOURCE_IDENTIFIER = CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Behavioral Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE = CONTENT_BINDING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Behavior</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_BEHAVIOR__BEHAVIOR = CONTENT_BINDING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dynamic Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_BEHAVIOR_FEATURE_COUNT = CONTENT_BINDING_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Dynamic Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_BEHAVIOR_OPERATION_COUNT = CONTENT_BINDING_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.DataFlowImpl <em>Data Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.DataFlowImpl
   * @see ifml.core.impl.CorePackageImpl#getDataFlow()
   * @generated
   */
  int DATA_FLOW = 12;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FLOW__ID = INTERACTION_FLOW__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FLOW__CONSTRAINTS = INTERACTION_FLOW__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FLOW__ANNOTATIONS = INTERACTION_FLOW__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Src Interaction Flow Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FLOW__SRC_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW__SRC_INTERACTION_FLOW_ELEMENT;

  /**
   * The feature id for the '<em><b>Trgt Interaction Flow Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FLOW__TRGT_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW__TRGT_INTERACTION_FLOW_ELEMENT;

  /**
   * The feature id for the '<em><b>Parameter Binding Group</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FLOW__PARAMETER_BINDING_GROUP = INTERACTION_FLOW__PARAMETER_BINDING_GROUP;

  /**
   * The number of structural features of the '<em>Data Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FLOW_FEATURE_COUNT = INTERACTION_FLOW_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Data Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FLOW_OPERATION_COUNT = INTERACTION_FLOW_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ViewElementEventImpl <em>View Element Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ViewElementEventImpl
   * @see ifml.core.impl.CorePackageImpl#getViewElementEvent()
   * @generated
   */
  int VIEW_ELEMENT_EVENT = 14;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT_EVENT__ID = EVENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT_EVENT__CONSTRAINTS = EVENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT_EVENT__ANNOTATIONS = EVENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT_EVENT__NAME = EVENT__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT_EVENT__PARAMETERS = EVENT__PARAMETERS;

  /**
   * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT_EVENT__IN_INTERACTION_FLOWS = EVENT__IN_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT_EVENT__OUT_INTERACTION_FLOWS = EVENT__OUT_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Activation Expression</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT_EVENT__ACTIVATION_EXPRESSION = EVENT__ACTIVATION_EXPRESSION;

  /**
   * The feature id for the '<em><b>Navigation Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT_EVENT__NAVIGATION_FLOWS = EVENT__NAVIGATION_FLOWS;

  /**
   * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT_EVENT__INTERACTION_FLOW_EXPRESSION = EVENT__INTERACTION_FLOW_EXPRESSION;

  /**
   * The number of structural features of the '<em>View Element Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>View Element Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ExternalEventImpl <em>External Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ExternalEventImpl
   * @see ifml.core.impl.CorePackageImpl#getExternalEvent()
   * @generated
   */
  int EXTERNAL_EVENT = 17;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_EVENT__ID = EVENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_EVENT__CONSTRAINTS = EVENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_EVENT__ANNOTATIONS = EVENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_EVENT__NAME = EVENT__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_EVENT__PARAMETERS = EVENT__PARAMETERS;

  /**
   * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_EVENT__IN_INTERACTION_FLOWS = EVENT__IN_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_EVENT__OUT_INTERACTION_FLOWS = EVENT__OUT_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Activation Expression</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_EVENT__ACTIVATION_EXPRESSION = EVENT__ACTIVATION_EXPRESSION;

  /**
   * The feature id for the '<em><b>Navigation Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_EVENT__NAVIGATION_FLOWS = EVENT__NAVIGATION_FLOWS;

  /**
   * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_EVENT__INTERACTION_FLOW_EXPRESSION = EVENT__INTERACTION_FLOW_EXPRESSION;

  /**
   * The number of structural features of the '<em>External Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>External Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ExpressionImpl
   * @see ifml.core.impl.CorePackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 30;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__ID = INTERACTION_FLOW_MODEL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__CONSTRAINTS = INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__ANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LANGUAGE = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__BODY = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.BooleanExpressionImpl
   * @see ifml.core.impl.CorePackageImpl#getBooleanExpression()
   * @generated
   */
  int BOOLEAN_EXPRESSION = 28;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__ID = EXPRESSION__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__CONSTRAINTS = EXPRESSION__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__LANGUAGE = EXPRESSION__LANGUAGE;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__BODY = EXPRESSION__BODY;

  /**
   * The number of structural features of the '<em>Boolean Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Boolean Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ConstraintImpl
   * @see ifml.core.impl.CorePackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 18;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__ID = BOOLEAN_EXPRESSION__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__CONSTRAINTS = BOOLEAN_EXPRESSION__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__ANNOTATIONS = BOOLEAN_EXPRESSION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__LANGUAGE = BOOLEAN_EXPRESSION__LANGUAGE;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__BODY = BOOLEAN_EXPRESSION__BODY;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ViewContainerImpl <em>View Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ViewContainerImpl
   * @see ifml.core.impl.CorePackageImpl#getViewContainer()
   * @generated
   */
  int VIEW_CONTAINER = 20;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTAINER__ID = VIEW_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTAINER__CONSTRAINTS = VIEW_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTAINER__ANNOTATIONS = VIEW_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTAINER__NAME = VIEW_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTAINER__PARAMETERS = VIEW_ELEMENT__PARAMETERS;

  /**
   * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTAINER__IN_INTERACTION_FLOWS = VIEW_ELEMENT__IN_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTAINER__OUT_INTERACTION_FLOWS = VIEW_ELEMENT__OUT_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTAINER__VIEW_ELEMENT_EVENTS = VIEW_ELEMENT__VIEW_ELEMENT_EVENTS;

  /**
   * The feature id for the '<em><b>Activation Expression</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTAINER__ACTIVATION_EXPRESSION = VIEW_ELEMENT__ACTIVATION_EXPRESSION;

  /**
   * The feature id for the '<em><b>View Container</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTAINER__VIEW_CONTAINER = VIEW_ELEMENT__VIEW_CONTAINER;

  /**
   * The feature id for the '<em><b>Is Land Mark</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTAINER__IS_LAND_MARK = VIEW_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTAINER__IS_DEFAULT = VIEW_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>View Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTAINER__VIEW_ELEMENTS = VIEW_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>View Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTAINER_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>View Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CONTAINER_OPERATION_COUNT = VIEW_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.IFMLModelImpl <em>IFML Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.IFMLModelImpl
   * @see ifml.core.impl.CorePackageImpl#getIFMLModel()
   * @generated
   */
  int IFML_MODEL = 21;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFML_MODEL__ID = NAMED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFML_MODEL__CONSTRAINTS = NAMED_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFML_MODEL__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFML_MODEL__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Interaction Flow Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFML_MODEL__INTERACTION_FLOW_MODEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Content Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFML_MODEL__CONTENT_MODEL = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Interaction Flow Model View Points</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFML_MODEL__INTERACTION_FLOW_MODEL_VIEW_POINTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>IFML Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFML_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>IFML Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFML_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.InteractionFlowExpressionImpl <em>Interaction Flow Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.InteractionFlowExpressionImpl
   * @see ifml.core.impl.CorePackageImpl#getInteractionFlowExpression()
   * @generated
   */
  int INTERACTION_FLOW_EXPRESSION = 24;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_EXPRESSION__ID = EXPRESSION__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_EXPRESSION__CONSTRAINTS = EXPRESSION__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_EXPRESSION__LANGUAGE = EXPRESSION__LANGUAGE;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_EXPRESSION__BODY = EXPRESSION__BODY;

  /**
   * The feature id for the '<em><b>Interaction Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_EXPRESSION__INTERACTION_FLOWS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interaction Flow Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Interaction Flow Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FLOW_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.DataBindingImpl <em>Data Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.DataBindingImpl
   * @see ifml.core.impl.CorePackageImpl#getDataBinding()
   * @generated
   */
  int DATA_BINDING = 25;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING__ID = CONTENT_BINDING__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING__CONSTRAINTS = CONTENT_BINDING__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING__ANNOTATIONS = CONTENT_BINDING__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING__NAME = CONTENT_BINDING__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING__PARAMETERS = CONTENT_BINDING__PARAMETERS;

  /**
   * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING__IN_INTERACTION_FLOWS = CONTENT_BINDING__IN_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING__OUT_INTERACTION_FLOWS = CONTENT_BINDING__OUT_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING__VIEW_ELEMENT_EVENTS = CONTENT_BINDING__VIEW_ELEMENT_EVENTS;

  /**
   * The feature id for the '<em><b>Activation Expression</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING__ACTIVATION_EXPRESSION = CONTENT_BINDING__ACTIVATION_EXPRESSION;

  /**
   * The feature id for the '<em><b>Sub View Component Parts</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING__SUB_VIEW_COMPONENT_PARTS = CONTENT_BINDING__SUB_VIEW_COMPONENT_PARTS;

  /**
   * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING__PARENT_VIEW_COMPONENT_PART = CONTENT_BINDING__PARENT_VIEW_COMPONENT_PART;

  /**
   * The feature id for the '<em><b>Uniform Resource Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING__UNIFORM_RESOURCE_IDENTIFIER = CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Conditional Expression</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING__CONDITIONAL_EXPRESSION = CONTENT_BINDING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Visualization Attributes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING__VISUALIZATION_ATTRIBUTES = CONTENT_BINDING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Classifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING__CLASSIFIER = CONTENT_BINDING_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Data Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING_FEATURE_COUNT = CONTENT_BINDING_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Data Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING_OPERATION_COUNT = CONTENT_BINDING_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ViewComponentImpl <em>View Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ViewComponentImpl
   * @see ifml.core.impl.CorePackageImpl#getViewComponent()
   * @generated
   */
  int VIEW_COMPONENT = 26;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT__ID = VIEW_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT__CONSTRAINTS = VIEW_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT__ANNOTATIONS = VIEW_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT__NAME = VIEW_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT__PARAMETERS = VIEW_ELEMENT__PARAMETERS;

  /**
   * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT__IN_INTERACTION_FLOWS = VIEW_ELEMENT__IN_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT__OUT_INTERACTION_FLOWS = VIEW_ELEMENT__OUT_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT__VIEW_ELEMENT_EVENTS = VIEW_ELEMENT__VIEW_ELEMENT_EVENTS;

  /**
   * The feature id for the '<em><b>Activation Expression</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT__ACTIVATION_EXPRESSION = VIEW_ELEMENT__ACTIVATION_EXPRESSION;

  /**
   * The feature id for the '<em><b>View Container</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT__VIEW_CONTAINER = VIEW_ELEMENT__VIEW_CONTAINER;

  /**
   * The feature id for the '<em><b>View Component Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT__VIEW_COMPONENT_PARTS = VIEW_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>View Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>View Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_COMPONENT_OPERATION_COUNT = VIEW_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.SystemEventImpl <em>System Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.SystemEventImpl
   * @see ifml.core.impl.CorePackageImpl#getSystemEvent()
   * @generated
   */
  int SYSTEM_EVENT = 27;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_EVENT__ID = EVENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_EVENT__CONSTRAINTS = EVENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_EVENT__ANNOTATIONS = EVENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_EVENT__NAME = EVENT__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_EVENT__PARAMETERS = EVENT__PARAMETERS;

  /**
   * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_EVENT__IN_INTERACTION_FLOWS = EVENT__IN_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_EVENT__OUT_INTERACTION_FLOWS = EVENT__OUT_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Activation Expression</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_EVENT__ACTIVATION_EXPRESSION = EVENT__ACTIVATION_EXPRESSION;

  /**
   * The feature id for the '<em><b>Navigation Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_EVENT__NAVIGATION_FLOWS = EVENT__NAVIGATION_FLOWS;

  /**
   * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_EVENT__INTERACTION_FLOW_EXPRESSION = EVENT__INTERACTION_FLOW_EXPRESSION;

  /**
   * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_EVENT__TRIGGERING_EXPRESSIONS = EVENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_EVENT__TYPE = EVENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>System Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>System Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ActivationExpressionImpl <em>Activation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ActivationExpressionImpl
   * @see ifml.core.impl.CorePackageImpl#getActivationExpression()
   * @generated
   */
  int ACTIVATION_EXPRESSION = 29;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVATION_EXPRESSION__ID = BOOLEAN_EXPRESSION__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVATION_EXPRESSION__CONSTRAINTS = BOOLEAN_EXPRESSION__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVATION_EXPRESSION__ANNOTATIONS = BOOLEAN_EXPRESSION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVATION_EXPRESSION__LANGUAGE = BOOLEAN_EXPRESSION__LANGUAGE;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVATION_EXPRESSION__BODY = BOOLEAN_EXPRESSION__BODY;

  /**
   * The number of structural features of the '<em>Activation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVATION_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Activation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVATION_EXPRESSION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ParameterImpl
   * @see ifml.core.impl.CorePackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 31;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__ID = INTERACTION_FLOW_MODEL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__CONSTRAINTS = INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__ANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__KIND = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ConditionalExpressionImpl
   * @see ifml.core.impl.CorePackageImpl#getConditionalExpression()
   * @generated
   */
  int CONDITIONAL_EXPRESSION = 32;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__ID = EXPRESSION__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__CONSTRAINTS = EXPRESSION__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__LANGUAGE = EXPRESSION__LANGUAGE;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__BODY = EXPRESSION__BODY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__PARAMETERS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__IN_INTERACTION_FLOWS = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__OUT_INTERACTION_FLOWS = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__VIEW_ELEMENT_EVENTS = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Activation Expression</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__ACTIVATION_EXPRESSION = EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Sub View Component Parts</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__SUB_VIEW_COMPONENT_PARTS = EXPRESSION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__PARENT_VIEW_COMPONENT_PART = EXPRESSION_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Conditional Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 8;

  /**
   * The number of operations of the '<em>Conditional Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ContextImpl <em>Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ContextImpl
   * @see ifml.core.impl.CorePackageImpl#getContext()
   * @generated
   */
  int CONTEXT = 33;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__ID = ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__CONSTRAINTS = ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__ANNOTATIONS = ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Context Dimensions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__CONTEXT_DIMENSIONS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ContextDimensionImpl <em>Context Dimension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ContextDimensionImpl
   * @see ifml.core.impl.CorePackageImpl#getContextDimension()
   * @generated
   */
  int CONTEXT_DIMENSION = 34;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_DIMENSION__ID = NAMED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_DIMENSION__CONSTRAINTS = NAMED_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_DIMENSION__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_DIMENSION__NAME = NAMED_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Context Dimension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_DIMENSION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Context Dimension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_DIMENSION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.VisualizationAttributeImpl <em>Visualization Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.VisualizationAttributeImpl
   * @see ifml.core.impl.CorePackageImpl#getVisualizationAttribute()
   * @generated
   */
  int VISUALIZATION_ATTRIBUTE = 35;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_ATTRIBUTE__ID = VIEW_COMPONENT_PART__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_ATTRIBUTE__CONSTRAINTS = VIEW_COMPONENT_PART__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_ATTRIBUTE__ANNOTATIONS = VIEW_COMPONENT_PART__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_ATTRIBUTE__NAME = VIEW_COMPONENT_PART__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_ATTRIBUTE__PARAMETERS = VIEW_COMPONENT_PART__PARAMETERS;

  /**
   * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_ATTRIBUTE__IN_INTERACTION_FLOWS = VIEW_COMPONENT_PART__IN_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_ATTRIBUTE__OUT_INTERACTION_FLOWS = VIEW_COMPONENT_PART__OUT_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_ATTRIBUTE__VIEW_ELEMENT_EVENTS = VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS;

  /**
   * The feature id for the '<em><b>Activation Expression</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_ATTRIBUTE__ACTIVATION_EXPRESSION = VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION;

  /**
   * The feature id for the '<em><b>Sub View Component Parts</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_ATTRIBUTE__SUB_VIEW_COMPONENT_PARTS = VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS;

  /**
   * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_ATTRIBUTE__PARENT_VIEW_COMPONENT_PART = VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART;

  /**
   * The feature id for the '<em><b>Structural Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_ATTRIBUTE__STRUCTURAL_FEATURE = VIEW_COMPONENT_PART_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Visualization Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_ATTRIBUTE_FEATURE_COUNT = VIEW_COMPONENT_PART_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Visualization Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISUALIZATION_ATTRIBUTE_OPERATION_COUNT = VIEW_COMPONENT_PART_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.ModuleImpl
   * @see ifml.core.impl.CorePackageImpl#getModule()
   * @generated
   */
  int MODULE = 36;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__ID = INTERACTION_FLOW_MODEL_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__CONSTRAINTS = INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__ANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Input Ports</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__INPUT_PORTS = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Output Ports</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__OUTPUT_PORTS = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Interaction Flow Model Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__INTERACTION_FLOW_MODEL_ELEMENTS = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.PortImpl
   * @see ifml.core.impl.CorePackageImpl#getPort()
   * @generated
   */
  int PORT = 37;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__ID = INTERACTION_FLOW_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__CONSTRAINTS = INTERACTION_FLOW_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__ANNOTATIONS = INTERACTION_FLOW_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__NAME = INTERACTION_FLOW_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__PARAMETERS = INTERACTION_FLOW_ELEMENT__PARAMETERS;

  /**
   * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__IN_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;

  /**
   * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link ifml.core.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.impl.AnnotationImpl
   * @see ifml.core.impl.CorePackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 38;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__TEXT = 0;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link ifml.core.SystemEventTypeEnum <em>System Event Type Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.SystemEventTypeEnum
   * @see ifml.core.impl.CorePackageImpl#getSystemEventTypeEnum()
   * @generated
   */
  int SYSTEM_EVENT_TYPE_ENUM = 39;

  /**
   * The meta object id for the '{@link ifml.core.ParameterKind <em>Parameter Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ifml.core.ParameterKind
   * @see ifml.core.impl.CorePackageImpl#getParameterKind()
   * @generated
   */
  int PARAMETER_KIND = 40;


  /**
   * Returns the meta object for class '{@link ifml.core.ViewPoint <em>View Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Point</em>'.
   * @see ifml.core.ViewPoint
   * @generated
   */
  EClass getViewPoint();

  /**
   * Returns the meta object for the reference list '{@link ifml.core.ViewPoint#getInteractionFlowModelElements <em>Interaction Flow Model Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Interaction Flow Model Elements</em>'.
   * @see ifml.core.ViewPoint#getInteractionFlowModelElements()
   * @see #getViewPoint()
   * @generated
   */
  EReference getViewPoint_InteractionFlowModelElements();

  /**
   * Returns the meta object for the reference '{@link ifml.core.ViewPoint#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Context</em>'.
   * @see ifml.core.ViewPoint#getContext()
   * @see #getViewPoint()
   * @generated
   */
  EReference getViewPoint_Context();

  /**
   * Returns the meta object for class '{@link ifml.core.InteractionFlowElement <em>Interaction Flow Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction Flow Element</em>'.
   * @see ifml.core.InteractionFlowElement
   * @generated
   */
  EClass getInteractionFlowElement();

  /**
   * Returns the meta object for the containment reference list '{@link ifml.core.InteractionFlowElement#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see ifml.core.InteractionFlowElement#getParameters()
   * @see #getInteractionFlowElement()
   * @generated
   */
  EReference getInteractionFlowElement_Parameters();

  /**
   * Returns the meta object for the reference list '{@link ifml.core.InteractionFlowElement#getInInteractionFlows <em>In Interaction Flows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>In Interaction Flows</em>'.
   * @see ifml.core.InteractionFlowElement#getInInteractionFlows()
   * @see #getInteractionFlowElement()
   * @generated
   */
  EReference getInteractionFlowElement_InInteractionFlows();

  /**
   * Returns the meta object for the containment reference list '{@link ifml.core.InteractionFlowElement#getOutInteractionFlows <em>Out Interaction Flows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Out Interaction Flows</em>'.
   * @see ifml.core.InteractionFlowElement#getOutInteractionFlows()
   * @see #getInteractionFlowElement()
   * @generated
   */
  EReference getInteractionFlowElement_OutInteractionFlows();

  /**
   * Returns the meta object for class '{@link ifml.core.NavigationFlow <em>Navigation Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Navigation Flow</em>'.
   * @see ifml.core.NavigationFlow
   * @generated
   */
  EClass getNavigationFlow();

  /**
   * Returns the meta object for the reference list '{@link ifml.core.NavigationFlow#getDataFlows <em>Data Flows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Data Flows</em>'.
   * @see ifml.core.NavigationFlow#getDataFlows()
   * @see #getNavigationFlow()
   * @generated
   */
  EReference getNavigationFlow_DataFlows();

  /**
   * Returns the meta object for class '{@link ifml.core.ActionEvent <em>Action Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Event</em>'.
   * @see ifml.core.ActionEvent
   * @generated
   */
  EClass getActionEvent();

  /**
   * Returns the meta object for class '{@link ifml.core.InteractionFlowModel <em>Interaction Flow Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction Flow Model</em>'.
   * @see ifml.core.InteractionFlowModel
   * @generated
   */
  EClass getInteractionFlowModel();

  /**
   * Returns the meta object for the containment reference list '{@link ifml.core.InteractionFlowModel#getInteractionFlowModelElements <em>Interaction Flow Model Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interaction Flow Model Elements</em>'.
   * @see ifml.core.InteractionFlowModel#getInteractionFlowModelElements()
   * @see #getInteractionFlowModel()
   * @generated
   */
  EReference getInteractionFlowModel_InteractionFlowModelElements();

  /**
   * Returns the meta object for class '{@link ifml.core.ParameterBindingGroup <em>Parameter Binding Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Binding Group</em>'.
   * @see ifml.core.ParameterBindingGroup
   * @generated
   */
  EClass getParameterBindingGroup();

  /**
   * Returns the meta object for the containment reference list '{@link ifml.core.ParameterBindingGroup#getParameterBindings <em>Parameter Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Bindings</em>'.
   * @see ifml.core.ParameterBindingGroup#getParameterBindings()
   * @see #getParameterBindingGroup()
   * @generated
   */
  EReference getParameterBindingGroup_ParameterBindings();

  /**
   * Returns the meta object for class '{@link ifml.core.ParameterBinding <em>Parameter Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Binding</em>'.
   * @see ifml.core.ParameterBinding
   * @generated
   */
  EClass getParameterBinding();

  /**
   * Returns the meta object for the reference '{@link ifml.core.ParameterBinding#getSourceParameter <em>Source Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source Parameter</em>'.
   * @see ifml.core.ParameterBinding#getSourceParameter()
   * @see #getParameterBinding()
   * @generated
   */
  EReference getParameterBinding_SourceParameter();

  /**
   * Returns the meta object for the reference '{@link ifml.core.ParameterBinding#getTargetParameter <em>Target Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Parameter</em>'.
   * @see ifml.core.ParameterBinding#getTargetParameter()
   * @see #getParameterBinding()
   * @generated
   */
  EReference getParameterBinding_TargetParameter();

  /**
   * Returns the meta object for class '{@link ifml.core.ContentModel <em>Content Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Model</em>'.
   * @see ifml.core.ContentModel
   * @generated
   */
  EClass getContentModel();

  /**
   * Returns the meta object for the reference list '{@link ifml.core.ContentModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Elements</em>'.
   * @see ifml.core.ContentModel#getElements()
   * @see #getContentModel()
   * @generated
   */
  EReference getContentModel_Elements();

  /**
   * Returns the meta object for class '{@link ifml.core.ViewElement <em>View Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Element</em>'.
   * @see ifml.core.ViewElement
   * @generated
   */
  EClass getViewElement();

  /**
   * Returns the meta object for the containment reference list '{@link ifml.core.ViewElement#getViewElementEvents <em>View Element Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>View Element Events</em>'.
   * @see ifml.core.ViewElement#getViewElementEvents()
   * @see #getViewElement()
   * @generated
   */
  EReference getViewElement_ViewElementEvents();

  /**
   * Returns the meta object for the reference '{@link ifml.core.ViewElement#getActivationExpression <em>Activation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Activation Expression</em>'.
   * @see ifml.core.ViewElement#getActivationExpression()
   * @see #getViewElement()
   * @generated
   */
  EReference getViewElement_ActivationExpression();

  /**
   * Returns the meta object for the reference '{@link ifml.core.ViewElement#getViewContainer <em>View Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>View Container</em>'.
   * @see ifml.core.ViewElement#getViewContainer()
   * @see #getViewElement()
   * @generated
   */
  EReference getViewElement_ViewContainer();

  /**
   * Returns the meta object for class '{@link ifml.core.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see ifml.core.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the containment reference list '{@link ifml.core.Action#getActionEvents <em>Action Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action Events</em>'.
   * @see ifml.core.Action#getActionEvents()
   * @see #getAction()
   * @generated
   */
  EReference getAction_ActionEvents();

  /**
   * Returns the meta object for the reference '{@link ifml.core.Action#getDynamicBehavior <em>Dynamic Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dynamic Behavior</em>'.
   * @see ifml.core.Action#getDynamicBehavior()
   * @see #getAction()
   * @generated
   */
  EReference getAction_DynamicBehavior();

  /**
   * Returns the meta object for class '{@link ifml.core.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see ifml.core.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link ifml.core.Element#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see ifml.core.Element#getId()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Id();

  /**
   * Returns the meta object for the containment reference list '{@link ifml.core.Element#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see ifml.core.Element#getConstraints()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Constraints();

  /**
   * Returns the meta object for the containment reference list '{@link ifml.core.Element#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see ifml.core.Element#getAnnotations()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Annotations();

  /**
   * Returns the meta object for class '{@link ifml.core.DynamicBehavior <em>Dynamic Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dynamic Behavior</em>'.
   * @see ifml.core.DynamicBehavior
   * @generated
   */
  EClass getDynamicBehavior();

  /**
   * Returns the meta object for the reference '{@link ifml.core.DynamicBehavior#getBehavioralFeature <em>Behavioral Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Behavioral Feature</em>'.
   * @see ifml.core.DynamicBehavior#getBehavioralFeature()
   * @see #getDynamicBehavior()
   * @generated
   */
  EReference getDynamicBehavior_BehavioralFeature();

  /**
   * Returns the meta object for the reference '{@link ifml.core.DynamicBehavior#getBehavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Behavior</em>'.
   * @see ifml.core.DynamicBehavior#getBehavior()
   * @see #getDynamicBehavior()
   * @generated
   */
  EReference getDynamicBehavior_Behavior();

  /**
   * Returns the meta object for class '{@link ifml.core.DataFlow <em>Data Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Flow</em>'.
   * @see ifml.core.DataFlow
   * @generated
   */
  EClass getDataFlow();

  /**
   * Returns the meta object for class '{@link ifml.core.InteractionFlow <em>Interaction Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction Flow</em>'.
   * @see ifml.core.InteractionFlow
   * @generated
   */
  EClass getInteractionFlow();

  /**
   * Returns the meta object for the reference '{@link ifml.core.InteractionFlow#getSrcInteractionFlowElement <em>Src Interaction Flow Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Src Interaction Flow Element</em>'.
   * @see ifml.core.InteractionFlow#getSrcInteractionFlowElement()
   * @see #getInteractionFlow()
   * @generated
   */
  EReference getInteractionFlow_SrcInteractionFlowElement();

  /**
   * Returns the meta object for the reference '{@link ifml.core.InteractionFlow#getTrgtInteractionFlowElement <em>Trgt Interaction Flow Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Trgt Interaction Flow Element</em>'.
   * @see ifml.core.InteractionFlow#getTrgtInteractionFlowElement()
   * @see #getInteractionFlow()
   * @generated
   */
  EReference getInteractionFlow_TrgtInteractionFlowElement();

  /**
   * Returns the meta object for the containment reference '{@link ifml.core.InteractionFlow#getParameterBindingGroup <em>Parameter Binding Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Binding Group</em>'.
   * @see ifml.core.InteractionFlow#getParameterBindingGroup()
   * @see #getInteractionFlow()
   * @generated
   */
  EReference getInteractionFlow_ParameterBindingGroup();

  /**
   * Returns the meta object for class '{@link ifml.core.ViewElementEvent <em>View Element Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Element Event</em>'.
   * @see ifml.core.ViewElementEvent
   * @generated
   */
  EClass getViewElementEvent();

  /**
   * Returns the meta object for class '{@link ifml.core.InteractionFlowModelElement <em>Interaction Flow Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction Flow Model Element</em>'.
   * @see ifml.core.InteractionFlowModelElement
   * @generated
   */
  EClass getInteractionFlowModelElement();

  /**
   * Returns the meta object for class '{@link ifml.core.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see ifml.core.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link ifml.core.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ifml.core.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for class '{@link ifml.core.ExternalEvent <em>External Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Event</em>'.
   * @see ifml.core.ExternalEvent
   * @generated
   */
  EClass getExternalEvent();

  /**
   * Returns the meta object for class '{@link ifml.core.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see ifml.core.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for class '{@link ifml.core.ViewComponentPart <em>View Component Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Component Part</em>'.
   * @see ifml.core.ViewComponentPart
   * @generated
   */
  EClass getViewComponentPart();

  /**
   * Returns the meta object for the containment reference list '{@link ifml.core.ViewComponentPart#getViewElementEvents <em>View Element Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>View Element Events</em>'.
   * @see ifml.core.ViewComponentPart#getViewElementEvents()
   * @see #getViewComponentPart()
   * @generated
   */
  EReference getViewComponentPart_ViewElementEvents();

  /**
   * Returns the meta object for the reference '{@link ifml.core.ViewComponentPart#getActivationExpression <em>Activation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Activation Expression</em>'.
   * @see ifml.core.ViewComponentPart#getActivationExpression()
   * @see #getViewComponentPart()
   * @generated
   */
  EReference getViewComponentPart_ActivationExpression();

  /**
   * Returns the meta object for the reference list '{@link ifml.core.ViewComponentPart#getSubViewComponentParts <em>Sub View Component Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Sub View Component Parts</em>'.
   * @see ifml.core.ViewComponentPart#getSubViewComponentParts()
   * @see #getViewComponentPart()
   * @generated
   */
  EReference getViewComponentPart_SubViewComponentParts();

  /**
   * Returns the meta object for the reference '{@link ifml.core.ViewComponentPart#getParentViewComponentPart <em>Parent View Component Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent View Component Part</em>'.
   * @see ifml.core.ViewComponentPart#getParentViewComponentPart()
   * @see #getViewComponentPart()
   * @generated
   */
  EReference getViewComponentPart_ParentViewComponentPart();

  /**
   * Returns the meta object for class '{@link ifml.core.ViewContainer <em>View Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Container</em>'.
   * @see ifml.core.ViewContainer
   * @generated
   */
  EClass getViewContainer();

  /**
   * Returns the meta object for the attribute '{@link ifml.core.ViewContainer#isIsLandMark <em>Is Land Mark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Land Mark</em>'.
   * @see ifml.core.ViewContainer#isIsLandMark()
   * @see #getViewContainer()
   * @generated
   */
  EAttribute getViewContainer_IsLandMark();

  /**
   * Returns the meta object for the attribute '{@link ifml.core.ViewContainer#isIsDefault <em>Is Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Default</em>'.
   * @see ifml.core.ViewContainer#isIsDefault()
   * @see #getViewContainer()
   * @generated
   */
  EAttribute getViewContainer_IsDefault();

  /**
   * Returns the meta object for the containment reference list '{@link ifml.core.ViewContainer#getViewElements <em>View Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>View Elements</em>'.
   * @see ifml.core.ViewContainer#getViewElements()
   * @see #getViewContainer()
   * @generated
   */
  EReference getViewContainer_ViewElements();

  /**
   * Returns the meta object for class '{@link ifml.core.IFMLModel <em>IFML Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IFML Model</em>'.
   * @see ifml.core.IFMLModel
   * @generated
   */
  EClass getIFMLModel();

  /**
   * Returns the meta object for the containment reference '{@link ifml.core.IFMLModel#getInteractionFlowModel <em>Interaction Flow Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interaction Flow Model</em>'.
   * @see ifml.core.IFMLModel#getInteractionFlowModel()
   * @see #getIFMLModel()
   * @generated
   */
  EReference getIFMLModel_InteractionFlowModel();

  /**
   * Returns the meta object for the containment reference '{@link ifml.core.IFMLModel#getContentModel <em>Content Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content Model</em>'.
   * @see ifml.core.IFMLModel#getContentModel()
   * @see #getIFMLModel()
   * @generated
   */
  EReference getIFMLModel_ContentModel();

  /**
   * Returns the meta object for the containment reference list '{@link ifml.core.IFMLModel#getInteractionFlowModelViewPoints <em>Interaction Flow Model View Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interaction Flow Model View Points</em>'.
   * @see ifml.core.IFMLModel#getInteractionFlowModelViewPoints()
   * @see #getIFMLModel()
   * @generated
   */
  EReference getIFMLModel_InteractionFlowModelViewPoints();

  /**
   * Returns the meta object for class '{@link ifml.core.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see ifml.core.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the reference '{@link ifml.core.Event#getActivationExpression <em>Activation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Activation Expression</em>'.
   * @see ifml.core.Event#getActivationExpression()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_ActivationExpression();

  /**
   * Returns the meta object for the containment reference list '{@link ifml.core.Event#getNavigationFlows <em>Navigation Flows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Navigation Flows</em>'.
   * @see ifml.core.Event#getNavigationFlows()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_NavigationFlows();

  /**
   * Returns the meta object for the containment reference '{@link ifml.core.Event#getInteractionFlowExpression <em>Interaction Flow Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interaction Flow Expression</em>'.
   * @see ifml.core.Event#getInteractionFlowExpression()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_InteractionFlowExpression();

  /**
   * Returns the meta object for class '{@link ifml.core.ContentBinding <em>Content Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Binding</em>'.
   * @see ifml.core.ContentBinding
   * @generated
   */
  EClass getContentBinding();

  /**
   * Returns the meta object for the attribute '{@link ifml.core.ContentBinding#getUniformResourceIdentifier <em>Uniform Resource Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uniform Resource Identifier</em>'.
   * @see ifml.core.ContentBinding#getUniformResourceIdentifier()
   * @see #getContentBinding()
   * @generated
   */
  EAttribute getContentBinding_UniformResourceIdentifier();

  /**
   * Returns the meta object for class '{@link ifml.core.InteractionFlowExpression <em>Interaction Flow Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction Flow Expression</em>'.
   * @see ifml.core.InteractionFlowExpression
   * @generated
   */
  EClass getInteractionFlowExpression();

  /**
   * Returns the meta object for the reference list '{@link ifml.core.InteractionFlowExpression#getInteractionFlows <em>Interaction Flows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Interaction Flows</em>'.
   * @see ifml.core.InteractionFlowExpression#getInteractionFlows()
   * @see #getInteractionFlowExpression()
   * @generated
   */
  EReference getInteractionFlowExpression_InteractionFlows();

  /**
   * Returns the meta object for class '{@link ifml.core.DataBinding <em>Data Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Binding</em>'.
   * @see ifml.core.DataBinding
   * @generated
   */
  EClass getDataBinding();

  /**
   * Returns the meta object for the reference list '{@link ifml.core.DataBinding#getConditionalExpression <em>Conditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Conditional Expression</em>'.
   * @see ifml.core.DataBinding#getConditionalExpression()
   * @see #getDataBinding()
   * @generated
   */
  EReference getDataBinding_ConditionalExpression();

  /**
   * Returns the meta object for the reference list '{@link ifml.core.DataBinding#getVisualizationAttributes <em>Visualization Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Visualization Attributes</em>'.
   * @see ifml.core.DataBinding#getVisualizationAttributes()
   * @see #getDataBinding()
   * @generated
   */
  EReference getDataBinding_VisualizationAttributes();

  /**
   * Returns the meta object for the reference '{@link ifml.core.DataBinding#getClassifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Classifier</em>'.
   * @see ifml.core.DataBinding#getClassifier()
   * @see #getDataBinding()
   * @generated
   */
  EReference getDataBinding_Classifier();

  /**
   * Returns the meta object for class '{@link ifml.core.ViewComponent <em>View Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Component</em>'.
   * @see ifml.core.ViewComponent
   * @generated
   */
  EClass getViewComponent();

  /**
   * Returns the meta object for the containment reference list '{@link ifml.core.ViewComponent#getViewComponentParts <em>View Component Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>View Component Parts</em>'.
   * @see ifml.core.ViewComponent#getViewComponentParts()
   * @see #getViewComponent()
   * @generated
   */
  EReference getViewComponent_ViewComponentParts();

  /**
   * Returns the meta object for class '{@link ifml.core.SystemEvent <em>System Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Event</em>'.
   * @see ifml.core.SystemEvent
   * @generated
   */
  EClass getSystemEvent();

  /**
   * Returns the meta object for the containment reference list '{@link ifml.core.SystemEvent#getTriggeringExpressions <em>Triggering Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Triggering Expressions</em>'.
   * @see ifml.core.SystemEvent#getTriggeringExpressions()
   * @see #getSystemEvent()
   * @generated
   */
  EReference getSystemEvent_TriggeringExpressions();

  /**
   * Returns the meta object for the attribute '{@link ifml.core.SystemEvent#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see ifml.core.SystemEvent#getType()
   * @see #getSystemEvent()
   * @generated
   */
  EAttribute getSystemEvent_Type();

  /**
   * Returns the meta object for class '{@link ifml.core.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Expression</em>'.
   * @see ifml.core.BooleanExpression
   * @generated
   */
  EClass getBooleanExpression();

  /**
   * Returns the meta object for class '{@link ifml.core.ActivationExpression <em>Activation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activation Expression</em>'.
   * @see ifml.core.ActivationExpression
   * @generated
   */
  EClass getActivationExpression();

  /**
   * Returns the meta object for class '{@link ifml.core.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see ifml.core.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link ifml.core.Expression#getLanguage <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Language</em>'.
   * @see ifml.core.Expression#getLanguage()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Language();

  /**
   * Returns the meta object for the attribute '{@link ifml.core.Expression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see ifml.core.Expression#getBody()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Body();

  /**
   * Returns the meta object for class '{@link ifml.core.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see ifml.core.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link ifml.core.Parameter#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see ifml.core.Parameter#getKind()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Kind();

  /**
   * Returns the meta object for class '{@link ifml.core.ConditionalExpression <em>Conditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Expression</em>'.
   * @see ifml.core.ConditionalExpression
   * @generated
   */
  EClass getConditionalExpression();

  /**
   * Returns the meta object for class '{@link ifml.core.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context</em>'.
   * @see ifml.core.Context
   * @generated
   */
  EClass getContext();

  /**
   * Returns the meta object for the reference list '{@link ifml.core.Context#getContextDimensions <em>Context Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Context Dimensions</em>'.
   * @see ifml.core.Context#getContextDimensions()
   * @see #getContext()
   * @generated
   */
  EReference getContext_ContextDimensions();

  /**
   * Returns the meta object for class '{@link ifml.core.ContextDimension <em>Context Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Dimension</em>'.
   * @see ifml.core.ContextDimension
   * @generated
   */
  EClass getContextDimension();

  /**
   * Returns the meta object for class '{@link ifml.core.VisualizationAttribute <em>Visualization Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visualization Attribute</em>'.
   * @see ifml.core.VisualizationAttribute
   * @generated
   */
  EClass getVisualizationAttribute();

  /**
   * Returns the meta object for the reference '{@link ifml.core.VisualizationAttribute#getStructuralFeature <em>Structural Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Structural Feature</em>'.
   * @see ifml.core.VisualizationAttribute#getStructuralFeature()
   * @see #getVisualizationAttribute()
   * @generated
   */
  EReference getVisualizationAttribute_StructuralFeature();

  /**
   * Returns the meta object for class '{@link ifml.core.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see ifml.core.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the reference list '{@link ifml.core.Module#getInputPorts <em>Input Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Input Ports</em>'.
   * @see ifml.core.Module#getInputPorts()
   * @see #getModule()
   * @generated
   */
  EReference getModule_InputPorts();

  /**
   * Returns the meta object for the reference list '{@link ifml.core.Module#getOutputPorts <em>Output Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Output Ports</em>'.
   * @see ifml.core.Module#getOutputPorts()
   * @see #getModule()
   * @generated
   */
  EReference getModule_OutputPorts();

  /**
   * Returns the meta object for the reference list '{@link ifml.core.Module#getInteractionFlowModelElements <em>Interaction Flow Model Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Interaction Flow Model Elements</em>'.
   * @see ifml.core.Module#getInteractionFlowModelElements()
   * @see #getModule()
   * @generated
   */
  EReference getModule_InteractionFlowModelElements();

  /**
   * Returns the meta object for class '{@link ifml.core.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see ifml.core.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for class '{@link ifml.core.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see ifml.core.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link ifml.core.Annotation#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see ifml.core.Annotation#getText()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Text();

  /**
   * Returns the meta object for enum '{@link ifml.core.SystemEventTypeEnum <em>System Event Type Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>System Event Type Enum</em>'.
   * @see ifml.core.SystemEventTypeEnum
   * @generated
   */
  EEnum getSystemEventTypeEnum();

  /**
   * Returns the meta object for enum '{@link ifml.core.ParameterKind <em>Parameter Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Parameter Kind</em>'.
   * @see ifml.core.ParameterKind
   * @generated
   */
  EEnum getParameterKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CoreFactory getCoreFactory();

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
     * The meta object literal for the '{@link ifml.core.impl.ViewPointImpl <em>View Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ViewPointImpl
     * @see ifml.core.impl.CorePackageImpl#getViewPoint()
     * @generated
     */
    EClass VIEW_POINT = eINSTANCE.getViewPoint();

    /**
     * The meta object literal for the '<em><b>Interaction Flow Model Elements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_POINT__INTERACTION_FLOW_MODEL_ELEMENTS = eINSTANCE.getViewPoint_InteractionFlowModelElements();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_POINT__CONTEXT = eINSTANCE.getViewPoint_Context();

    /**
     * The meta object literal for the '{@link ifml.core.impl.InteractionFlowElementImpl <em>Interaction Flow Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.InteractionFlowElementImpl
     * @see ifml.core.impl.CorePackageImpl#getInteractionFlowElement()
     * @generated
     */
    EClass INTERACTION_FLOW_ELEMENT = eINSTANCE.getInteractionFlowElement();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_FLOW_ELEMENT__PARAMETERS = eINSTANCE.getInteractionFlowElement_Parameters();

    /**
     * The meta object literal for the '<em><b>In Interaction Flows</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS = eINSTANCE.getInteractionFlowElement_InInteractionFlows();

    /**
     * The meta object literal for the '<em><b>Out Interaction Flows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS = eINSTANCE.getInteractionFlowElement_OutInteractionFlows();

    /**
     * The meta object literal for the '{@link ifml.core.impl.NavigationFlowImpl <em>Navigation Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.NavigationFlowImpl
     * @see ifml.core.impl.CorePackageImpl#getNavigationFlow()
     * @generated
     */
    EClass NAVIGATION_FLOW = eINSTANCE.getNavigationFlow();

    /**
     * The meta object literal for the '<em><b>Data Flows</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAVIGATION_FLOW__DATA_FLOWS = eINSTANCE.getNavigationFlow_DataFlows();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ActionEventImpl <em>Action Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ActionEventImpl
     * @see ifml.core.impl.CorePackageImpl#getActionEvent()
     * @generated
     */
    EClass ACTION_EVENT = eINSTANCE.getActionEvent();

    /**
     * The meta object literal for the '{@link ifml.core.impl.InteractionFlowModelImpl <em>Interaction Flow Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.InteractionFlowModelImpl
     * @see ifml.core.impl.CorePackageImpl#getInteractionFlowModel()
     * @generated
     */
    EClass INTERACTION_FLOW_MODEL = eINSTANCE.getInteractionFlowModel();

    /**
     * The meta object literal for the '<em><b>Interaction Flow Model Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS = eINSTANCE.getInteractionFlowModel_InteractionFlowModelElements();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ParameterBindingGroupImpl <em>Parameter Binding Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ParameterBindingGroupImpl
     * @see ifml.core.impl.CorePackageImpl#getParameterBindingGroup()
     * @generated
     */
    EClass PARAMETER_BINDING_GROUP = eINSTANCE.getParameterBindingGroup();

    /**
     * The meta object literal for the '<em><b>Parameter Bindings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_BINDING_GROUP__PARAMETER_BINDINGS = eINSTANCE.getParameterBindingGroup_ParameterBindings();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ParameterBindingImpl
     * @see ifml.core.impl.CorePackageImpl#getParameterBinding()
     * @generated
     */
    EClass PARAMETER_BINDING = eINSTANCE.getParameterBinding();

    /**
     * The meta object literal for the '<em><b>Source Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_BINDING__SOURCE_PARAMETER = eINSTANCE.getParameterBinding_SourceParameter();

    /**
     * The meta object literal for the '<em><b>Target Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_BINDING__TARGET_PARAMETER = eINSTANCE.getParameterBinding_TargetParameter();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ContentModelImpl <em>Content Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ContentModelImpl
     * @see ifml.core.impl.CorePackageImpl#getContentModel()
     * @generated
     */
    EClass CONTENT_MODEL = eINSTANCE.getContentModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_MODEL__ELEMENTS = eINSTANCE.getContentModel_Elements();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ViewElementImpl <em>View Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ViewElementImpl
     * @see ifml.core.impl.CorePackageImpl#getViewElement()
     * @generated
     */
    EClass VIEW_ELEMENT = eINSTANCE.getViewElement();

    /**
     * The meta object literal for the '<em><b>View Element Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_ELEMENT__VIEW_ELEMENT_EVENTS = eINSTANCE.getViewElement_ViewElementEvents();

    /**
     * The meta object literal for the '<em><b>Activation Expression</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_ELEMENT__ACTIVATION_EXPRESSION = eINSTANCE.getViewElement_ActivationExpression();

    /**
     * The meta object literal for the '<em><b>View Container</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_ELEMENT__VIEW_CONTAINER = eINSTANCE.getViewElement_ViewContainer();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ActionImpl
     * @see ifml.core.impl.CorePackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Action Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__ACTION_EVENTS = eINSTANCE.getAction_ActionEvents();

    /**
     * The meta object literal for the '<em><b>Dynamic Behavior</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__DYNAMIC_BEHAVIOR = eINSTANCE.getAction_DynamicBehavior();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ElementImpl
     * @see ifml.core.impl.CorePackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__CONSTRAINTS = eINSTANCE.getElement_Constraints();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__ANNOTATIONS = eINSTANCE.getElement_Annotations();

    /**
     * The meta object literal for the '{@link ifml.core.impl.DynamicBehaviorImpl <em>Dynamic Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.DynamicBehaviorImpl
     * @see ifml.core.impl.CorePackageImpl#getDynamicBehavior()
     * @generated
     */
    EClass DYNAMIC_BEHAVIOR = eINSTANCE.getDynamicBehavior();

    /**
     * The meta object literal for the '<em><b>Behavioral Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE = eINSTANCE.getDynamicBehavior_BehavioralFeature();

    /**
     * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DYNAMIC_BEHAVIOR__BEHAVIOR = eINSTANCE.getDynamicBehavior_Behavior();

    /**
     * The meta object literal for the '{@link ifml.core.impl.DataFlowImpl <em>Data Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.DataFlowImpl
     * @see ifml.core.impl.CorePackageImpl#getDataFlow()
     * @generated
     */
    EClass DATA_FLOW = eINSTANCE.getDataFlow();

    /**
     * The meta object literal for the '{@link ifml.core.impl.InteractionFlowImpl <em>Interaction Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.InteractionFlowImpl
     * @see ifml.core.impl.CorePackageImpl#getInteractionFlow()
     * @generated
     */
    EClass INTERACTION_FLOW = eINSTANCE.getInteractionFlow();

    /**
     * The meta object literal for the '<em><b>Src Interaction Flow Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_FLOW__SRC_INTERACTION_FLOW_ELEMENT = eINSTANCE.getInteractionFlow_SrcInteractionFlowElement();

    /**
     * The meta object literal for the '<em><b>Trgt Interaction Flow Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_FLOW__TRGT_INTERACTION_FLOW_ELEMENT = eINSTANCE.getInteractionFlow_TrgtInteractionFlowElement();

    /**
     * The meta object literal for the '<em><b>Parameter Binding Group</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_FLOW__PARAMETER_BINDING_GROUP = eINSTANCE.getInteractionFlow_ParameterBindingGroup();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ViewElementEventImpl <em>View Element Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ViewElementEventImpl
     * @see ifml.core.impl.CorePackageImpl#getViewElementEvent()
     * @generated
     */
    EClass VIEW_ELEMENT_EVENT = eINSTANCE.getViewElementEvent();

    /**
     * The meta object literal for the '{@link ifml.core.impl.InteractionFlowModelElementImpl <em>Interaction Flow Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.InteractionFlowModelElementImpl
     * @see ifml.core.impl.CorePackageImpl#getInteractionFlowModelElement()
     * @generated
     */
    EClass INTERACTION_FLOW_MODEL_ELEMENT = eINSTANCE.getInteractionFlowModelElement();

    /**
     * The meta object literal for the '{@link ifml.core.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.NamedElementImpl
     * @see ifml.core.impl.CorePackageImpl#getNamedElement()
     * @generated
     */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ExternalEventImpl <em>External Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ExternalEventImpl
     * @see ifml.core.impl.CorePackageImpl#getExternalEvent()
     * @generated
     */
    EClass EXTERNAL_EVENT = eINSTANCE.getExternalEvent();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ConstraintImpl
     * @see ifml.core.impl.CorePackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ViewComponentPartImpl <em>View Component Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ViewComponentPartImpl
     * @see ifml.core.impl.CorePackageImpl#getViewComponentPart()
     * @generated
     */
    EClass VIEW_COMPONENT_PART = eINSTANCE.getViewComponentPart();

    /**
     * The meta object literal for the '<em><b>View Element Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS = eINSTANCE.getViewComponentPart_ViewElementEvents();

    /**
     * The meta object literal for the '<em><b>Activation Expression</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION = eINSTANCE.getViewComponentPart_ActivationExpression();

    /**
     * The meta object literal for the '<em><b>Sub View Component Parts</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS = eINSTANCE.getViewComponentPart_SubViewComponentParts();

    /**
     * The meta object literal for the '<em><b>Parent View Component Part</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART = eINSTANCE.getViewComponentPart_ParentViewComponentPart();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ViewContainerImpl <em>View Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ViewContainerImpl
     * @see ifml.core.impl.CorePackageImpl#getViewContainer()
     * @generated
     */
    EClass VIEW_CONTAINER = eINSTANCE.getViewContainer();

    /**
     * The meta object literal for the '<em><b>Is Land Mark</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_CONTAINER__IS_LAND_MARK = eINSTANCE.getViewContainer_IsLandMark();

    /**
     * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_CONTAINER__IS_DEFAULT = eINSTANCE.getViewContainer_IsDefault();

    /**
     * The meta object literal for the '<em><b>View Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_CONTAINER__VIEW_ELEMENTS = eINSTANCE.getViewContainer_ViewElements();

    /**
     * The meta object literal for the '{@link ifml.core.impl.IFMLModelImpl <em>IFML Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.IFMLModelImpl
     * @see ifml.core.impl.CorePackageImpl#getIFMLModel()
     * @generated
     */
    EClass IFML_MODEL = eINSTANCE.getIFMLModel();

    /**
     * The meta object literal for the '<em><b>Interaction Flow Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IFML_MODEL__INTERACTION_FLOW_MODEL = eINSTANCE.getIFMLModel_InteractionFlowModel();

    /**
     * The meta object literal for the '<em><b>Content Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IFML_MODEL__CONTENT_MODEL = eINSTANCE.getIFMLModel_ContentModel();

    /**
     * The meta object literal for the '<em><b>Interaction Flow Model View Points</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IFML_MODEL__INTERACTION_FLOW_MODEL_VIEW_POINTS = eINSTANCE.getIFMLModel_InteractionFlowModelViewPoints();

    /**
     * The meta object literal for the '{@link ifml.core.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.EventImpl
     * @see ifml.core.impl.CorePackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Activation Expression</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__ACTIVATION_EXPRESSION = eINSTANCE.getEvent_ActivationExpression();

    /**
     * The meta object literal for the '<em><b>Navigation Flows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__NAVIGATION_FLOWS = eINSTANCE.getEvent_NavigationFlows();

    /**
     * The meta object literal for the '<em><b>Interaction Flow Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__INTERACTION_FLOW_EXPRESSION = eINSTANCE.getEvent_InteractionFlowExpression();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ContentBindingImpl <em>Content Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ContentBindingImpl
     * @see ifml.core.impl.CorePackageImpl#getContentBinding()
     * @generated
     */
    EClass CONTENT_BINDING = eINSTANCE.getContentBinding();

    /**
     * The meta object literal for the '<em><b>Uniform Resource Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER = eINSTANCE.getContentBinding_UniformResourceIdentifier();

    /**
     * The meta object literal for the '{@link ifml.core.impl.InteractionFlowExpressionImpl <em>Interaction Flow Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.InteractionFlowExpressionImpl
     * @see ifml.core.impl.CorePackageImpl#getInteractionFlowExpression()
     * @generated
     */
    EClass INTERACTION_FLOW_EXPRESSION = eINSTANCE.getInteractionFlowExpression();

    /**
     * The meta object literal for the '<em><b>Interaction Flows</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_FLOW_EXPRESSION__INTERACTION_FLOWS = eINSTANCE.getInteractionFlowExpression_InteractionFlows();

    /**
     * The meta object literal for the '{@link ifml.core.impl.DataBindingImpl <em>Data Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.DataBindingImpl
     * @see ifml.core.impl.CorePackageImpl#getDataBinding()
     * @generated
     */
    EClass DATA_BINDING = eINSTANCE.getDataBinding();

    /**
     * The meta object literal for the '<em><b>Conditional Expression</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_BINDING__CONDITIONAL_EXPRESSION = eINSTANCE.getDataBinding_ConditionalExpression();

    /**
     * The meta object literal for the '<em><b>Visualization Attributes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_BINDING__VISUALIZATION_ATTRIBUTES = eINSTANCE.getDataBinding_VisualizationAttributes();

    /**
     * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_BINDING__CLASSIFIER = eINSTANCE.getDataBinding_Classifier();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ViewComponentImpl <em>View Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ViewComponentImpl
     * @see ifml.core.impl.CorePackageImpl#getViewComponent()
     * @generated
     */
    EClass VIEW_COMPONENT = eINSTANCE.getViewComponent();

    /**
     * The meta object literal for the '<em><b>View Component Parts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_COMPONENT__VIEW_COMPONENT_PARTS = eINSTANCE.getViewComponent_ViewComponentParts();

    /**
     * The meta object literal for the '{@link ifml.core.impl.SystemEventImpl <em>System Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.SystemEventImpl
     * @see ifml.core.impl.CorePackageImpl#getSystemEvent()
     * @generated
     */
    EClass SYSTEM_EVENT = eINSTANCE.getSystemEvent();

    /**
     * The meta object literal for the '<em><b>Triggering Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_EVENT__TRIGGERING_EXPRESSIONS = eINSTANCE.getSystemEvent_TriggeringExpressions();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_EVENT__TYPE = eINSTANCE.getSystemEvent_Type();

    /**
     * The meta object literal for the '{@link ifml.core.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.BooleanExpressionImpl
     * @see ifml.core.impl.CorePackageImpl#getBooleanExpression()
     * @generated
     */
    EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ActivationExpressionImpl <em>Activation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ActivationExpressionImpl
     * @see ifml.core.impl.CorePackageImpl#getActivationExpression()
     * @generated
     */
    EClass ACTIVATION_EXPRESSION = eINSTANCE.getActivationExpression();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ExpressionImpl
     * @see ifml.core.impl.CorePackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__LANGUAGE = eINSTANCE.getExpression_Language();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__BODY = eINSTANCE.getExpression_Body();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ParameterImpl
     * @see ifml.core.impl.CorePackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__KIND = eINSTANCE.getParameter_Kind();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ConditionalExpressionImpl
     * @see ifml.core.impl.CorePackageImpl#getConditionalExpression()
     * @generated
     */
    EClass CONDITIONAL_EXPRESSION = eINSTANCE.getConditionalExpression();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ContextImpl <em>Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ContextImpl
     * @see ifml.core.impl.CorePackageImpl#getContext()
     * @generated
     */
    EClass CONTEXT = eINSTANCE.getContext();

    /**
     * The meta object literal for the '<em><b>Context Dimensions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT__CONTEXT_DIMENSIONS = eINSTANCE.getContext_ContextDimensions();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ContextDimensionImpl <em>Context Dimension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ContextDimensionImpl
     * @see ifml.core.impl.CorePackageImpl#getContextDimension()
     * @generated
     */
    EClass CONTEXT_DIMENSION = eINSTANCE.getContextDimension();

    /**
     * The meta object literal for the '{@link ifml.core.impl.VisualizationAttributeImpl <em>Visualization Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.VisualizationAttributeImpl
     * @see ifml.core.impl.CorePackageImpl#getVisualizationAttribute()
     * @generated
     */
    EClass VISUALIZATION_ATTRIBUTE = eINSTANCE.getVisualizationAttribute();

    /**
     * The meta object literal for the '<em><b>Structural Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISUALIZATION_ATTRIBUTE__STRUCTURAL_FEATURE = eINSTANCE.getVisualizationAttribute_StructuralFeature();

    /**
     * The meta object literal for the '{@link ifml.core.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.ModuleImpl
     * @see ifml.core.impl.CorePackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Input Ports</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__INPUT_PORTS = eINSTANCE.getModule_InputPorts();

    /**
     * The meta object literal for the '<em><b>Output Ports</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__OUTPUT_PORTS = eINSTANCE.getModule_OutputPorts();

    /**
     * The meta object literal for the '<em><b>Interaction Flow Model Elements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__INTERACTION_FLOW_MODEL_ELEMENTS = eINSTANCE.getModule_InteractionFlowModelElements();

    /**
     * The meta object literal for the '{@link ifml.core.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.PortImpl
     * @see ifml.core.impl.CorePackageImpl#getPort()
     * @generated
     */
    EClass PORT = eINSTANCE.getPort();

    /**
     * The meta object literal for the '{@link ifml.core.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.impl.AnnotationImpl
     * @see ifml.core.impl.CorePackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

    /**
     * The meta object literal for the '{@link ifml.core.SystemEventTypeEnum <em>System Event Type Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.SystemEventTypeEnum
     * @see ifml.core.impl.CorePackageImpl#getSystemEventTypeEnum()
     * @generated
     */
    EEnum SYSTEM_EVENT_TYPE_ENUM = eINSTANCE.getSystemEventTypeEnum();

    /**
     * The meta object literal for the '{@link ifml.core.ParameterKind <em>Parameter Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ifml.core.ParameterKind
     * @see ifml.core.impl.CorePackageImpl#getParameterKind()
     * @generated
     */
    EEnum PARAMETER_KIND = eINSTANCE.getParameterKind();

  }

} //CorePackage
