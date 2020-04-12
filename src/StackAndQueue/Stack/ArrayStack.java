package StackAndQueue.Stack;

import java.util.Arrays;

public class ArrayStack implements Stack {
    private Object[] arr;
    private int maxSize;
    private int top;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        arr = new Object[this.maxSize];
        top = -1;
    }

    @Override
    public void Push(Object data) {
        try {
            arr[++top] = data;
        } catch (ArrayIndexOutOfBoundsException ex) {
            maxSize += 1;
            arr = Arrays.copyOf(arr, maxSize);
            arr[top] = data;
        }
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    @Override
    public Object Pop() {
        try {
            return arr[top--];
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Object Peek() {
        return arr[top];
    }

    @Override
    public void display() {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
