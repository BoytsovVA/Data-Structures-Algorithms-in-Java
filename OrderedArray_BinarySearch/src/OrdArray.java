//Работа с классом упорядоченного массива

public class OrdArray {
    private long[] arr; //Ссылка на массив
    private int nElems; //Количество элементов данных

    public OrdArray(int max) {
        arr = new long[max];
        nElems = 0;
    }

    public int size() { return nElems; }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while(true) {
            curIn = (lowerBound + upperBound) / 2;
            if (arr[curIn] == searchKey)
                return curIn;
            else if (lowerBound > upperBound)
                return nElems;
            else {
                if (arr[curIn] < searchKey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }

    public void insert(long value) {
        double lowerBound = 0;
        double upperBound = nElems - 1;
        int curIn;

        while(true) {
            curIn = (int)Math.round((lowerBound + upperBound) / 2);
            if (lowerBound > upperBound)
                break;
            else {
                if (arr[curIn] < value)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
        for (int j = nElems; j > curIn; j--)
            arr[j] = arr[j-1];
        arr[curIn] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int i = find(value);
        if (i == nElems)
            return false;
        else {
            for (int j = i; j < nElems; j++)
                arr[j] = arr[j+1];
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
}
