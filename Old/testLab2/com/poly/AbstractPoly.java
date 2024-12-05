package com.poly;

public class AbstractPoly implements Poly {
    private int degree;

    public AbstractPoly() {

    }

    @Override
    public int degree() {
        return degree;
    }

    public int[] differentiate() {
        return null;
    }

    public boolean equals(Object o) {
        return false;
    }

    public String toString() {
        return "";
    }

    @Override
    public double evaluate(double x) {
        return 0;
    }

    @Override
    public int coefficient(int i) {
        return 0;
    }

    @Override
    public int[] coefficients() {
        return new int[]{0};
    }

    @Override
    public Poly derivative() {
        return null;
    }


}
