package hus.oop.basicstatistics;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

public class TestBasicStatistics {
    public static void main(String[] args) {
        /*
           - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
             là <TenSinhVien_MaSinhVien_BasicStatistics>.txt (Ví dụ, NguyenVanA_123456_BasicStatistics.txt).
           - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
             <TenSinhVien_MaSinhVien_BasicStatistics>.zip (Ví dụ, NguyenVanA_123456_BasicStatistics.zip),
             nộp lên classroom.
         */
        try {
            String fileName = "basicstatistics/LeVanNam_21002158_BasicStatistics.txt";
            PrintStream fileOut = new PrintStream(fileName);
            System.setOut(fileOut);

            testMyArrayList();
            testMyLinkedList();

        } catch (FileNotFoundException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }

    public static void testMyArrayList() {
        /*
           - Sinh ngẫu nhiên một số tự nhiên nằm trong đoạn [30, 50], lưu vào biến length.
           - Tạo một danh sách kiểu MyArrayList có các phần tử dữ liệu kiểu Double, các giá trị của phần
             tử được sinh ngẫu nhiên nằm trong đoạn [1, 20].
           - Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
             In ra terminal tập dữ liệu và các đại lượng thống kê.
         */
        MyArrayList list = new MyArrayList();
        Random rand = new Random();
        int n = rand.nextInt(21);
        for (int i = 0; i < n; i++) {
            double num = rand.nextDouble();
            list.append(num);
        }

        BasicStatistic bs = new BasicStatistic(list);
        System.out.println("MyArrayList:");
        System.out.println("Data: " + list);
        System.out.println("Max: " + bs.max());
        System.out.println("Min: " + bs.min());
        System.out.println("Mean: " + bs.mean());
        System.out.println("Variance: " + bs.variance());
    }

    public static void testMyLinkedList() {
        /*
           - Sinh ngẫu nhiên một số tự nhiên nằm trong đoạn [30, 50], lưu vào biến length.
           - Tạo ra một danh sách kiểu MyLinkedList có các phần tử dữ liệu kiểu Double, các giá trị của phần
             tử được sinh ngẫu nhiên nằm trong đoạn [1, 20].
           - Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
             In ra terminal tập dữ liệu và các đại lượng thống kê.
         */
        MyLinkedList list = new MyLinkedList();
        Random rand = new Random();
        int n = rand.nextInt(1, 21);
        for (int i = 0; i < n; i++) {
            double num = rand.nextDouble();
            list.append(num);
        }

        BasicStatistic bs = new BasicStatistic(list);
        System.out.println("\nMyLinkedList:");
        System.out.println("Data: " + list);
        System.out.println("Max: " + bs.max());
        System.out.println("Min: " + bs.min());
        System.out.println("Mean: " + bs.mean());
        System.out.println("Variance: " + bs.variance());
    }
}
