import java.util.Scanner;
import java.lang.Math;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int number1 = sc.nextInt();
        System.out.print("Enter 2nd integer: ");
        int number2 = sc.nextInt();
        System.out.print("Enter 3rd integer: ");
        int number3 = sc.nextInt();
        sc.close();

        System.out.println("The sum is: " + (number1 + number2 + number3));
        System.out.println("The product is: " + (number1 * number2 * number3));
        System.out.println("The max is: " + Math.max(number1, Math.max(number2, number3)));
        System.out.println("The max is: " + Math.min(number1, Math.min(number2, number3)));
    }
}
