package homework6.ex_12;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime a = new MyTime(10, 59, 34);
        System.out.println(a.toString() + " one hour later is " + (a.nextHour()).toString());
        System.out.println(a.toString() + " one minute later is " + (a.nextMinute()).toString());
        MyTime b = new MyTime(0, 0, 0);
        System.out.println("hour of " + b.toString() + " is " + b.getHour());
        System.out.println(b.toString() + " one second before is " + (b.previousSecond()).toString());
    }
}
