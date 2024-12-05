import java.util.*;
import java.lang.Math;

public class SumProductMinMax5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int number1 = sc.nextInt();
        System.out.print("Enter 2nd integer: ");
        int number2 = sc.nextInt();
        System.out.print("Enter 3rd integer: ");
        int number3 = sc.nextInt();
        System.out.print("Enter 4th integer: ");
        int number4 = sc.nextInt();
        System.out.print("Enter 5th integer: ");
        int number5 = sc.nextInt();
        sc.close();

        System.out.println("The sum is: " + (number1 + number2 + number3 + number4 + number5));
        System.out.println("The product is: " + (number1 * number2 * number3 * number4 * number5));
        System.out.println("The max is: " + Collections.max(Arrays.asList(number1, number2, number3, number4, number5)));
        System.out.println("The max is: " + Collections.min(Arrays.asList(number1, number2, number3, number4, number5)));
    }
}

