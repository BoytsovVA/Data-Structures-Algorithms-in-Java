package SortingMethods.Partitional;

import SortingMethods.Array;

public class PartitionTest {
    public static void main(String[] args) {
        Partition arr = new Partition(100);
        for (int i = 0; i < 100; i++) {
            arr.insert((long)(Math.random()*999));
        }

        arr.display();

        arr.partitionIn(0, 99, 500);

        arr.display();
    }
}
