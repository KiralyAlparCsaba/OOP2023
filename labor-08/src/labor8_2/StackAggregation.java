package labor8_2;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Objects;

public class StackAggregation {

    private ArrayList<Object> items  = new ArrayList<>();
    private final int capacity;

    public StackAggregation(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull(){
        if(items.size() == capacity){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(items.size() == 0) {
            return true;
        }
        return false;
    }

    public void push(Object item) {
        items.add(item);
    }

    public Object pop() {
        if (!isEmpty()) {
            return items.remove(items.size() - 1);
        } else {
            throw new EmptyStackException();
        }
    }
    public int getSize(){
        return items.size();
    }
}
