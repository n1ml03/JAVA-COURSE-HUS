import java.util.Scanner;

public class Fibonacci {
    public static int fibonacc(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacc(n - 1) + fibonacc(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci of " + n + " is: " + fibonacc(n));
        sc.close();
    }
}
