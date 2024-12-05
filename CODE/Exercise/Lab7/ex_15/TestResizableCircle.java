package ex_15;

public class TestResizableCircle {
    public static void main(String[] args) {
        Resizable r1 = new ResizableCircle(3.4);
        System.out.println(r1);
        r1.resize(50);
        System.out.println(r1);

        GeometricObject r2 = (GeometricObject) r1;
        System.out.println(r2);
        System.out.println("Perimeter = " + r2.getPerimeter());
        System.out.println("Area = " + r2.getArea());
    }
}
