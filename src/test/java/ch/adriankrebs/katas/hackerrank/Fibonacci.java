package ch.adriankrebs.katas.hackerrank;

import java.util.Scanner;

/**
 * Created by Adrian on 9/19/2016.
 */
public class Fibonacci {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("get me the "+n+ "th element of the fibonacci sequence: "+fibonacci(n));
    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


}
