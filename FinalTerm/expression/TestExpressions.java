package com.expression;

public class TestExpressions {
    public static void main(String[] args) {
        // Create leaf nodes (numbers)
        Evaluable num3 = new Number(3);
        Evaluable num4 = new Number(4);
        Evaluable num2 = new Number(2);

        // Create composite nodes (expressions)
        Evaluable add = new Expression(num3, new AdditionOperator(), num4);
        Evaluable multiply = new Expression(add, new MultiplicationOperator(), num2);
        Evaluable subtract = new Expression(multiply, new SubtractionOperator(), num3);
        Evaluable divide = new Expression(subtract, new DivisionOperator(), num2);

        // Evaluate and print results
        System.out.println("Expression: ((3 + 4) * 2 - 3) / 2");
        System.out.println("Result: " + divide.evaluate());

        // Test individual operations
        System.out.println("3 + 4 = " + add.evaluate());
        System.out.println("(3 + 4) * 2 = " + multiply.evaluate());
        System.out.println("((3 + 4) * 2) - 3 = " + subtract.evaluate());

        // Test division by zero
        try {
            Evaluable divideByZero = new Expression(num3, new DivisionOperator(), new Number(0));
            divideByZero.evaluate();
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
