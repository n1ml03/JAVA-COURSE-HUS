import java.util.Scanner;

public class Dec2Hex {
    public static String dec2Hex(int dec) {
        int idx;
        String hex = "";
        char hexChars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (dec > 0) {
            idx = dec % 16;
            hex = hexChars[idx] + hex;
            dec = dec / 16;
        }
        return hex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decNum = sc.nextInt();
        sc.close();
        System.out.println("The equivalent hexadecimal number is: " + dec2Hex(decNum));
    }
}
