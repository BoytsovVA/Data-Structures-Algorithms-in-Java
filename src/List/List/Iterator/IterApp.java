package List.List.Iterator;

public class IterApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList(); // Создание списка
        ListIterator iter1 = theList.getIterator(); // Создание итератора
        Object value;

        iter1.insertAfter(20);
        iter1.insertAfter(40);
        iter1.insertAfter(80);
        iter1.insertBefore(60);


        while(true)
        {
            System.out.print("Enter first letter of show, reset, ");
            System.out.print("next, get, before, after, delete: ");
            System.out.flush();
            int choice = getChar();
            switch(choice)
            {
                case 's':
                    if( !theList.isEmpty() )
                        theList.displayList();
                    else
                        System.out.println("List is empty");
                    break;
                case 'r':
                    iter1.reset();
                    break;
                    System.out.println("Can’t go to next link");
                    break;
                case ‘g’: // Получение текущего элемента
                     if( !theList.isEmpty() )
                {
                    value = iter1.getCurrent().dData; System.out.println("Returned " + value); }
else
                System.out.println("List is empty");
                break;
                case ‘b’: // Вставка перед текущим элементом
                    System.out.print("Enter value to insert: "); System.out.flush();
                    value = getInt();
                    iter1.insertBefore(value);
                    break;
                case 'a': // Вставка после текущего элемента
                    System.out.print("Enter value to insert: "); System.out.flush();
                    value = getInt();
                    iter1.insertAfter(value);
                case ‘n’:
                    if( !theList.isEmpty() && !iter1.atEnd() )
                        iter1.nextLink(); else
                        break; case 'd':
                if( !theList.isEmpty() ) {
// Удаление текущего элемента
                    value = iter1.deleteCurrent(); System.out.println("Deleted " + value); }
                else
                    System.out.println("Can’t delete"); break;
                default:
                    System.out.println("Invalid entry");

    }

}
