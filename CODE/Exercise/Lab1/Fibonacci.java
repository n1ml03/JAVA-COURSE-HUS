import javax.swing.event.SwingPropertyChangeSupport;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 3;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum = 0;
        double average;

        System.out.println("The first " + nMax + " Fibonacci numbers are: ");

        while (n <= nMax) {
            System.out.print(fnMinus1 + " ");

            ++n;
            sum = fnMinus1 + fnMinus2;
            fnMinus1 = fnMinus2;
            fnMinus2 = sum;

        }
        average = (double) sum / nMax;
        System.out.println(average);
    }
}