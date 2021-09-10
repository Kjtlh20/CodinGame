import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt();
        int lightY = in.nextInt();
        int initialTx = in.nextInt();
        int initialTy = in.nextInt();

        int currTx = initialTx;
        int currTy = initialTy;
        String dir = "";

        while (true) {
            int remainingTurns = in.nextInt();

            if (currTx < lightX && currTy == lightY) {
                dir = "E";
                initialTx++;
            }
            if (currTx > lightX && currTy == lightY) {
                dir = "W";
                initialTx--;
            }
            if (currTx == lightX && currTy > lightY) {
                dir = "N";
                currTy--;
            }
            if (currTx == lightX && currTy < lightY) {
                dir = "S";
                currTy++;
            }
            if (currTx > lightX && currTy < lightY) {
                dir = "SW";
                currTx--;
                currTy++;
            }
            if (currTx > lightX && currTy > lightY) {
                dir = "NW";
                currTx--;
                currTy--;
            }
            if (currTx < lightX && currTy > lightY) {
                dir = "NE";
                currTx++;
                currTy--;
            }
            if (currTx < lightX && currTy < lightY) {
                dir = "SE";
                currTx++;
                currTy++;
            }

            System.out.println(dir);
        }
    }
}