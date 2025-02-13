package lab02;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String: ");
        String str = scanner.nextLine();
        scanner.close();
        System.out.printf("The reverse of string \"%s\" is \"%s\"",
                str, reverseString(str));
    }

    public static String reverseString(String str) {
        String strReverse = "";
        for (int charIdx = str.length()-1 ; charIdx >= 0; --charIdx) {
            strReverse = strReverse + str.charAt(charIdx);
        }
        return strReverse;
    }
}
