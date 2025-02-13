package lab03.ExerciseRecursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {12, 24, 45, 46, 68, 56, 78};
        int key1 = 56;
        int key2 = 20;
        System.out.println("TESTING LINEARSEARCH");
        if (linearSearcch(array, key1)) {
            System.out.printf("%d is found in the array\n", key1);
        } else {
            System.out.printf("%d is not found in the array\n", key2);
        }
        System.out.println();
        System.out.println("TESTING LINEARSEARCHINDEX");
        int index = linearSearchIndex(array, key2);
        if (index != -1) {
            System.out.printf("%d is found at index %d", key2, index);
        } else {
            System.out.printf("%d is not found in the array", key2);
        }
    }

    public static boolean linearSearcch(int[] array, int key) {
        for (int element : array) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key) {
                return index;
            }
        }
        return -1;
    }
}
