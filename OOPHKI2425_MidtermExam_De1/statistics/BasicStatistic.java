package hus.oop.statistics;
import  java.util.Arrays;

public class BasicStatistic implements Statistic {
    private DataSet dataSet;

    /**
     * Hàm dựng khởi tạo tập dữ liệu.
     */
    public BasicStatistic() {
    }

    public void setDataSet(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public int size() {
        return dataSet.size();
    }

    @Override
    public double max() {
        double max = dataSet.getAt(0);
        for (int i = 1; i < dataSet.size(); i++) {
            if (dataSet.getAt(i) > max) {
                max = dataSet.getAt(i);
            }
        }
        return max;
    }

    @Override
    public double min() {
        double min = dataSet.getAt(0);
        for (int i = 1; i < dataSet.size(); i++) {
            if (dataSet.getAt(i) < min) {
                min = dataSet.getAt(i);
            }
        }
        return min;
    }

    @Override
    public double mean() {
        double sum = 0;
        for (int i = 0; i < dataSet.size(); i++) {
            sum += dataSet.getAt(i);
        }
        return sum / dataSet.size();
    }

    @Override
    public double variance() {
        double mean = mean();
        double sumOfSquares = 0;
        for (int i = 0; i < dataSet.size(); i++) {
            sumOfSquares += Math.pow(dataSet.getAt(i) - mean, 2);
        }
        return sumOfSquares / dataSet.size();
    }

    @Override
    public double[] rank() {
        double[] data = new double[dataSet.size()];
        for (int i = 0; i < dataSet.size(); i++) {
            data[i] = dataSet.getAt(i);
        }
        Arrays.sort(data);
        return data;
    }

    @Override
    public double median() {
       double[] rankedData = rank();
       int middle = rankedData.length / 2;
       if (rankedData.length % 2 == 1) {
           return rankedData[middle];
       } else {
           return (rankedData[middle - 1] + rankedData[middle]) / 2;
       }
    }
}
