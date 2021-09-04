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
        int n = in.nextInt(); // the number of temperatures to analyse
        int maxTemp = 9999;
        int closestToZero = maxTemp;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            System.err.println("t: " + t);
            if (Math.abs(t) < Math.abs(closestToZero)) {
                closestToZero = t;
            }
            if (t == Math.abs(closestToZero) && t > 0) {
                closestToZero = t;
            }
            System.err.println("closestToZero: " + closestToZero);
        }
        if (n == 0) {
            closestToZero = 0;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(closestToZero);
    }
}