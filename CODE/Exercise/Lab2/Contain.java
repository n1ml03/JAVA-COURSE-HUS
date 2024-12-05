import java.util.Scanner;

public class Contain {
    public static boolean contains(int[] array, int key) {
        for (int val : array) {
            if (val == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        final int NUM_ITEM = sc.nextInt();
        int[] items = new int[NUM_ITEM];
        if (items.length > 0) {
            System.out.print("Enter the value of all items (separted bt space): ");
            for (int i = 0; i < items.length; i++) {
                items[i] = sc.nextInt();
            }
        }
        System.out.print("Enter the value: ");
        int key = sc.nextInt();
        System.out.println("The value contain in array?: " + contains(items, key));
        sc.close();
    }
}
