package List.SortedList;

import List.LinkedList.IList;
import List.LinkedList.Link;

public class SortedList implements IList {
    private Link first;

    public SortedList() {
        first = null;
    }

    public SortedList(Link[] links) {
        first = null;
        for (int i = 0; i < links.length; i++) {
            insert(links[i].getData());
        }
    }


    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void display() {
        Link current = first;
        while (current != null) {
            current.DisplayLink();
            current = current.getNext();
        }
    }

    @Override
    public Object find(Object key) {
        Link current = first;
        try {
            while (!current.getData().equals(key)) {
                if (current.getNext() == null)
                    throw new RuntimeException();
                else
                    current = current.getNext();
            }
            return current;
        } catch (RuntimeException ex) {
            ex.getMessage();
            return null;
        }
    }

    public void insert(Object key) {
        Link newLink = new Link(key);
        Link current = first;
        Link previous = null;
        while (current != null && key.hashCode() > current.getData().hashCode()) {
            previous = current;
            current = current.getNext();
        }
            if (previous == null)
                first = newLink;
            else
                previous.setNext(newLink);
            newLink.setNext(current);
    }

    @Override
    public Object delete(Object key) {
        Link current = first;
        Link previous = first;
        try {
            if (isEmpty())
                throw new RuntimeException();
            if (first.getData().equals(key)) {
                first = first.getNext();
                return current;
            }
            while (current != null && key.hashCode() > current.getData().hashCode()) {
                if (current.getNext() == null)
                    throw new RuntimeException();
                else {
                    previous = current;
                    current = current.getNext();
                }
            }
                previous.setNext(current.getNext());
                return current;

        } catch (RuntimeException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Object deleteFirst() {
        try {
            if (isEmpty())
                throw new RuntimeException();
            Link tmp = first;
            first = first.getNext();
            return tmp;
        }catch (RuntimeException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
