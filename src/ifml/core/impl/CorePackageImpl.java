/**
 */
package ifml.core.impl;

import ifml.core.Action;
import ifml.core.ActionEvent;
import ifml.core.ActivationExpression;
import ifml.core.Annotation;
import ifml.core.BooleanExpression;
import ifml.core.ConditionalExpression;
import ifml.core.Constraint;
import ifml.core.ContentBinding;
import ifml.core.ContentModel;
import ifml.core.Context;
import ifml.core.ContextDimension;
import ifml.core.CoreFactory;
import ifml.core.CorePackage;
import ifml.core.DataBinding;
import ifml.core.DataFlow;
import ifml.core.DynamicBehavior;
import ifml.core.Element;
import ifml.core.Event;
import ifml.core.Expression;
import ifml.core.ExternalEvent;
import ifml.core.IFMLModel;
import ifml.core.InteractionFlow;
import ifml.core.InteractionFlowElement;
import ifml.core.InteractionFlowExpression;
import ifml.core.InteractionFlowModel;
import ifml.core.InteractionFlowModelElement;
import ifml.core.Module;
import ifml.core.NamedElement;
import ifml.core.NavigationFlow;
import ifml.core.Parameter;
import ifml.core.ParameterBinding;
import ifml.core.ParameterBindingGroup;
import ifml.core.ParameterKind;
import ifml.core.Port;
import ifml.core.SystemEvent;
import ifml.core.SystemEventTypeEnum;
import ifml.core.ViewComponent;
import ifml.core.ViewComponentPart;
import ifml.core.ViewContainer;
import ifml.core.ViewElement;
import ifml.core.ViewElementEvent;
import ifml.core.ViewPoint;
import ifml.core.VisualizationAttribute;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewPointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactionFlowElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass navigationFlowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactionFlowModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterBindingGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contentModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dynamicBehaviorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataFlowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactionFlowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewElementEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactionFlowModelElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewComponentPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifmlModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contentBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactionFlowExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activationExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextDimensionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visualizationAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass portEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum systemEventTypeEnumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum parameterKindEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see ifml.core.CorePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CorePackageImpl()
  {
    super(eNS_URI, CoreFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CorePackage init()
  {
    if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

    // Obtain or create and register package
    CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();
    UmlPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theCorePackage.createPackageContents();

    // Initialize created meta-data
    theCorePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCorePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
    return theCorePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewPoint()
  {
    return viewPointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewPoint_InteractionFlowModelElements()
  {
    return (EReference)viewPointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewPoint_Context()
  {
    return (EReference)viewPointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractionFlowElement()
  {
    return interactionFlowElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractionFlowElement_Parameters()
  {
    return (EReference)interactionFlowElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractionFlowElement_InInteractionFlows()
  {
    return (EReference)interactionFlowElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractionFlowElement_OutInteractionFlows()
  {
    return (EReference)interactionFlowElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNavigationFlow()
  {
    return navigationFlowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNavigationFlow_DataFlows()
  {
    return (EReference)navigationFlowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionEvent()
  {
    return actionEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractionFlowModel()
  {
    return interactionFlowModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractionFlowModel_InteractionFlowModelElements()
  {
    return (EReference)interactionFlowModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterBindingGroup()
  {
    return parameterBindingGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterBindingGroup_ParameterBindings()
  {
    return (EReference)parameterBindingGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterBinding()
  {
    return parameterBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterBinding_SourceParameter()
  {
    return (EReference)parameterBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterBinding_TargetParameter()
  {
    return (EReference)parameterBindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContentModel()
  {
    return contentModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContentModel_Elements()
  {
    return (EReference)contentModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewElement()
  {
    return viewElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewElement_ViewElementEvents()
  {
    return (EReference)viewElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewElement_ActivationExpression()
  {
    return (EReference)viewElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewElement_ViewContainer()
  {
    return (EReference)viewElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_ActionEvents()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_DynamicBehavior()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElement_Id()
  {
    return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_Constraints()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_Annotations()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDynamicBehavior()
  {
    return dynamicBehaviorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDynamicBehavior_BehavioralFeature()
  {
    return (EReference)dynamicBehaviorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDynamicBehavior_Behavior()
  {
    return (EReference)dynamicBehaviorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataFlow()
  {
    return dataFlowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractionFlow()
  {
    return interactionFlowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractionFlow_SrcInteractionFlowElement()
  {
    return (EReference)interactionFlowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractionFlow_TrgtInteractionFlowElement()
  {
    return (EReference)interactionFlowEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractionFlow_ParameterBindingGroup()
  {
    return (EReference)interactionFlowEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewElementEvent()
  {
    return viewElementEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractionFlowModelElement()
  {
    return interactionFlowModelElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedElement()
  {
    return namedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedElement_Name()
  {
    return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalEvent()
  {
    return externalEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraint()
  {
    return constraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewComponentPart()
  {
    return viewComponentPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewComponentPart_ViewElementEvents()
  {
    return (EReference)viewComponentPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewComponentPart_ActivationExpression()
  {
    return (EReference)viewComponentPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewComponentPart_SubViewComponentParts()
  {
    return (EReference)viewComponentPartEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewComponentPart_ParentViewComponentPart()
  {
    return (EReference)viewComponentPartEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewContainer()
  {
    return viewContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewContainer_IsLandMark()
  {
    return (EAttribute)viewContainerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewContainer_IsDefault()
  {
    return (EAttribute)viewContainerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewContainer_ViewElements()
  {
    return (EReference)viewContainerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIFMLModel()
  {
    return ifmlModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIFMLModel_InteractionFlowModel()
  {
    return (EReference)ifmlModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIFMLModel_ContentModel()
  {
    return (EReference)ifmlModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIFMLModel_InteractionFlowModelViewPoints()
  {
    return (EReference)ifmlModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_ActivationExpression()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_NavigationFlows()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_InteractionFlowExpression()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContentBinding()
  {
    return contentBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContentBinding_UniformResourceIdentifier()
  {
    return (EAttribute)contentBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractionFlowExpression()
  {
    return interactionFlowExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractionFlowExpression_InteractionFlows()
  {
    return (EReference)interactionFlowExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataBinding()
  {
    return dataBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataBinding_ConditionalExpression()
  {
    return (EReference)dataBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataBinding_VisualizationAttributes()
  {
    return (EReference)dataBindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataBinding_Classifier()
  {
    return (EReference)dataBindingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewComponent()
  {
    return viewComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewComponent_ViewComponentParts()
  {
    return (EReference)viewComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemEvent()
  {
    return systemEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemEvent_TriggeringExpressions()
  {
    return (EReference)systemEventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystemEvent_Type()
  {
    return (EAttribute)systemEventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanExpression()
  {
    return booleanExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivationExpression()
  {
    return activationExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Language()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Body()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Kind()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionalExpression()
  {
    return conditionalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContext()
  {
    return contextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContext_ContextDimensions()
  {
    return (EReference)contextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextDimension()
  {
    return contextDimensionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVisualizationAttribute()
  {
    return visualizationAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVisualizationAttribute_StructuralFeature()
  {
    return (EReference)visualizationAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule()
  {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_InputPorts()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_OutputPorts()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_InteractionFlowModelElements()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPort()
  {
    return portEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotation()
  {
    return annotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_Text()
  {
    return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSystemEventTypeEnum()
  {
    return systemEventTypeEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getParameterKind()
  {
    return parameterKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoreFactory getCoreFactory()
  {
    return (CoreFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    viewPointEClass = createEClass(VIEW_POINT);
    createEReference(viewPointEClass, VIEW_POINT__INTERACTION_FLOW_MODEL_ELEMENTS);
    createEReference(viewPointEClass, VIEW_POINT__CONTEXT);

    interactionFlowElementEClass = createEClass(INTERACTION_FLOW_ELEMENT);
    createEReference(interactionFlowElementEClass, INTERACTION_FLOW_ELEMENT__PARAMETERS);
    createEReference(interactionFlowElementEClass, INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS);
    createEReference(interactionFlowElementEClass, INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS);

    navigationFlowEClass = createEClass(NAVIGATION_FLOW);
    createEReference(navigationFlowEClass, NAVIGATION_FLOW__DATA_FLOWS);

    actionEventEClass = createEClass(ACTION_EVENT);

    interactionFlowModelEClass = createEClass(INTERACTION_FLOW_MODEL);
    createEReference(interactionFlowModelEClass, INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS);

    parameterBindingGroupEClass = createEClass(PARAMETER_BINDING_GROUP);
    createEReference(parameterBindingGroupEClass, PARAMETER_BINDING_GROUP__PARAMETER_BINDINGS);

    parameterBindingEClass = createEClass(PARAMETER_BINDING);
    createEReference(parameterBindingEClass, PARAMETER_BINDING__SOURCE_PARAMETER);
    createEReference(parameterBindingEClass, PARAMETER_BINDING__TARGET_PARAMETER);

    contentModelEClass = createEClass(CONTENT_MODEL);
    createEReference(contentModelEClass, CONTENT_MODEL__ELEMENTS);

    viewElementEClass = createEClass(VIEW_ELEMENT);
    createEReference(viewElementEClass, VIEW_ELEMENT__VIEW_ELEMENT_EVENTS);
    createEReference(viewElementEClass, VIEW_ELEMENT__ACTIVATION_EXPRESSION);
    createEReference(viewElementEClass, VIEW_ELEMENT__VIEW_CONTAINER);

    actionEClass = createEClass(ACTION);
    createEReference(actionEClass, ACTION__ACTION_EVENTS);
    createEReference(actionEClass, ACTION__DYNAMIC_BEHAVIOR);

    elementEClass = createEClass(ELEMENT);
    createEAttribute(elementEClass, ELEMENT__ID);
    createEReference(elementEClass, ELEMENT__CONSTRAINTS);
    createEReference(elementEClass, ELEMENT__ANNOTATIONS);

    dynamicBehaviorEClass = createEClass(DYNAMIC_BEHAVIOR);
    createEReference(dynamicBehaviorEClass, DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE);
    createEReference(dynamicBehaviorEClass, DYNAMIC_BEHAVIOR__BEHAVIOR);

    dataFlowEClass = createEClass(DATA_FLOW);

    interactionFlowEClass = createEClass(INTERACTION_FLOW);
    createEReference(interactionFlowEClass, INTERACTION_FLOW__SRC_INTERACTION_FLOW_ELEMENT);
    createEReference(interactionFlowEClass, INTERACTION_FLOW__TRGT_INTERACTION_FLOW_ELEMENT);
    createEReference(interactionFlowEClass, INTERACTION_FLOW__PARAMETER_BINDING_GROUP);

    viewElementEventEClass = createEClass(VIEW_ELEMENT_EVENT);

    interactionFlowModelElementEClass = createEClass(INTERACTION_FLOW_MODEL_ELEMENT);

    namedElementEClass = createEClass(NAMED_ELEMENT);
    createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

    externalEventEClass = createEClass(EXTERNAL_EVENT);

    constraintEClass = createEClass(CONSTRAINT);

    viewComponentPartEClass = createEClass(VIEW_COMPONENT_PART);
    createEReference(viewComponentPartEClass, VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS);
    createEReference(viewComponentPartEClass, VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION);
    createEReference(viewComponentPartEClass, VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS);
    createEReference(viewComponentPartEClass, VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART);

    viewContainerEClass = createEClass(VIEW_CONTAINER);
    createEAttribute(viewContainerEClass, VIEW_CONTAINER__IS_LAND_MARK);
    createEAttribute(viewContainerEClass, VIEW_CONTAINER__IS_DEFAULT);
    createEReference(viewContainerEClass, VIEW_CONTAINER__VIEW_ELEMENTS);

    ifmlModelEClass = createEClass(IFML_MODEL);
    createEReference(ifmlModelEClass, IFML_MODEL__INTERACTION_FLOW_MODEL);
    createEReference(ifmlModelEClass, IFML_MODEL__CONTENT_MODEL);
    createEReference(ifmlModelEClass, IFML_MODEL__INTERACTION_FLOW_MODEL_VIEW_POINTS);

    eventEClass = createEClass(EVENT);
    createEReference(eventEClass, EVENT__ACTIVATION_EXPRESSION);
    createEReference(eventEClass, EVENT__NAVIGATION_FLOWS);
    createEReference(eventEClass, EVENT__INTERACTION_FLOW_EXPRESSION);

    contentBindingEClass = createEClass(CONTENT_BINDING);
    createEAttribute(contentBindingEClass, CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER);

    interactionFlowExpressionEClass = createEClass(INTERACTION_FLOW_EXPRESSION);
    createEReference(interactionFlowExpressionEClass, INTERACTION_FLOW_EXPRESSION__INTERACTION_FLOWS);

    dataBindingEClass = createEClass(DATA_BINDING);
    createEReference(dataBindingEClass, DATA_BINDING__CONDITIONAL_EXPRESSION);
    createEReference(dataBindingEClass, DATA_BINDING__VISUALIZATION_ATTRIBUTES);
    createEReference(dataBindingEClass, DATA_BINDING__CLASSIFIER);

    viewComponentEClass = createEClass(VIEW_COMPONENT);
    createEReference(viewComponentEClass, VIEW_COMPONENT__VIEW_COMPONENT_PARTS);

    systemEventEClass = createEClass(SYSTEM_EVENT);
    createEReference(systemEventEClass, SYSTEM_EVENT__TRIGGERING_EXPRESSIONS);
    createEAttribute(systemEventEClass, SYSTEM_EVENT__TYPE);

    booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);

    activationExpressionEClass = createEClass(ACTIVATION_EXPRESSION);

    expressionEClass = createEClass(EXPRESSION);
    createEAttribute(expressionEClass, EXPRESSION__LANGUAGE);
    createEAttribute(expressionEClass, EXPRESSION__BODY);

    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__KIND);

    conditionalExpressionEClass = createEClass(CONDITIONAL_EXPRESSION);

    contextEClass = createEClass(CONTEXT);
    createEReference(contextEClass, CONTEXT__CONTEXT_DIMENSIONS);

    contextDimensionEClass = createEClass(CONTEXT_DIMENSION);

    visualizationAttributeEClass = createEClass(VISUALIZATION_ATTRIBUTE);
    createEReference(visualizationAttributeEClass, VISUALIZATION_ATTRIBUTE__STRUCTURAL_FEATURE);

    moduleEClass = createEClass(MODULE);
    createEReference(moduleEClass, MODULE__INPUT_PORTS);
    createEReference(moduleEClass, MODULE__OUTPUT_PORTS);
    createEReference(moduleEClass, MODULE__INTERACTION_FLOW_MODEL_ELEMENTS);

    portEClass = createEClass(PORT);

    annotationEClass = createEClass(ANNOTATION);
    createEAttribute(annotationEClass, ANNOTATION__TEXT);

    // Create enums
    systemEventTypeEnumEEnum = createEEnum(SYSTEM_EVENT_TYPE_ENUM);
    parameterKindEEnum = createEEnum(PARAMETER_KIND);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    UmlPackage theUmlPackage = (UmlPackage)EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    viewPointEClass.getESuperTypes().add(this.getNamedElement());
    interactionFlowElementEClass.getESuperTypes().add(this.getNamedElement());
    interactionFlowElementEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
    interactionFlowElementEClass.getESuperTypes().add(theUmlPackage.getTemplaetableElement());
    navigationFlowEClass.getESuperTypes().add(this.getInteractionFlow());
    actionEventEClass.getESuperTypes().add(this.getEvent());
    interactionFlowModelEClass.getESuperTypes().add(this.getNamedElement());
    parameterBindingGroupEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
    parameterBindingEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
    contentModelEClass.getESuperTypes().add(this.getNamedElement());
    viewElementEClass.getESuperTypes().add(this.getInteractionFlowElement());
    actionEClass.getESuperTypes().add(this.getInteractionFlowElement());
    dynamicBehaviorEClass.getESuperTypes().add(this.getContentBinding());
    dataFlowEClass.getESuperTypes().add(this.getInteractionFlow());
    interactionFlowEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
    viewElementEventEClass.getESuperTypes().add(this.getEvent());
    interactionFlowModelElementEClass.getESuperTypes().add(this.getElement());
    namedElementEClass.getESuperTypes().add(this.getElement());
    externalEventEClass.getESuperTypes().add(this.getEvent());
    constraintEClass.getESuperTypes().add(this.getBooleanExpression());
    viewComponentPartEClass.getESuperTypes().add(this.getInteractionFlowElement());
    viewContainerEClass.getESuperTypes().add(this.getViewElement());
    ifmlModelEClass.getESuperTypes().add(this.getNamedElement());
    eventEClass.getESuperTypes().add(this.getInteractionFlowElement());
    contentBindingEClass.getESuperTypes().add(this.getViewComponentPart());
    interactionFlowExpressionEClass.getESuperTypes().add(this.getExpression());
    dataBindingEClass.getESuperTypes().add(this.getContentBinding());
    viewComponentEClass.getESuperTypes().add(this.getViewElement());
    systemEventEClass.getESuperTypes().add(this.getEvent());
    booleanExpressionEClass.getESuperTypes().add(this.getExpression());
    activationExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
    expressionEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
    parameterEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
    parameterEClass.getESuperTypes().add(theUmlPackage.getMultiplicityElement());
    parameterEClass.getESuperTypes().add(theUmlPackage.getTypedElement());
    parameterEClass.getESuperTypes().add(this.getNamedElement());
    conditionalExpressionEClass.getESuperTypes().add(this.getExpression());
    conditionalExpressionEClass.getESuperTypes().add(this.getViewComponentPart());
    contextEClass.getESuperTypes().add(this.getElement());
    contextDimensionEClass.getESuperTypes().add(this.getNamedElement());
    visualizationAttributeEClass.getESuperTypes().add(this.getViewComponentPart());
    moduleEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
    portEClass.getESuperTypes().add(this.getInteractionFlowElement());

    // Initialize classes, features, and operations; add parameters
    initEClass(viewPointEClass, ViewPoint.class, "ViewPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewPoint_InteractionFlowModelElements(), this.getInteractionFlowModelElement(), null, "interactionFlowModelElements", null, 0, -1, ViewPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getViewPoint_Context(), this.getContext(), null, "context", null, 1, 1, ViewPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactionFlowElementEClass, InteractionFlowElement.class, "InteractionFlowElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractionFlowElement_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, InteractionFlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getInteractionFlowElement_InInteractionFlows(), this.getInteractionFlow(), null, "inInteractionFlows", null, 0, -1, InteractionFlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getInteractionFlowElement_OutInteractionFlows(), this.getInteractionFlow(), null, "outInteractionFlows", null, 0, -1, InteractionFlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(navigationFlowEClass, NavigationFlow.class, "NavigationFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNavigationFlow_DataFlows(), this.getDataFlow(), null, "dataFlows", null, 0, -1, NavigationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(actionEventEClass, ActionEvent.class, "ActionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactionFlowModelEClass, InteractionFlowModel.class, "InteractionFlowModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractionFlowModel_InteractionFlowModelElements(), this.getInteractionFlowModelElement(), null, "interactionFlowModelElements", null, 0, -1, InteractionFlowModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(parameterBindingGroupEClass, ParameterBindingGroup.class, "ParameterBindingGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterBindingGroup_ParameterBindings(), this.getParameterBinding(), null, "parameterBindings", null, 0, -1, ParameterBindingGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(parameterBindingEClass, ParameterBinding.class, "ParameterBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterBinding_SourceParameter(), this.getParameter(), null, "sourceParameter", null, 1, 1, ParameterBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getParameterBinding_TargetParameter(), this.getParameter(), null, "targetParameter", null, 1, 1, ParameterBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(contentModelEClass, ContentModel.class, "ContentModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContentModel_Elements(), theUmlPackage.getElement(), null, "elements", null, 0, -1, ContentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewElementEClass, ViewElement.class, "ViewElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewElement_ViewElementEvents(), this.getViewElementEvent(), null, "viewElementEvents", null, 0, -1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getViewElement_ActivationExpression(), this.getActivationExpression(), null, "activationExpression", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getViewElement_ViewContainer(), this.getViewContainer(), null, "viewContainer", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAction_ActionEvents(), this.getActionEvent(), null, "actionEvents", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getAction_DynamicBehavior(), this.getDynamicBehavior(), null, "dynamicBehavior", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElement_Id(), theEcorePackage.getEString(), "id", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getElement_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getElement_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dynamicBehaviorEClass, DynamicBehavior.class, "DynamicBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDynamicBehavior_BehavioralFeature(), theUmlPackage.getBehavioralFeature(), null, "behavioralFeature", null, 0, 1, DynamicBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDynamicBehavior_Behavior(), theUmlPackage.getBehavior(), null, "behavior", null, 0, 1, DynamicBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataFlowEClass, DataFlow.class, "DataFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactionFlowEClass, InteractionFlow.class, "InteractionFlow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractionFlow_SrcInteractionFlowElement(), this.getInteractionFlowElement(), null, "srcInteractionFlowElement", null, 1, 1, InteractionFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getInteractionFlow_TrgtInteractionFlowElement(), this.getInteractionFlowElement(), null, "trgtInteractionFlowElement", null, 1, 1, InteractionFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getInteractionFlow_ParameterBindingGroup(), this.getParameterBindingGroup(), null, "parameterBindingGroup", null, 0, 1, InteractionFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(viewElementEventEClass, ViewElementEvent.class, "ViewElementEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactionFlowModelElementEClass, InteractionFlowModelElement.class, "InteractionFlowModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedElement_Name(), theEcorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(externalEventEClass, ExternalEvent.class, "ExternalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(viewComponentPartEClass, ViewComponentPart.class, "ViewComponentPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewComponentPart_ViewElementEvents(), this.getViewElementEvent(), null, "viewElementEvents", null, 0, -1, ViewComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getViewComponentPart_ActivationExpression(), this.getActivationExpression(), null, "activationExpression", null, 0, 1, ViewComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getViewComponentPart_SubViewComponentParts(), this.getViewComponentPart(), this.getViewComponentPart_ParentViewComponentPart(), "subViewComponentParts", null, 0, -1, ViewComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViewComponentPart_ParentViewComponentPart(), this.getViewComponentPart(), this.getViewComponentPart_SubViewComponentParts(), "parentViewComponentPart", null, 1, 1, ViewComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewContainerEClass, ViewContainer.class, "ViewContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getViewContainer_IsLandMark(), theEcorePackage.getEBoolean(), "isLandMark", null, 1, 1, ViewContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getViewContainer_IsDefault(), theEcorePackage.getEBoolean(), "isDefault", null, 1, 1, ViewContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getViewContainer_ViewElements(), this.getViewElement(), null, "viewElements", null, 0, -1, ViewContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(ifmlModelEClass, IFMLModel.class, "IFMLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIFMLModel_InteractionFlowModel(), this.getInteractionFlowModel(), null, "interactionFlowModel", null, 1, 1, IFMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getIFMLModel_ContentModel(), this.getContentModel(), null, "contentModel", null, 1, 1, IFMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getIFMLModel_InteractionFlowModelViewPoints(), this.getViewPoint(), null, "interactionFlowModelViewPoints", null, 0, -1, IFMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEvent_ActivationExpression(), this.getActivationExpression(), null, "activationExpression", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getEvent_NavigationFlows(), this.getNavigationFlow(), null, "navigationFlows", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getEvent_InteractionFlowExpression(), this.getInteractionFlowExpression(), null, "interactionFlowExpression", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(contentBindingEClass, ContentBinding.class, "ContentBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContentBinding_UniformResourceIdentifier(), theEcorePackage.getEString(), "uniformResourceIdentifier", null, 0, 1, ContentBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactionFlowExpressionEClass, InteractionFlowExpression.class, "InteractionFlowExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractionFlowExpression_InteractionFlows(), this.getInteractionFlow(), null, "interactionFlows", null, 1, -1, InteractionFlowExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataBindingEClass, DataBinding.class, "DataBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataBinding_ConditionalExpression(), this.getConditionalExpression(), null, "conditionalExpression", null, 0, -1, DataBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataBinding_VisualizationAttributes(), this.getVisualizationAttribute(), null, "visualizationAttributes", null, 0, -1, DataBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataBinding_Classifier(), theUmlPackage.getClassifier(), null, "classifier", null, 1, 1, DataBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewComponentEClass, ViewComponent.class, "ViewComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewComponent_ViewComponentParts(), this.getViewComponentPart(), null, "viewComponentParts", null, 0, -1, ViewComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemEventEClass, SystemEvent.class, "SystemEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSystemEvent_TriggeringExpressions(), this.getExpression(), null, "triggeringExpressions", null, 1, -1, SystemEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getSystemEvent_Type(), this.getSystemEventTypeEnum(), "type", null, 1, 1, SystemEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(activationExpressionEClass, ActivationExpression.class, "ActivationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpression_Language(), theEcorePackage.getEString(), "language", null, 1, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getExpression_Body(), theEcorePackage.getEString(), "body", null, 1, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameter_Kind(), this.getParameterKind(), "kind", "ordinary", 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(conditionalExpressionEClass, ConditionalExpression.class, "ConditionalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContext_ContextDimensions(), this.getContextDimension(), null, "contextDimensions", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextDimensionEClass, ContextDimension.class, "ContextDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(visualizationAttributeEClass, VisualizationAttribute.class, "VisualizationAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVisualizationAttribute_StructuralFeature(), theUmlPackage.getStructuralFeature(), null, "structuralFeature", null, 0, 1, VisualizationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModule_InputPorts(), this.getPort(), null, "inputPorts", null, 1, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_OutputPorts(), this.getPort(), null, "outputPorts", null, 1, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_InteractionFlowModelElements(), this.getInteractionFlowModelElement(), null, "interactionFlowModelElements", null, 1, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnnotation_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(systemEventTypeEnumEEnum, SystemEventTypeEnum.class, "SystemEventTypeEnum");
    addEEnumLiteral(systemEventTypeEnumEEnum, SystemEventTypeEnum.TIME);
    addEEnumLiteral(systemEventTypeEnumEEnum, SystemEventTypeEnum.SPECIAL_CONDITION);

    initEEnum(parameterKindEEnum, ParameterKind.class, "ParameterKind");
    addEEnumLiteral(parameterKindEEnum, ParameterKind.ORDINARY);
    addEEnumLiteral(parameterKindEEnum, ParameterKind.INPUT);
    addEEnumLiteral(parameterKindEEnum, ParameterKind.OUTPUT);
    addEEnumLiteral(parameterKindEEnum, ParameterKind.INPUT_OUTPUT);

    // Create resource
    createResource(eNS_URI);
  }

} //CorePackageImpl
