package lab04.MyComplexClass;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter complex number 1 (real and imaginary part): ");
        MyComplex complex1 = new MyComplex(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Enter complex number 2 (real and imaginart part): ");
        MyComplex complex2 = new MyComplex(scanner.nextDouble(), scanner.nextDouble());
        scanner.close();

        printComplex(complex1, 1);
        printComplex(complex2, 2);
        compareComplex(complex1, complex2);
        sumComplex(complex1, complex2);

    }

    public static void printComplex(MyComplex complex, int number) {
        System.out.printf("Number %d is: (%s)%n", number, complex);
        System.out.printf("(%s) is%s a pure real number\n", complex,
                complex.isReal()?"":" NOT");
        System.out.printf("(%s) is%s a pure imaginary number\n", complex,
                complex.isImaginary()?"":" NOT");
    }

    public static void compareComplex(MyComplex complex1, MyComplex complex2) {
        System.out.printf("(%s) is%s equal to %s\n", complex1,
                complex1.equals(complex2) ? "" : " NOT", complex2);
    }

    public static void sumComplex(MyComplex complex1, MyComplex complex2) {
        System.out.printf("(%s) + (%s) = %s\n", complex1, complex2,
                complex1.addNew(complex2));
    }
}
