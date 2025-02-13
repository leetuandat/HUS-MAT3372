package lab12.integration;

import java.util.ArrayList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        this.coefficients = new ArrayList<>();
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
        if (index < 0 || index >= coefficients.size()) {
            return 0.0; // Return 0 for out-of-bounds indices
        }
        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return
     */
    @Override
    public double[] coefficients() {
        double[] coeffArray = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            coeffArray[i] = coefficients.get(i);
        }
        return coeffArray;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial append(double coefficient) {
        coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial insert(double coefficient, int index) {
        coefficients.add(index, coefficient);
        return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial set(double coefficient, int index) {
        coefficients.set(index, coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return
     */
    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        double result = 0.0;
        for (int i = coefficients.size() - 1; i >= 0; i--) {
            result = result * x + coefficients.get(i);
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        ListPolynomial derivative = new ListPolynomial();
        for (int i = 1; i < coefficients.size(); i++) {
            derivative.append(i * coefficients.get(i));
        }
        return derivative;
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        ListPolynomial result = new ListPolynomial();
        int maxSize = Math.max(this.coefficients.size(), another.coefficients.size());
        for (int i = 0; i < maxSize; i++) {
            double coeff1 = i < this.coefficients.size() ? this.coefficients.get(i) : 0.0;
            double coeff2 = i < another.coefficients.size() ? another.coefficients.get(i) : 0.0;
            result.append(coeff1 + coeff2);
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        ListPolynomial result = new ListPolynomial();
        int maxSize = Math.max(this.coefficients.size(), another.coefficients.size());
        for (int i = 0; i < maxSize; i++) {
            double coeff1 = i < this.coefficients.size() ? this.coefficients.get(i) : 0.0;
            double coeff2 = i < another.coefficients.size() ? another.coefficients.get(i) : 0.0;
            result.append(coeff1 - coeff2);
        }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        int newSize = this.coefficients.size() + another.coefficients.size() - 1;
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < newSize; i++) {
            result.append(0.0);
        }
        for (int i = 0; i < this.coefficients.size(); i++) {
            for (int j = 0; j < another.coefficients.size(); j++) {
                double newCoeff = result.coefficient(i + j) + this.coefficients.get(i) * another.coefficients.get(j);
                result.set(newCoeff, i + j);
            }
        }
        return result;
    }
}
