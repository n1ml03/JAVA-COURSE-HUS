package hus.oop.datastructure;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        /* TODO
        Yêu cầu:

        - Hoàn thiện code chương trình theo mẫu đã cho.

        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_DataStructure>.txt (Ví dụ, NguyenVanA_123456_DataStructure.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_DataStructure>.zip (Ví dụ, NguyenVanA_123456_DataStructure.zip),
          nộp lên classroom.
        */
        try {
            // Chuyển hướng output console ra file
            String fileName = "LeVanNam_21002158_DataStructure.txt";
            PrintStream fileOut = new PrintStream(fileName);
            System.setOut(fileOut); // Gán System.out vào file

            // Gọi các phương thức kiểm tra
            testQueue();
            testStack();

            // Thông báo hoàn tất
            System.out.println("Kết quả đã được ghi vào file: " + fileName);
        } catch (FileNotFoundException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }

    public static void testStack() {
        /* TODO
         - Sinh ra một số tự nhiên ngẫu nhiên nằm trong đoạn [20 - 30], gọi là n.
         - Sinh ngẫu nhiên ra n số nguyên, cho vào stack.
            + In ra các phần tử trong stack.
            + Lần lượt xóa các phần tử trong stack. Sau mỗi lần xóa, in ra các phần tử còn lại trong stack.
         */
        Random rand = new Random();
        int n = rand.nextInt(20, 31);
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            int num = rand.nextInt();
            stack.push(num);
        }

        System.out.println(stack);
        for (int i = 0; i < n; i++) {
            System.out.println("Xoa phan tu thu " + i);
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }

    public static void testQueue() {
        /* TODO
         - Sinh ra một số tự nhiên ngẫu nhiên nằm trong đoạn [20 - 30], gọi là n.
         - Sinh ra n số nguyên ngẫu nhiên, cho vào queue.
            + In ra các phần tử trong queue.
            + Lần lượt xóa các phần tử trong queue. Sau mỗi lần xóa, in ra các phần tử còn lại trong queue.
         */

        Random rand = new Random();
        int n = rand.nextInt(20, 31);
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            int num = rand.nextInt();
            queue.offer(num);
        }

        System.out.println(queue);
        for (int i = 0; i < n; i++) {
            System.out.println("Xoa phan tu thu " + i);
            System.out.println(queue.poll());
            System.out.println(queue);
        }
    }
}
