package com.practise.primes;

import java.util.ArrayList;
import java.util.List;

public class Prime {

  public List<Integer> findPrimes(int n) {
    List<Integer> primeList = new ArrayList<>() ;
    int primeNumberCount =0 ;
    for(int number = 2; number <=n ;number++ ){
      boolean isPrime = true ;
      for (int divisor = 2; divisor * divisor <= number; divisor++) {
        if(number%divisor == 0)
        { isPrime = false ;
          break ;}
      }
      if(isPrime) {
        primeNumberCount ++ ;
      primeList.add(number);}
    }
    return primeList ;
  }

  public int countPrimeNumbers(int n){
   List<Integer> primeList = findPrimes(n) ;
   return primeList.size() ;
  }
}
