package lab03.ExerciseRecursion;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};

        System.out.println("Array before Insertion Sort:");
        printArray(array);

        insertionSort(array);

        System.out.println("Array after Insertion Sort:");
        printArray(array);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int indexCheck = i - 1;
            while (indexCheck >= 0 && array[indexCheck] > key) {
                array[indexCheck + 1] = array[indexCheck];
                indexCheck--;
            }
            array[indexCheck + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
