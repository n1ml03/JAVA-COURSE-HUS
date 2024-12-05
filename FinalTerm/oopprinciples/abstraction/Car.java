package oopprinciples.abstraction;

public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand + " car is starting the engine.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " car is stopping the engine.");
    }
}