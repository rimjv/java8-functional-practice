package com.practise.exceptions;

import com.practise.services.StackTrace;
import org.junit.Assert;
import org.junit.Test;

public class StackTraceTest {
    @Test
    public void shouldClearInheritedStackTrace() {
        StackTrace stacktrace = new StackTraceImpl();
        try {
            stacktrace.clearStackTrace();
        } catch (Exception e) {
            Assert.assertEquals("clearStackTrace", e.getStackTrace()[0].getMethodName());
        }
    }
}
