package lab02;

import java.util.Scanner;

public class CheckHexString {
    public static void main(String[] args) {
        testHexString();
    }

    public static void testHexString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a hex string: ");
        String str = scanner.next();
        boolean isValidHex = isHexString(str);
        if (isValidHex) {
            System.out.printf("\"%s\" is a Hex string\n", str);
        } else {
            System.out.printf("\"%s\" is NOT a hex string\n", str);
        }
//        System.out.printf(isValidHex ? "\"%s\" is a Hex string" : "\"%s\" is NOT a hex string", str);
    }

    public static boolean isHexString(String hexStr) {
        if (hexStr.isEmpty()) {
            return false;
        }
        hexStr = hexStr.toLowerCase();
        for (char c : hexStr.toCharArray()) {
            if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f'))) {
                return false;
            }
        }
        return true;
    }
}



