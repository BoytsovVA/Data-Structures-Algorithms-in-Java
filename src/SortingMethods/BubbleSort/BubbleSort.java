package SortingMethods.BubbleSort;

import SortingMethods.ArraySort;

public class BubbleSort extends ArraySort {
    public BubbleSort(int max) {
        super(max);
    }

    public void bubblesort() {
//        for (int i = nElems - 1; i > 1 ; i--) {
//            for (int j = 0; j < i; j++)
//            if (a[j] > a[j+1])
//                swap( j,j+1);
//        }
        for (int i = 0; i < nElems - 1; i++) {
            for (int j = 0; j < nElems - i; j++)
            if (a[j] > a[j+1])
                swap( j,j+1);
//                long tmp = a[j];
//                a[j] = a [j+1];
//                a[j+1] = tmp;
        }
    }


}
