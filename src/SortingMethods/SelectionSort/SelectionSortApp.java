package SortingMethods.SelectionSort;


public class SelectionSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        Selection arr = new Selection(maxSize);
        for (int i = 0; i < 29; i++)
            arr.insert((long) (Math.random() * (600 + 1) - 200));
        arr.display();
        arr.selectionsort();
        arr.display();
    }
}
