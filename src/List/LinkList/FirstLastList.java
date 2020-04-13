package List.LinkList;

public class FirstLastList extends Link implements IList {
    private Link first;
    private Link last;


    public FirstLastList() {
        super(null);
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
    public void Display() {
        System.out.println("List(first ---> last): ");
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
            while (current.data != key) {
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
            System.out.println("List is empty");
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