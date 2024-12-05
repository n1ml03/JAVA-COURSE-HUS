package exercises_on_classes.ex_11;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

        Circle c3 = new Circle(2.0, "red");
        System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c2.getArea() + " color: " + c3.getColor());

        Circle c4 = new Circle();
        c4.setRadius(5.5);
        System.out.println("radius is: " + c4.getRadius());
        c4.setColor("green");
        System.out.println("color is: " + c4.getColor());


    }
}
