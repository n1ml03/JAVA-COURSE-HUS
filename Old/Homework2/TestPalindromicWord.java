import java.util.Scanner;

public class TestPalindromicWord {

    public static void isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println(str + " is not a palindrome word");
                return;
            }
            left++;
            right--;
        }
        System.out.println(str + " is a palindrome word");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String str = sc.nextLine().toLowerCase();

        isPalindrome(str);
        sc.close();
    }
}
