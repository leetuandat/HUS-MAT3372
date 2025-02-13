package lab03.ExerciseRecursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {9, 6, 4, 1, 5};
        System.out.printf("Array before sort: %s%n\n", Arrays.toString(array));
        selectionSort(array);
        System.out.printf("Array after sort: %s%n\n", Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        for (int selectIndex = 0; selectIndex < array.length - 1; selectIndex++) {
            int minIndex = selectIndex;
            for (int index = selectIndex + 1; index < array.length; index++) {
                if (array[index] < array[minIndex]) {
                    minIndex = index;
                }
            }
            if (minIndex != selectIndex) {
                int temp = array[selectIndex];
                array[selectIndex] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

}
