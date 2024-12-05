import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int number = n;
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit + " ");
            number /= 10;
        }
    }
}
