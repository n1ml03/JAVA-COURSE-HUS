import java.util.Scanner;

public class GradesHistogram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        int[] grades = new int[n];
        System.out.print("Enter the grades: ");
        for (int i = 0; i < n; i++) {
            grades[i] = input.nextInt();
        }

        int[] histogram = new int[11];
        for (int i = 0; i < n; i++) {
            int grade = grades[i] / 10;
            if (grade >= 0 && grade <= 10) {
                histogram[grade]++;
            }
        }
        // Print the vertical histogram
        for (int i = 0; i < 11; i++) {
            System.out.print(i * 10 + " - " + String.valueOf((i + 1) * 10 - 1) + ": ");
            for (int j = 0; j < histogram[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Print the horizontal histogram
        System.out.print("  ");
        for (int i = 0; i < 11; i++) {
            System.out.print(i * 10 + "-" + String.valueOf((i + 1) * 10 - 1) + "  ");
        }
        System.out.println();
        System.out.print("  ");
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < histogram[i]; j++) {
                System.out.print("* ");
            }
        }
        input.close();
    }
}