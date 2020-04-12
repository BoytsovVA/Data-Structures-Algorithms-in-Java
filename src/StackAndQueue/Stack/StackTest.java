package StackAndQueue.Stack;

public class StackTest {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        stack.Push(11);
        stack.Push(11);
        stack.Push(11);
        stack.Push(13);
        stack.display();
        System.out.println("_____");
        System.out.println(stack.Peek());
        System.out.println("_____");
        for (int i = 0; i < 4; i++) {
            System.out.println(stack.Pop());
        }
        Reverser rs = new Reverser("[({})]");
        rs.check();
    }


}
