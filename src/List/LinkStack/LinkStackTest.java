package List.LinkStack;

import List.LinkStack.LinkStack;

public class LinkStackTest {
    public static void main(String[] args) {
        LinkStack ls = new LinkStack();
        ls.Push(20);
        ls.Push(40);
        ls.display();
        ls.Push(60);
        ls.Push(80);
        ls.display();
        ls.Pop();
        ls.Pop();
        ls.display();
    }

}
