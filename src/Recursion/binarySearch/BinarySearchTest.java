package Recursion.binarySearch;

public class BinarySearchTest {
    public static void main(String[] args) {
        int maxSize = 10;
        OrdArray ordArray = new OrdArray(maxSize);
        ordArray.insert(72);
        ordArray.insert(90);
        ordArray.insert(945);
        ordArray.insert(134);
        ordArray.insert(11);
        ordArray.insert(65);
        ordArray.insert(615);
        ordArray.insert(15);

        ordArray.display();
        int searchkey = 945;

        if (ordArray.find(searchkey) != ordArray.size())
            System.out.println("SearchKey was found " + searchkey);
        else
            System.out.println("Don't found");

    }
}
