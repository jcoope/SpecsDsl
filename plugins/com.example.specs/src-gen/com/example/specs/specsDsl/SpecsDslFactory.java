/**
 * generated by Xtext 2.21.0
 */
package com.example.specs.specsDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.example.specs.specsDsl.SpecsDslPackage
 * @generated
 */
public interface SpecsDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpecsDslFactory eINSTANCE = com.example.specs.specsDsl.impl.SpecsDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Spec</em>'.
   * @generated
   */
  Spec createSpec();

  /**
   * Returns a new object of class '<em>Processor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Processor</em>'.
   * @generated
   */
  Processor createProcessor();

  /**
   * Returns a new object of class '<em>Clock Speed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Clock Speed</em>'.
   * @generated
   */
  ClockSpeed createClockSpeed();

  /**
   * Returns a new object of class '<em>Cores</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cores</em>'.
   * @generated
   */
  Cores createCores();

  /**
   * Returns a new object of class '<em>Motherboard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Motherboard</em>'.
   * @generated
   */
  Motherboard createMotherboard();

  /**
   * Returns a new object of class '<em>Memory</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Memory</em>'.
   * @generated
   */
  Memory createMemory();

  /**
   * Returns a new object of class '<em>Capacity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Capacity</em>'.
   * @generated
   */
  Capacity createCapacity();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SpecsDslPackage getSpecsDslPackage();

} //SpecsDslFactory