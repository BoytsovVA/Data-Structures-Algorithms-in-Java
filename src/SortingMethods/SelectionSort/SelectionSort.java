package SortingMethods.SelectionSort;

import SortingMethods.ArraySort;

public class SelectionSort extends ArraySort {
    public SelectionSort(int max) {
        super(max);
    }

    public void selectionsort() {
        int min;
        for (int i = 0; i < nElems - 1; i++) {
            min = i;
            for (int j = i + 1; j < nElems; j++)
                if (a[j] < a[min])
                    min = j;
            swap(i, min);
        }
    }
}
