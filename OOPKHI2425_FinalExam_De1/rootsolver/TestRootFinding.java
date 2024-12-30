package hus.oop.rootsolver;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestRootFinding {
    public static void main(String[] args) {
        /* TODO
        Chạy các hàm test để test chương trình.
        Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_RootSolver>.txt
        (ví dụ, NguyenVanA_123456_RootSolver.txt).
        Nén tất cả các file source code và file kết quả chạy chương trình vào file zip có tên
        <TenSinhVien_MaSinhVien_RootSolver>.zip (ví dụ, NguyenVanA_123456_RootSolver.txt), và nộp bài
        lên classroom.
        */
        try {
            String fileName = "rootsolver/LeVanNam_21002158_RootSolver.txt";
            PrintStream fileOut = new PrintStream(fileName);
            System.setOut(fileOut);

            testRootSolver();

        } catch (FileNotFoundException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }

    }

    public static void testRootSolver() {
        /* TODO
         - Viết chương trình tìm nghiệm của hàm (sin(x).x - 3) theo các phương pháp đã cho (Bisection, Newton-Raphson, Secant) sử dụng
           UnivariateRealRootFinding. Các phương pháp tìm nghiệm có thể thay đổi ở thời gian chạy chương trình.
         - In ra phương pháp sử dụng, hàm và nghiệm tìm được trong khoảng [a, b] đã cho.
         */

        int lower = 12;
        int upper = 14;
        double tolerance = 1e-6;
        int maxIterations = 1000;

        AbstractFunction abstractFunction = new AbstractFunction() {
            @Override
            public double evaluate(double x) {
                return Math.sin(x)*x -3;
            }

            @Override
            public double derivative(double x) {
                return Math.cos(x)*x+Math.sin(x);
            }
        };

        BisectionSolver bisectionSolver = new BisectionSolver(tolerance, maxIterations);
        double rootBisection = bisectionSolver.solve(abstractFunction, lower, upper);
        System.out.println("Phuong phap Bisection");
        System.out.println("Nghiem cua ham sin(x).x-3 tren khoang [12, 14]: " +  rootBisection);
        System.out.println();

        NewtonRaphsonSolver newtonRaphsonSolver = new NewtonRaphsonSolver(tolerance, maxIterations);
        double rootNewton = newtonRaphsonSolver.solve(abstractFunction, lower, upper);
        System.out.println("Phuong phap Newtion-Raphson");
        System.out.println("Nghiem cua ham sin(x).x-3 tren khoang [12, 14]: " + rootNewton);
        System.out.println();

        SecantSolver secantSolver = new SecantSolver(tolerance, maxIterations);
        double rootSecant = secantSolver.solve(abstractFunction, lower, upper);
        System.out.println("Phuong phap Secant");
        System.out.println("Nghiem cua ham sin(x).x-3 tren khoang [12, 14]: " + rootSecant);
        System.out.println();
    }
}
