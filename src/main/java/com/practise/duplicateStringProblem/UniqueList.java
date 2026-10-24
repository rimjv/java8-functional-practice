package com.practise.duplicateStringProblem;

import java.util.*;

public class UniqueList {
  public static List<String> deDuplicate(List<String> list) {
 //List<String> uniqueList = new ArrayList<>() ;
//  for (String ch : list)
//  {
//    if(!uniqueList.contains(ch)){
//      uniqueList.add(ch);
//    }
//  }
//  return uniqueList ;
//  }
      //    for (String ch : list)
//    {
//        uniqueSet.add(ch) ;
//    }
      Set<String> uniqueSet = new LinkedHashSet<>(list);

//      for(String  ch : uniqueSet) {
//          uniqueList.add(ch) ;
//      }
      return new ArrayList<>(uniqueSet);
  }



}
