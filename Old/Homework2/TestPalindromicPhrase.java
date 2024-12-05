import java.util.Scanner;

public class TestPalindromicPhrase {

    public static void isPalindrome(String str) {
        String reverse = "";
        str = str.replaceAll("\\s+", ""); // Loại bỏ khoảng trắng
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (!str.equals(reverse)) {
            System.out.println(str + " is not a palindrome phrase");
        } else {
            System.out.println(str + " is a palindrome phrase");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phrase: ");
        String str = sc.nextLine().toLowerCase();

        isPalindrome(str);
        sc.close();
    }
}