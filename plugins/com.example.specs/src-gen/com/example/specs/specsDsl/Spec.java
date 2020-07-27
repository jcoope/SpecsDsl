/**
 * generated by Xtext 2.21.0
 */
package com.example.specs.specsDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.specs.specsDsl.Spec#getName <em>Name</em>}</li>
 *   <li>{@link com.example.specs.specsDsl.Spec#getProcessor <em>Processor</em>}</li>
 *   <li>{@link com.example.specs.specsDsl.Spec#getMotherboard <em>Motherboard</em>}</li>
 *   <li>{@link com.example.specs.specsDsl.Spec#getMemories <em>Memories</em>}</li>
 * </ul>
 *
 * @see com.example.specs.specsDsl.SpecsDslPackage#getSpec()
 * @model
 * @generated
 */
public interface Spec extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.example.specs.specsDsl.SpecsDslPackage#getSpec_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.example.specs.specsDsl.Spec#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Processor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processor</em>' containment reference.
   * @see #setProcessor(Processor)
   * @see com.example.specs.specsDsl.SpecsDslPackage#getSpec_Processor()
   * @model containment="true"
   * @generated
   */
  Processor getProcessor();

  /**
   * Sets the value of the '{@link com.example.specs.specsDsl.Spec#getProcessor <em>Processor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Processor</em>' containment reference.
   * @see #getProcessor()
   * @generated
   */
  void setProcessor(Processor value);

  /**
   * Returns the value of the '<em><b>Motherboard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Motherboard</em>' containment reference.
   * @see #setMotherboard(Motherboard)
   * @see com.example.specs.specsDsl.SpecsDslPackage#getSpec_Motherboard()
   * @model containment="true"
   * @generated
   */
  Motherboard getMotherboard();

  /**
   * Sets the value of the '{@link com.example.specs.specsDsl.Spec#getMotherboard <em>Motherboard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Motherboard</em>' containment reference.
   * @see #getMotherboard()
   * @generated
   */
  void setMotherboard(Motherboard value);

  /**
   * Returns the value of the '<em><b>Memories</b></em>' containment reference list.
   * The list contents are of type {@link com.example.specs.specsDsl.Memory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Memories</em>' containment reference list.
   * @see com.example.specs.specsDsl.SpecsDslPackage#getSpec_Memories()
   * @model containment="true"
   * @generated
   */
  EList<Memory> getMemories();

} // Spec
