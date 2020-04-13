package List.LinkList;

import StackAndQueue.Stack.Stack;

public class LinkStack <T> implements Stack {
    private LinkList stacklist;

    public LinkStack() {
        stacklist = new LinkList();
    }

    @Override
    public void Push(Object data) {
        stacklist.insertFirst(data);
    }

    @Override
    public boolean isEmpty() {
        return stacklist.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public Object Pop() {
        return stacklist.deleteFirst();
    }

    @Override
    public Object Peek() {
        return stacklist.getFirst().data;
    }

    @Override
    public void display() {
        stacklist.Display();
    }
}
