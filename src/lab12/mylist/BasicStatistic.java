package lab12.mylist;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        // Gán data vào thuộc tính của lớp
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * @return giá trị lớn nhất.
     */
    public double max() {
        double maxVal = Double.MIN_VALUE;
        for (int i = 0; i < data.size(); i++) {
            if ((Double)data.get(i) > maxVal) {
                maxVal = (Double)data.get(i);
            }
        }
        return maxVal;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        double minVal = Double.MAX_VALUE;
        for (int i = 0; i < data.size(); i++) {
            if ((Double)data.get(i) < minVal) {
                minVal = (Double)data.get(i);
            }
        }
        return minVal;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += (Double)data.get(i);
        }
        return sum / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * @return phương sai.
     */
    public double variance() {
        double meanVal = mean();
        double temp = 0;
        for (int i = 0; i < data.size(); i++) {
            temp += ((Double)data.get(i) - meanVal) * ((Double)data.get(i) - meanVal);
        }
        return temp / (data.size() - 1);
    }
}