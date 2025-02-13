package homework2;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber() {
        final int SECRET_NUMBER = (int) (Math.random()*99);
        Scanner sc = new Scanner(System.in);
        guessNumber(SECRET_NUMBER, sc);
    }

    public static void guessNumber(int number, Scanner in) {
        System.out.println("Key in your guess: ");
        int n = in.nextInt();
        int count = 0;
        while (number != n) {
            if (number > n) {
                System.out.println("Try higher");
                n = in.nextInt();
                count++;
            } else if (number < n) {
                System.out.println("Try lower");
                n = in.nextInt();
                count++;
            }
        }
        System.out.printf("You got it in %d trial!", count);
    }
}
