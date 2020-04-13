package List.LinkList;

public interface IList <T> {
    boolean isEmpty();
    void insertFirst(T data);
    T deleteFirst();
    void Display();
    T find(T key);
    T delete(T key);

}
