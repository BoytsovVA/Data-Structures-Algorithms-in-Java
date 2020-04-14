package List.List.Iterator;

public class LinkList extends Link  {
    private Link first;

    public LinkList() {
        super(null);
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

    }
}
