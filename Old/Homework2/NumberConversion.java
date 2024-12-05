import java.util.Scanner;

public class NumberConversion {

    private static String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTVUWXYZ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String str = sc.nextLine();
        System.out.print("ENter the input radix: ");
        int inputRadix = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the output radix: ");
        int outputRadix = Integer.parseInt(sc.nextLine());
        sc.close();


        System.out.printf("\"%1$s\" in radix %2$d is \"%3$s\" in radix %4$d.\n"
                , str, inputRadix
                , toRadix(str, inputRadix, outputRadix), outputRadix);
    }

    public static int toInt(String in, int inRadix) {
        int result = 0;
        for (int i = in.length() - 1; i >= 0; i--) {
            int digit = Character.digit(in.charAt(i), inRadix);
            result += digit * Math.pow(inRadix, (in.length() - 1 - i));
        }
        return result;
    }

    public static String toRadix(int number, int radix) {
        String result = "";
        if (radix == 0) {
            return result;
        }

        while (number > 0) {
            result = alphabet.charAt(number % radix) + result;
            number /= radix;
        }
        return result;
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return in;
        }
        return toRadix(toInt(in, inRadix), outRadix);
    }
}