package SortingMethods.InsertSort;

import SortingMethods.Array;

public class Insert extends Array {
    public Insert(int max) {
        super(max);
    }

    public void insertsort() {
        int j;
        for (int i = 1; i < nElems; i++) {
            long tmp = arr[i];
            j = i;
            while ((j > 0) && (arr[j - 1] >= tmp)) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = tmp;
        }
    }
}
