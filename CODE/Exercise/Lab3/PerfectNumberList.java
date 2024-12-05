import java.util.Scanner;

public class PerfectNumberList {
    public static boolean isPerfect(int aPosInt) {
        int sumDivisors = 1; 
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                sumDivisors += i;
                if (i != aPosInt / i) { 
                    sumDivisors += aPosInt / i;
                }
            }
        }
        return (sumDivisors == aPosInt);
    }

    public static boolean isDeficient(int aPosInt) {
        int sumDivisors = 1; 
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                sumDivisors += i;
                if (i != aPosInt / i) { 
                    sumDivisors += aPosInt / i;
                }
            }
        }
        return (sumDivisors < aPosInt);
    }

    public static void main(String[] args) {
        System.out.print("Enter the upper bound (positive integer): ");
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt()) {
            System.out.println("Upper bound not valid. Please try again.");
            return;
        }
        int upperBound = in.nextInt();
        in.close();

        if (upperBound < 0) {
            System.out.println("Upper bound is not positive. Please try again.");
            return;
        }
        System.out.print("These numbers are perfect: ");
        int countPerfectNumbers = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (!isPerfect(i)) {
                continue;
            }
            System.out.printf("%d ", i);
            countPerfectNumbers++;
        }
        System.out.printf("\n[%1$d perfect numbers found (%2$.2f%%)]\n",
                countPerfectNumbers, ((double) 100 * countPerfectNumbers / upperBound)
        );

        System.out.println();

        System.out.print("These numbers are neither deficient nor perfect: ");
        int countDeficientNumbers = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (isDeficient(i) || isPerfect(i)) {
                continue;
            }
            System.out.printf("%d ", i);
            countDeficientNumbers++;
        }
        System.out.printf("\n[%1$d numbers found (%2$.2f%%)]\n",
                countDeficientNumbers, ((double) 100 * countDeficientNumbers / upperBound)
        );
    }
}
