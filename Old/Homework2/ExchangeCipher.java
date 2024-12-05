import java.util.Scanner;

public class ExchangeCipher {
    public static String exchangeCipher(String inStr) {
        inStr = inStr.toUpperCase();

        StringBuilder cipherText = new StringBuilder();

        for (int i = 0; i < inStr.length(); i++) {

            char ch = inStr.charAt(i);

            char cipherChar = (char) ('Z' - (ch - 'A'));

            cipherText.append(cipherChar);
        }

        return cipherText.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plantext string: ");
        String str = sc.next().toLowerCase();

        System.out.println("The ciphertext string is: "+ exchangeCipher(str));
        
        sc.close();
    }
}
