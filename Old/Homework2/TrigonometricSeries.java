public class TrigonometricSeries {
    public static void main(String[] args) {
        double x = Math.PI / 6;
        int numTerms = 10;

        System.out.println("Calculated values: ");
        System.out.printf("sin(%1$d) = %2$f \n", (int) Math.round(x * 180 / Math.PI)
                , TrigonometricSeries.sin(x, numTerms));
        System.out.printf("cos(%1$d) = %2$f \n", (int) Math.round(x * 180 / Math.PI)
                , TrigonometricSeries.cos(x, numTerms));
        System.out.println();
        System.out.println("Math.sin() values: ");
        System.out.printf("sin(%1$d) = %2$f \n", (int) Math.round(x * 180 / Math.PI)
                , Math.sin(x));
        System.out.println("Math.cos() values: ");
        System.out.printf("cos(%1$d) = %2$f \n", (int) Math.round(x * 180 / Math.PI)
                , Math.cos(x));

    }

    public static double calculateTerm(double x, int numTerms) {
        double term = 1D;
        for (int i = numTerms; i > 0; i--) {
            term *= x / i;
        }
        return term;
    }

    public static double sin(double x, int numTerms) {
        double result = 0D;
        for (int i = 0; i < numTerms; i++) {
            result += (i % 2 == 0 ? 1 : -1) * calculateTerm(x, (2 * i + 1));
        }
        return result;
    }

    public static double cos(double x, int numTerms) {
        double result = 0D;
        for (int i = 0; i < numTerms; i++) {
            result += (i % 2 == 0 ? 1 : -1) * calculateTerm(x, (2 * i));
        }
        return result;
    }


}
