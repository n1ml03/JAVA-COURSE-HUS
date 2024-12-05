import java.util.*;

public class GradesStatistics {
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();
        System.out.print("The grades are: ");
        print(grades);
        System.out.println("The average is: " + average(grades));
        System.out.printf("The median is: %.2f \n", median(grades));
        System.out.println("The minumum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.printf("The standard deviation is: %.2f \n", stdDev(grades));
    }

    public static void readGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        grades = new int[numStudents];

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Enter the grade for student %d: ", i + 1);
            grades[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; ++i) {
            if (i == 0) {
                System.out.print(array[0]);
            } else {
                System.out.printf(", %d", array[i]);
            }
        }
        System.out.println("]");
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int grade : array) {
            sum += grade;
        }
        return (double) sum / array.length;
    }

    public static double median(int[] array) {
        int[] arr = array.clone();
        Arrays.sort(arr);
        if (arr.length % 2 == 1) {
            return arr[arr.length / 2];
        } else {
            return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        }
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double stdDev(int[] array) {
        double sum = 0.0, stdDev = 0.0;
        int length = array.length;

        for (double num : array) {
            sum += num;
        }

        double mean = sum / length;

        for (double num : array) {
            stdDev += Math.pow(num - mean, 2);
        }

        return Math.sqrt(stdDev / length);
    }

}
