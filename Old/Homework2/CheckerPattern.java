import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row % 2 == 1 && col % 2 == 1) || (row % 2 == 0 && col % 2 == 0)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
        sc.close();
    }
}
