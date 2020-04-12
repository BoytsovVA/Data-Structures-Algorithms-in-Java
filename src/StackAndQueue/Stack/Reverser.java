package StackAndQueue.Stack;

public class Reverser {
    private String input;
    private String output;

    public Reverser(String input) {
        this.input = input;
    }

    public void check() {
        int stackSize = input.length();
        ArrayStack theStack = new ArrayStack(stackSize);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    theStack.Push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                        try {
                            if (!theStack.isEmpty()) {
                                char tmp = (char) theStack.Pop();
                                if ((ch == '}' && tmp == '{') ||
                                        (ch == ']' && tmp == '[') ||
                                        (ch == ')' && tmp == '(')) {
//                                throw new Exception("Error: "+ch+" at" + i);
                                    break;
                                } else
                                    throw new Exception("Error: " + ch + " at " + i);
                            }
                        }catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                default:
                    break;
            }
        }
        try {
            if (!theStack.isEmpty()) {
                throw new Exception("error ");
            }
            else
                System.out.println("Ok");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
