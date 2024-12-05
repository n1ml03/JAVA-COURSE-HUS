package hus.oop.search;

public class BinarySearch implements hus.oop.algorithm.search.Search {
    private hus.oop.algorithm.search.Sorter sorter;

    public BinarySearch() {
        /* TODO */
    }

    public void setSorter(hus.oop.algorithm.search.Sorter sorter) {
        /* TODO */
        this.sorter = sorter;
    }

    /**
     * Tìm kiếm giá trị value trong mảng data.
     * @param data: mảng tập hợp các giá trị.
     * @param value: giá trị cần tìm kiếm.
     * @return
     */
    @Override
    public int search(double[] data, double value) {
        /* TODO */
        return binarySearch(data, value);
    }

    /**
     * Tìm kiếm giá trị value trong mảng data, sử dụng thuật toán tìm kiếm nhị phân.
     * @param data
     * @param value
     * @return
     */
    private int binarySearch(double[] data, double value) {
        /* TODO */
        int left = 0;
        int right = data.length - 1;
        while (left <= right) {
            int m = (left + right) / 2;

            if (data[m] == value) {
                return m;
            } else if (data[m] > value) {
                right = m - 1;
            } else {
                left = m + 1;
            }
        }
        return -1;
    }

    /**
     * Sắp xếp mảng dữ liệu data.
     * @param data
     */
    private void sort(double[] data) {
        /* TODO */
        BubbleSort sorter = new BubbleSort();
        sorter.sort(data, true);
    }
}
