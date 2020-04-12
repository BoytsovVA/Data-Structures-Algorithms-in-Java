package StackAndQueue.Queue;

import java.util.Arrays;

public class PriorityQueue implements Queue {
    private int nItems;
    private Object arr[];
    private int maxSize;

    public PriorityQueue (int maxSize) {
        this.maxSize = maxSize;
        arr = new Object[this.maxSize];
        nItems = 0;
    }

    @Override
    public void insert(Object data) {
        try {
            if (isFull())
                throw new ArrayIndexOutOfBoundsException();
            int i;
            if (nItems == 0)
                arr[nItems++] = data;
            else {
                insertfunc(data);
            }
        } catch (Exception ex) {
            maxSize += 1;
            arr = Arrays.copyOf(arr, maxSize);
            insertfunc(data);
        }
    }

    private void insertfunc(Object data) {
        int i;
        for (i = nItems - 1; i >= 0; i--) {
            if (data.hashCode() > arr[i].hashCode())
                arr[i + 1] = arr[i];
            else
                break;
        }
        arr[i + 1] = data;
        nItems++;
    }

    @Override
    public Object remove() {
        try {
            if (isEmpty())
                throw new ArrayIndexOutOfBoundsException();
            else
                return arr[--nItems];
        } catch (Exception ex) {
           throw new RuntimeException(ex);
        }
    }

    @Override
    public Object peekFront() {
        return arr[nItems-1];
    }

    @Override
    public boolean isEmpty() {
        return (nItems == 0);
    }

    @Override
    public boolean isFull() {
        return (nItems == maxSize);
    }

    @Override
    public Object size() {
        return nItems;
    }

    @Override
    public void display() {
        for (int i = 0; i < nItems; i++)
            System.out.print(arr[i] + " ");
    }
}
