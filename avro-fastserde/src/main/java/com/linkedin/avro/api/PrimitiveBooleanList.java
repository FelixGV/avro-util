package com.linkedin.avro.api;

import java.util.List;


/**
 * A {@link List} implementation with additional functions to prevent boxing.
 */
public interface PrimitiveBooleanList extends List<Boolean> {
  /**
   * @param index index of the element to return
   * @return the element at the specified position in this list
   */
  boolean getPrimitive(int index);

  /**
   * @param e element whose presence in this collection is to be ensured
   * @return <tt>true</tt> if this collection changed as a result of the call
   */
  boolean addPrimitive(boolean e);

  /**
   * Replaces the element at the specified position in this list with the
   * specified element (optional operation).
   *
   * @param index index of the element to replace
   * @param element element to be stored at the specified position
   * @return the element previously at the specified position
   */
  boolean setPrimitive(int index, boolean element);
}
