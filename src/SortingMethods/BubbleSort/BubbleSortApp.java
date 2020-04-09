package SortingMethods.BubbleSort;

public class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        BubbleSort arr = new BubbleSort(maxSize);
        for (int i = 0; i < 29; i++)
            arr.insert((long) (Math.random() * (600 + 1) - 200));
        arr.display();
        arr.bubblesort();
        arr.display();
    }
}
