package lab03.ExerciseRecursion;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {9, 2, 4, 1, 5};
        System.out.printf("Array before sorted: %s%n\n", Arrays.toString(array));
        bubbleSort(array);
        System.out.printf("Array after sorted: %s%n\n", Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        for (int turn = 1; turn < array.length; turn++) {
            boolean swapped = false;
            for (int index = 1; index < array.length; index++) {
                if (array[index-1] > array[index]) {
                    int temp = array[index-1];
                    array[index-1] = array[index];
                    array[index] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
