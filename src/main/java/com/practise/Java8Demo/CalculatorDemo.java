package com.practise.Java8Demo;
@FunctionalInterface
interface Calculator {
    int calculate(int  a ,int b );
}
public  class CalculatorDemo{
public static void main(String[] args){

    Calculator add =(int a,int b)-> a +b ;
    Calculator subtract =(int a,int b)-> a -b ;
    Calculator multiply =(int a,int b)-> a *b ;
    Calculator divide =(int a,int b)->
    {
        if(b == 0)
            throw new IllegalArgumentException(" divisor cant be zero") ;
        return a/b ;
    };

    System.out.println(add.calculate(20,5));
    System.out.println(subtract.calculate(20,5));
    System.out.println(multiply.calculate(20,5));
    System.out.println(divide.calculate(20,0));


}

}