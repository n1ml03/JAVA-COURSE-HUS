import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        System.out.print("Enter the upper bound (positive integer): ");
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt()) {
            System.out.println("Upper bound not valid. Please try again.");
            return;
        }
        int upperBound = in.nextInt();
        in.close();
        
        System.out.println(isProductOfPrimeFactors(30));
        System.out.println(isProductOfPrimeFactors(20));

        printPerfectPrimeFactors(upperBound);

        
    }

    public static boolean isPrime(int aPosInt) {
        if (aPosInt <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        if (aPosInt <= 1) {
            return false;
        }
        for (int i = 2; i <= aPosInt; i++) {
            if (isPrime(i) && (aPosInt % i == 0)) {
                if (aPosInt % (aPosInt / i) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printPerfectPrimeFactors(int upperBound) {
        System.out.print("These numbers are equal to the product of prime factors: ");

        int countProductOfPrimeFactors = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.printf("%1$d ", i);
                countProductOfPrimeFactors++;
            }
        }
        System.out.printf("\n[%1$d numbers found (%2$.2f%%)]\n"
                , countProductOfPrimeFactors, ((double) 100 * countProductOfPrimeFactors / upperBound));
    }
}
