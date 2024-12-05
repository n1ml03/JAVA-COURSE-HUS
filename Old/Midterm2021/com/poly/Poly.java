package com.poly;

public interface Poly {
    int degree();

    Poly derivative();

    double coefficient(int degree);

    double[] coefficients();
}
