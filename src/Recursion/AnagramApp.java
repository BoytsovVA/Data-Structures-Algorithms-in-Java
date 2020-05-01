package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnagramApp {
    static int size;
    static int count;
    static char[] arrChar = new char[100];

    public static void main(String[] args) throws IOException {
        System.out.println("Enter arr word: ");
        String input = getString();
        size = input.length();
        count = 0;
        for (int i = 0; i < size ; i++)
            arrChar[i] = input.charAt(i);
        doAnagram(size);
    }

    public static void doAnagram(int newSize) {
        if (newSize == 1)
            return;
        for (int i = 0; i < newSize; i++) {
            doAnagram(newSize - 1);
            if (newSize == 2)
                displayWord();
            rotate(newSize);
        }
    }

    public static void displayWord() {
        if (count < 99)
            System.out.print(" ");
        if (count < 9)
            System.out.print(" ");
        System.out.print(++count + " ");
        for(int i = 0; i < size; i++)
            System.out.print( arrChar[i] );
        System.out.print(" ");
        System.out.flush();
        if(count % 6 == 0)
            System.out.println();
    }

    public static void rotate(int newSize) {
        int i;
        int position = size - newSize;
        char tmp = arrChar[position];
        for (i = position + 1; i < size; i++)
            arrChar[i-1] = arrChar[i];
        arrChar[i-1] = tmp;
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        return bf.readLine();
    }
}
