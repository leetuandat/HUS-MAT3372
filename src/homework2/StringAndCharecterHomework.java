package homework2;
import java.util.*;
public class StringAndCharecterHomework {
    public static void main(String[] args) {
        testExchangeCipher();
        testPalindromicWord();
        testPalindromicPhrase();
    }
    public static String exchangeCipher(String inStr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            char originalChar = inStr.charAt(i);
            if (Character.isLetter(originalChar)) {
                char newChar;
                if (Character.isUpperCase(originalChar)) {
                    newChar = (char) ('Z' - (originalChar - 'A'));
                } else {
                    newChar = (char) ('z' - (originalChar - 'a'));
                }
                result.append(newChar);
            } else {
                result.append(originalChar);
            }
        }
        return result.toString().toUpperCase();
    }

    public static void testExchangeCipher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a plaintext string: ");
        String plaintext = scanner.nextLine();
        String ciphertext = exchangeCipher(plaintext);
        System.out.println("The ciphertext String is: " + ciphertext);
    }

    public static boolean isPalindromicWord(String inStr) {
        // Convert to lowercase for case-insensitive comparison
        inStr = inStr.toLowerCase();

        int left = 0;
        int right = inStr.length() - 1;

        while (left < right) {
            char leftChar = inStr.charAt(left++);
            char rightChar = inStr.charAt(right--);

            if (leftChar != rightChar) {
                return false;
            }
        }

        return true;
    }

    public static void testPalindromicWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.next();

        if (isPalindromicWord(word)) {
            System.out.println("\"" + word + "\" is a palindrome.");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindromicPhrase(String inStr) {
        inStr = inStr.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = inStr.length() - 1;
        while (left < right) {
            char leftChar = inStr.charAt(left++);
            char rightChar = inStr.charAt(right--);
            if (leftChar != rightChar) {
                return false;
            }
        }
        return true;
    }

    public static void testPalindromicPhrase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String phrase = scanner.nextLine();

        if (isPalindromicPhrase(phrase)) {
            System.out.println("\"" + phrase + "\" is a palindrome.");
        } else {
            System.out.println("\"" + phrase + "\" is not a palindrome.");
        }
    }
}
