package com.practise.findClassName;

public class ClassIdentifierImpl<T, E> implements ClassIdentifier<T, E> {
  public String[] identifyClasses(T parameterOne, E parameterTwo) throws Exception {
    if(parameterOne == null || parameterTwo == null)
      throw new Exception("Parameters cannot be null") ;
    String parameterOneClassName = parameterOne.getClass().getSimpleName() ;
    String parameterTwoClassName = parameterTwo.getClass().getSimpleName() ;
    String [] classNames = new String[2];
    classNames[0]=parameterOneClassName ;
    classNames[1]=parameterTwoClassName ;

    return classNames ;
   // throw new MethodNotImplementedException("Identify Classes");
  }
}
