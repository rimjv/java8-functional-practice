package com.practise.characterCount;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
  public static Map<Character, Integer> countCharacters(String string) {
    Map<Character,Integer> resultMap =  new HashMap<>();
    if(string==null || string.trim().isEmpty()) {
        return resultMap ;
    }
    for(char ch : string.toCharArray())
    {
      if (ch == ' ') {
          continue;
      }
      if (resultMap.containsKey((ch))) {
        resultMap.put(ch, resultMap.get(ch)+1);
      }
      else resultMap.put(ch, 1);
    }
    return resultMap ;

  }
}
