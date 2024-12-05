import java.util.Scanner;

public class HillPatternX {

    public static void printPatternA(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 2 * size - i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void printPatternB(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 2 * size - i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void printPatternC(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 2 * size - i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 2 * size - i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void printPatternD(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= 2 * size - 1; j++) {
                if ((i + j > size + 1) && (i > j - size + 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < size; i++) {
            for (int j = 1; j <= 2 * size - 1; j++) {
                if ((i < j - 1) && (i + j < 2 * size - 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        printPatternA(size);
        System.out.println();
        printPatternB(size);
        System.out.println();
        printPatternC(size);
        System.out.println();
        printPatternD(size);
        sc.close();

    }
}
