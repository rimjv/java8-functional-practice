package com.practise.Java8Demo;
@FunctionalInterface
interface StringTransformer{
    String transform(String s);
}

public class StringTransformerDemo {


public static void main (String [] args)

    { StringTransformer upper = (s) -> s.toUpperCase();
        StringTransformer reverse = (String s) -> new StringBuilder(s).reverse().toString() ;
        StringTransformer removeVowels = (String s) -> s.replaceAll("[aeiouAEIOU]", "");
        System.out.println(upper.transform("Rimjhim"));
        System.out.println(reverse.transform("Rimjhim"));
        System.out.println(removeVowels.transform("Rimjhim"));
    }
}
