package SortingMethods.SelectionSort;

import SortingMethods.Array;

public class Selection extends Array {
    public Selection(int max) {
        super(max);
    }

    public void selectionsort() {
        int min;
        for (int i = 0; i < nElems - 1; i++) {
            min = i;
            for (int j = i + 1; j < nElems; j++)
                if (arr[j] < arr[min])
                    min = j;
            swap(i, min);
        }
    }
}
