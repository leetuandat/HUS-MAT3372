package lab03.ExerciseRecursion;

import java.util.Scanner;

public class FactorialRecusive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        System.out.println("The factorial is: " + factorial(n));
    }

    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n-1);
    }
}
