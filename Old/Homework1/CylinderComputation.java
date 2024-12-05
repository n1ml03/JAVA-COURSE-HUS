import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = sc.nextFloat();
        System.out.print("Enter height: ");
        float height = sc.nextFloat();

        double baseArea = radius * radius * Math.PI;
        double surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        double volume = baseArea * height;

        System.out.printf("BaseArea is: %.2f%n", baseArea);
        System.out.printf("SufaceArea is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);

        sc.close();
    }
}