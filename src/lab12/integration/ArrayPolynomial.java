package lab12.integration;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficients;
    private int size;

    public ArrayPolynomial() {
        this.coefficients = new double[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public double coefficient(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return coefficients[index];
    }

    @Override
    public double[] coefficients() {
        // Trả về bản sao của mảng để che giấu cấu trúc nội bộ
        return coefficients.clone();
    }

    public ArrayPolynomial append(double coefficient) {
        if (size >= coefficients.length) {
            enlarge();
        }
        coefficients[size] = coefficient;
        size++;
        return this;
    }

    public ArrayPolynomial insert(double coefficient, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size >= coefficients.length) {
            enlarge();
        }
        System.arraycopy(coefficients, index, coefficients, index + 1, size - index);
        coefficients[index] = coefficient;
        size++;
        return this;
    }

    public ArrayPolynomial set(double coefficient, int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        coefficients[index] = coefficient;
        return this;
    }

    @Override
    public int degree() {
        return size - 1;
    }

    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < size; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }

    @Override
    public Polynomial derivative() {
        ArrayPolynomial derivative = new ArrayPolynomial();
        for (int i = 1; i < this.size; i++) {
            derivative.append(i * this.coefficients[i]);
        }
        return derivative;
    }

    public ArrayPolynomial plus(ArrayPolynomial another) {
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < Math.max(this.size, another.size); i++) {
            double thisCoef = i < this.size ? this.coefficient(i) : 0;
            double anotherCoef = i < another.size ? another.coefficient(i) : 0;
            result.append(thisCoef + anotherCoef);
        }
        return result;
    }

    public ArrayPolynomial minus(ArrayPolynomial another) {
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < Math.max(this.size, another.size); i++) {
            double thisCoef = i < this.size ? this.coefficient(i) : 0;
            double anotherCoef = i < another.size ? another.coefficient(i) : 0;
            result.append(thisCoef - anotherCoef);
        }
        return result;
    }

    public ArrayPolynomial multiply(ArrayPolynomial another) {
        ArrayPolynomial result = new ArrayPolynomial();
        result.coefficients = new double[this.size + another.size - 1];
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < another.size; j++) {
                result.coefficients[i + j] += this.coefficients[i] * another.coefficients[j];
            }
        }
        result.size = this.size + another.size - 1;
        return result;
    }

    private void enlarge() {
        double[] newCoefficents = new double[coefficients.length * 2];
        System.arraycopy(coefficients, 0, newCoefficents, 0, coefficients.length);
        coefficients = newCoefficents;
    }
}