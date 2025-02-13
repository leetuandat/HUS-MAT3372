package lab02;

import java.util.Scanner;

public class Hex2Bin {

    public static void main(String[] args) {
        testHexadecimalToBinary();
    }

    public static final String[] HEX_BITS = {
            "0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"
    };

    public static void testHexadecimalToBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = scanner.nextLine();
        String binary = hexadecimalToBinary(hexStr);
        if (binary != null) {
            System.out.printf("The equivalent binary for hexadecimal \"%s\" is:%n%s%n", hexStr, binary);
        } else {
            System.out.println("Invalid hexadecimal input. Please enter a valid hexadecimal string.");
        }
        scanner.close();
    }

    public static String hexadecimalToBinary(String hexStr) {
        // Validate input
        if (!isValidHexadecimal(hexStr)) {
            return null;
        }
        StringBuilder binary = new StringBuilder();
        for (int i = 0; i < hexStr.length(); i++) {
            char hexChar = hexStr.charAt(i);
            int index = Character.digit(hexChar, 16);
            binary.append(HEX_BITS[index]).append(" ");
        }
        return binary.toString().trim();
    }

    public static boolean isValidHexadecimal(String hexStr) {
        // Valid characters for hexadecimal: 0-9, A-F, a-f
        String validChars = "0123456789ABCDEFabcdef";
        for (char c : hexStr.toCharArray()) {
            if (validChars.indexOf(c) == -1) {
                return false; // Invalid character
            }
        }
        return true;
    }
}
