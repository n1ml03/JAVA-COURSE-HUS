import java.util.Scanner;

public class CaesarCode {
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String str, int key) {
        str = str.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < str.length(); i++) {
            int charPosition = alpha.indexOf(str.charAt(i));
            int keyVal = (key + charPosition) % 26;
            char replaceVal = alpha.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the plantext string: ");
        String str = sc.nextLine();
        System.out.print("Enter the fixed number: ");
        int key = sc.nextInt();
        System.out.println(encrypt(str, key).toUpperCase());
        sc.close();
    }
}
