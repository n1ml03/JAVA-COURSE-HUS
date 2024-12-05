package com.expression;

public class DivisionOperator implements Operator {
    @Override
    public double doOperation(Evaluable leftOperand, Evaluable rightOperand) {
        double divisor = rightOperand.evaluate();
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return leftOperand.evaluate() / divisor;
    }
}
