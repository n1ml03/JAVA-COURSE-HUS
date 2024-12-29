
import java.io.IOException;
import java.io.PrintStream;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
      
      /*
        - Chạy demo các hàm test.
        - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
          (ví dụ, NguyenVanA_123456_Integration.txt)
        - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
      */

        try {
            // Chuyển hướng output console ra file
            String fileName = "LeVanNam_21002158_Integration.txt";
            PrintStream fileOut = new PrintStream(fileName);
            System.setOut(fileOut);

            System.out.println("TestArrayPolynom");
            testArrayPolynomial();

            System.out.println("\nTestListPolynom");
            testListPolynomial();

            System.out.println("\nTestIntegrationCalculator");
            testIntegrationCalculator();

        } catch (IOException e) {
            System.err.println("Lỗi ghi file: " + e.getMessage());
        }
    }

    public static void testArrayPolynomial() {
        ArrayPolynomial p1 = new ArrayPolynomial();
        p1.append(1).append(2).append(3);
        System.out.println("Đa thức p1: " + p1);

        ArrayPolynomial p2 = new ArrayPolynomial();
        p2.append(4).append(5).append(6);
        System.out.println("Đa thức p2: " + p2);

        ArrayPolynomial p3 = new ArrayPolynomial();
        p3.append(p1.coefficient(0) + p2.coefficient(0));
        p3.append(p1.coefficient(1) + p2.coefficient(1));
        p3.append(p1.coefficient(2) + p2.coefficient(2));
        System.out.println("p1 + p2: " + p3);

        p3 = new ArrayPolynomial();
        p3.append(p1.coefficient(0) - p2.coefficient(0));
        p3.append(p1.coefficient(1) - p2.coefficient(1));
        p3.append(p1.coefficient(2) - p2.coefficient(2));
        System.out.println("p1 - p2: " + p3);

    }

    public static void testListPolynomial() {
        ListPolynomial p1 = new ListPolynomial();
        p1.append(1).append(2).append(3);
        System.out.println("Đa thức p1: " + p1);

        ListPolynomial p2 = new ListPolynomial();
        p2.append(4).append(5).append(6);
        System.out.println("Đa thức p2: " + p2);

        ListPolynomial p3 = p1.plus(p2);
        System.out.println("p1 + p2: " + p3);

        p3 = p1.minus(p2);
        System.out.println("p1 - p2: " + p3);

        p3 = p1.multiply(p2);
        System.out.println("p1 * p2: " + p3);

    }

    public static void testIntegrationCalculator() {
        Polynomial poly = new ArrayPolynomial().append(2).append(3); // Ví dụ: 2 + 3x
        Integrator integrator = new MidpointRule(1, 3);
        IntegrationCalculator calculator = new IntegrationCalculator(integrator, poly);
        double result = calculator.integrate(1, 2);
        System.out.println("Phương pháp Midpoint: ");
        System.out.println("Đa thức: " + poly);
        System.out.println("Tích phân từ 1 đến 2: " + result);

        integrator = new TrapezoidRule(1, 3);
        calculator.setIntegrator(integrator);
        result = calculator.integrate(1, 2);
        System.out.println("\nPhương pháp Trapezoid: ");
        System.out.println("Đa thức: " + poly);
        System.out.println("Tích phân từ 1 đến 2: " + result);

        integrator = new SimpsonRule(1, 3);
        calculator.setIntegrator(integrator);
        result = calculator.integrate(1, 2);
        System.out.println("\nPhương pháp Simpson: ");
        System.out.println("Đa thức: " + poly);
        System.out.println("Tích phân từ 1 đến 2: " + result);
    }
}
