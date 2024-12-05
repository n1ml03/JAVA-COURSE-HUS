package oopprinciples.abstraction;

public abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void start();
    public abstract void stop();
}