package List.List.Iterator;

public class ListIterator {
    private Link previous;
    private Link current;
    private LinkList ourList;

    public ListIterator(LinkList list) {
        ourList = list;
        reset();
    }

    public void reset() {
        current = ourList.getFirst();
        previous = null;
    }

    public boolean atEnd() {
        return ourList.next == null;
    }

    public void nextLink() {
        try {
            if ((!atEnd()) && (!ourList.isEmpty()))
                throw new RuntimeException();
            previous = current;
            current = current.next;
        } catch (RuntimeException ex) {
            System.out.println("Список пуст или это конец списка");
            ex.printStackTrace();
        }
    }

    public Link getCurrent() {
        return current;
    }

    public void insertAfter(Object data) {
        Link newLink = new Link(data);
        if (ourList.isEmpty()) {
            ourList.setFirst(newLink);
            current = newLink;
        } else {
            newLink.next = current.next;
            current.next = newLink;
            nextLink();
        }
    }

    public void insertBefore(Object data) {
        Link newLink = new Link(data);
        if (previous == null) {
            newLink.next = ourList.getFirst();
            ourList.setFirst(newLink);
            nextLink();
        } else {
            newLink.next = current.next;
            current.next = newLink;
            nextLink();
        }
    }

    public Object deleteCurrent() {
        try {
            if (ourList.isEmpty())
                throw new RuntimeException();
            Object data = current.data;
            if (previous == null) {
                ourList.setFirst(current.next);
                reset();
            } else {
                previous.next = current.next;
                if (atEnd())
                    reset();
                else
                    current = current.next;
            }
            return data;
        } catch (RuntimeException ex) {
            System.out.println("Список пуст");
            ex.printStackTrace();
            return null;
        }
    }
}
