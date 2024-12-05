import java.util.Scanner;

public class SpecialSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        double x = sc.nextDouble();
        System.out.printf("Sum of the series: %.9f \n", sumOfSeries(x, 5));
        sc.close();

        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            Object obj = new Object();
        }
        long elapsedTime = System.nanoTime() - startTime;

        System.out.println("Total execution time to create 1000K objects in Java in millis: "
                + elapsedTime / 1000000);
    }

    public static double specialSeries(double x, int numTerms) {
        double term = 1D;
        for (int i = (2 * numTerms + 1); i > 0; i--) {
            term *= x * (i % 2 == 0 ? 1 : i) / (i % 2 == 0 ? i : 1);
        }
        term /= 2 * (2 * numTerms + 1);
        return term;
    }

    public static double sumOfSeries(double x, int numTerms) {
        if (x < -1D || x > 1D) {
            System.out.println("x value in range [-1; 1] and try again.");
            return 0D;
        }

        double result = 0D;
        for (int i = 0; i < numTerms; i++) {
            result += specialSeries(x, i);
        }
        return result;
    }
}
