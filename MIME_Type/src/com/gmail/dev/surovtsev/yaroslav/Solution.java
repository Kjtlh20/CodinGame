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
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            System.err.println("EXT: " + EXT + ", MT: " + MT);
            map.put(EXT.toLowerCase(), MT);
        }
        in.nextLine();
        String[] mimeTypes = new String[Q];
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            System.err.println("FNAME: " + FNAME);
            String fileExt = "";
            if (FNAME.contains(".")) {
                fileExt = FNAME.substring(FNAME.lastIndexOf(".") + 1);
            }
            System.err.println("fileExt: " + fileExt);
            String value = map.get(fileExt.toLowerCase());
            System.err.println("value: " + value);
            if (value == null) {
                mimeTypes[i] = "UNKNOWN";
            } else {
                mimeTypes[i] = value;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
        for (String mimeType : mimeTypes) {
            System.out.println(mimeType);
        }
    }
}