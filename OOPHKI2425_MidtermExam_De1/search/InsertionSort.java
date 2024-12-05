package hus.oop.search;

public class InsertionSort implements hus.oop.algorithm.search.Sorter {
    /**
     * Sắp xếp mảng dữ liệu, sử dụng thuật toán Insertion sort.
     * @param data
     * @param order: true sắp xếp theo thứ tự tăng dần, false sắp xếp theo thứ tự giảm dần.
     */
    @Override
    public void sort(double[] data, boolean order) {
        /* TODO */
        if (order) {
            sortAscending(data);
        } else {
            sortDescending(data);
        }
    }

    /**
     * Sắp xếp mảng dữ liệu theo thứ tự tăng dần, sử dụng thuật toán Insertion sort.
     * @param data
     */
    private void sortAscending(double[] data) {
        /* TODO */
        for (int i = 1; i < data.length; ++i) {
            double k = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > k) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = k;
        }
    }

    /**
     * Sắp xếp mảng dữ liệu theo thứ tự giảm dần, sử dụng thuật toán Insertion sort.
     * @param data
     */
    private void sortDescending(double[] data) {
        /* TODO */
        for (int i = 1; i < data.length; ++i) {
            double k = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] < k) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = k;
        }
    }
}