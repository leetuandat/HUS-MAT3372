package lab04.MyPolynomialClass;

public class TestMain {
    public static void main(String[] args) {
        MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial polynomial2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println(polynomial1);
        System.out.println(polynomial2);

        System.out.println(polynomial1.evaluate(2));

        System.out.println(polynomial1.add(polynomial2));

        System.out.println(polynomial1.multiply(polynomial2));
    }
}
//In Java, you don't necessarily need to keep the degree as an instance
// variable in the Polynomial class. The degree of the polynomial can
// be computed dynamically based on the coefficients
//_________________________________________

//In C/C++, it might be more common to store the degree of the polynomial
//as an instance variable because C/C++ is more explicit about memory
// management. Storing the degree can make certain operations, like
// polynomial addition, multiplication, and division, more efficient.