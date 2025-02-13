package homework2;
import java.util.*;
public class ArrayHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printArrayInStars(scanner);
    }

    public static void printArrayInStars(Scanner in) {
        System.out.println("Enter the number of items:");
        int NUM_ITEMS = in.nextInt();

        int[] items = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items: ");
        for (int i = 0; i < NUM_ITEMS; i++) {
            items[i] = in.nextInt();
        }

        System.out.println("Array contents represented by number of stars:");
        for (int i = 0; i < NUM_ITEMS; i++) {
            System.out.printf("%d: ", i);
            printStars(items[i]);
            System.out.println("("+ items[i] +")");
        }
    }

    public static void printStars(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
}
