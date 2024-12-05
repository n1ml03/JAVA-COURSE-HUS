import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String hex = sc.nextLine().toUpperCase();
        sc.close();
        
        boolean isHex = true;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            if ((c < '0' || c > '9') && (c < 'A' || c > 'F')) {
                isHex = false;
                throw new IllegalArgumentException("Invalid hex string");
            }
        }
        if (isHex) {
            System.out.println(hex + " is a hex string");
        } else {
            System.out.println(hex + " is NOT a hex string");
        }
    }
}
