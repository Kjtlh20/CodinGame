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
        String LON = in.next();
        String LAT = in.next();
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            System.err.println("DEFIB: " + DEFIB);
            arr[i] = DEFIB;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        double x;
        double y;
        double d;
        double lonA = Double.parseDouble(LON.replace(",", "."));
        double latA = Double.parseDouble(LAT.replace(",", "."));
        double lonB;
        double latB;
        String[] data;
        double minDist = 999_999_999;
        String result = "";
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            data = arr[i].split(";");
            lonB = Double.parseDouble(data[4].replace(",", "."));
            latB = Double.parseDouble(data[5].replace(",", "."));
            x = (lonB - lonA) * Math.cos((latA + latB) / 2.0);
            y = latB - latA;
            d = Math.sqrt(x*x + y*y) * 6371;
            System.err.println("d: " + d);

            if (d < minDist) {
                minDist = d;
                result = data[1];
                index = i;
            }
        }
        System.err.println("minDist: " + minDist + ", index: " + index);
        System.out.println(result);
    }
}