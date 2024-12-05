import java.util.Scanner;

public class Bin2Dec {
    public static boolean isBinary(int binary) {
        int copyOfInput = binary;

        while (copyOfInput != 0) {
            if (copyOfInput % 10 > 1) {
                return false;
            }
            copyOfInput = copyOfInput / 10;
        }
        return true;
    }

    public static int bin2Dec(int binary) {
        int decimal = 0;
        int n = 0;
        if (binary == 0) {
            return 0;
        }
        if (isBinary(binary)) {
            int temp = binary % 10;
            decimal += temp * Math.pow(2, n);
            binary = binary / 10;
            n++;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        int binary = sc.nextInt();
        if (!isBinary(binary)) {
            System.out.printf("error: invalid binary string \u0027%d\u0027", binary);
        } else {
            System.out.printf("The equivalent decimal number for binary \u0027%d\u0027 is: %d", binary, bin2Dec(binary));
        }

        sc.close();
    }
}
