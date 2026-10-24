package com.practise.comparator;

public class ComparatorImpl<T extends Comparable<T>>
        implements Comparator<T> {
  public T findGreater(T parameterOne, T parameterTwo) throws Exception {
    if(parameterOne.getClass() != parameterTwo.getClass())
      throw new IllegalArgumentException() ;
   if(parameterOne.compareTo(parameterTwo) >0) {
       return parameterOne ;
   } else return parameterTwo ;
  }
}
