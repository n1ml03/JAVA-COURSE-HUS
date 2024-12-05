package linesub;

public class TestLine {
    public static void main(String[] args) {
        Line lineSub = new Line(8, 9, 6, 7);
        System.out.println(lineSub.getBegin());
        System.out.println(lineSub.getEnd());
        System.out.println(lineSub.getLength());
        System.out.println(lineSub.getGradient());
    }
}
