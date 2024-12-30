package hus.oop.rootsolver;

public class SecantSolver implements RootSolver {
    private final double tolerance;
    private final int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public SecantSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của hàm một biến theo phương pháp Secant
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm trong đoạn [lower, upper], hoặc Double.NaN nếu không tìm thấy nghiệm.
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        double fLower = function.evaluate(lower);
        double fUpper = function.evaluate(upper);

        if (fLower * fUpper >= 0) {
            return Double.NaN; // Điều kiện ban đầu không thỏa mãn
        }

        double x0 = upper;
        double x1 = lower;
        double x2;

        for (int i = 0; i < maxIterations; i++) {
            x2 = x1 - (fUpper * (x1 - x0)) / (fUpper - fLower);
            double fX2 = function.evaluate(x2);

            if (Math.abs(x2 - x1) < tolerance || fX2 ==0) {
                return x2;
            }

            x0 = x1;
            x1 = x2;
            fLower = fUpper;
            fUpper = fX2;
        }

        return Double.NaN; // Không hội tụ sau maxIterations lần lặp
    }
}
