import java.util.Scanner;
import java.util.Random;;

public class WordGuess {

    private static final String[] words = {"testing", "hello", "world", "template", "java",
     "programming", "computer", "science", "engineer", "algorithm"};
    private static String secretWord;
    private static boolean[] secretWordMatches;

    public static void main(String[] args) {
        initializeGame();
        Scanner in = new Scanner(System.in);
        runGame(in);
        in.close();
    }

    private static void initializeGame() {
        Random rand = new Random();
        secretWord = words[rand.nextInt(words.length)];
        secretWordMatches = new boolean[secretWord.length()];
    }

    private static void runGame(Scanner in) {
        int trials = 0;
        while (true) {
            System.out.print("Key in one character or your guess word: ");
            String trialWord = in.next();
            trials++;
            if (trialWord.length() == 1) {
                processCharacterGuess(trialWord);
                trialWord = getDisplayWord();
                System.out.printf("Trail %1$d: %2$s\n", trials, trialWord);
            }
            if (trialWord.equals(secretWord)) {
                System.out.printf("Key in one character or your guess word: %s \n", secretWord);
                System.out.println("Congratulation!");
                break;
            }
        }
        System.out.printf("You got in %d trials\n", trials);
    }

    private static void processCharacterGuess(String trialWord) {
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWordMatches[i]) {
                continue;
            }
            secretWordMatches[i] = secretWord.charAt(i) == trialWord.charAt(0);
        }
    }

    private static String getDisplayWord() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < secretWord.length(); i++) {
            str.append(secretWordMatches[i] ? secretWord.charAt(i) : '_');
        }
        return str.toString();
    }
}