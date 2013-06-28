/**
 */
package ifml.core.impl;

import ifml.core.ConditionalExpression;
import ifml.core.CorePackage;
import ifml.core.DataBinding;
import ifml.core.VisualizationAttribute;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifml.core.impl.DataBindingImpl#getConditionalExpression <em>Conditional Expression</em>}</li>
 *   <li>{@link ifml.core.impl.DataBindingImpl#getVisualizationAttributes <em>Visualization Attributes</em>}</li>
 *   <li>{@link ifml.core.impl.DataBindingImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataBindingImpl extends ContentBindingImpl implements DataBinding
{
  /**
   * The cached value of the '{@link #getConditionalExpression() <em>Conditional Expression</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionalExpression()
   * @generated
   * @ordered
   */
  protected EList<ConditionalExpression> conditionalExpression;

  /**
   * The cached value of the '{@link #getVisualizationAttributes() <em>Visualization Attributes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisualizationAttributes()
   * @generated
   * @ordered
   */
  protected EList<VisualizationAttribute> visualizationAttributes;

  /**
   * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassifier()
   * @generated
   * @ordered
   */
  protected Classifier classifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataBindingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CorePackage.Literals.DATA_BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConditionalExpression> getConditionalExpression()
  {
    if (conditionalExpression == null)
    {
      conditionalExpression = new EObjectResolvingEList<ConditionalExpression>(ConditionalExpression.class, this, CorePackage.DATA_BINDING__CONDITIONAL_EXPRESSION);
    }
    return conditionalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VisualizationAttribute> getVisualizationAttributes()
  {
    if (visualizationAttributes == null)
    {
      visualizationAttributes = new EObjectResolvingEList<VisualizationAttribute>(VisualizationAttribute.class, this, CorePackage.DATA_BINDING__VISUALIZATION_ATTRIBUTES);
    }
    return visualizationAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classifier getClassifier()
  {
    if (classifier != null && classifier.eIsProxy())
    {
      InternalEObject oldClassifier = (InternalEObject)classifier;
      classifier = (Classifier)eResolveProxy(oldClassifier);
      if (classifier != oldClassifier)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DATA_BINDING__CLASSIFIER, oldClassifier, classifier));
      }
    }
    return classifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classifier basicGetClassifier()
  {
    return classifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassifier(Classifier newClassifier)
  {
    Classifier oldClassifier = classifier;
    classifier = newClassifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DATA_BINDING__CLASSIFIER, oldClassifier, classifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CorePackage.DATA_BINDING__CONDITIONAL_EXPRESSION:
        return getConditionalExpression();
      case CorePackage.DATA_BINDING__VISUALIZATION_ATTRIBUTES:
        return getVisualizationAttributes();
      case CorePackage.DATA_BINDING__CLASSIFIER:
        if (resolve) return getClassifier();
        return basicGetClassifier();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CorePackage.DATA_BINDING__CONDITIONAL_EXPRESSION:
        getConditionalExpression().clear();
        getConditionalExpression().addAll((Collection<? extends ConditionalExpression>)newValue);
        return;
      case CorePackage.DATA_BINDING__VISUALIZATION_ATTRIBUTES:
        getVisualizationAttributes().clear();
        getVisualizationAttributes().addAll((Collection<? extends VisualizationAttribute>)newValue);
        return;
      case CorePackage.DATA_BINDING__CLASSIFIER:
        setClassifier((Classifier)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CorePackage.DATA_BINDING__CONDITIONAL_EXPRESSION:
        getConditionalExpression().clear();
        return;
      case CorePackage.DATA_BINDING__VISUALIZATION_ATTRIBUTES:
        getVisualizationAttributes().clear();
        return;
      case CorePackage.DATA_BINDING__CLASSIFIER:
        setClassifier((Classifier)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CorePackage.DATA_BINDING__CONDITIONAL_EXPRESSION:
        return conditionalExpression != null && !conditionalExpression.isEmpty();
      case CorePackage.DATA_BINDING__VISUALIZATION_ATTRIBUTES:
        return visualizationAttributes != null && !visualizationAttributes.isEmpty();
      case CorePackage.DATA_BINDING__CLASSIFIER:
        return classifier != null;
    }
    return super.eIsSet(featureID);
  }

} //DataBindingImpl
