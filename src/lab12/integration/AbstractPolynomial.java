package lab12.integration;

public abstract class AbstractPolynomial implements Polynomial {
    protected double[] coefficients; // Giả sử mảng các hệ số được lưu trữ trong trường này

    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        if (coefficients == null || coefficients.length == 0) return "0";

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < coefficients.length; i++) {
            if (coefficients[i] == 0) continue; // Bỏ qua hệ số bằng 0

            String term;
            if (i == 0) {
                term = String.format("%.2f", coefficients[i]);
            } else if (i == 1) {
                term = String.format("%.2fx", coefficients[i]);
            } else {
                term = String.format("%.2fx^%d", coefficients[i], i);
            }

            result.append((coefficients[i] > 0 && i != 0) ? " + " + term : term);
        }

        return result.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        if (coefficients == null || coefficients.length <= 1) return new double[]{0};

        double[] diffCoefficients = new double[coefficients.length - 1];
        for (int i = 1; i < coefficients.length; i++) {
            diffCoefficients[i - 1] = i * coefficients[i];
        }
        return diffCoefficients;
    }
}
