package oopprinciples.abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");

        car.start();
        car.stop();
    }
}