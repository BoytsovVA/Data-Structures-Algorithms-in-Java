package Tree;

public class TreeApp {
    public static void main(String[] args) {
        Tree<Integer> theTree = new Tree<Integer>();
        theTree.insert(50);
        theTree.insert(25);
        theTree.insert(75);

        Node found = theTree.find(50);
        if (found != null)
            found.displayNode();
        else
            throw new NullPointerException("f");
        theTree.minimum().displayNode();
        theTree.maximum().displayNode();
    }
}
