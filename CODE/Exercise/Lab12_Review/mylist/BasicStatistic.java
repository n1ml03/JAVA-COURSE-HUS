

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * @return giá trị lớn nhất.
     */
    public double max() {
        if (data.size() == 0) {
            throw new IllegalStateException("The list is empty.");
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
        if (data.size() == 0) {
            throw new IllegalStateException("The list is empty.");
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
        if (data.size() == 0) {
            throw new IllegalStateException("The list is empty.");
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
        if (data.size() == 0) {
            throw new IllegalStateException("The list is empty.");
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
