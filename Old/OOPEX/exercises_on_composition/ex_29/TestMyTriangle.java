package exercises_on_composition.ex_29;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(1, 3, 3, 5, 6, 2);
        MyTriangle t2 = new MyTriangle(1, 2, 3, 4, 5, 6);

        System.out.println("Triangle " + t1 + " is " + t1.getType() + " and has perimeter " + t1.getPerimeter());
        System.out.println("Triangle " + t2 + " is " + t2.getType() + " and has perimeter " + t2.getPerimeter());
    }
}
