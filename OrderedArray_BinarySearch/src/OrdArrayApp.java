public class OrdArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray array = new OrdArray(maxSize);
        array.insert(11);
        for (int i = 1; i < 20; i++)
            array.insert((long) (Math.random() * (600 + 1) - 200));
        int searchKey = 11;
        if (array.find(searchKey) != array.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        array.display();

        array.delete(searchKey);

        array.display();
    }
}
