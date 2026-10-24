package com.practise.findClassName;

public interface ClassIdentifier<T, E> {
  String[] identifyClasses(T parameterOne, E parameterTwo) throws Exception;
}
