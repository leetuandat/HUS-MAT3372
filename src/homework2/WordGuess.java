package homework2;

import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        guessWord();
    }

    public static void guessWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word for player to guess: ");
        String guessedString = scanner.nextLine().toLowerCase();
        guessWord(guessedString, scanner);
        scanner.close();
    }

    public static void guessWord(String guessedString, Scanner in) {
        int attempts = 6;
        int count = 0;
        StringBuilder guessedLetter = new StringBuilder("_".repeat(guessedString.length()));

        while (attempts > 0 && guessedLetter.toString().contains("_")) {
            count++;
            System.out.println("Key in one character or your guess word: ");
            String guess = in.next().toLowerCase();

            if (guess.length() > 1) {
                if (guess.equals(guessedString)) {
                    System.out.println("Congratulations!");
                    System.out.printf("You got it in %d trials\n", count);
                    return;
                } else {
                    attempts--;
                    System.out.println("Incorrect guess");
                    System.out.printf("Attempts left: %d\n", attempts);
                }
            } else if (guess.length() == 1) {
                char guessedChar = guess.charAt(0);
                boolean found = false;
                for (int i = 0; i < guessedString.length(); i++) {
                    if (guessedChar == guessedString.charAt(i)) {
                        guessedLetter.setCharAt(i, guessedChar);
                        found = true;
                    }
                }
                if (!found) {
                    attempts--;
                    System.out.println("Wrong! Try again");
                    System.out.printf("Attempts left: %d\n", attempts);
                }
            }

            System.out.printf("Trial %d: %s\n", count, guessedLetter.toString());
        }
        //game over reveal word
        if (attempts == 0) {
            System.out.printf("Out of attempts. The word is: %s\n", guessedString);
        } else {
            System.out.println("Congratulations!");
            System.out.printf("You got it in %d trials\n", count);
        }
    }
}
