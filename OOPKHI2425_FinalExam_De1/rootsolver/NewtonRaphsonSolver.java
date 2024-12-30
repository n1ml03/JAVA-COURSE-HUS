package hus.oop.rootsolver;

public class NewtonRaphsonSolver implements RootSolver {
    private final double tolerance;
    private final int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public NewtonRaphsonSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của hàm một biến sử dụng phương pháp Newton-Raphson.
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm, hoặc Double.NaN nếu không hội tụ.
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        double x0 = lower;
        double x1;
        double f0, df0;

        for (int i = 0; i < maxIterations; i++) {
            f0 = function.evaluate(x0);
            df0 = function.derivative(x0);

            if (df0 == 0) {
                return Double.NaN; // Tránh chia cho 0
            }

            x1 = x0 - f0 / df0;

            if (Math.abs(x1 - x0) < tolerance) {
                return x1;
            }

            x0 = x1;
        }

        return Double.NaN; // Không hội tụ sau maxIterations lần lặp
    }
}
