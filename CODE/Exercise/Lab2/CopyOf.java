import java.util.Scanner;

public class CopyOf {
    public static int[] copyOf(int[] array) {
        int[] copyArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyArr[i] = array[i];
        }

        return copyArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.print("Enter the value of all array1 (separted bt space): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] copyArray = copyOf(arr);
        System.out.print("The copy of given array: ");
        for (int i : copyArray) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
