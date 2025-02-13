package lab03.ExerciseRecursion;

import java.util.Scanner;

public class GCDRecursive {
    public static void main(String[] args) {
        //UCLN
        testGCD();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
//        return gcd(b, Math.abs(a-b));
        return gcd(a, a%b);
    }

    public static void testGCD() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = scanner.nextInt();
        System.out.println();
        System.out.print("Enter number 2: ");
        int b = scanner.nextInt();
        System.out.printf("gcd(%d, %d) = %d", a, b, gcd(a, a - b));
    }
}
