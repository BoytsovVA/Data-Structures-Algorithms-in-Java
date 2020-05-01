package Recursion;

public class TowersOfHanoi {
    private static int nDisks = 40;
    private static long k = 0;
    public static void main(String[] args) {
    doTowers(nDisks, 'A', 'B', 'C');
        System.err.println(k);
    }

    public static void doTowers(int topN, char from, char inter, char to) {
        if (topN == 1) {
            //System.out.println("Disk 1 from " + from + " to " + to);
            k++;
        }
        else {
            doTowers(topN - 1, from, to, inter);
            //System.out.println("Disk " + topN + " from " + from + " to "+ to);
            k++;
            doTowers(topN-1, inter, from, to); // inter-->to
        }
    }
}
