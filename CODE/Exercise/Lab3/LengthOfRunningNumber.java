import java.util.Scanner;

public class LengthOfRunningNumber {
    public static String run(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }
        return sb.toString();
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i + "").length();
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Running number: " + run(n));
        System.out.println("Sum of digits: " + sumOfDigits(n));
    }
}
