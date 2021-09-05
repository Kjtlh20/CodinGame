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
        String MESSAGE = in.nextLine();
        System.err.println("MESSAGE: " + MESSAGE);

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        char[] charArr = MESSAGE.toCharArray();
        String binaryMessage = "";
        String binaryChar;
        for (int i = 0; i < charArr.length; i++) {
            binaryChar = Integer.toBinaryString(charArr[i]);
            if (binaryChar.length() < 7) {
                binaryChar = "0" + binaryChar;
            }
            binaryMessage = binaryMessage + binaryChar;
        }
        System.err.println("binaryMessage: " + binaryMessage);

        String chuckMessage = "";
        charArr = binaryMessage.toCharArray();
        String zeros = "";
        String currChar;
        int i = 0;
        char prev = charArr[0];
        while (true) {
            currChar = (String) ((prev == '1') ? "0 " : "00 ");
            if (i == charArr.length || charArr[i] != prev) {
                chuckMessage = chuckMessage + currChar + zeros + " ";
                zeros = "";
            }
            if (i == charArr.length) {
                break;
            }
            zeros = zeros + "0";
            prev = charArr[i];
            i++;
        }
        chuckMessage = chuckMessage.trim();
        System.out.println(chuckMessage);
    }
}