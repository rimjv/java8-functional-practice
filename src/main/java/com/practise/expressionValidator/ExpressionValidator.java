package com.practise.expressionValidator;

import com.practise.services.MethodNotImplementedException;

public interface ExpressionValidator {
    boolean isBalancedExpression(String expression) throws MethodNotImplementedException;
}
