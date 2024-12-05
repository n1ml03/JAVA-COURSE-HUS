import java.util.Scanner;

public class Swap {
    public static boolean swap(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = arr1[i] + arr2[i];
                arr2[i] = arr1[i] - arr2[i];
                arr1[i] = arr1[i] - arr2[i];
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number of array2: ");
        int num2 = sc.nextInt();
        int[] arr1 = new int[num1];
        int[] arr2 = new int[num2];


        System.out.print("Enter the value of all array1 (separted bt space): ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the value of all array2 (separted bt space): ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Contents are successfully swapped?: " + swap(arr1, arr2));
        sc.close();
    }
}
