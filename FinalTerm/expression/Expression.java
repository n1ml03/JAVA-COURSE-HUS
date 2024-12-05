package com.expression;

public class Expression implements Evaluable {
    private Evaluable leftOperand;
    private Evaluable rightOperand;
    private Operator operator;

    public Expression(Evaluable leftOperand, Operator operator, Evaluable rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    @Override
    public double evaluate() {
        return operator.doOperation(leftOperand, rightOperand);
    }
}
