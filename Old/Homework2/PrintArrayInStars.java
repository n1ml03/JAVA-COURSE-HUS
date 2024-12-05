import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        final int NUM_ITEM = sc.nextInt();
        int[] items = new int[NUM_ITEM];
        if (items.length > 0) {
            System.out.print("Enter the value of all items (separted bt space): ");
            for (int i = 0; i < items.length; i++) {
                items[i] = sc.nextInt();
            }
        }

        for (int idx = 0; idx < items.length; ++idx) {
            System.out.print(idx + ": ");
            for (int starNo = 1; starNo <= items[idx]; ++starNo) {
                System.out.print("*");
            }
            System.out.println("(" + items[idx] + ")");
        }
        sc.close();
    }
}
