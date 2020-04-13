package List.LinkList;

import StackAndQueue.Queue.Queue;

public class LinkQueue implements Queue {
    private FirstLastList queuelist;

    public LinkQueue() {
        queuelist = new FirstLastList();
    }

    @Override
    public void insert(Object data) {
        queuelist.insertLast(data);
    }

    @Override
    public Object remove() {
        return queuelist.deleteFirst();
    }

    @Override
    public Object peekFront() {
        return queuelist.getFirst().data;
    }

    @Override
    public boolean isEmpty() {
        return queuelist.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public Object size() {
        return null;
    }

    @Override
    public void display() {
        queuelist.Display();
    }
}
