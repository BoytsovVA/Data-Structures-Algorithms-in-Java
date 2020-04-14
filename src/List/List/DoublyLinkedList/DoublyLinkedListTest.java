package List.List.DoublyLinkedList;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertFirst(22);
        dl.insertFirst(44);
        dl.insertFirst(66);

        dl.insertLast(11);
        dl.insertLast(33);
        dl.insertLast(55);

        dl.display();
        System.err.println("\nУдаление");

        dl.deleteFirst();
        dl.deleteLast();
        dl.delete(33);

        System.err.println("После удаления ");
        dl.display();

        dl.insert(11, 77);
        dl.insert(77, 88);

        System.err.println("\nПосле еще одной вставки ");
        //dl.find(33);
        //dl.delete(88);
        dl.display();
    }
}
