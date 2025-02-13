package lab04.MyComplexClass;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

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
        //return (imag == 0)
        return Double.compare(imag, 0.0) == 0;
    }

    public boolean isImaginary() {
        //return (real == 0)
        return Double.compare(real, 0.0) == 0;
    }

    public boolean equals(double real, double imag) {
        //return (this.real == real && this.imag == imag)
        return (Double.compare(this.real, real) == 0 &&
                Double.compare(this.imag, imag) == 0);
    }

    public boolean equals(MyComplex another) {
        //return (this.real == another.getReal() && this.imag == another.getImag())
        return (Double.compare(this.real, another.getReal()) == 0 &&
                Double.compare(this.imag, another.getImag()) == 0);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
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


}
