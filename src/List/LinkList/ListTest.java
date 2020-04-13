package List.LinkList;

public class ListTest {
    public static void main(String[] args) {
        LinkList theList = new LinkList();
        theList.insertFirst(11);
        theList.insertFirst("Str");
        theList.insertFirst(33);
        theList.insertFirst(44);
        theList.Display();
        System.out.println();
        theList.deleteFirst().DisplayLink();
        System.err.println("\nCheck find");

        Link f = theList.find("Str");
        if (f == null)
            System.out.println("Don't find");
        else
            System.out.println("Find");

        System.err.println("\n Check del");

        Link d = theList.delete("1"); //
        if( d != null )
            System.out.println("Deleted link with key " + d.data);
        else
            System.out.println("Can’t delete link");

        System.err.println("Check all list");
        theList.Display();
        System.out.println();

        while (!theList.isEmpty()) {
            Link<Integer> DeletedLink = theList.deleteFirst();
            System.out.println("Deleted: ");
            DeletedLink.DisplayLink();
            System.out.println();
        }
        theList.deleteFirst();

        System.err.println("\n\n\n");

        FirstLastList theList1 = new FirstLastList();
        theList1.insertFirst(22);
        theList1.insertFirst(44);
        theList1.insertFirst(66);

        theList1.insertLast(11);
        theList1.insertLast(33);
        theList1.insertLast(55);

        theList1.Display();

        theList1.deleteFirst();
        theList1.deleteFirst();

        theList1.Display();

        Link f1 = theList1.find(11);
        if (f1 == null)
            System.out.println("Don't find");
        else
            System.out.println("Find");

        System.err.println("\n Check del");

        Link d1 = theList1.delete(33); //
        if( d1 != null )
            System.out.println("Deleted link with key " + d1.data);
        else
            System.out.println("Can’t delete link");

        System.err.println("Check all list");
        theList1.Display();
    }
}
