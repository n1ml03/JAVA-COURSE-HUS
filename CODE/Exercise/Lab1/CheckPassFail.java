import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pass: ");
        int mark = sc.nextInt();
        System.out.println("The mark is " + mark);

        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
}