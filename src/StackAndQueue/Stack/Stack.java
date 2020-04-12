package StackAndQueue.Stack;

public interface Stack <T> {
    void Push(T data);
    boolean isEmpty();
    boolean isFull();
    T Pop();
    T Peek();
    void display();
}
