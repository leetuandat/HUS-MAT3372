package lab02;

import java.util.Scanner;

public class CaesarsCode {
    public static void main(String[] args) {
        testCipherCaesarCode();
    }

    public static void testCipherCaesarCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a plaintext string: ");
        String str = scanner.next().toUpperCase();
        String cipherStr = cipherCaesarCode(str);
        System.out.printf("The ciphertext string is: %s", cipherStr);
    }

    public static String cipherCaesarCode(String inStr) {
        StringBuilder cipherCode = new StringBuilder();
        int shift = 3;
        for (int index = 0; index < inStr.length(); index++) {
            char c = inStr.charAt(index);
            if (c >= 'A' && c <= 'W') {
                cipherCode.append((char) (c + shift));
            } else if (c == 'X' || c == 'Y' || c == 'Z') {
                cipherCode.append((char) (c - (26 - shift)));
            } else {
                cipherCode.append(c);
            }
        }
        return cipherCode.toString();
    }
}
