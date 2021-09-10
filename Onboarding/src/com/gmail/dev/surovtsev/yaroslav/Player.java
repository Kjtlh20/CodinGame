import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String enemy1 = in.next();
            int dist1 = in.nextInt();
            String enemy2 = in.next();
            int dist2 = in.nextInt();

            int minDist = dist1;
            String target = enemy1;
            if (dist2 < minDist) {
                target = enemy2;
            }

            System.out.println(target);
        }
    }
}