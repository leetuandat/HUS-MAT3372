package lab03.ExerciseRecursion;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] array = {9 ,8 ,7 ,6, 5, 4, 3, 2, 1};
        bubbleSort(array);
        int key1 = 4;
        int key2 = 10;
        System.out.printf("%d in the array? %s\n", key1,
                binarySearch(array, key1, 0, array.length));
        System.out.printf("%d in the array? %s\n", key2,
                binarySearch(array, key2, 0, array.length));
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            if (array[fromIdx] == key){
                return true;
            }
            return false;
        }

        int middleIdx = (fromIdx + toIdx)/2;
        int middleElement = array[middleIdx];
        if (key == middleElement) {
            return true;
        } else if (key < middleElement) {
            return binarySearch(array, key, fromIdx, middleIdx);
        } else {
            return binarySearch(array, key, middleIdx + 1, toIdx);
        }
    }

    public static void bubbleSort(int[] array) {
        for (int turn = 1; turn <= array.length; turn++) {
            boolean swapped = false;
            for (int index = 1; index < array.length; index++) {
                if (array[index-1] > array[index]) {
                    int temp = array[index];
                    array[index] = array[index-1];
                    array[index-1] = temp;
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
            System.out.print(element +" ");
        }
        System.out.println();
    }
}
