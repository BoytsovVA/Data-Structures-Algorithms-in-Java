package StackAndQueue.Queue;

import java.util.Arrays;

public class SimpleQueue implements Queue {
    private int maxSize;
    private Object[] arr;
    private int rear;
    private int front;
    private int nItems;

    public SimpleQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new Object[this.maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    @Override
    public void insert(Object data) {
        try {
            if (nItems == maxSize)
                throw new ArrayIndexOutOfBoundsException();
            else {
                if (rear == maxSize - 1)
                    rear = -1;
                arr[++rear] = data;
                nItems++;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            maxSize += 1;
            arr = Arrays.copyOf(arr, maxSize);
            if (front == (rear+1)) {
                for (int i = maxSize- 1; i > front; i--)
                    arr[i] = arr[i - 1];
                arr[front + 1] = arr[front++];
                arr[++rear] = data;
                nItems++;
                return;
            }
            arr[++rear] = data;
            nItems++;
        }
    }

    @Override
    public Object remove() {
        Object data = arr[front++];
        if (front == maxSize)
            front = 0;
        nItems--;
        return data;
    }

    @Override
    public Object peekFront() {
        return arr[front];
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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
