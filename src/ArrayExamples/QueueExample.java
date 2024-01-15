package de.tum.cit.ase;

import java.util.*;

public class QueueExample {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;


    public QueueExample(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
        int sizeArr =  queueArray.length;

    }

    public boolean isEmpty() {
        return rear < front;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public void enqueue(int item) {
        if (!isFull()) {
            queueArray[++rear] = item;
        } else {
            System.out.println("Queue is full. Cannot enqueue " + item);
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            return queueArray[++front];
        } else {
            System.out.println("Queue is empty");
            return -1;
        }
    }

    public int front() {
        if (!isEmpty()) {
            return queueArray[front];
        } else {
            System.out.println("Queue is empty");
            return -1;
        }
    }

    public int size() {
        return rear - front + 1;
    }

    public static void main(String[] args) {
        QueueExample queue = new QueueExample(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Queue: " + Arrays.toString(queue.queueArray));
        System.out.println("Dequeue item: " + queue.dequeue());
        System.out.println("Queue after dequeue: " + Arrays.toString(queue.queueArray));
        System.out.println("Front item: " + queue.front());
        System.out.println("Queue size: " + queue.size());


        ArrayList<Boolean> list = new ArrayList<>();
        LinkedList<Student> list2 = new LinkedList<>();


        list.size();

        Student berke = new Student("Berke", 0, 0);
        list.remove(0);
        list.get(0);
        list.remove(berke);

    }





}




