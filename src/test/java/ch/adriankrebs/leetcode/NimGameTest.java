package ch.adriankrebs.leetcode;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Adrian on 8/2/2016.
 */
public class NimGameTest {


    @Test
    public void shouldWinThisGame() {
      int stonesOnHeap = 5;

        boolean didIWin = NimGame.canWinNim(stonesOnHeap);

        assertTrue(didIWin);
    }


    @Test
    public void shouldLoseThisGame() {
        int stonesOnHeap = 4;

        boolean didIWin = NimGame.canWinNim(stonesOnHeap);

        assertFalse(didIWin);
    }



}