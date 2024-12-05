package com.vector;

import java.util.ArrayList;
import java.util.List;

public class ListVector implements IVector {
    private List<Double> data;

    public ListVector() {
        data = new ArrayList<>();
    }

    public ListVector(List<Double> data) {
        this.data = new ArrayList<>(data);
    }

    @Override
    public void append(double value) {
        data.add(value);
    }

    @Override
    public void insert(double value, int index) {
        data.add(index, value);
    }

    @Override
    public void remove(int index) {
        data.remove(index);
    }

    @Override
    public int length() {
        return data.size();
    }

    @Override
    public double magnitude() {
        double sum = 0;
        for (double value : data) {
            sum += value * value;
        }
        return Math.sqrt(sum);
    }

    public double distanceTo(ListVector another) {
        if (this.length() != another.length()) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }
        double sum = 0;
        for (int i = 0; i < length(); i++) {
            double diff = this.data.get(i) - another.data.get(i);
            sum += diff * diff;
        }
        return Math.sqrt(sum);
    }

    @Override
    public double[] elements() {
        return data.stream().mapToDouble(Double::doubleValue).toArray();
    }

    public double element(int index) {
        return data.get(index);
    }

    public ListVector minus(ListVector another) {
        if (this.length() != another.length()) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }
        ListVector result = new ListVector();
        for (int i = 0; i < length(); i++) {
            result.append(this.data.get(i) - another.data.get(i));
        }
        return result;
    }

    public ListVector plus(ListVector another) {
        if (this.length() != another.length()) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }
        ListVector result = new ListVector();
        for (int i = 0; i < length(); i++) {
            result.append(this.data.get(i) + another.data.get(i));
        }
        return result;
    }

    public ListVector scale(double factor) {
        ListVector result = new ListVector();
        for (double value : data) {
            result.append(value * factor);
        }
        return result;
    }

    public double dot(ListVector another) {
        if (this.length() != another.length()) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }
        double sum = 0;
        for (int i = 0; i < length(); i++) {
            sum += this.data.get(i) * another.data.get(i);
        }
        return sum;
    }

    /*
     * Hàm trả ra format của vector dạng: [a1, a2, ..., an].
     */
    @Override
    public String toString() {
        return data.toString();
    }
}
