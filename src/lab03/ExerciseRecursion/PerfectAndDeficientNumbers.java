package lab03.ExerciseRecursion;

import java.util.Scanner;

public class PerfectAndDeficientNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int n = scanner.nextInt();
        System.out.println();
        System.out.print("These numbers are perfect: ");
        int perfectCount = printPerfectNumbers(n);
        System.out.printf("[%d perfect numbers found (%.2f%%)]%n",
                perfectCount, ((double) perfectCount / n) * 100);
        System.out.println("");
        System.out.print("These numbers are neither deficient nor perfect: ");
        int neitherCount = printNeitherNumbers(n);
        System.out.printf("[%d numbers found (%.2f%%)]%n",
                neitherCount, ((double) neitherCount / n) * 100);
    }

    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return sum == aPosInt;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return sum < aPosInt;
    }

    public static int printPerfectNumbers(int upperBound) {
        int perfectCount = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                perfectCount++;
            }
        }
        System.out.println();
        return perfectCount;
    }

    public static int printNeitherNumbers(int upperBound) {
        int neitherCount = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (!isPerfect(i) && !isDeficient(i)) {
                System.out.print(i + " ");
                neitherCount++;
            }
        }
        System.out.println();
        return neitherCount;
    }
}
