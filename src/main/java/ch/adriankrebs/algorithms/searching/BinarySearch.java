package ch.adriankrebs.algorithms.searching;

import java.util.Arrays;

/**
 * Created by Adrian on 7/23/2016.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1,2,3};
        int key = 2;
        int index = Arrays.binarySearch(array, key); //returns index of the search key
        System.out.println(index);
    }
}
