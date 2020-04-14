package List.List.DoublyLinkedList;

import List.LinkedList.IList;

public class DoublyLinkedList implements IList {
    private Link first;
    private Link last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void insertFirst(Object data) {
        Link newLink = new Link(data);
        if (isEmpty())
            last = newLink;
        else
            first.previous = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(Object data) {
        Link newLink = new Link(data);
        if (isEmpty())
            first = newLink;
        else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    @Override
    public Object deleteFirst() {
        try {
            if (isEmpty())
                throw new RuntimeException();
            Link current = first;
            if (current.next == null)
                last = null;
            else
                first.next.previous = null;
            first = first.next;
            return current;
        } catch (RuntimeException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public Object deleteLast() {
        try {
            if (isEmpty())
                throw new RuntimeException();
            Link current = last;
            if (current.previous == null)
                first = null;
            else
                last.previous.next = null;
            last = current.previous;
            return current;
        } catch (RuntimeException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public void display() {
        Link current = first;
        try {
            if (isEmpty())
                throw new RuntimeException();
            while (current != null) {
                current.display();
                current = current.next;
            }
        } catch (RuntimeException ex) {
            System.out.println("Список пуст");
            ex.printStackTrace();
        }

    }

    @Override
    public Object find(Object key) {
        try {
            if (isEmpty())
                throw new RuntimeException();
            Link current = first;
            while (!current.data.equals(key)) {
                if (current.next == null)
                    throw new RuntimeException();
                else
                    current = current.next;
            }
            return current;
        } catch (RuntimeException ex) {
            System.out.println("Обьект не найден");
            return null;
        }
    }

    @Override
    public Object delete(Object key) {
        Link current = (Link) find(key);
        if (current == first)
            first = first.next;
        else
            current.previous.next = current.next;
        if (current == last)
            last = current.previous;
        else
            current.next.previous = current.previous;
        return current;
    }

    public boolean insert(Object key, Object data) {
        Link current = (Link) find(key);
        Link newLink = new Link(data);
        if (current == last) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }
}
