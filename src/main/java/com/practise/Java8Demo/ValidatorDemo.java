package com.practise.Java8Demo;

@FunctionalInterface
interface Validator<T>{
    boolean validate (T t);
}

public class ValidatorDemo {

    public static void main (String [] args) {
        Validator<String> emailValidator = (email) -> email.contains("@");
        Validator<Integer> ageValidator = (age) -> age >= 18 && age <= 60;
        System.out.println(emailValidator.validate("ridfdf@sddfs"));
        System.out.println(ageValidator.validate(55));

    }
}

