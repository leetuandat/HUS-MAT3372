package lab02;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.next();
        scanner.close();

        printCountVowelsDigits(str);
    }

    public static boolean isVowel(char c) {
        String vowels = "aeuioAEUIO";
        return !(vowels.indexOf(c) == -1);
// if c is a vowel then vowels.indexOf(c) return the value != -1
// so isVowel return false so need add !
//        if (vowels.indexOf(c) == -1) {
//            return false;
//        }
//        return true;
    }

    public static int countVowels(String inStr) {
        int count = 0;
        for (int index = 0; index < inStr.length(); index++) {
            count += isVowel(inStr.charAt(index)) ? 1 : 0;
        }
        return count;
    }

    public static boolean isDigit(char c) {
        String digit = "0123456789";
        return !(digit.indexOf(c) == -1);
    }

    public static int countDigits(String inStr) {
        int count = 0;
        for (int index = 0; index < inStr.length(); index++) {
            count += isDigit(inStr.charAt(index)) ? 1 : 0;
        }
        return count;
    }

    public static void printCountVowelsDigits (String str) {
        int countVowels = countVowels(str);
        int countDigits = countDigits(str);
        System.out.printf("Number of vowels: %d (%.2f%%)\n",
                countVowels, countVowels * 100.0 / str.length());
        System.out.printf("Number of digits: %d (%.2f%%)\n",
                countDigits, countDigits * 100.0 / str.length());
    }
}
