import java.util.Scanner;

public class Hex2Bin {
    private static final String[] HEX_BINARY = {
        "0000", "0001", "0010", "0011",
        "0100", "0101", "0110", "0111",
        "1000", "1001", "1010", "1011",
        "1100", "1101", "1110", "1111"
    };

    public static String hex2Bin(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toUpperCase().toCharArray()) {
            int digit = Character.digit(c, 16);
            if (digit >= 0) {
                result.append(HEX_BINARY[digit]);
            } else {
                System.out.println("Invalid hexadecimal character: " + c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Hexadecimal string: ");
        String str = sc.nextLine();
        sc.close();

        System.out.printf("The equivalent binary to hexadecimal \"%s\" is: %s%n", str, hex2Bin(str));
    }
}
