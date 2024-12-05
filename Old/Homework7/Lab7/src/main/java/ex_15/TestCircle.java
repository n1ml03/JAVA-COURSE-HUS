package ex_15;

public class TestCircle {
    public static void main(String[] args) {
        GeometricObject c1 = new Circle(1);
        System.out.println(c1);
        System.out.println("Perimeter = " + c1.getPerimeter());
        System.out.println("Area = " + c1.getArea());
    }
}
