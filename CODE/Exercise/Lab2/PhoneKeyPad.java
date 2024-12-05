import java.util.Scanner;

public class PhoneKeyPad {
    private static final String KEYPAD_MAPPING = "22233344455566677778889999";

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the String: ");
            String input = sc.next().toLowerCase();
            
            StringBuilder result = new StringBuilder(input.length()); 
            for (char c : input.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    result.append(KEYPAD_MAPPING.charAt(c - 'a'));
                }
            }
            
            System.out.println(result);
        }
    }
}