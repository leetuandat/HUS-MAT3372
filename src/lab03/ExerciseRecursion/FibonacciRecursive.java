package lab03.ExerciseRecursion;

import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        testFibonacci();
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void testFibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n  = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("F(%3d) = %4d\n", i, fibonacci(i));
        }
    }
}
