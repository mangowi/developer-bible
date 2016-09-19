package ch.adriankrebs.katas.hackerrank;

import java.util.Scanner;

/**
 * Created by Adrian on 9/19/2016.
 */
public class Factorial {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        return n > 1 ? n * factorial(n - 1) : 1;
    }


}
