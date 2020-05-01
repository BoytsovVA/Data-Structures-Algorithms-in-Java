package Recursion.binarySearch;

public class OrdArray {
    private long[] arr;
    private int nElems;

    public OrdArray(int size) {
        arr = new long[size];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public void insert(long data) {
        if (size() >= arr.length) {
            long[] bigger = new long[size() * 2];
            System.arraycopy(arr, 0, bigger, 0, arr.length);
            arr = bigger;
        } else {
            int i;
            for (i = 0; i < nElems; i++)
                if (arr[i] > data)
                    break;
            for (int j = nElems; j > i; j--)
                arr[j] = arr[j - 1];
            arr[i] = data;
            nElems++;
        }
    }

    public int find(long searchKey) {
        return recFind(searchKey, 0, nElems - 1);
    }

    private int recFind(long searchKey, int lowerBound, int upperBound) {
        int curIn;
        curIn = (lowerBound + upperBound)/2;

        if (arr[curIn] == searchKey)
            return curIn;
        else if (lowerBound > upperBound)
            return nElems;
        else {
            if (arr[curIn] < searchKey)
                return recFind(searchKey, curIn + 1, upperBound);
            else
                return recFind(searchKey, lowerBound, curIn - 1);
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


}
