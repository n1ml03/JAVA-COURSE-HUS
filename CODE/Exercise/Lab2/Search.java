import java.util.Scanner;

public class Search {
    public static int search(int[] array, int key) {
        for (int val = 0; val < array.length; val++) {
            if (array[val] == key) {
                return val;
            }
        }
        return -1;
    }

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
        System.out.print("Enter the value: ");
        int key = sc.nextInt();
        System.out.println("The index of value is: " + search(items, key));
        sc.close();
    }
}
