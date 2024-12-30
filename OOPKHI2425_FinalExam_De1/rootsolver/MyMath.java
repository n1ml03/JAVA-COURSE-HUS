package hus.oop.rootsolver;

public class MyMath {
    public static double sin(double x) {
        double sin = x, term = x, x2 = -x*x;
        int i = 3;
        while (Math.abs(term) > 1e-12) {
            term = term * x2 / (i * (i - 1));
            sin += term;
            i += 2;
        }
        return sin;
    }

    public static double cos(double x) {
        double cos = 1, term = 1, x2 = -x*x;
        int i = 2;
        while (Math.abs(term) > 1e-12) {
            term = term * x2 / (i * (i - 1));
            cos += term;
            i += 2;
        }
        return cos;
    }

    public static double exp(double x) {
        double exp = 1, term = 1;
        int i = 1;
        while (Math.abs(term) > 1e-12) {
            term = term * x / i;
            exp += term;
            i++;
        }
        return exp;
    }

    public static double ln(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Đối số của hàm ln phải là số dương.");
        }
        double ln = x -1, term = x - 1;
        int i = 1;
        while (Math.abs(term) > 1e-12) {
            term = term * (x - 1) / i;
            ln += term;
            i++;
        }
        return ln;
    }
}
