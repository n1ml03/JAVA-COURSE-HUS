package animal;

public class TestMain {
    public static void main(String[] args) {
        Cat c1 = new Cat("Cat");
        System.out.println(c1);
        c1.greets();
        Dog d1 = new Dog("Dog");
        Dog d2 = new Dog("Hehee");
        System.out.println(d1);
        System.out.println(d2);
        d1.greets();
        d1.greets(d2);
    }
}
