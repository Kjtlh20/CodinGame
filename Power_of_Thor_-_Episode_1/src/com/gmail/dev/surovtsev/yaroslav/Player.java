import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        int currTx = initialTx;
        int currTy = initialTy;

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.err.println("remainingTurns: " + remainingTurns);
            System.err.println("currTx: " + currTx);
            System.err.println("currTy: " + currTy);

            // A single line providing the move to be made: N NE E SE S SW W or NW
            if (currTx < lightX && currTy == lightY) {
                System.out.println("E");
                initialTx++;
            }
            if (currTx > lightX && currTy == lightY) {
                System.out.println("W");
                initialTx--;
            }
            if (currTx == lightX && currTy > lightY) {
                System.out.println("N");
                currTy--;
            }
            if (currTx == lightX && currTy < lightY) {
                System.out.println("S");
                currTy++;
            }
            if (currTx > lightX && currTy < lightY) {
                System.out.println("SW");
                currTx--;
                currTy++;
            }
            if (currTx > lightX && currTy > lightY) {
                System.out.println("NW");
                currTx--;
                currTy--;
            }
            if (currTx < lightX && currTy > lightY) {
                System.out.println("NE");
                currTx++;
                currTy--;
            }
            if (currTx < lightX && currTy < lightY) {
                System.out.println("SE");
                currTx++;
                currTy++;
            }
        }
    }
}