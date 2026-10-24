package com.practise.exceptions;

import com.practise.services.ErraticService;
import com.practise.services.ExceptionService;
import com.practise.services.RandomError;
import com.practise.services.RandomException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for @{@link ErraticServiceImpl}
 * Can you play around with fiery exceptions ?
 */
public class ErraticServiceTest {
    @Test
    public void shouldReturnErrorCodeInCaseOfException() throws Exception {
        ErraticService erraticServiceTest = new ErraticServiceImpl();
        ExceptionService stubService = new ExceptionService();
        RandomError randomError = erraticServiceTest.execute(stubService);
        RandomException lastExceptionThrown = stubService.getLastExceptionThrown();

        Assert.assertEquals(lastExceptionThrown.getError().getCode(), randomError.getCode());
    }
}
