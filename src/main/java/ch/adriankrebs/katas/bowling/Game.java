package ch.adriankrebs.katas.bowling;

/**
 * Created by Adrian on 6/26/2016.
 */
public class Game {

    private int score = 0;
    private int counter = 0;

    private Frame [] frames  = new Frame [10];
    private int framepointer = 0;


    public int getScore() {


        /*
        is called only at the very end of the game.  It returns the total score for that game.


         */


        return score;
    }


    public void roll(int pins) {

        score += pins;

    }
}
