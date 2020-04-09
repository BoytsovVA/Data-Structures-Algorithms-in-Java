package SortingMethods.InsertSort;

import SortingMethods.ArraySort;

public class InsertSort extends ArraySort {
    public InsertSort(int max) {
        super(max);
    }

    public void insertsort() {
        int j;
        for (int i = 1; i < nElems; i++) {
            long tmp = a[i];
            j = i;
            while ((j > 0) && (a[j - 1] >= tmp)) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = tmp;
        }
    }
}
