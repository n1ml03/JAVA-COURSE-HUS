import java.util.Scanner;

public class DecipherCaesarCode {
    public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String decrypt(String cipherText, int key) {
        cipherText = cipherText.toLowerCase();
        String message = "";
        for (int i = 0; i < cipherText.length(); i++) {
            int charPosition = alphabet.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - key) % 26;
            if (keyVal < 0) {
                keyVal = alphabet.length() + keyVal;
            }
            char replaceVal = alphabet.charAt(keyVal);
            message += replaceVal;
        }
        return message;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String str = sc.nextLine();

        System.out.print("Enter the fixed number: ");
        int key = sc.nextInt();
        System.out.println(decrypt(str, key).toUpperCase());
        sc.close();
    }
}
