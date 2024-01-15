package de.tum.cit.ase;

import java.util.ArrayList;
import java.util.Arrays;

public class StackExample {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public StackExample(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int item) {
        if (!isFull()) {
            stackArray[++top] = item;
        } else {
            System.out.println("Stack is full. Cannot push " + item);
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        System.out.println(stringList.get(0));
        stringList.remove(0);
        System.out.println(stringList.get(0));

    }
}
