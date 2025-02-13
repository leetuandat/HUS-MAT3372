package lab12.integration;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        // Run demo tests and save the results to a file
        try (PrintWriter out = new PrintWriter(new FileWriter("TranMinhDuc_21000677_Integration.txt"))) {
            out.println("Test ArrayPolynomial:");
            testArrayPolynomial(out);

            out.println("\nTest ListPolynomial:");
            testListPolynomial(out);

            out.println("\nTest IntegrationCalculator:");
            testIntegrationCalculator(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testArrayPolynomial(PrintWriter out) {
        // Create an ArrayPolynomial instance
        ArrayPolynomial poly = new ArrayPolynomial();
        poly.append(1);  // x^0
        poly.append(2);  // x^1
        poly.append(3);  // x^2

        out.println("Original polynomial: " + poly);

        // Modify the polynomial
        poly.set(4, 1);  // Change coefficient of x^1 to 4
        out.println("After setting coefficient of x^1 to 4: " + poly);

        // Add another polynomial
        ArrayPolynomial poly2 = new ArrayPolynomial();
        poly2.append(1);  // x^0
        poly2.append(1);  // x^1
        poly2.append(1);  // x^2
        ArrayPolynomial sumPoly = poly.plus(poly2);
        out.println("Sum with another polynomial (1 + x + x^2): " + sumPoly);

        // Subtract another polynomial
        ArrayPolynomial diffPoly = poly.minus(poly2);
        out.println("Difference with another polynomial (1 + x + x^2): " + diffPoly);

        // Multiply by another polynomial
        ArrayPolynomial prodPoly = poly.multiply(poly2);
        out.println("Product with another polynomial (1 + x + x^2): " + prodPoly);

        // Evaluate the polynomial
        double value = poly.evaluate(2);
        out.println("Polynomial evaluated at x=2: " + value);
    }

    public static void testListPolynomial(PrintWriter out) {
        // Create a ListPolynomial instance
        ListPolynomial poly = new ListPolynomial();
        poly.append(1);  // x^0
        poly.append(2);  // x^1
        poly.append(3);  // x^2

        out.println("Original polynomial: " + poly);

        // Modify the polynomial
        poly.set(4, 1);  // Change coefficient of x^1 to 4
        out.println("After setting coefficient of x^1 to 4: " + poly);

        // Add another polynomial
        ListPolynomial poly2 = new ListPolynomial();
        poly2.append(1);  // x^0
        poly2.append(1);  // x^1
        poly2.append(1);  // x^2
        ListPolynomial sumPoly = poly.plus(poly2);
        out.println("Sum with another polynomial (1 + x + x^2): " + sumPoly);

        // Subtract another polynomial
        ListPolynomial diffPoly = poly.minus(poly2);
        out.println("Difference with another polynomial (1 + x + x^2): " + diffPoly);

        // Multiply by another polynomial
        ListPolynomial prodPoly = poly.multiply(poly2);
        out.println("Product with another polynomial (1 + x + x^2): " + prodPoly);

        // Evaluate the polynomial
        double value = poly.evaluate(2);
        out.println("Polynomial evaluated at x=2: " + value);
    }

    public static void testIntegrationCalculator(PrintWriter out) {
        // Create a polynomial
        ListPolynomial poly = new ListPolynomial();
        poly.append(1);  // x^0
        poly.append(2);  // x^1
        poly.append(3);  // x^2

        // Integrate using different methods
        Integrator midpointRule = new MidpointRule(0.0001, 100);
        Integrator trapezoidRule = new TrapezoidRule(0.0001, 100);
        Integrator simpsonRule = new SimpsonRule(0.0001, 100);

        IntegrationCalculator calculator = new IntegrationCalculator(midpointRule, poly);
        double result = calculator.integrate(0, 1);
        out.println("Midpoint Rule: Polynomial: " + poly + ", Integral from 0 to 1: " + result);

        calculator.setIntegrator(trapezoidRule);
        result = calculator.integrate(0, 1);
        out.println("Trapezoid Rule: Polynomial: " + poly + ", Integral from 0 to 1: " + result);

        calculator.setIntegrator(simpsonRule);
        result = calculator.integrate(0, 1);
        out.println("Simpson Rule: Polynomial: " + poly + ", Integral from 0 to 1: " + result);
    }
}
