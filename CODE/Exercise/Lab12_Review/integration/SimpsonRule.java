

public class SimpsonRule implements Integrator {
    private final double precision;
    private final int maxIterations;

    public SimpsonRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     * @param poly Đa thức cần tích phân
     * @param lower Giới hạn dưới của tích phân
     * @param upper Giới hạn trên của tích phân
     * @return Giá trị xấp xỉ của tích phân
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        int n = 1;
        double In, I2n;
        do {
            In = integrate(poly, lower, upper, n);
            n *= 2;
            I2n = integrate(poly, lower, upper, n);
        } while (Math.abs(I2n - In) / 3 >= precision && n <= maxIterations);
        return I2n;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals (số chẵn) khoảng phân hoạch đều.
     * @param poly Đa thức cần tích phân
     * @param lower Giới hạn dưới của tích phân
     * @param upper Giới hạn trên của tích phân
     * @param numOfSubIntervals Số khoảng phân hoạch
     * @return Giá trị xấp xỉ của tích phân
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        double h = (upper - lower) / numOfSubIntervals;
        double sum = poly.evaluate(lower) + poly.evaluate(upper);
        for (int i = 1; i < numOfSubIntervals; i++) {
            sum += (i % 2 == 0) ? 2 * poly.evaluate(lower + i * h) : 4 * poly.evaluate(lower + i * h);
        }
        return sum * h / 3;
    }
}
