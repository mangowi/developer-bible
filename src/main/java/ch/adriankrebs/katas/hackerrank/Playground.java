package ch.adriankrebs.katas.hackerrank;

import java.util.Scanner;

/**
 * Created by Adrian on 9/8/2016.
 */
public class Playground {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int [] a = {a0, a1, a2};
        int [] b = {b0, b1, b2};
        int scoreA; int scoreB;
        scoreA = scoreB = 0;

        for(int i= 0;i<3;i++) {
            if(a[i] < b[i]) scoreB++;
            else if(a[i] > b[i] ) scoreA++;
        }
        System.out.println(scoreA +" "+ scoreB);
    }

}
