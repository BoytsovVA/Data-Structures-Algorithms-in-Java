package Array;

public class highArray {
    private long[] arr;
    private int nElems;

    public highArray(int max) {
        arr = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++)
            if (arr[j] == searchKey)
                break;
        if (j == nElems)
            return false;
        else
            return true;
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++)
            if (arr[j] == value)
                break;
        if (j == nElems)
            return false;
        else {
            for (int k = j; k < nElems; k++)
                arr[k] = arr[k+1];
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(arr[j] + " ");
        System.out.println("");
    }
}
