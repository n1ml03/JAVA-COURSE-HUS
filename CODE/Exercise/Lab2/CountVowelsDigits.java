import java.util.Scanner;


public class CountVowelsDigits {
    private static final String VOWELS = "aeiou";

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the String: ");
            String str = sc.next().toLowerCase();
            
            int[] counts = analyzeCounts(str);
            int countVowels = counts[0];
            int countDigits = counts[1];
            
            double perVowel = (double) countVowels / str.length() * 100;
            double perDigit = (double) countDigits / str.length() * 100;

            System.out.printf("Number of vowels: %d (%.2f%%)%n", countVowels, perVowel);
            System.out.printf("Number of digits: %d (%.2f%%)%n", countDigits, perDigit);
        }
    }

    private static int[] analyzeCounts(String str) {
        int countVowels = 0, countDigits = 0;
        
        for (char c : str.toCharArray()) {
            if (VOWELS.indexOf(c) != -1) {
                countVowels++;
            } else if (Character.isDigit(c)) {
                countDigits++;
            }
        }
        
        return new int[]{countVowels, countDigits};
    }
}
