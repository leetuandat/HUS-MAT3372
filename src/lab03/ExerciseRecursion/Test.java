package lab03.ExerciseRecursion;

public class Test {
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                // Swap array[i] and array[minIndex]
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array before Selection Sort:");
        printArray(array);

        selectionSort(array);

        System.out.println("Array after Selection Sort:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

//    public static boolean isRadixN(String radixString, int radix) {
//        final String DIGITS = "0123456789abcdef";
//        if ()
//    }

//    public static int radixToDecimal(String radixString, int radix) {
//        if (!)
//    }
}
