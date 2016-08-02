package ch.adriankrebs.leetcode;

/**
 * Created by Adrian on 8/2/2016.
 */
public class NimGame {
    public static boolean canWinNim(int n) {

        return n % 4 != 0;
    }
}



    //Time complexity is O(1), since only one check is performed. No additional space is used, so space complexity is also O(1).
