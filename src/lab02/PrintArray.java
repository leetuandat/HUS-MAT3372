package lab02;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numberItems = scanner.nextInt();
        System.out.print("Enter the value of all items (separated by space): ");
        int[] array = new int[numberItems];
        for (int index = 0; index < numberItems; index++) {
            array[index] = scanner.nextInt();
        }
        scanner.close();
        printArray(array);
    }

    public static void printArray(int[] array) {
        String str = "[" + array[0];
        for (int i = 1; i < array.length; i++) {
            str += ", " + array[i];
        }
        str += "]";
        System.out.printf("The values are: %s\n", str);
    }
}
