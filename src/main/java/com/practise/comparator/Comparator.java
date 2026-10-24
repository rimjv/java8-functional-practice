package com.practise.comparator;

public interface Comparator<T> {
  T findGreater(T parameterOne, T parameterTwo) throws Exception;
}
