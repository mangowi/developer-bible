package ch.adriankrebs.katas.hackerrank;

import java.util.Scanner;

/**
 * Created by Adrian on 9/7/2016.
 */
public class DataTypes {


    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

                 /* Declare second integer, double, and String variables. */
        int secondInt;
        double secondDouble;
        String secondString = "";

        /* Read and save an integer, double, and String to your variables.*/

        secondInt = Integer.parseInt(scan.nextLine());

        secondDouble = Double.parseDouble(scan.nextLine());

        secondString = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + secondInt);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + secondDouble);
        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first. */
        System.out.println(s + secondString);

        scan.close();
    }
}