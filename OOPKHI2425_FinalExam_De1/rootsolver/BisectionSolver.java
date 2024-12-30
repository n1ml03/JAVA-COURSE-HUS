package hus.oop.rootsolver;

public class BisectionSolver implements RootSolver {
    private final double tolerance;
    private final int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public BisectionSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của hàm một biến theo phương pháp chia đôi (Bisection)
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm, hoặc -1 nếu điều kiện ban đầu không thỏa mãn.
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        double fLower = function.evaluate(lower);
        double fUpper = function.evaluate(upper);

        if (fLower * fUpper >= 0) {
            System.out.println("Điều kiện ban đầu không thỏa mãn: f(lower) * f(upper) >= 0");
            return -1; // Trả về -1 nếu điều kiện ban đầu không thỏa mãn
        }

        for (int n = 1; n <= maxIterations; n++) {
            double c = (lower + upper) / 2;
            double fC = function.evaluate(c);

            if (fC == 0 || (upper - lower) < tolerance) {
                return c;
            } else if (fC * fLower > 0) {
                lower = c;
                fLower = fC;
            } else {
                upper = c;
                fUpper = fC;
            }
        }
        return (lower + upper) / 2; // Trả về giá trị gần đúng nhất sau maxIterations lần lặp
    }
}
