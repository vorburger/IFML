/**
 */
package ifml.core.impl;

import ifml.core.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CoreFactory init()
  {
    try
    {
      CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory(CorePackage.eNS_URI);
      if (theCoreFactory != null)
      {
        return theCoreFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CoreFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoreFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CorePackage.VIEW_POINT: return createViewPoint();
      case CorePackage.NAVIGATION_FLOW: return createNavigationFlow();
      case CorePackage.ACTION_EVENT: return createActionEvent();
      case CorePackage.INTERACTION_FLOW_MODEL: return createInteractionFlowModel();
      case CorePackage.PARAMETER_BINDING_GROUP: return createParameterBindingGroup();
      case CorePackage.PARAMETER_BINDING: return createParameterBinding();
      case CorePackage.CONTENT_MODEL: return createContentModel();
      case CorePackage.VIEW_ELEMENT: return createViewElement();
      case CorePackage.ACTION: return createAction();
      case CorePackage.DYNAMIC_BEHAVIOR: return createDynamicBehavior();
      case CorePackage.DATA_FLOW: return createDataFlow();
      case CorePackage.VIEW_ELEMENT_EVENT: return createViewElementEvent();
      case CorePackage.EXTERNAL_EVENT: return createExternalEvent();
      case CorePackage.CONSTRAINT: return createConstraint();
      case CorePackage.VIEW_COMPONENT_PART: return createViewComponentPart();
      case CorePackage.VIEW_CONTAINER: return createViewContainer();
      case CorePackage.IFML_MODEL: return createIFMLModel();
      case CorePackage.EVENT: return createEvent();
      case CorePackage.INTERACTION_FLOW_EXPRESSION: return createInteractionFlowExpression();
      case CorePackage.DATA_BINDING: return createDataBinding();
      case CorePackage.VIEW_COMPONENT: return createViewComponent();
      case CorePackage.SYSTEM_EVENT: return createSystemEvent();
      case CorePackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
      case CorePackage.ACTIVATION_EXPRESSION: return createActivationExpression();
      case CorePackage.PARAMETER: return createParameter();
      case CorePackage.CONDITIONAL_EXPRESSION: return createConditionalExpression();
      case CorePackage.CONTEXT: return createContext();
      case CorePackage.CONTEXT_DIMENSION: return createContextDimension();
      case CorePackage.VISUALIZATION_ATTRIBUTE: return createVisualizationAttribute();
      case CorePackage.MODULE: return createModule();
      case CorePackage.PORT: return createPort();
      case CorePackage.ANNOTATION: return createAnnotation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CorePackage.SYSTEM_EVENT_TYPE_ENUM:
        return createSystemEventTypeEnumFromString(eDataType, initialValue);
      case CorePackage.PARAMETER_KIND:
        return createParameterKindFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CorePackage.SYSTEM_EVENT_TYPE_ENUM:
        return convertSystemEventTypeEnumToString(eDataType, instanceValue);
      case CorePackage.PARAMETER_KIND:
        return convertParameterKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewPoint createViewPoint()
  {
    ViewPointImpl viewPoint = new ViewPointImpl();
    return viewPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NavigationFlow createNavigationFlow()
  {
    NavigationFlowImpl navigationFlow = new NavigationFlowImpl();
    return navigationFlow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionEvent createActionEvent()
  {
    ActionEventImpl actionEvent = new ActionEventImpl();
    return actionEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionFlowModel createInteractionFlowModel()
  {
    InteractionFlowModelImpl interactionFlowModel = new InteractionFlowModelImpl();
    return interactionFlowModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterBindingGroup createParameterBindingGroup()
  {
    ParameterBindingGroupImpl parameterBindingGroup = new ParameterBindingGroupImpl();
    return parameterBindingGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterBinding createParameterBinding()
  {
    ParameterBindingImpl parameterBinding = new ParameterBindingImpl();
    return parameterBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentModel createContentModel()
  {
    ContentModelImpl contentModel = new ContentModelImpl();
    return contentModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewElement createViewElement()
  {
    ViewElementImpl viewElement = new ViewElementImpl();
    return viewElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicBehavior createDynamicBehavior()
  {
    DynamicBehaviorImpl dynamicBehavior = new DynamicBehaviorImpl();
    return dynamicBehavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataFlow createDataFlow()
  {
    DataFlowImpl dataFlow = new DataFlowImpl();
    return dataFlow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewElementEvent createViewElementEvent()
  {
    ViewElementEventImpl viewElementEvent = new ViewElementEventImpl();
    return viewElementEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalEvent createExternalEvent()
  {
    ExternalEventImpl externalEvent = new ExternalEventImpl();
    return externalEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewComponentPart createViewComponentPart()
  {
    ViewComponentPartImpl viewComponentPart = new ViewComponentPartImpl();
    return viewComponentPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewContainer createViewContainer()
  {
    ViewContainerImpl viewContainer = new ViewContainerImpl();
    return viewContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IFMLModel createIFMLModel()
  {
    IFMLModelImpl ifmlModel = new IFMLModelImpl();
    return ifmlModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionFlowExpression createInteractionFlowExpression()
  {
    InteractionFlowExpressionImpl interactionFlowExpression = new InteractionFlowExpressionImpl();
    return interactionFlowExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataBinding createDataBinding()
  {
    DataBindingImpl dataBinding = new DataBindingImpl();
    return dataBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewComponent createViewComponent()
  {
    ViewComponentImpl viewComponent = new ViewComponentImpl();
    return viewComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemEvent createSystemEvent()
  {
    SystemEventImpl systemEvent = new SystemEventImpl();
    return systemEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpression createBooleanExpression()
  {
    BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
    return booleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivationExpression createActivationExpression()
  {
    ActivationExpressionImpl activationExpression = new ActivationExpressionImpl();
    return activationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalExpression createConditionalExpression()
  {
    ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
    return conditionalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context createContext()
  {
    ContextImpl context = new ContextImpl();
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextDimension createContextDimension()
  {
    ContextDimensionImpl contextDimension = new ContextDimensionImpl();
    return contextDimension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisualizationAttribute createVisualizationAttribute()
  {
    VisualizationAttributeImpl visualizationAttribute = new VisualizationAttributeImpl();
    return visualizationAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemEventTypeEnum createSystemEventTypeEnumFromString(EDataType eDataType, String initialValue)
  {
    SystemEventTypeEnum result = SystemEventTypeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSystemEventTypeEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterKind createParameterKindFromString(EDataType eDataType, String initialValue)
  {
    ParameterKind result = ParameterKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertParameterKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CorePackage getCorePackage()
  {
    return (CorePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CorePackage getPackage()
  {
    return CorePackage.eINSTANCE;
  }

} //CoreFactoryImpl
