package lab03.ExerciseRecursion;

import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();
        int primeNum = printIsPrime(upperBound);
        System.out.printf("[%d primes found (%.2f%%)%n]", primeNum, ((double)primeNum/upperBound)*100);
    }

    public static boolean isPrime(int aPosInt) {
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int printIsPrime(int aPosInt) {
        int count = 0;
        for (int i = 2; i <= aPosInt; i++) {
            if (isPrime(i)) {
                System.out.print(i + "   ");
                count++;
            }
        }
        System.out.println();
        return count;
    }
}
