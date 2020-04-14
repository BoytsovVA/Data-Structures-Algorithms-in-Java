package List.LinkedList;

public class LinkList extends Link implements IList {
    private Link first;

    public LinkList() {
        super(null);
        first = null;
    }
    @Override
    public boolean isEmpty() {
        return (first == null);
    }

    @Override
    public void insertFirst(Object data) {
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    @Override
    public Link deleteFirst() {
        try {
            if (isEmpty())
                throw new RuntimeException();
            Link tmp = first;
            first = first.next;
            return tmp;
        } catch (RuntimeException ex) {
//            System.err.println(ex.getMessage());
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

    public Link getFirst() {
        return first;
    }
}
