package StackAndQueue.Queue;

public interface Queue <T>{
    void insert(T data);
    T remove();
    T peekFront();
    boolean isEmpty();
    boolean isFull();
    T size();
    void display();

}
