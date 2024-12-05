package hus.oop.statistics;

import java.util.ArrayList;
import java.util.List;

public class ListDataSet extends AbstractDataSet {
    private List<Double> data;

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public ListDataSet(ArrayList<Double> data) {
        /* TODO */
        this.data = new ArrayList<>();
    }

    @Override
    public int size() {
        /* TODO */
        return data.size();
    }

    @Override
    public double getAt(int index) {
        /* TODO */
        return data.get(index);
    }

    @Override
    public double[] getAll(int from, int to) {
        /* TODO */
        List<Double> subList = data.subList(from, to);
        double[] result = new double[subList.size()];
        for (int i = 0; i < subList.size(); i++) {
            result[i] = subList.get(i);
        }
        return result;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void append(double value) {
        /* TODO */
        data.addLast(value);
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * @param index
     * @param value
     */
    @Override
    public void insert(int index, double value) {
        /* TODO */
        data.add(index, value);
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        data.remove(index);
    }

    /**
     * Xóa tất cả các phần tử dữ liệu có giá trị bằng value trong tập dữ liệu.
     * @param value
     */
    @Override
    public void remove(double value) {
        /* TODO */
        data.remove(value);
    }
}
