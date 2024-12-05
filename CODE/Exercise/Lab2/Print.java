import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the value : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();

        System.out.print("The value are : ");
        print(array);

    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print(array[array.length - 1] + "]");
    }
}
