import java.util.Scanner;

public class GCD {
    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);

    }

    public static int gcd(int a, int b) {
        if (a < 0) {
            System.out.println("Error: a must be non-negative. Please re-enter.");
            return -1;
        }
        if (b < 0) {
            System.out.println("Error: b must be non-negative. Please re-enter.");
            return -1;
        }
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        in.close();
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
        System.out.println("GCDRecursive of " + a + " and " + b + " is: " + gcdRecursive(a, b));
    }
}
