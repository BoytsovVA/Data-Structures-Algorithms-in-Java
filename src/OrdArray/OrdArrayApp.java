package OrdArray;

import static OrdArray.OrdArray.merge;

public class OrdArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray array = new OrdArray(maxSize);
        OrdArray array1 = new OrdArray(maxSize);
        for (int i = 0; i < 20; i++)
            array.insert((long) (Math.random() * (600 + 1) - 200));
        for (int i = 0; i < 29; i++)
            array1.insert((long) (Math.random() * (600 + 1) - 200));

        int searchKey = 11;
        if (array.find(searchKey) != array.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        array.display();
        array1.display();

        OrdArray array3 = merge(array, array1);
//        array.delete(searchKey);
        System.out.println("Слияние массивов: ");
        array3.display();


    }
}
