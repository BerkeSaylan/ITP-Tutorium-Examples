package de.tum.cit.ase;

import java.util.Arrays;

public class BubbleSortExample {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place, so we don't need to check them
            for (int j = 0; j < n; j++) {
                // Swap if the element found is greater than the next element
                if (j < n - 1 && array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }





        /* Efficient implementation of bubble sort that uses the idea: After every outer iteration
        the lastly placed index has currently the correct number, e.g. : if we have 9 unsorted numbers
        after the first iteration the last index will have the largest number, meaning in the next iteration
        we only have consider the remaining 8, as the last index is already correct
         */

    public static void bubbleSort2(int[] array) {
        // Traverse through all array elements
        for (int k = 0; k < array.length - 1; k++) {
            // Last k elements are already in place, so we don't need to check them
            for (int l = k + 1; l < array.length; l++) {
                // Swap if the element found is greater than the next element
                if (array[k] > array[l]) {
                    // Swap array[k] and array[l]
                    int temp = array[k];
                    array[k] = array[l];
                    array[l] = temp;
                }
            }
        }
    }


        public static void main(String[] args) {
            int[] array = {64, 34, 25, 12, 22, 11, 90};

            System.out.println("Original array: " + Arrays.toString(array));

            bubbleSort(array);

            System.out.println("Sorted array: " + Arrays.toString(array));
        }

}
