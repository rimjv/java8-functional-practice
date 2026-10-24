package com.practise.exceptions;


import com.practise.services.ErraticService;
import com.practise.services.ExceptionService;
import com.practise.services.RandomError;
import com.practise.services.RandomException;

public class ErraticServiceImpl implements ErraticService {
    public RandomError execute(ExceptionService stubService){
       try {
           stubService.throwException();
       }catch (RandomException exception)
       {
           return exception.getError();
       }
        return new RandomError(-1);
    }
}
