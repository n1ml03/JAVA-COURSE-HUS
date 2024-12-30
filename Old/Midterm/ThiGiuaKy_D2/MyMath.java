import java.io.FileWriter;
import java.math.BigInteger;

public class MyMath {
    public MyMath() {}
    
    /**
     * Calculate cos(x)
     * @param x double
     * @return double
     */
    public static double cos(double x) {
        double cos = 1, term = 1, x2 = x*x;
        for (int i = 2; Math.abs(term) > 1e-12; i += 2) {
            term = -term * x2 / (i * (i - 1));
            cos += term;
        }
        return cos;
    }

    /**
     * Calculate exp(x)
     * @param x double
     * @return double
     */
    public static double exp(double x) {
        double exp = 1, term = 1;
        for (int i = 1; Math.abs(term) > 1e-12; i++) {
            term = term * x / i;
            exp += term;
        }
        return exp;
    }

    /**
     * Convert decimal to other radix
     * @param in String
     * @param outRadix int
     * @return String
     */
    public static String decimalTo(String in, int outRadix) {
        BigInteger dec = new BigInteger(in);
        StringBuilder res = new StringBuilder();
        while (dec.compareTo(BigInteger.ZERO) > 0) {
            int tmp = dec.mod(BigInteger.valueOf(outRadix)).intValue();
            res.insert(0, (tmp < 10) ? tmp : (char) (tmp + 55));
            dec = dec.divide(BigInteger.valueOf(outRadix));
        }
        return res.toString();
    }

    /**
     * Convert other radix to decimal
     * @param in String
     * @param inRadix int
     * @return String
     */
    public static String toDecimal(String in, int inRadix) {
        in = in.toUpperCase();
        BigInteger res = BigInteger.ZERO;
        for (int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);
            int d = (c >= '0' && c <= '9') ? c - '0' : c - 'A' + 10;
            res = res.multiply(BigInteger.valueOf(inRadix)).add(BigInteger.valueOf(d));
        }
        return res.toString();
    }

    /**
     * Convert from one radix to another
     * @param in String
     * @param inRadix int
     * @param outRadix int
     * @return String
     */
    public static String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) return in;
        return (outRadix == 10) ? toDecimal(in, inRadix) : 
            (inRadix == 10) ? decimalTo(in, outRadix) : 
            decimalTo(toDecimal(in, inRadix), outRadix);
    }


    public static void main(String[] args) {
        String result = "e^(2.2) * cos(3.3) = " + exp(2.2) * cos(3.3) + "\n";
        result += "using java libraries: " + Math.exp(2.2) * Math.cos(3.3) + "\n\n";
        result += "123456789123456789 in 13 to 8: " + toRadix("123456789123456789", 13, 8) + "\n";
        System.out.println(result);

        try (FileWriter fileWriter = new FileWriter("MyMath21002158.txt")) {
            fileWriter.write(result);
        } catch (Exception e) {
            System.out.println("Can't write to file!");
            e.printStackTrace();
        }
    }
}
