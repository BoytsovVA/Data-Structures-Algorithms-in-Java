package List.LinkedList;

public interface IList <T> {
    boolean isEmpty();
    default void insertFirst(T data) {
        System.out.println("No one method");
    }
    default T deleteFirst() {
        System.out.println("No one method");
        return null;
    }
    void display();
    T find(T key);
    T delete(T key);

}
