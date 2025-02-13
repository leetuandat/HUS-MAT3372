package homework2;
import java.util.*;
public class MathLibraryHomeWork {
    public static final long LONG_MAX_VALUE = Long.MAX_VALUE;
    public static void main(String[] args) {
        testTrigonometric();
        testSpecialSeries();
        factorialInt();
        factorialLong();
        testNumberConversion();
    }

    public static void testTrigonometric() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x value (in radians): ");
        double x = scanner.nextDouble();

        System.out.println("Enter number of terms: ");
        int numTerms = scanner.nextInt();

        System.out.println("\nResults:");
        System.out.println("x = " + x);
        System.out.println("Number of terms = " + numTerms);
        System.out.println("------------------------------");
        computeAndCompareTrig(x, numTerms, Math.sin(x), Math.cos(x));
    }

    public static void computeAndCompareTrig(double x, int numTerms, double expectedSin, double expectedCos) {
        double computedSin = computeSin(x, numTerms);
        double computedCos = computeCos(x, numTerms);

        System.out.printf("Computed sin(x) using series: %.8f%n", computedSin);
        System.out.printf("Computed cos(x) using series: %.8f%n", computedCos);
        System.out.printf("Math.sin(x): %.8f%n", expectedSin);
        System.out.printf("Math.cos(x): %.8f%n", expectedCos);

        // Compare computed values with Math methods
        System.out.println("\nComparison:");
        compareValues("sin(x)", computedSin, expectedSin);
        compareValues("cos(x)", computedCos, expectedCos);
    }

    public static double computeSin(double x, int numTerms) {
        double sinX = 0;
        for (int i = 0; i < numTerms; i++) {
            int n = 2 * i + 1;
            sinX += Math.pow(-1, i) * Math.pow(x, n) / factorial(n);
        }
        return sinX;
    }

    public static double computeCos(double x, int numTerms) {
        double cosX = 0;
        for (int i = 0; i < numTerms; i++) {
            int n = 2 * i;
            cosX += Math.pow(-1, i) * Math.pow(x, n) / factorial(n);
        }
        return cosX;
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void compareValues(String function, double computedValue, double expectedValue) {
        double epsilon = 1e-8;
        if (Math.abs(computedValue - expectedValue) < epsilon) {
            System.out.printf("%s: Computed value matches Math method.%n", function);
        } else {
            System.out.printf("%s: Computed value does not match Math method.%n", function);
        }
    }

    public static double specialSeries(double x, int numTerms) {
        double result = 0;
        for (int n = 1; n <= numTerms; n++) {
            result += (double) (2 * n - 1) / (2 * n) * Math.pow(x, 2 * n - 1);
        }
        return result;
    }

    public static void testSpecialSeries() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x (double): ");
        double x = scanner.nextDouble();
        System.out.print("Enter the number of terms (int): ");
        int numTerms = scanner.nextInt();

        double seriesSum = specialSeries(x, numTerms);
        System.out.printf("Sum of the series: %.10f\n", seriesSum);
    }

    public static void factorialInt() {
        int i = 1;
        int factorial = 1;
        System.out.println("Factorials that can be expressed as an int:");
        while (true) {
            if (factorial <= 0) {
                break;
            }
            System.out.println("Factorial of " + i + ": " + factorial);
            i++;
            factorial *= i;
        }
    }

    public static void factorialLong() {
        int i = 1;
        long factorial = 1L;
        System.out.println("Factorials that can be expressed as a long:");
        while (true) {
            if (factorial <= 0 || factorial > LONG_MAX_VALUE) {
                break;
            }
            System.out.println("Factorial of " + i + ": " + factorial);
            i++;
            factorial *= i;
        }
    }

    public static void fibonacciInt() {
        int prev = 0;
        int current = 1;
        System.out.println("Fibonacci numbers that can be expressed as an int:");
        System.out.println("F(0) = 0");
        int next;
        int i = 1;
        while (current >= 0 && current <= Integer.MAX_VALUE) {
            System.out.println("F(" + i + ") = " + current);
            next = prev + current;
            prev = current;
            current = next;
            i++;
        }
    }

    public static String toRadix(String number, int inputRadix, int outputRadix) {
        if (!isValidRadix(inputRadix) || !isValidRadix(outputRadix)) {
            return "Invalid radix. Radix must be between 2 and 36.";
        }

        try {
            int decimalValue = Integer.parseInt(number, inputRadix);
            return Integer.toString(decimalValue, outputRadix);
        } catch (NumberFormatException e) {
            return "Invalid input. Please enter a valid number for the given radix.";
        }
    }

    private static boolean isValidRadix(int radix) {
        return radix >= Character.MIN_RADIX && radix <= Character.MAX_RADIX;
    }

    public static void testNumberConversion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to convert: ");
        String number = scanner.nextLine();
        System.out.print("Enter the input radix (between 2 and 36): ");
        int inputRadix = scanner.nextInt();
        System.out.print("Enter the output radix (between 2 and 36): ");
        int outputRadix = scanner.nextInt();
        String result = toRadix(number, inputRadix, outputRadix);
        System.out.println("Converted number: " + result);
    }
}
