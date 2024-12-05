import java.util.Scanner;


public class Reverse {
    public static void reverse(int[] array) {
        System.out.print("The values are: [");
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == array.length - 1) {
                System.out.print(array[array.length - 1]);
            } else {
                System.out.printf(", %d", array[i]);
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.print("Enter the value of all array (separted bt space): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        sc.close();
    }
}
