package ch.adriankrebs.katas.hackerrank;

import java.util.Scanner;

/**
 * Created by Adrian on 9/7/2016.
 */
public class StrangeCounter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int timeToGetXfor = in.nextInt();
        System.out.println();



    }

    public long getNumberForTime(long t) {

        long tMin = 1;
        long nMax = 3;

        // calc outer boundary
        while (tMin < t) {
            tMin += nMax;
            nMax *= 2;

        }
        // if the input time is the outer boundary return it
        if (t == tMin) {
            return nMax;
        }
        return tMin -t ;

    }
}
