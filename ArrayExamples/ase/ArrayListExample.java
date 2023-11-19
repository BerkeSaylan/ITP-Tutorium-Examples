package de.tum.cit.ase;

import java.util.List;

public class ArrayListExample {
        private static final int INITIAL_CAPACITY = 10;
        private int[] array;
        private int size;

        public ArrayListExample() {
            array = new int[INITIAL_CAPACITY];
            size = 0;
        }

        public void add(int element) {
            if (size == array.length) {
                int newCapacity = array.length * 2;
                array = java.util.Arrays.copyOf(array, newCapacity);
            }
            array[size] = element;
            size++;
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                System.out.println("Index " + index + " out of bounds.");
            }
            return array[index];
        }

        public int size() {
            return size;
        }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index " + index + " out of bounds.");
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
    }

        public static void main(String[] args) {
            ArrayListExample myList = new ArrayListExample();

            // Add elements to the list
            myList.add(5);
            myList.add(10);
            myList.add(15);

            // Print the elements in the list
            for (int i = 0; i < myList.size(); i++) {
                System.out.println("Element at index " + i + ": " + myList.get(i));
            }
        }

}
