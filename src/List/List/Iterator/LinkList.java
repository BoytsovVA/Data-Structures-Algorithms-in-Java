package List.List.Iterator;

public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public ListIterator getIterator() {
        return new ListIterator(this);
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }
}
