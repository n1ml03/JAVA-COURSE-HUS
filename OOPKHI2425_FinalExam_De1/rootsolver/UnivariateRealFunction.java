package hus.oop.rootsolver;

public class UnivariateRealFunction implements AbstractFunction {
    @Override
    public double evaluate(double x) {
        return MyMath.exp(-x);
    }

    @Override
    public double derivative(double x) {
        return -MyMath.exp(-x);
    }
}
