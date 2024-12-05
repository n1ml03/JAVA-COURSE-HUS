package com.poly;

import java.util.Objects;

public class AbstractPoly implements Poly {
    double[] derive() {
        if (degree() == 0) {
            return new double[]{0};
        }
        double[] diff = new double[degree()];
        for (int i = 0; i < degree(); i++) {
            diff[i] = coefficient(i + 1) * (i + 1);
        }
        return diff;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof AbstractPoly abstractPoly)) {
            return false;
        }
        if (abstractPoly.degree() != degree()) {
            return false;
        }
        for (int i = 0; i < degree(); i++) {
            if (coefficient(i) != abstractPoly.coefficient(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Poly[");
        for (int i = 0; i < degree(); i++) {
            if (coefficient(i) != 0) {
                if (i == 0) {
                    s.append(coefficient(i));
                } else {
                    if (s.charAt(s.length() - 1) != '[') {
                        if (coefficient(i) > 0) {
                            s.append(" + ");
                        } else {
                            s.append(" - ");
                        }
                    }
                    s.append(Math.abs(coefficient(i)));
                    if (i == 1) {
                        s.append('x');
                    } else {
                        s.append("x^").append(i);
                    }
                }

            }
        }
        s.append(']');
        return s.toString();
    }

    @Override
    public int degree() {
        return 0;
    }

    @Override
    public Poly derivative() {
        return null;
    }

    @Override
    public double coefficient(int degree) {
        return 0;
    }

    @Override
    public double[] coefficients() {
        return new double[0];
    }
}
