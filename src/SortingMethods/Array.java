package SortingMethods;

public class Array {
    protected long[] arr;
    protected int nElems;

        public Array(int max) {
            arr = new long[max];
            nElems = 0;
        }

        public void insert(long value) {
            arr[nElems] = value;
            nElems++;
        }

        public void display() {
            for (int i = 0; i < nElems; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        public void swap(int one, int two) {
            long tmp = arr[one];
            arr[one] = arr[two];
            arr[two] = tmp;
        }
}
