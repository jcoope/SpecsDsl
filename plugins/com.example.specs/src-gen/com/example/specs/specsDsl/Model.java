/**
 * generated by Xtext 2.21.0
 */
package com.example.specs.specsDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.specs.specsDsl.Model#getSpecs <em>Specs</em>}</li>
 * </ul>
 *
 * @see com.example.specs.specsDsl.SpecsDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Specs</b></em>' containment reference list.
   * The list contents are of type {@link com.example.specs.specsDsl.Spec}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specs</em>' containment reference list.
   * @see com.example.specs.specsDsl.SpecsDslPackage#getModel_Specs()
   * @model containment="true"
   * @generated
   */
  EList<Spec> getSpecs();

} // Model
