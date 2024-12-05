package com.fraction;

public class Fraction extends Number implements Comparable<Fraction> {
    private int numerator;
    private int denominator;

    public Fraction(Fraction fraction) {
        this(fraction.numerator, fraction.denominator);
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public Fraction add(Fraction fraction) {
        return new Fraction((this.numerator * fraction.denominator + this.denominator * fraction.numerator) /
                this.denominator * fraction.denominator);
    }

    public Fraction add(int number) {
        return add(new Fraction(number));
    }

    @Override
    public int compareTo(Fraction fraction) {
        int d = denominator / gcd(denominator, fraction.denominator) * fraction.denominator;
        return Integer.compare(d / denominator * numerator, d / fraction.denominator * fraction.numerator);

    }

    @Override
    public byte byteValue() {
        return (byte) (numerator / denominator);
    }

    @Override
    public double doubleValue() {
        return ((double) numerator) / denominator;
    }


    public boolean equals(Fraction fraction) {
        return compareTo(fraction) == 0;
    }

    @Override
    public float floatValue() {
        return ((float) numerator) / denominator;
    }

    private int gcd(int number1, int number2) {
        while (number2 != 0) {
            int tmp = number1 % number2;
            number1 = number2;
            number2 = tmp;
        }
        return number1;
    }


    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
        simplify();
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return ((long) numerator) / denominator;
    }

    @Override
    public short shortValue() {
        return (short) (numerator / denominator);
    }

    public void main(String[] args) {
        Fraction fraction1 = new Fraction(1);
        Fraction fraction2 = new Fraction(2, 2);
        Fraction fraction3 = new Fraction(1, 4);
        Fraction fraction4 = new Fraction(fraction3);
        System.out.println(fraction1.add(fraction2));
        System.out.println(fraction3.add(fraction4));
        System.out.println(fraction3.doubleValue());
        System.out.println(fraction3.floatValue());
        System.out.println(fraction3.intValue());
        System.out.println(fraction3.longValue());

        Fraction fraction5 = new Fraction(3, 4);
        System.out.println(fraction5);
        fraction5.setDenominator(12);
        System.out.println(fraction5);
        fraction5.setNumerator(4);
        System.out.println(fraction5);

        System.out.println(fraction1.equals(fraction2));
        System.out.println(fraction1.compareTo(fraction3));

    }

    private void simplify() {
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        int fractionGcd = gcd(Math.abs(numerator), denominator);
        numerator /= fractionGcd;
        denominator /= fractionGcd;

    }

    @Override
    public String toString() {
        return "Fraction[" + this.numerator + "/" + this.denominator + "]";
    }

}