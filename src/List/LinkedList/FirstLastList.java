package List.LinkedList;

public class FirstLastList implements IList {
    private Link first;
    private Link last;


    public FirstLastList() {
        first = null;
        last = null;
    }

    public Link getFirst() {
        return first;
    }

    public Link getLast() {
        return last;
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
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(Object data) {
        Link newLink = new Link(data);
        if (isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
    }

    @Override
    public Object deleteFirst() {
        try {
            if (first == null)
                throw new RuntimeException();
            Link tmp = first;
            if (first.next == null)
                last = null;
            else
                first = first.next;
            return tmp;
        } catch (RuntimeException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public void display() {
        System.out.println("SortedList(first ---> last): ");
        Link current = first;
        while (current != null) {
            current.DisplayLink();
            current = current.next;
        }
    }

    @Override
    public Link find(Object key) {
        Link current = first;
        try {
            while (!current.data.equals(key)) {
                if (current.next == null)
                    throw new RuntimeException();
                else
                    current = current.next;
            }
            return current;
        } catch (RuntimeException ex) {
            ex.getMessage();
            return null;
        }
    }

    @Override
    public Link delete(Object key) {
        if (isEmpty()) {
            System.out.println("SortedList is empty");
            return null;
        }
        Link current = first;
        Link previous = first;
        try {
            while (current.data != key) {
                if (current.next == null)
                    throw new RuntimeException();
                else {
                    previous = current;
                    current = current.next;
                }
            }
            if (current == first)
                first = first.next;
            else
                previous.next = current.next;
            return current;
        } catch (RuntimeException ex) {
            ex.getMessage();
            return null;
        }
    }
}
