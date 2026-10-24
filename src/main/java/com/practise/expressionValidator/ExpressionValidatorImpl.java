package com.practise.expressionValidator;

import java.util.Stack;
import com.practise.services.MethodNotImplementedException;

public class ExpressionValidatorImpl implements ExpressionValidator {

    public boolean isBalancedExpression(String expression)
            throws MethodNotImplementedException {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char opening = stack.pop();

                if ((ch == ')' && opening != '(')
                        || (ch == '}' && opening != '{')
                        || (ch == ']' && opening != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
