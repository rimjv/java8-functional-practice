
        package com.practise.exceptions;

import com.practise.services.StackTrace;

public class StackTraceImpl implements StackTrace {

    public void clearStackTrace() throws Exception {
        try {
            method1();
        } catch (Exception e) {
            StackTraceElement[] trace = e.getStackTrace();

            for (int i = 0; i < trace.length; i++) {
                if (trace[i].getMethodName().equals("clearStackTrace")) {
                    StackTraceElement[] newTrace =
                            java.util.Arrays.copyOfRange(trace, i, trace.length);

                    e.setStackTrace(newTrace);
                    break;
                }
            }

            throw e;
        }
    }

    private void method1() throws Exception {
        method2();
    }

    private void method2() throws Exception {
        method3();
    }

    private void method3() throws Exception {
        throw new Exception("Exception from method3");
    }
}
