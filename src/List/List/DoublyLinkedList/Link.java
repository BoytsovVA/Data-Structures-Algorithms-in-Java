package List.List.DoublyLinkedList;

public class Link <T> {
    protected T data;
    protected Link next;
    protected Link previous;

    public Link(T data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public void display() {
        System.out.print(data + " ");
    }
}
