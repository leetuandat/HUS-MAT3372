package lab02;
import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class MethodExercise {
    public static void main(String[] args) {
        //exponent
        testExponent();

        //hasEight
        Scanner testMagicSum = new Scanner(System.in);
        testMagicSum(testMagicSum);

        //print
        int[] array1 = {6 ,12, 4, 56, 3, 1};
        double[] array2 = {2.1, 12.1, 4.1, 56.1, 3.1, 1.1};
        float[] array3 = {2.1f, 12.1f, 4.1f, 56.1f, 3.1f, 1.1f};
        print(array1);
        print(array2);
        print(array3);
        System.out.printf("\n");

        //arrayToString
        System.out.printf("Array to string: %s\n", arrayToString(array1));

        //contains
        int[] arrayContains = {1, 2, 3, 4, 5};
        System.out.printf("Does the array contain 3? %s\n", contains(arrayContains, 3));

        //search
        int[] arraySearch = {1, 2 ,3 ,4 ,5};
        System.out.printf("Search key's index is: %d\n", search(arraySearch, 3));

        //equals
        int[] arrayEqual1 = {1, 2, 3, 4 ,5};
        int[] arrayEqual2 = {1, 2, 3, 4 ,5};
        int[] arrayEqual3 = {3, 4, 1, 5 ,2};
        System.out.printf("The 2 arrays are equal, right? %s\n", equals(arrayEqual1, arrayEqual2));
        System.out.printf("The 2 arrays are equal, right? %s\n", equals(arrayEqual3, arrayEqual1));

        //copyOf
        int[] arrayCopyOf = {1, 2, 3, 4, 5};
        System.out.printf("Main array: %s\n", arrayToString(arrayCopyOf));
        System.out.printf("Array copy: %s\n", arrayToString(copyOf(arrayCopyOf)));
        System.out.printf("Array copy 2 parameter: %s\n", arrayToString(copyOfWith2Parameter(arrayCopyOf, 10)));

        //swap
        int[] arraySwap1 = {1, 2 ,3 ,4 ,5};
        int[] arraySwap2 = {6, 7, 8 , 9, 10};
        System.out.printf("Main array 1: %s\n", arrayToString(arraySwap1));
        System.out.printf("Main array 1: %s\n", arrayToString(arraySwap2));
        System.out.println("After swap");
        swap(arraySwap1, arraySwap2);
        System.out.printf("Array 1: %s\n", arrayToString(arraySwap1));
        System.out.printf("Array 1: %s\n", arrayToString(arraySwap2));

        //reverse
        int[] arrayReverse = {1, 2 ,3 ,4 ,5};
        reverse(arrayReverse);
        System.out.printf("Array after reverse: %s\n", arrayToString(arrayReverse));
    }

    //exponent
    public static int exponent(int base, int exp) {
        int product = 1;
        int i = 0;
        while (i<exp) {
            product *= base;
            i++;
        }
        return product;
    }

    public static void testExponent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exp = scanner.nextInt();

        int result = exponent(base, exp);
        System.out.printf("%d raised to the power of %d is: %d\n", base, exp, result);
    }

    //hasEight
    public static boolean hasEight(int number) {
        while (number != 0) {
            int digit = number % 10;
            if (digit == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static void testMagicSum(Scanner in) {
        int sum = 0;
        while (true) {
            System.out.print("Enter a positive integer (or -1 to end): ");
            int num = in.nextInt();
            if (num == -1) {
                break;
            }
            if (hasEight(num)) {
                sum += num;
            }
        }
        System.out.println("The magic sum is: " + sum);
    }

    //print()
    public static void print(int[] array) {
        if (array.length == 0) {
            System.out.print("[]");
            return;
        }
        System.out.print("[");
        System.out.print(array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.print("]");
        System.out.println();
    }

    public static void print(double[] array) {
        if (array.length == 0) {
            System.out.print("[]");
            return;
        }
        System.out.print("[");
        System.out.print(array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.print("]");
        System.out.println();
    }

    public static void print(float[] array) {
        if (array.length == 0) {
            System.out.print("[]");
            return;
        }
        System.out.print("[");
        System.out.print(array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.print("]");
    }

    //arrayToString
    public static String arrayToString(int[] array) {
        if (array.length == 0) {
            return "[]";
        }
        StringBuilder str = new StringBuilder();
        str.append("[");
        str.append(array[0]);
        for (int index = 1; index < array.length; index++) {
            str.append(", ").append(array[index]);
        }
        str.append("]");
        return str.toString();
    }

    //contains
    public static boolean contains(int[] array, int key) {
        for (int element : array) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }

    //search
    public static int search(int[] array, int key) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key) {
                return index;
            }
        }
        return -1;
    }

    //equals
    public static boolean equals(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        if (array1 == null || array2 == null) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    //copyOf
    public static int[] copyOf(int[] array) {
        if (array == null) return null;
        int[] copyArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        return copyArray;
    }

    public static int[] copyOfWith2Parameter(int[] array, int newLength) {
        if (array == null) return null;
        int[] copyArray = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            copyArray[i] = (i < array.length) ? array[i] : 0;
        }
        return copyArray;
    }

    //swap
    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true;
    }

    //reverse
    public static void reverse(int[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        while (startIndex < endIndex) {
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}
