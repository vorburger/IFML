/**
 */
package ifml.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ifml.core.CorePackage
 * @generated
 */
public interface CoreFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CoreFactory eINSTANCE = ifml.core.impl.CoreFactoryImpl.init();

  /**
   * Returns a new object of class '<em>View Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Point</em>'.
   * @generated
   */
  ViewPoint createViewPoint();

  /**
   * Returns a new object of class '<em>Navigation Flow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Navigation Flow</em>'.
   * @generated
   */
  NavigationFlow createNavigationFlow();

  /**
   * Returns a new object of class '<em>Action Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Event</em>'.
   * @generated
   */
  ActionEvent createActionEvent();

  /**
   * Returns a new object of class '<em>Interaction Flow Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interaction Flow Model</em>'.
   * @generated
   */
  InteractionFlowModel createInteractionFlowModel();

  /**
   * Returns a new object of class '<em>Parameter Binding Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Binding Group</em>'.
   * @generated
   */
  ParameterBindingGroup createParameterBindingGroup();

  /**
   * Returns a new object of class '<em>Parameter Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Binding</em>'.
   * @generated
   */
  ParameterBinding createParameterBinding();

  /**
   * Returns a new object of class '<em>Content Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Content Model</em>'.
   * @generated
   */
  ContentModel createContentModel();

  /**
   * Returns a new object of class '<em>View Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Element</em>'.
   * @generated
   */
  ViewElement createViewElement();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Dynamic Behavior</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dynamic Behavior</em>'.
   * @generated
   */
  DynamicBehavior createDynamicBehavior();

  /**
   * Returns a new object of class '<em>Data Flow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Flow</em>'.
   * @generated
   */
  DataFlow createDataFlow();

  /**
   * Returns a new object of class '<em>View Element Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Element Event</em>'.
   * @generated
   */
  ViewElementEvent createViewElementEvent();

  /**
   * Returns a new object of class '<em>External Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Event</em>'.
   * @generated
   */
  ExternalEvent createExternalEvent();

  /**
   * Returns a new object of class '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint</em>'.
   * @generated
   */
  Constraint createConstraint();

  /**
   * Returns a new object of class '<em>View Component Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Component Part</em>'.
   * @generated
   */
  ViewComponentPart createViewComponentPart();

  /**
   * Returns a new object of class '<em>View Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Container</em>'.
   * @generated
   */
  ViewContainer createViewContainer();

  /**
   * Returns a new object of class '<em>IFML Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IFML Model</em>'.
   * @generated
   */
  IFMLModel createIFMLModel();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Interaction Flow Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interaction Flow Expression</em>'.
   * @generated
   */
  InteractionFlowExpression createInteractionFlowExpression();

  /**
   * Returns a new object of class '<em>Data Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Binding</em>'.
   * @generated
   */
  DataBinding createDataBinding();

  /**
   * Returns a new object of class '<em>View Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Component</em>'.
   * @generated
   */
  ViewComponent createViewComponent();

  /**
   * Returns a new object of class '<em>System Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Event</em>'.
   * @generated
   */
  SystemEvent createSystemEvent();

  /**
   * Returns a new object of class '<em>Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Expression</em>'.
   * @generated
   */
  BooleanExpression createBooleanExpression();

  /**
   * Returns a new object of class '<em>Activation Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Activation Expression</em>'.
   * @generated
   */
  ActivationExpression createActivationExpression();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Conditional Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Expression</em>'.
   * @generated
   */
  ConditionalExpression createConditionalExpression();

  /**
   * Returns a new object of class '<em>Context</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context</em>'.
   * @generated
   */
  Context createContext();

  /**
   * Returns a new object of class '<em>Context Dimension</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Dimension</em>'.
   * @generated
   */
  ContextDimension createContextDimension();

  /**
   * Returns a new object of class '<em>Visualization Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Visualization Attribute</em>'.
   * @generated
   */
  VisualizationAttribute createVisualizationAttribute();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Port</em>'.
   * @generated
   */
  Port createPort();

  /**
   * Returns a new object of class '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation</em>'.
   * @generated
   */
  Annotation createAnnotation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CorePackage getCorePackage();

} //CoreFactory
