package lab05.TheMyComplex;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return String.format("%s + %si", real, imag);
    }

    public boolean isReal() {
        return imag == 0.0;
    }

    public boolean isImaginary() {
        return real == 0.0;
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.real &&
                this.imag == another.imag);
    }

    public double magnitude() {
        return (Math.sqrt(real*real + imag*imag));
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.getReal(),
                                    this.imag + right.getImag());
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real = right.getReal(),
                this.imag - right.getImag());
    }

    public MyComplex multiply(MyComplex right) {
        this.real = this.real * right.getReal() - this.imag * right.getImag();
        this.imag = this.real * right.getImag() + this.imag * right.getReal();
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double denominator = right.getReal() * right.getReal() +
                right.getImag() * right.getImag();
        this.real = (this.real * right.getReal() + this.imag * right.getImag() /
                denominator);
        this.imag = (this.imag * right.getReal() - this.real * right.getImag() /
                denominator);
        return this;
    }

    public MyComplex conjugate() {
        this.real = this.real;
        this.imag = - this.imag;
        return this;
    }
}
