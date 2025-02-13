package lab02;

import java.util.Scanner;

// Exercise 2.3
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        char c = 'B';
        char hint = (char) ((char) ((c - 'A' + 3) % 26) + 'A');
        System.out.print(hint);
    }
}