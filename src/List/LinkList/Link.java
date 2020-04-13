package List.LinkList;

public class Link<T> {
    protected T data;
    protected Link next;

    public Link(T data) {
        this.data = data;
        next = null;
    }

    public void DisplayLink() {
        System.out.print("{" + data + "} ");
    }

}
