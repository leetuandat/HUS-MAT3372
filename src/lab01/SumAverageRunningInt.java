package lab01;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        System.out.println("Using For Loop: ");
        getSumAverageByForLoop(LOWERBOUND, UPPERBOUND);
        System.out.println("Using WhileDo Loop: ");
        getSumAverageByWhileDoLoop(LOWERBOUND, UPPERBOUND);
        System.out.println("Using DoWhile Loop: ");
        getSumAverageByDoWhileLoop(LOWERBOUND, UPPERBOUND);
        System.out.println("");

    }

    public static void getSumAverageByForLoop(int lowerBound, int upperBound) {
        int sum = 0;
        int count = 0;
        for (int value = lowerBound; value <= upperBound; value ++) {
            sum += value;
            count++;
        }
        System.out.printf("The sum of %d to %d is %d\n", lowerBound, upperBound, sum);
        System.out.printf("The average is %s\n", (double) sum/count);
    }

    public static void getSumAverageByWhileDoLoop(int lowerBound, int upperBound) {
        int value = lowerBound;
        int sum = 0;
        int count = 0;
        while (value <= upperBound) {
            sum += value;
            value++;
            count++;
        }
        System.out.printf("The sum of %d to %d is %d\n", lowerBound, upperBound, sum);
        System.out.printf("The average is %s\n", (double) sum/count);
    }

    public static void getSumAverageByDoWhileLoop(int lowerBound, int upperBound) {
        int value = lowerBound;
        int sum = 0;
        int count = 0;
        do {
            sum += value;
            value++;
            count++;
        } while (value <= upperBound);
        System.out.printf("The sum of %d to %d is %d\n",
                lowerBound, upperBound, sum);
        System.out.printf("The average is %s\n", (double) sum / count);
    }

    public static void printSumSquares(int lowerBound, int upperBound) {
        int sum = 0;
        int count = 0;
        for (int value = lowerBound; value <= upperBound; value++) {
            sum += value * value;
            count++;
        }
        System.out.printf("The sum of the squares from %d to %d is %d\n",
                lowerBound, upperBound, sum);
    }

    // 6
    public static void printSumOddEven(int lowerBound, int upperBound) {
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        for (int value = lowerBound; value <= upperBound; value++) {
            if (value % 2 == 0) {
                sumEven += value;
            } else {
                sumOdd += value;
            }
        }
        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        } else {
            absDiff = sumEven - sumOdd;
        }

        System.out.printf("The sum of odd numbers from %d to %d is %d.\n",
                lowerBound, upperBound, sumOdd);
        System.out.printf("The sum of even numbers from %d to %d is %d.\n",
                lowerBound, upperBound, sumEven);
        System.out.println("The Absolute difference between the two sums is " + absDiff);
    }
}
