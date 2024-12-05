import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        String reverse = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            reverse = ch + reverse;
        }

        System.out.println("The reverse of the String '" + s + "' is '" + reverse + "'.");
        sc.close();
    }
}
