package de.tum.cit.ase;

import java.util.Arrays;

public class BubbleSortExample {
    public static void bubbleSort(int[] array) {
        // Traverse through all array elements
        for (int i = 0; i < array.length - 1; i++) {
            // Last i elements are already in place, so we don't need to check them
            for (int j = 0; j < array.length - 1; j++) {
                // Swap if the element found is greater than the next element
                if (array[j] > array[j + 1]) {
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
        for (int i = 0; i < array.length - 1; i++) {
            // Last i elements are already in place, so we don't need to check them
            for (int j = 0; j < array.length - 1 - i; j++) {
                // Swap if the element found is greater than the next element
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    /* Another way to implement bubbleSort, only difference to version 2 is that after every iteration
    the index in the front is assigned the correct value, e.g. after iteration 1 the smallest number
    is in index 0
     */
    public static void bubbleSort3(int[] array) {
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
        int[] array = {64, 34, 25, 12, 22, 11, 90, 0};

        System.out.println("Original array: " + Arrays.toString(array));

        bubbleSort3(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

}
