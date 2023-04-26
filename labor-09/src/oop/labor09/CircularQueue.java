package oop.labor09;

import java.util.Arrays;
import java.util.Objects;

public class CircularQueue implements IQueue {

    private int CAPACITY;
    private int front;
    private int rear;
    private Object[] items;


    public CircularQueue(int CAPACITY) {
        front = -1;
        rear = -1;
        this.CAPACITY = CAPACITY;
        items = new Object[CAPACITY];
    }

    public boolean isFull() {
        if (front == 0 && rear == CAPACITY - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }
    public boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    public void enQueue(Object item) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else{
            if (front == -1)
                front = 0;
            rear = (rear +1)%CAPACITY;
            items[rear] = item;
            System.out.println("Inserted" + item);
        }
    }

    public Object deQueue() {
        Object element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            }
            else {
                front = (front + 1) % CAPACITY;
            }
            return (element);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircularQueue that = (CircularQueue) o;
        return front == that.front && rear == that.rear && Arrays.equals(items, that.items);
    }


    public void printQueue(){
        int i;
        if (isEmpty()) {
            System.out.println("Circular Queue Is Empty");
        } else {
            System.out.println("Front:  " + front);
            System.out.println("Items:  ");
            for (i = front; i != rear; i = (i + 1) % CAPACITY)
                System.out.print(items[i] + " ");
            System.out.println(items[i]);
            System.out.println("Rear:  " + rear);
        }


    }
}
