package SortingMethods.Partitional;

import SortingMethods.Array;

public class Partition extends Array {

    public Partition(int maxSize) {
        super(maxSize);
    }

    public void partitionIn(int left, int right, long pilot) {
        int leftPtr = left - 1;
        int rightPtr = right + 1;
        while (true) {
            while (leftPtr < right && arr[++leftPtr] < pilot)
                ;
            while (rightPtr > left && arr[--rightPtr] > pilot)
                ;
            if (leftPtr > rightPtr)
                break;
            else
                swap(leftPtr, rightPtr);
        }
    }
}
