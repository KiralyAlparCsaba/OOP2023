package oop.labor09;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue implements IQueue {

    private final ArrayList<Object> items;
    private final int CAPACITY;

    public ArrayListQueue(int capacity) {
        this.items = new ArrayList<>();
        this.CAPACITY = capacity;
    }

    public boolean isEmpty() {
        if (items.size() == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (items.size() == CAPACITY) {
            return true;
        }
        return false;
    }

    public void enQueue(Object item) {
        items.add(item);
    }

    public Object deQueue() {
        Object first = items.get(0);
        items.remove(0);
        return first;
    }

    public void printQueue() {
        for (Object i : items) {
            System.out.println(i + " ");
        }

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListQueue that = (ArrayListQueue) o;
        return  Objects.equals(items, that.items);
    }

}