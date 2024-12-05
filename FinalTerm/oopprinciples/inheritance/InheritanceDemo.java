package oopprinciples.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");

        // Inherited method
        dog.eat();

        // Dog-specific method
        dog.bark();
    }
}