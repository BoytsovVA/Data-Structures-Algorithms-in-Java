//Работа с классом упорядоченного массива

package OrdArray;

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

    public static OrdArray merge(OrdArray arr1, OrdArray arr2) {
        OrdArray result = new OrdArray(arr1.size() + arr2.size());
//        int firstIndex = 0;
//        int secondIndex = 0;
//        for(int i=0; i< result.arr.length;i++) {
//            if(firstIndex >= arr1.size()){
//                result.insert(arr2.arr[secondIndex]);
//                secondIndex += 1;
//            }else if(secondIndex >= arr2.size()){
//                result.insert(arr1.arr[firstIndex]);
//                firstIndex += 1;
//            }else if (arr1.arr[firstIndex] < arr2.arr[secondIndex]){
//                result.insert(arr1.arr[firstIndex]);
//                firstIndex += 1;
//            }else{
//                result.insert(arr2.arr[secondIndex]);
//                secondIndex += 1;
//            }
//        }
        for (int i = 0; i < arr1.nElems; i++)
            result.insert(arr1.arr[i]);
        for (int i = 0; i < arr2.nElems; i++)
            result.insert(arr2.arr[i]);
        return result;
        }

    public void display() {
        for (int i = 0; i < nElems; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
}
