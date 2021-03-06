/**
 * generated by Xtext 2.21.0
 */
package com.example.specs.specsDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.example.specs.specsDsl.SpecsDslFactory
 * @model kind="package"
 * @generated
 */
public interface SpecsDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "specsDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.example.com/specs/SpecsDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "specsDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpecsDslPackage eINSTANCE = com.example.specs.specsDsl.impl.SpecsDslPackageImpl.init();

  /**
   * The meta object id for the '{@link com.example.specs.specsDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.specs.specsDsl.impl.ModelImpl
   * @see com.example.specs.specsDsl.impl.SpecsDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Specs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SPECS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.example.specs.specsDsl.impl.SpecImpl <em>Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.specs.specsDsl.impl.SpecImpl
   * @see com.example.specs.specsDsl.impl.SpecsDslPackageImpl#getSpec()
   * @generated
   */
  int SPEC = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC__NAME = 0;

  /**
   * The feature id for the '<em><b>Processor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC__PROCESSOR = 1;

  /**
   * The feature id for the '<em><b>Motherboard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC__MOTHERBOARD = 2;

  /**
   * The feature id for the '<em><b>Memories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC__MEMORIES = 3;

  /**
   * The number of structural features of the '<em>Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.example.specs.specsDsl.impl.ProcessorImpl <em>Processor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.specs.specsDsl.impl.ProcessorImpl
   * @see com.example.specs.specsDsl.impl.SpecsDslPackageImpl#getProcessor()
   * @generated
   */
  int PROCESSOR = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Clock Speed</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSOR__CLOCK_SPEED = 1;

  /**
   * The feature id for the '<em><b>Cores</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSOR__CORES = 2;

  /**
   * The number of structural features of the '<em>Processor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.example.specs.specsDsl.impl.ClockSpeedImpl <em>Clock Speed</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.specs.specsDsl.impl.ClockSpeedImpl
   * @see com.example.specs.specsDsl.impl.SpecsDslPackageImpl#getClockSpeed()
   * @generated
   */
  int CLOCK_SPEED = 3;

  /**
   * The feature id for the '<em><b>Clock Speed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOCK_SPEED__CLOCK_SPEED = 0;

  /**
   * The number of structural features of the '<em>Clock Speed</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOCK_SPEED_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.example.specs.specsDsl.impl.CoresImpl <em>Cores</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.specs.specsDsl.impl.CoresImpl
   * @see com.example.specs.specsDsl.impl.SpecsDslPackageImpl#getCores()
   * @generated
   */
  int CORES = 4;

  /**
   * The feature id for the '<em><b>Cores</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORES__CORES = 0;

  /**
   * The number of structural features of the '<em>Cores</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.example.specs.specsDsl.impl.MotherboardImpl <em>Motherboard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.specs.specsDsl.impl.MotherboardImpl
   * @see com.example.specs.specsDsl.impl.SpecsDslPackageImpl#getMotherboard()
   * @generated
   */
  int MOTHERBOARD = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOTHERBOARD__NAME = 0;

  /**
   * The number of structural features of the '<em>Motherboard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOTHERBOARD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.example.specs.specsDsl.impl.MemoryImpl <em>Memory</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.specs.specsDsl.impl.MemoryImpl
   * @see com.example.specs.specsDsl.impl.SpecsDslPackageImpl#getMemory()
   * @generated
   */
  int MEMORY = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMORY__NAME = 0;

  /**
   * The feature id for the '<em><b>Capacity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMORY__CAPACITY = 1;

  /**
   * The number of structural features of the '<em>Memory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMORY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.example.specs.specsDsl.impl.CapacityImpl <em>Capacity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.specs.specsDsl.impl.CapacityImpl
   * @see com.example.specs.specsDsl.impl.SpecsDslPackageImpl#getCapacity()
   * @generated
   */
  int CAPACITY = 7;

  /**
   * The feature id for the '<em><b>Capacity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPACITY__CAPACITY = 0;

  /**
   * The number of structural features of the '<em>Capacity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPACITY_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.example.specs.specsDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.example.specs.specsDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.example.specs.specsDsl.Model#getSpecs <em>Specs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Specs</em>'.
   * @see com.example.specs.specsDsl.Model#getSpecs()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Specs();

  /**
   * Returns the meta object for class '{@link com.example.specs.specsDsl.Spec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spec</em>'.
   * @see com.example.specs.specsDsl.Spec
   * @generated
   */
  EClass getSpec();

  /**
   * Returns the meta object for the attribute '{@link com.example.specs.specsDsl.Spec#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.example.specs.specsDsl.Spec#getName()
   * @see #getSpec()
   * @generated
   */
  EAttribute getSpec_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.example.specs.specsDsl.Spec#getProcessor <em>Processor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Processor</em>'.
   * @see com.example.specs.specsDsl.Spec#getProcessor()
   * @see #getSpec()
   * @generated
   */
  EReference getSpec_Processor();

  /**
   * Returns the meta object for the containment reference '{@link com.example.specs.specsDsl.Spec#getMotherboard <em>Motherboard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Motherboard</em>'.
   * @see com.example.specs.specsDsl.Spec#getMotherboard()
   * @see #getSpec()
   * @generated
   */
  EReference getSpec_Motherboard();

  /**
   * Returns the meta object for the containment reference list '{@link com.example.specs.specsDsl.Spec#getMemories <em>Memories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Memories</em>'.
   * @see com.example.specs.specsDsl.Spec#getMemories()
   * @see #getSpec()
   * @generated
   */
  EReference getSpec_Memories();

  /**
   * Returns the meta object for class '{@link com.example.specs.specsDsl.Processor <em>Processor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Processor</em>'.
   * @see com.example.specs.specsDsl.Processor
   * @generated
   */
  EClass getProcessor();

  /**
   * Returns the meta object for the reference '{@link com.example.specs.specsDsl.Processor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see com.example.specs.specsDsl.Processor#getName()
   * @see #getProcessor()
   * @generated
   */
  EReference getProcessor_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.example.specs.specsDsl.Processor#getClockSpeed <em>Clock Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clock Speed</em>'.
   * @see com.example.specs.specsDsl.Processor#getClockSpeed()
   * @see #getProcessor()
   * @generated
   */
  EReference getProcessor_ClockSpeed();

  /**
   * Returns the meta object for the containment reference '{@link com.example.specs.specsDsl.Processor#getCores <em>Cores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cores</em>'.
   * @see com.example.specs.specsDsl.Processor#getCores()
   * @see #getProcessor()
   * @generated
   */
  EReference getProcessor_Cores();

  /**
   * Returns the meta object for class '{@link com.example.specs.specsDsl.ClockSpeed <em>Clock Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clock Speed</em>'.
   * @see com.example.specs.specsDsl.ClockSpeed
   * @generated
   */
  EClass getClockSpeed();

  /**
   * Returns the meta object for the attribute '{@link com.example.specs.specsDsl.ClockSpeed#getClockSpeed <em>Clock Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clock Speed</em>'.
   * @see com.example.specs.specsDsl.ClockSpeed#getClockSpeed()
   * @see #getClockSpeed()
   * @generated
   */
  EAttribute getClockSpeed_ClockSpeed();

  /**
   * Returns the meta object for class '{@link com.example.specs.specsDsl.Cores <em>Cores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cores</em>'.
   * @see com.example.specs.specsDsl.Cores
   * @generated
   */
  EClass getCores();

  /**
   * Returns the meta object for the attribute '{@link com.example.specs.specsDsl.Cores#getCores <em>Cores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cores</em>'.
   * @see com.example.specs.specsDsl.Cores#getCores()
   * @see #getCores()
   * @generated
   */
  EAttribute getCores_Cores();

  /**
   * Returns the meta object for class '{@link com.example.specs.specsDsl.Motherboard <em>Motherboard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Motherboard</em>'.
   * @see com.example.specs.specsDsl.Motherboard
   * @generated
   */
  EClass getMotherboard();

  /**
   * Returns the meta object for the reference '{@link com.example.specs.specsDsl.Motherboard#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see com.example.specs.specsDsl.Motherboard#getName()
   * @see #getMotherboard()
   * @generated
   */
  EReference getMotherboard_Name();

  /**
   * Returns the meta object for class '{@link com.example.specs.specsDsl.Memory <em>Memory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Memory</em>'.
   * @see com.example.specs.specsDsl.Memory
   * @generated
   */
  EClass getMemory();

  /**
   * Returns the meta object for the reference '{@link com.example.specs.specsDsl.Memory#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see com.example.specs.specsDsl.Memory#getName()
   * @see #getMemory()
   * @generated
   */
  EReference getMemory_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.example.specs.specsDsl.Memory#getCapacity <em>Capacity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Capacity</em>'.
   * @see com.example.specs.specsDsl.Memory#getCapacity()
   * @see #getMemory()
   * @generated
   */
  EReference getMemory_Capacity();

  /**
   * Returns the meta object for class '{@link com.example.specs.specsDsl.Capacity <em>Capacity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capacity</em>'.
   * @see com.example.specs.specsDsl.Capacity
   * @generated
   */
  EClass getCapacity();

  /**
   * Returns the meta object for the attribute '{@link com.example.specs.specsDsl.Capacity#getCapacity <em>Capacity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Capacity</em>'.
   * @see com.example.specs.specsDsl.Capacity#getCapacity()
   * @see #getCapacity()
   * @generated
   */
  EAttribute getCapacity_Capacity();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SpecsDslFactory getSpecsDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.example.specs.specsDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.specs.specsDsl.impl.ModelImpl
     * @see com.example.specs.specsDsl.impl.SpecsDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Specs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SPECS = eINSTANCE.getModel_Specs();

    /**
     * The meta object literal for the '{@link com.example.specs.specsDsl.impl.SpecImpl <em>Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.specs.specsDsl.impl.SpecImpl
     * @see com.example.specs.specsDsl.impl.SpecsDslPackageImpl#getSpec()
     * @generated
     */
    EClass SPEC = eINSTANCE.getSpec();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPEC__NAME = eINSTANCE.getSpec_Name();

    /**
     * The meta object literal for the '<em><b>Processor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC__PROCESSOR = eINSTANCE.getSpec_Processor();

    /**
     * The meta object literal for the '<em><b>Motherboard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC__MOTHERBOARD = eINSTANCE.getSpec_Motherboard();

    /**
     * The meta object literal for the '<em><b>Memories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC__MEMORIES = eINSTANCE.getSpec_Memories();

    /**
     * The meta object literal for the '{@link com.example.specs.specsDsl.impl.ProcessorImpl <em>Processor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.specs.specsDsl.impl.ProcessorImpl
     * @see com.example.specs.specsDsl.impl.SpecsDslPackageImpl#getProcessor()
     * @generated
     */
    EClass PROCESSOR = eINSTANCE.getProcessor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESSOR__NAME = eINSTANCE.getProcessor_Name();

    /**
     * The meta object literal for the '<em><b>Clock Speed</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESSOR__CLOCK_SPEED = eINSTANCE.getProcessor_ClockSpeed();

    /**
     * The meta object literal for the '<em><b>Cores</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESSOR__CORES = eINSTANCE.getProcessor_Cores();

    /**
     * The meta object literal for the '{@link com.example.specs.specsDsl.impl.ClockSpeedImpl <em>Clock Speed</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.specs.specsDsl.impl.ClockSpeedImpl
     * @see com.example.specs.specsDsl.impl.SpecsDslPackageImpl#getClockSpeed()
     * @generated
     */
    EClass CLOCK_SPEED = eINSTANCE.getClockSpeed();

    /**
     * The meta object literal for the '<em><b>Clock Speed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOCK_SPEED__CLOCK_SPEED = eINSTANCE.getClockSpeed_ClockSpeed();

    /**
     * The meta object literal for the '{@link com.example.specs.specsDsl.impl.CoresImpl <em>Cores</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.specs.specsDsl.impl.CoresImpl
     * @see com.example.specs.specsDsl.impl.SpecsDslPackageImpl#getCores()
     * @generated
     */
    EClass CORES = eINSTANCE.getCores();

    /**
     * The meta object literal for the '<em><b>Cores</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CORES__CORES = eINSTANCE.getCores_Cores();

    /**
     * The meta object literal for the '{@link com.example.specs.specsDsl.impl.MotherboardImpl <em>Motherboard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.specs.specsDsl.impl.MotherboardImpl
     * @see com.example.specs.specsDsl.impl.SpecsDslPackageImpl#getMotherboard()
     * @generated
     */
    EClass MOTHERBOARD = eINSTANCE.getMotherboard();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOTHERBOARD__NAME = eINSTANCE.getMotherboard_Name();

    /**
     * The meta object literal for the '{@link com.example.specs.specsDsl.impl.MemoryImpl <em>Memory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.specs.specsDsl.impl.MemoryImpl
     * @see com.example.specs.specsDsl.impl.SpecsDslPackageImpl#getMemory()
     * @generated
     */
    EClass MEMORY = eINSTANCE.getMemory();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMORY__NAME = eINSTANCE.getMemory_Name();

    /**
     * The meta object literal for the '<em><b>Capacity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMORY__CAPACITY = eINSTANCE.getMemory_Capacity();

    /**
     * The meta object literal for the '{@link com.example.specs.specsDsl.impl.CapacityImpl <em>Capacity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.specs.specsDsl.impl.CapacityImpl
     * @see com.example.specs.specsDsl.impl.SpecsDslPackageImpl#getCapacity()
     * @generated
     */
    EClass CAPACITY = eINSTANCE.getCapacity();

    /**
     * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPACITY__CAPACITY = eINSTANCE.getCapacity_Capacity();

  }

} //SpecsDslPackage
