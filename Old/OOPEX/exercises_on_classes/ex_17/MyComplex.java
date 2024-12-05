package exercises_on_classes.ex_17;

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
        return real + " + " + imag + "i";
    }

    public boolean isReal() {
        return (imag == 0);
    }

    public void setReal(double real) {
        this.real = real;
    }

    public boolean isImaginary() {
        return (real == 0);
    }

    public boolean equals(double real, double imag) {
        return (getReal() == real && getImag() == imag);
    }

    public boolean equals(MyComplex another) {
        return equals(another.getReal(), another.getImag());
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(getReal(), 2) + Math.pow(getImag(), 2));
    }

    public double argument() {
        return Math.atan2(getImag(), getReal());
    }

    public MyComplex add(MyComplex right) {
        setReal(real + right.real);
        setImag(imag + right.imag);
        return this;
    }


    public MyComplex addNew(MyComplex right) {
        return new MyComplex(real + right.real, imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        setReal(real - right.real);
        setImag(imag - right.imag);
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(real - right.real, imag - right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        setReal(real * right.real - imag * right.imag);
        setImag(real * right.imag + imag * right.real);
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double rightSq = Math.pow(right.getReal(), 2) + Math.pow(right.getImag(), 2);
        setReal(multiply(right).getReal() / rightSq);
        setImag(multiply(right).getImag() / rightSq);
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }
}
