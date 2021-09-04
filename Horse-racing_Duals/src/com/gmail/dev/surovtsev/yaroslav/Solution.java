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
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            arr[i] = pi;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.err.println("N: " + N);

        int minDiff = 10000000;
        int currDiff;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                currDiff = Math.abs(arr[i] - arr[j]);
                if (currDiff < minDiff) {
                    minDiff = currDiff;
                }
            }
            System.err.println("****************");
            System.err.println("pi: " + arr[i]);
            System.err.println("minDiff: " + minDiff);
            System.err.println("c: " + c);
            c++;
            if (c > 1000) {
                break;
            }
        }
        System.out.println(minDiff);
    }
}