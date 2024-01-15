package de.tum.cit.ase;

import java.util.Arrays;
import java.util.List;

public class Example {

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }



    public static void main(String[] args) {
        // Example 1: Creating an array with size
        int[] numbers = new int[5];
        numbers[0] = 1;

        // Example 2: Creating an array with values
        String[] strings = {"A", "B"};
        strings[0] = null;

        numbers[1] = 2;
        System.out.println("Array with values: " + Arrays.toString(numbers));
        for(int i = 3; i < numbers.length; i++) {
            System.out.println("Current index " +i + "has the value" + numbers[i]);
        }

        // Example 3: Creating an array using the 'new' keyword
        int[] anotherArray = new int[]{6, 7, 8, 9, 10};
        System.out.println("Another array with values: " + Arrays.toString(anotherArray));


        String[] arr1 = new String[]{"a", "b"};
        String[] arr2 = new String[2];
        arr2 = arr1;
        arr1[1] = "x";





        int[] sourceArray2 = {1, 2, 3, 4, 5};
        int[] destinationArray2 = new int[sourceArray2.length];

        // Copying every index of an array to another array using loops
        for (int i = 0; i < sourceArray2.length; i++) {
            destinationArray2[i] = sourceArray2[i];
        }



        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length];

        // Copying every index of an array to another array
        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);

        System.out.println("Source array: " + Arrays.toString(sourceArray));
        System.out.println("Destination array: " + Arrays.toString(destinationArray));


        int[] numbers2 = {1, 2, 3, 4, 5};

        // Shifting the elements in an array to the left by one
        int firstElement = numbers2[0];
        for (int i = 1; i < numbers2.length; i++) {
            numbers2[i - 1] = numbers2[i];
        }
        numbers2[numbers2.length - 1] = firstElement;



        //Do the linear search in the array
        int[] array = {2, 5, 8, 12, 16, 23, 38, 42, 50};
        int target = 16;

        int result = linearSearch(array, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

}