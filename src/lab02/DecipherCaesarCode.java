package lab02;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        testDecipherCaesarCode();
    }

    public static void testDecipherCaesarCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a ciphertext string: ");
        String cipherText = scanner.next().toUpperCase();
        String plainText = decipherCaesarCode(cipherText);
        System.out.printf("The plaintext string is: %s", plainText);
    }

    public static String decipherCaesarCode(String inStr) {
        StringBuilder plainText = new StringBuilder();
        int shift = 3;
        for (int index = 0; index < inStr.length(); index++) {
            char c = inStr.charAt(index);
            if (c >= 'D' && c <= 'Z') {
                plainText.append((char) (c - shift));
            } else if (c == 'A' || c == 'B' || c == 'C') {
                plainText.append((char) (c + 23));
            } else {
                plainText.append(c);
            }
        }
        return plainText.toString();
    }
}
