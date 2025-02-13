package lab03.ExerciseRecursion;

import java.util.Scanner;

public class LengthOfARunningNumberSequence {
    public static void main(String[] args) {
        testLengthOfSn();
    }

    public static int lengthOfSn(int n) {
        if (n == 1) {
            return 1;
        }
            return (n + "").length() + lengthOfSn(n-1);
        //3.length + length(2)
    }

    public static void testLengthOfSn() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
//            System.out.printf("S(%d) = %d\n", i, lengthOfSn(i));
            System.out.printf("Length of S(%d) is: %d\n", i, lengthOfSn(i));
        }
    }
}
