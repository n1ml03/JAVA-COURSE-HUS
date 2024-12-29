

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class TestMyList {
    public static void main(String[] args) {

        try {
            // Chuyển hướng output console ra file
            String fileName = "LeVanNam_21002158_MyList.txt";
            PrintStream fileOut = new PrintStream(fileName);
            System.setOut(fileOut);

            testMyArrayList();
            testMyLinkedList();

        } catch (FileNotFoundException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }

    public static void testMyArrayList() {
        MyArrayList list = new MyArrayList();
        List<Double> data = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        for (Double d : data) {
            list.append(d);
        }

        BasicStatistic bs = new BasicStatistic(list);
        System.out.println("MyArrayList:");
        System.out.println("Data: " + data);
        System.out.println("Max: " + bs.max());
        System.out.println("Min: " + bs.min());
        System.out.println("Mean: " + bs.mean());
        System.out.println("Variance: " + bs.variance());
    }

    public static void testMyLinkedList() {
        MyLinkedList list = new MyLinkedList();
        List<Double> data = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        for (Double d : data) {
            list.append(d);
        }

        BasicStatistic bs = new BasicStatistic(list);
        System.out.println("\nMyLinkedList:");
        System.out.println("Data: " + data);
        System.out.println("Max: " + bs.max());
        System.out.println("Min: " + bs.min());
        System.out.println("Mean: " + bs.mean());
        System.out.println("Variance: " + bs.variance());
    }
}
