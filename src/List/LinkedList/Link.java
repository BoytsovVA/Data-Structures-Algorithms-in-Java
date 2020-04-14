package List.LinkedList;

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

    public T getData() {
        return data;
    }

    public Link getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Link next) {
        this.next = next;
    }
}
