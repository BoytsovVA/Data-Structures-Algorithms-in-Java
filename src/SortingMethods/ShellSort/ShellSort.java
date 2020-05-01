package SortingMethods.ShellSort;

public class ShellSort {
    private long[] arr;
    private int nElem;

    public ShellSort(int maxSize) {
        arr = new long[maxSize];
        nElem = 0;
    }

    public void insert(long value) {
        arr[nElem] = value;
        nElem++;
    }

    public void display() {
        for (int i = 0; i < nElem; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public void ShellSort() {
        int inner, outer;
        long temp;
        int h = 1;
        while (h <= nElem/3)
            h = h * 3 + 1;
        while (h > 0) {
            for (outer = h; outer < nElem ; outer++) {
                temp = arr[outer];
                inner = outer;
                while (inner > h-1 && arr[inner - h] >= temp) {
                    arr[inner] = arr[inner - h];
                    inner -= h;
                }
                arr[inner] = temp;
            }
            h = (h-1)/3;
        }
    }
}
