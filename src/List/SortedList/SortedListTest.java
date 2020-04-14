package List.SortedList;

import List.LinkedList.Link;

import java.util.Map;

public class SortedListTest {
    public static void main(String[] args) {
        SortedList sl = new SortedList();
        sl.insert(20);
        sl.insert(40);

        sl.display();
        System.out.println("\n");

        sl.insert(10);
        sl.insert(30);
        sl.insert(50);

        sl.display();
        System.out.println("\n");

        sl.delete(50);

        sl.display();

        System.out.println();

        sl.deleteFirst();

        sl.display();

        System.err.println("\nСортировка вставкой на основе списка");

        Link[] linkApp = new Link[10];

        for (int i = 0; i < linkApp.length; i++) {
            Integer n = (int) (Math.random()*90);
            Link newLink = new Link(n);
            linkApp[i] = newLink;
        }

        System.out.println("\nUnsorted array : ");

        for (int i = 0; i < linkApp.length; i++) {
            linkApp[i].DisplayLink();
        }

        SortedList sl1 = new SortedList(linkApp);

        for (int i = 0; i < linkApp.length; i++) {
            linkApp[i] = (Link) sl1.deleteFirst();
        }

        System.out.println("\nSorted array : ");

        for (int i = 0; i < linkApp.length; i++) {
            linkApp[i].DisplayLink();
        }
    }
}
