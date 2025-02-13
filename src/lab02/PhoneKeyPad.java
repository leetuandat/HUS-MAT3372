package lab02;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        testPhoneKeyPad();
    }

    public static void testPhoneKeyPad() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.next().toLowerCase();
        String strConvertedBySwitchCase = phoneKeyPadBySwitchCase(str);
        String strConvertedByNestedIf = phoneKeyPadByNestedIf(str);
        System.out.printf("Converted to keypad by switch-case: %s\n", strConvertedBySwitchCase);
        System.out.printf("Converted to keypad by nested-if: %s\n", strConvertedByNestedIf);
    }
    //(a)
    public static String phoneKeyPadBySwitchCase(String inStr) {
        StringBuilder str = new StringBuilder();
        for (int index = 0; index < inStr.length(); index++) {
            char c = inStr.charAt(index);
            switch (c) {
                case 'a':
                case 'b':
                case 'c':
                    str.append('2');
                    break;
                case 'd':
                case 'e':
                case 'f':
                    str.append('3');
                    break;
                case 'g':
                case 'h':
                case 'i':
                    str.append('4');
                    break;
                case 'j':
                case 'k':
                case 'l':
                    str.append('5');
                    break;
                case 'm':
                case 'n':
                case 'o':
                    str.append('6');
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    str.append('7');
                    break;
                case 't':
                case 'u':
                case 'v':
                    str.append('8');
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    str.append('9');
                    break;
                default:
                    //for non-aphabet characters
                    str.append(c);
                    break;
            }
        }
        return str.toString();
    }
    //(b)
    public static String phoneKeyPadByNestedIf(String inStr) {
        StringBuilder str = new StringBuilder();
        for (int index = 0; index < inStr.length(); index++) {
            char c = inStr.charAt(index);
            if (c >= 'a' && c <= 'c') {
                str.append('2');
            } else if (c >= 'd' && c <= 'f') {
                str.append('3');
            } else if (c >= 'g' && c <= 'i') {
                str.append('4');
            } else if (c >= 'j' && c <= 'l') {
                str.append('5');
            } else if (c >= 'm' && c <= 'o') {
                str.append('6');
            } else if (c >= 'p' && c <= 's') {
                str.append('7');
            } else if (c >= 't' && c <= 'v') {
                str.append('8');
            } else if (c >= 'w' && c <= 'z') {
                str.append('9');
            } else {
                str.append(c);
            }
        }
        return str.toString();
    }
}
