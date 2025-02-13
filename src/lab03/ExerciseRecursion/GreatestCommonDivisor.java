package lab03.ExerciseRecursion;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = scanner.nextInt();
        System.out.println();
        System.out.print("Enter number 2: ");
        int b = scanner.nextInt();
        System.out.println();
        System.out.printf("gcd(%d,%d)", a, b);
        gcd(a, b);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            System.out.printf(" = %d", a);
            return a;
        }
        System.out.printf(" = gcd(%d,%d)", b, a%b);
        return gcd(b, a%b);
    }
}
