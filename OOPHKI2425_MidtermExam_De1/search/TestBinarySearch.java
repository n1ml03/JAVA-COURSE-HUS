package hus.oop.search;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class TestBinarySearch {
    public static void main(String[] args) {
        /* Yêu cầu:
        - Sinh ra ngẫu nhiên một số tự nhiên có giá trị nằm trong khoảng [10 - 20].
        - Sinh ra ngẫu nhiên một mảng các số kiểu double, có kích thước bằng số tự nhiên đã sinh ngẫu nhiên ở trên.
        - Tạo đối tượng có kiểu dữ liệu BinarySearch được tham chiếu đến bởi một biến có kiểu dữ liệu Search.
          Dùng đối tượng này test thuật toán tìm kiếm nhị phân với mảng dữ liệu đã sinh ra sử dụng 3 thuật toán sắp xếp khác nhau như đã cho.

          Các kết quả test được in ra terminal theo định dạng: ví dụ
          Using Bubble Sort Algorithm:
          Before sorting: [5.0 4.0 3.0 2.0 1.0]
          After sorting: [1.0 2.0 3.0 4.0 5.0]
          Binary search giá trị 3.0: 2

          Using Insertion Sort Algorithm:
          Before sorting: [5.0 4.0 3.0 2.0 1.0]
          After sorting: [1.0 2.0 3.0 4.0 5.0]
          Binary search giá trị 6.0:-1

        - Kết quả chạy chương trình lưu vào file text được đặt tên <TenSinhVien_MaSinhVien_BinarySearch.txt.
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BinarySearch>.zip (Ví dụ, NguyenVanA_123456_BinarySearch.zip),
          nộp lên classroom
         */

        Random random = new Random();
        int n = random.nextInt(10, 21);
        double[] original = new double[n];
        for (int i = 0; i < n; i++) {
            original[i] = random.nextInt(0, n * 2);
        }

        BinarySearch binarySearch = new BinarySearch();
        StringBuilder result = new StringBuilder();

        // Bubble sort
        BubbleSort bubbleSort = new BubbleSort();
        double[] arr = original.clone();
        result.append("Using Bubble Sort Algorithm: \nBefore sorting: ").append(Arrays.toString(original));
        bubbleSort.sort(arr, true);
        result.append("\nAfter sorting: ").append(Arrays.toString(arr)).append("\n");
        result.append("Binary search giá trị 3.0: ").append(binarySearch.search(arr, 3.0)).append("\n\n");

        // Insertion sort
        InsertionSort insertionSort = new InsertionSort();
        double[] arrIns = original.clone();
        result.append("Using Insertion Sort Algorithm: \nBefore sorting: ").append(Arrays.toString(original));
        insertionSort.sort(arrIns, true);
        result.append("\nAfter sorting: ").append(Arrays.toString(arr)).append("\n");
        result.append("Binary search giá trị 6.0: ").append(binarySearch.search(arr, 6.0));

        System.out.println(result.toString());

        try (FileWriter fileWriter = new FileWriter("LeVanNam_21002158_BinarySearch.txt")) {
            fileWriter.write(result.toString());
        } catch (IOException e) {
            System.out.println("Can't write to file!");
            e.printStackTrace();
        }

    }
}
