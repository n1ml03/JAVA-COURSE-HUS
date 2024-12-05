import java.util.Scanner;

public class Oct2Dec {
    public static int oct2Dec(int octal) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (octal == 0) {
                break;
            } else {
                int temp = octal % 10;
                decimal += temp * Math.pow(8, n);
                octal = octal / 10;
                n++;
            }
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        int octal = sc.nextInt();
        System.out.printf("The equivalenr decimal number \"%d\" is: %d", octal, oct2Dec(octal));
        sc.close();
    }
}
