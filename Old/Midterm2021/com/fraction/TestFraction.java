package com.fraction;

import java.util.*;

public class TestFraction {
    private List<Fraction> fractions;

    public TestFraction() {
        fractions = new ArrayList<>();
    }

    public Fraction getSecondLargestValue() {
        if (fractions.size() <= 1) {
            return null;
        }
        Collections.sort(fractions);
        return fractions.get(fractions.size() - 2);
    }

    public void print(List<Fraction> fractions) {
        for (Fraction fraction : fractions) {
            System.out.print(fraction + " ");
        }
        System.out.println();
    }

    public List<Fraction> sortByDenominator(List<Fraction> fractions) {
        List<Fraction> result = new ArrayList<>(fractions);
        result.sort(Comparator.comparingInt(Fraction::getDenominator));
        return result;
    }

    public void main(String[] args) {
        TestFraction testFraction = new TestFraction();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            testFraction.fractions.add(new Fraction(random.nextInt(1000) + 1, random.nextInt(1000) + 1));
        }
        print(testFraction.fractions);
        print(sortByValue(testFraction.fractions));
        print(sortByDenominator(testFraction.fractions));
        System.out.println(testFraction.getSecondLargestValue());
    }

    public List<Fraction> sortByValue(List<Fraction> fractions) {
        List<Fraction> result = new ArrayList<>(fractions);
        Collections.sort(result);
        return result;
    }
}
