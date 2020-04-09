package SortingMethods;

public class ArraySort {
    protected long[] a;
    protected int nElems;

        public ArraySort(int max) {
            a = new long[max];
            nElems = 0;
        }

        public void insert(long value) {
            a[nElems] = value;
            nElems++;
        }

        public void display() {
            for (int i = 0; i < nElems; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }

        public void swap(int one, int two) {
            long tmp = a[one];
            a[one] = a[two];
            a[two] = tmp;
        }
}
