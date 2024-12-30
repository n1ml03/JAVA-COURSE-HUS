package hus.oop.basicstatistics;

import java.util.NoSuchElementException;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        /* TODO */
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * @return giá trị lớn nhất.
     */
    public double max() {
        /* TODO */
        if (data.size() == 0) {
            throw new NoSuchElementException("The list is empty.");
        }
        double max = (double) data.get(0);
        for (int i = 1; i < data.size(); i++) {
            double value = (double) data.get(i);
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        /* TODO */
        if (data.size() == 0) {
            throw new NoSuchElementException("The list is empty.");
        }
        double min = (double) data.get(0);
        for (int i = 1; i < data.size(); i++) {
            double value = (double) data.get(i);
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        /* TODO */
        if (data.size() == 0) {
            throw new NoSuchElementException("The list is empty.");
        }

        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += (double) data.get(i);
        }
        return sum / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * @return phương sai.
     */
    public double variance() {
        /* TODO */
        if (data.size() == 0) {
            throw new NoSuchElementException("The list is empty.");
        }

        double mean = mean();
        double sumOfSquares = 0;
        for (int i = 0; i < data.size(); i++) {
            double value = (double) data.get(i);
            sumOfSquares += Math.pow(value - mean, 2);
        }
        return sumOfSquares / data.size();
    }
}
