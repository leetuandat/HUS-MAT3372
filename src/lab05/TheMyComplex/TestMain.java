package lab05.TheMyComplex;

import lab05.TheMyComplex.MyComplex;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        MyComplex complex1 = new MyComplex(scanner.nextDouble(), scanner.nextDouble());
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        MyComplex complex2 = new MyComplex(scanner.nextDouble(), scanner.nextDouble());
        scanner.close();

        System.out.printf("Number 1 is: (%s)%n", complex1);
        System.out.printf("(%s) is %s a pure real number%n", complex1,
                complex1.isReal()?"":"NOT");
        System.out.printf("(%s) is %s a pure imaginary number%n", complex1,
                complex1.isImaginary()?"":"NOT");
        System.out.println();

        System.out.printf("Number 2 is: (%s)%n", complex2);
        System.out.printf("(%s) is %s a pure real number%n", complex2,
                complex2.isReal()?"":"NOT");
        System.out.printf("(%s) is %s a pure imaginary number%n", complex2,
                complex2.isImaginary()?"":"NOT");
        System.out.println();

        System.out.printf("(%s) is %s equal to (%s)%n", complex1,
                complex1.equals(complex2) , complex2);
        System.out.printf("(%s) + (%s) = (%s)", complex1, complex2,
                complex1.addNew(complex2));
    }
}
