package SortingMethods.BubbleSort;

import SortingMethods.Array;

public class Bubble extends Array {
    public Bubble(int max) {
        super(max);
    }

    public void bubblesort() {
//        for (int i = nElems - 1; i > 1 ; i--) {
//            for (int j = 0; j < i; j++)
//            if (arr[j] > arr[j+1])
//                swap( j,j+1);
//        }
        for (int i = 0; i < nElems - 1; i++) {
            for (int j = 0; j < nElems - i; j++)
            if (arr[j] > arr[j+1])
                swap( j,j+1);
//                long tmp = arr[j];
//                arr[j] = arr [j+1];
//                arr[j+1] = tmp;
        }
    }


}
