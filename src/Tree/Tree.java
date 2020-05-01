package Tree;

public class Tree<T extends Comparable<T>> {
    private Node<T> root;

    public Node<T> find(T key) {
        try {
            Node<T> current = root;
            if (current == null)
                throw new NullPointerException();
            while (current.data.compareTo(key) != 0) {
                if (key.compareTo(current.data) < 0)
                    current = current.leftChild;
                else
                    current = current.rightChild;
                if (current == null)
                    return null;
            }
            return current;
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void insert(T data) {
        Node<T> newNode = new Node<T>();
        newNode.data = data;
        if (root == null)
            root = newNode;
        else {
            Node<T> current = root;
            Node<T> parent;
            while (true) {
                parent = current;
                if (current.data.compareTo(data) > 0) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }

    }

    public boolean delete(T key) {
        try {
            if (root == null)
                throw new NullPointerException();
            else {
                Node<T> current = root;
                Node<T> parent = root;
                boolean isLeftChild = true;
                while (!(current.data.compareTo(key) == 0)) {
                    parent = current;
                    if (current.data.compareTo(key) > 0) {
                        isLeftChild = true;
                        current = current.leftChild;
                    } else {
                        isLeftChild = false;
                        current = current.rightChild;
                    }
                    if (current == null)
                        return false;
                }
                if (current.leftChild == null && current.rightChild == null) {
                    if (current == root)
                        root = null;
                    else if (isLeftChild)
                        parent.leftChild = null;
                    else
                        parent.rightChild = null;
                } else if (current.rightChild == null) {
                    if (current == root)
                        root = null;
                    else if (isLeftChild)
                        parent.leftChild = current.leftChild;
                    else
                        parent.rightChild = current.leftChild;
                } else if (current.leftChild == null) {
                    if (current == root)
                        root = null;
                    else if (isLeftChild)
                        parent.leftChild = current.rightChild;
                    else
                        parent.rightChild = current.rightChild;
                }
            }
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }

    private void inOrder(Node<T> localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);

            System.out.println(localRoot.data + " ");

            inOrder(localRoot.rightChild);
        }
    }

    public Node<T> minimum() {
        Node<T> current = root;
        while (current.leftChild != null)
            current = current.leftChild;
        return current;
    }
    public Node<T> maximum() {
        Node<T> current = root;
        while (current.rightChild != null)
            current = current.rightChild;
        return current;
    }
}
