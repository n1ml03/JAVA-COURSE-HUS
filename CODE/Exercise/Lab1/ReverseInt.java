import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        int inNumber;
        int inDigit = 0;
        int reverse = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        inNumber = sc.nextInt();

        sc.close();

        while (inNumber > 0) {
            inDigit = inNumber % 10;
            reverse = reverse * 10 + inDigit;
            inNumber /= 10;
        }
        System.out.println("The reverse is : " + reverse);
    }
}
