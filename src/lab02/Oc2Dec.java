package lab02;

import java.util.Scanner;

public class Oc2Dec {

    public static void main(String[] args) {
        testOctalToDecimal();
    }

    public static void testOctalToDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        String octalStr = scanner.nextLine();
        int decimal = octalToDecimal(octalStr);
        if (decimal != -1) {
            System.out.printf("The equivalent decimal number for %s is: %d%n", octalStr, decimal);
        } else {
            System.out.println("Invalid octal string entered.");
        }
        scanner.close();
    }

    public static int octalToDecimal(String octalStr) {
        if (!isValidOctal(octalStr)) {
            return -1;
        }
        int decimal = 0;
        for (int i = 0; i < octalStr.length(); i++) {
            int digit = octalStr.charAt(i) - '0';
            decimal += digit * Math.pow(8, octalStr.length() - 1 - i);
        }
        return decimal;
    }

    public static boolean isValidOctal(String octalStr) {
        for (int i = 0; i < octalStr.length(); i++) {
            char c = octalStr.charAt(i);
            if (c < '0' || c > '7') {
                return false;
            }
        }
        return true;
    }
}
