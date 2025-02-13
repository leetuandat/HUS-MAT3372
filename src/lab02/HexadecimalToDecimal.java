package lab02;

import java.util.Scanner;

// Exercise 2.10
public class HexadecimalToDecimal {
    public static void main(String[] args) {
        testHexadecimalToDecimal();
    }

    public static boolean isValidHexString(String hexStr) {
        if (hexStr.isEmpty()) {
            return false;
        }
        hexStr = hexStr.toUpperCase();
        for (char c : hexStr.toCharArray()) {
            if (!((c >= '0' && c <= '9' || (c >= 'A' && c <= 'F')))) {
                return false;
            }
        }
        return true;
    }

    public static int hexCharToDecimal(char hexChar) {
        if (hexChar >= '0' && hexChar <= '9') {
            return hexChar - '0';
        } else {
            return hexChar - 'A' + 10;
        }
    }

    public static int hex2Dec(String hexStr) {
        if (!isValidHexString(hexStr)) {
            return -1;
        }
        hexStr = hexStr.toUpperCase();

        int decimal = 0;
        for (int i = 0; i < hexStr.length(); i++) {
            char hexChar = hexStr.charAt(i);
            int digit = hexCharToDecimal(hexChar);
            decimal = decimal * 16 + digit;
        }
        return decimal;
    }
    public static void testHexadecimalToDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = scanner.nextLine();
        scanner.close();

        int decimal = hex2Dec(hexStr);

        if (decimal != -1) {
            System.out.printf("The equivalent decimal number for %s is: %s", hexStr, decimal);
        } else {
            System.out.printf("Invalid hexadecimal string: %s\n", hexStr);
        }
    }
}