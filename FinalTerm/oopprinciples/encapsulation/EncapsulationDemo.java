package oopprinciples.encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);

        // Accessing data through public methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying data through public methods
        person.setName("Alicia");
        person.setAge(26);

        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

        // Demonstrating encapsulation
        person.setAge(-5); // This won't change the age due to the condition in setAge method
        System.out.println("Age after invalid update: " + person.getAge());
    }
}