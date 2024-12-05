public class ComputePI {
    public static void main(String[] args) {
        double pi;
        double sum = 0.0;
        int MAX_DENOMINATOR = 1000;
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += 1 / (double) denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1 / (double) denominator;
            } else {
                System.out.println("Impossible!!!");
            }
        }
        pi = 4 * sum;
        System.out.println("PI = " + pi);
    }
}
