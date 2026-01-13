/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs.util;

import it.polimi.lIRAs.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.polimi.lIRAs.LIRAsPackage
 * @generated
 */
public class LIRAsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LIRAsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LIRAsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LIRAsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LIRAsSwitch<Adapter> modelSwitch =
    new LIRAsSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter casePattern(Pattern object)
      {
        return createPatternAdapter();
      }
      @Override
      public Adapter caseSequence(Sequence object)
      {
        return createSequenceAdapter();
      }
      @Override
      public Adapter caseSubSequence(SubSequence object)
      {
        return createSubSequenceAdapter();
      }
      @Override
      public Adapter caseConclusion(Conclusion object)
      {
        return createConclusionAdapter();
      }
      @Override
      public Adapter caseLoop(Loop object)
      {
        return createLoopAdapter();
      }
      @Override
      public Adapter caseConditionalStatement(ConditionalStatement object)
      {
        return createConditionalStatementAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseAtomicPredicate(AtomicPredicate object)
      {
        return createAtomicPredicateAdapter();
      }
      @Override
      public Adapter caseRelation(Relation object)
      {
        return createRelationAdapter();
      }
      @Override
      public Adapter caseTarget(Target object)
      {
        return createTargetAdapter();
      }
      @Override
      public Adapter caseAgent(Agent object)
      {
        return createAgentAdapter();
      }
      @Override
      public Adapter caseHuman(Human object)
      {
        return createHumanAdapter();
      }
      @Override
      public Adapter caseRobot(Robot object)
      {
        return createRobotAdapter();
      }
      @Override
      public Adapter caseLocation(Location object)
      {
        return createLocationAdapter();
      }
      @Override
      public Adapter caseResource(Resource object)
      {
        return createResourceAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link it.polimi.lIRAs.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.lIRAs.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.lIRAs.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.lIRAs.Pattern
   * @generated
   */
  public Adapter createPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.lIRAs.Sequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.lIRAs.Sequence
   * @generated
   */
  public Adapter createSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.lIRAs.SubSequence <em>Sub Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.lIRAs.SubSequence
   * @generated
   */
  public Adapter createSubSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.lIRAs.Conclusion <em>Conclusion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.lIRAs.Conclusion
   * @generated
   */
  public Adapter createConclusionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.lIRAs.Loop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.lIRAs.Loop
   * @generated
   */
  public Adapter createLoopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.lIRAs.ConditionalStatement <em>Conditional Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.lIRAs.ConditionalStatement
   * @generated
   */
  public Adapter createConditionalStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.lIRAs.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.lIRAs.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.lIRAs.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.lIRAs.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.lIRAs.AtomicPredicate <em>Atomic Predicate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.lIRAs.AtomicPredicate
   * @generated
   */
  public Adapter createAtomicPredicateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.lIRAs.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.lIRAs.Relation
   * @generated
   */
  public Adapter createRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.lIRAs.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.lIRAs.Target
   * @generated
   */
  public Adapter createTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.lIRAs.Agent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.lIRAs.Agent
   * @generated
   */
  public Adapter createAgentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.lIRAs.Human <em>Human</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.lIRAs.Human
   * @generated
   */
  public Adapter createHumanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.lIRAs.Robot <em>Robot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.lIRAs.Robot
   * @generated
   */
  public Adapter createRobotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.lIRAs.Location <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.lIRAs.Location
   * @generated
   */
  public Adapter createLocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.polimi.lIRAs.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.polimi.lIRAs.Resource
   * @generated
   */
  public Adapter createResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LIRAsAdapterFactory
