package lab02;

import java.util.Scanner;

import java.util.InputMismatchException;

public class RadixN2Dec {

    public static void main(String[] args) {
            testRadixN();
        }
        public static void testRadixN() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the radix: ");
            int radix = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter the string: ");
            String radixNStr = scanner.nextLine();

            int decimal = radixNToDecimal(radixNStr);
            if (decimal != -1) {
                System.out.printf("The equivalent decimal number \"%s\" is: %d%n", radixNStr, decimal);
            } else {
                System.out.println("Invalid input. Please enter a valid radix n string.");
            }
            scanner.close();
        }
        public static int radixNToDecimal(String radixNStr) {
            // Valid characters for radix up to 16: 0-9, A-F
            String validChars = "0123456789ABCDEF";
            int radix = radixNStr.length();
            // Validate input string
            for (int i = 0; i < radix; i++) {
                char c = Character.toUpperCase(radixNStr.charAt(i));
                if (validChars.indexOf(c) == -1) {
                    return -1; // Invalid character
                }
            }
            int decimal = 0;
            for (int i = 0; i < radix; i++) {
                char c = Character.toUpperCase(radixNStr.charAt(i));
                int digit = convertCharToDigit(c);
                decimal += digit * Math.pow(16, radix - 1 - i);
            }
            return decimal;
        }
        public static int convertCharToDigit(char c) {
            if (Character.isDigit(c)) {
                return c - '0';
            } else { // A-F
                return c - 'A' + 10;
            }
        }
}
