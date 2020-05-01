package Tree;

public class Node<T extends Comparable<T>> {
    T data;
    Node<T> leftChild;
    Node<T> rightChild;

    public void displayNode() {
        try {
            if (data == null)
                throw new NullPointerException();
            else
                System.out.println(data);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}
