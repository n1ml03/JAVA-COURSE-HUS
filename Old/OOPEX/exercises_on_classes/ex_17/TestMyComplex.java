package exercises_on_classes.ex_17;


public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex complex = new MyComplex(2, 3);
        MyComplex another = new MyComplex(3, 3);

        /*Testing getters */
        System.out.println("Testing getters");
        System.out.println();

        System.out.println("Testing getReal: " + complex.getReal());
        System.out.println("Testing getImag: " + complex.getImag());
        System.out.println("Testing toString: " + complex);

        System.out.println();

        /*Testing setters */
        System.out.println("Testing setters");
        System.out.println();

        System.out.println("Testing setReal");
        System.out.println("Current real: " + complex.getReal());
        complex.setReal(10);
        System.out.println("Changed radius: " + complex.getReal());
        System.out.println();

        System.out.println("Testing setImag");
        System.out.println("Current imag: " + complex.getImag());
        complex.setImag(10);
        System.out.println("Changed radius: " + complex.getImag());
        System.out.println();

        System.out.println("Testing setValue");
        System.out.println("Current values: " + complex);
        complex.setValue(7, 7);
        System.out.println("Changed radius: " + complex);
        System.out.println();

        System.out.println("Testing add");
        System.out.println("Current values: " + complex);
        MyComplex added = complex.add(another);
        System.out.println("Changed values: " + added);
        System.out.println();

        System.out.println("Testing subtract");
        System.out.println("Current values: " + complex);
        MyComplex subtracted = complex.subtract(another);
        System.out.println("Changed values: " + subtracted);
        System.out.println();

        System.out.println("Testing multiply");
        System.out.println("Current values: " + complex);
        complex.multiply(another);
        System.out.println("Changed values: " + complex);
        System.out.println();

        System.out.println("Testing divide");
        System.out.println("Current values: " + complex);
        complex.divide(another);
        System.out.println("Changed values: " + complex);
        System.out.println();

        /*Testing return */
        System.out.println("Testing return");
        System.out.println();

        System.out.println("Testing isReal: " + complex.isReal());
        System.out.println("Testing isImaginary: " + complex.isImaginary());
        System.out.println("Testing equals: " + complex.equals(another));
        System.out.println("Testing magnitude: " + complex.magnitude());
        System.out.println("Testing argumentInRadians: " + complex.argument());
        System.out.println("Testing arguemntInDegrees: " + complex.argument());

    }
}
