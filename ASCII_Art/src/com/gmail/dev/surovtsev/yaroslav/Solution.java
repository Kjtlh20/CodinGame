import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();

        System.err.println("L: " + L);
        System.err.println("H: " + H);
        System.err.println("T: " + T);

        String[][] data = new String[H][L];
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            System.err.println(ROW);
            data[i][0] = ROW;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        T = T.toUpperCase();
        char[] charArray = T.toCharArray();
        char currLetter;
        int index;
        String line = "";
        for (int i = 0; i < data.length; i++) {
            line = "";
            for (int j = 0; j < charArray.length; j++) {
                currLetter = charArray[j];
                index = getIndexLetter(currLetter);
                line = line + data[i][0].substring(index * L, index * L + L);
            }
            System.out.println(line);
        }
    }

    public static int getIndexLetter(char letter) {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?".toCharArray();
        int index = alphabet.length - 1;
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == letter) {
                index = i;
                break;
            }
        }
        return index;
    }
}