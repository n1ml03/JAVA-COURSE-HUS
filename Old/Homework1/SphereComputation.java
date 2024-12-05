import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double surfaceArea = 4.0 * radius * radius * Math.PI;
        double volume = 4.0 / 3 * Math.PI * radius * radius * radius;

        System.out.printf("SufaceArea is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);

        sc.close();
    }
}