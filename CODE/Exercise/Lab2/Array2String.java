import java.util.Scanner;

public class Array2String {
    public static String arrayToString(int[] items) {
        String join = "";
        StringBuilder sb = new StringBuilder("[");
        for (int val : items) {
            sb.append(join).append(val);
            join = ", ";
        }
        return sb.append("]").toString();
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
        System.out.println(arrayToString(items));
        sc.close();
    }
}
