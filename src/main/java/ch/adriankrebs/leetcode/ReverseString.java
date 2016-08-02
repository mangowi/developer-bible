package ch.adriankrebs.leetcode;

/**
 * Created by Adrian on 8/2/2016.
 */
public class ReverseString {


    public static String reverseString(String stringToReverse) {

        StringBuilder stringBuilder = new StringBuilder(stringToReverse);

        return stringBuilder.reverse().toString();

    }
}
