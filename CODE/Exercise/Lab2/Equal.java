import java.util.Scanner;

public class Equal {
    public static boolean equals(int[] array1, int[] array2) {
        if (array1 == array2) {
            return true;
        }
        if (array1 == null || array2 == null || array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array1: ");
        int num1 = sc.nextInt();
        int[] arr1 = new int[num1];

        System.out.print("Enter the value of all array1 (separted bt space): ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the number of array2: ");
        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];
        System.out.print("Enter the value of all array2 (separted bt space): ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Array1 equal to Array2: " + equals(arr1, arr2));
        sc.close();
    }
}
