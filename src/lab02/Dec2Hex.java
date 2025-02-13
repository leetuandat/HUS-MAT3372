package lab02;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        testDecimalToHexadecimal();
    }

    public static void testDecimalToHexadecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive decimal number: ");
        int decimalNumber = scanner.nextInt();
        if (decimalNumber < 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            String hexadecimal = decimalToHexadecimal(decimalNumber);
            System.out.printf("The equivalent hexadecimal for decimal %d is: %s%n", decimalNumber, hexadecimal);
        }

        scanner.close();
    }

    public static String decimalToHexadecimal(int positiveInteger) {
        StringBuilder hexBuilder = new StringBuilder();
        while (positiveInteger > 0) {
            int remainder = positiveInteger % 16;
            char hexDigit = (char) (remainder < 10 ? remainder + '0' : remainder + 'A' - 10);
            hexBuilder.insert(0, hexDigit);
            positiveInteger /= 16;
        }
        return hexBuilder.toString();
    }
}
