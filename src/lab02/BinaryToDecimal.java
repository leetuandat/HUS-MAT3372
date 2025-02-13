package lab02;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        testBinaryToDecimal();
    }

    public static void testBinaryToDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Binary string: ");
        String binaryString = scanner.next();
        int decimalNumber = binaryToDecimal(binaryString);
        System.out.printf("");
    }

    public static int binaryToDecimal(String binStr) {
        int decimalNumber = 0;
        int power = 0;
        for (int index = binStr.length()-1; index >= 0; index--) {
            char c = binStr.charAt(index);
            if (c == '1') {
                decimalNumber += Math.pow(2, power);
            }
            power++;
        }
        return decimalNumber;
    }

    public static boolean checkBinaryString (String inStr) {
        for (int index = 0; index < inStr.length(); index++) {
            char c = inStr.charAt(index);
            if (!(c == '1' || c == '0')) {
                return false;
            }
        }
        return true;
    }
}
