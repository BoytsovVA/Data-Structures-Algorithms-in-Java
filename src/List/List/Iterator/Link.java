package List.List.Iterator;

public class Link <T>{
    protected T data;
    protected Link next;

    public Link(T data) {
        this.data = data;
        next = null;
    }

    public void display() {
        System.out.print(data + " ");
    }
}
