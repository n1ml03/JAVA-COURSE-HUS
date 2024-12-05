package hus.oop.statistics;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TestStatistics {
    public static void main(String[] args) throws IOException {
        /* TODO

         - Viết các hàm test như yêu cầu và chạy test chương trình.
         - Copy kết quả chạy chương trình và lưu vào file text có tên <Ten_MaSinhVien_Statistics>.txt
         (ví dụ, NguyenVanA_123456S_Statistics.txt).
          - Nén các file source code và file text kết quả chạy chương trình theo định dạng .zip,
         đặt tên là <Ten_MaSinhVien_Statistics>.zip (ví dụ, NguyenVanA_123456_Statistics.zip) và nộp lên classroom.
         */
        try {
            // Chuyển hướng output console ra file
            String fileName = "LeVanNam_21002158_Statistics.txt";
            PrintStream fileOut = new PrintStream(fileName);
            System.setOut(fileOut); // Gán System.out vào file

            // Gọi các phương thức kiểm tra
            testArrayDataSet();
            testListDataSet();

            // Thông báo hoàn tất
            System.out.println("Kết quả đã được ghi vào file: " + fileName);
        } catch (FileNotFoundException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }

    }

    public static void testArrayDataSet() {
        /* TODO
         - Sinh ra một số tự nhiên ngẫu nhiên trong đoạn [10, 20], gọi là n.
         - Sinh ra n số thực kiểu double ngẫu nhiên, cho vào tập dữ liệu.
         - In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
         - Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
           In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
         */

        Random rand = new Random();
        int n = rand.nextInt(10, 21);
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            double num = rand.nextDouble();
            arr[i] = num;
        }

        DataSet dataSet = new ArrayDataSet(arr);
        BasicStatistic basicStatistic = new BasicStatistic();
        basicStatistic.setDataSet(dataSet);

        System.out.println("Tap du lieu: " + basicStatistic);
        System.out.println("Kich co: " + basicStatistic.size());
        System.out.println("Max: " + basicStatistic.max());
        System.out.println("Min: " + basicStatistic.min());
        System.out.println("Ky vong: " + basicStatistic.mean());
        System.out.println("Phuong sai: " + basicStatistic.variance());
        System.out.println("Rank: " + Arrays.toString(basicStatistic.rank()));
        System.out.println("Median:" + basicStatistic.median());
    }

    public static void testListDataSet() {
        /* TODO
         - Sinh ra một số tự nhiên ngẫu nhiên trong đoạn [10, 20], gọi là n.
         - Sinh ra n số thực kiểu double ngẫu nhiên, cho vào tập dữ liệu.
         - In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
         - Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
           In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
         */
        Random rand = new Random();
        int n = rand.nextInt(10, 21);
        ArrayList<Double> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double num = rand.nextDouble();
            arr.add(num);
        }

        DataSet dataSet = new ListDataSet(arr);
        BasicStatistic basicStatistic = new BasicStatistic();
        basicStatistic.setDataSet(dataSet);

        System.out.println("Tap du lieu: " + basicStatistic);
        System.out.println("Kich co: " + basicStatistic.size());
        System.out.println("Max: " + basicStatistic.max());
        System.out.println("Min: " + basicStatistic.min());
        System.out.println("Ky vong: " + basicStatistic.mean());
        System.out.println("Phuong sai: " + basicStatistic.variance());
        System.out.println("Rank: " + Arrays.toString(basicStatistic.rank()));
       System.out.println("Median:" + basicStatistic.median());
    }
}
