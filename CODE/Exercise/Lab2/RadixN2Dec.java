import java.util.Scanner;

public class RadixN2Dec {
    public static int radixNToDecimal(String radixNStr, int radix) {
        if (radix < 2 || radix > 16) {
            System.out.println("Radix must be between 2 and 16");
        }
        
        int result = 0;
        for (int i = 0; i < radixNStr.length(); i++) {
            char c = Character.toUpperCase(radixNStr.charAt(i));
            int digit = 0;
            if (Character.isDigit(c)) {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digit = c - 'A' + 10;
            } else {
                System.out.println("Invalid character in input string");
            }
            
            if (digit >= radix) {
                System.out.println("Digit out of range for given radix");
            }
            
            result = result * radix + digit;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the string: ");
        String s = sc.nextLine().trim();

        System.out.printf("The equivalent decimal number \"%s\" is: %d%n", s, radixNToDecimal(s, radix));
        sc.close();
    }
}
