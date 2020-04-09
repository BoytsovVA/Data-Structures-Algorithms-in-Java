package SortingMethods.InsertSort;

public class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        InsertSort arr = new InsertSort(maxSize);
        for (int i = 0; i < 29; i++)
            arr.insert((long) (Math.random() * (600 + 1) - 200));
        arr.display();
        arr.insertsort();
        arr.display();
    }
}
