package SortingMethods.ShellSort;

public class ShellSortTest {
    public static void main(String[] args) {
        ShellSort arr = new ShellSort(1000);
        for (int i = 1; i < 100; i++) {
            arr.insert((long)(Math.random() * 999));
        }
        arr.display();
        arr.ShellSort();
        arr.display();
    }
}
