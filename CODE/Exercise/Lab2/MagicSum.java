import java.util.Scanner;

public class MagicSum {
    public static boolean isEight(int number) {
        while (number > 0) {
            int eight = number % 10;
            number = number / 10;
            if (eight != 8) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SENTINEL = -1;
        System.out.print("Enter the positive integer (or -1 to end): ");
        int number = sc.nextInt();
        int sum = 0;

        while (number != SENTINEL) {
            if (isEight(number)) {
                sum += number;
            }

            System.out.print("Enter the positive integer (or -1 to end): ");
            number = sc.nextInt();
        }
        System.out.println("The magic sum is: " + sum);
        sc.close();
    }
}
