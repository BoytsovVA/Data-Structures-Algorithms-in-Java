package List.List.Iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IterApp {
    public static void main(String[] args) throws IOException {
        LinkList theList = new LinkList();
        ListIterator iter1 = theList.getIterator();
        Object value;

        iter1.insertAfter(20);
        iter1.insertAfter(40);
        iter1.insertAfter(80);
        iter1.insertBefore(60);


        while (true) {
            System.out.print("Enter first letter of show, reset, ");
            System.out.print("next, get, before, after, delete: ");
            System.out.flush();
            int choice = getChar();
            switch (choice) {
                case 's':
                    if (!theList.isEmpty())
                        theList.displayList();
                    else
                        System.out.println("List is empty");
                    break;
                case 'r':
                    iter1.reset();
                    break;
                case 'n':
                    iter1.nextLink();
                    break;
                case 'g':
                    value = iter1.getCurrent().data;
                    System.out.println("Returned " + value);
                    break;
                case 'b':
                    System.out.println("Print value to insert: ");
                    System.out.flush();
                    value = getObject();
                    iter1.insertBefore(value);
                    break;
                case 'a':
                    System.out.println("Print value to insert: ");
                    System.out.flush();
                    value = getObject();
                    iter1.insertAfter(value);
                    break;
                case 'd':
                    value = iter1.deleteCurrent();
                    System.out.println("Deleted " + value);
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        return str;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static Object getObject() throws IOException {
        return getString();
    }

}
