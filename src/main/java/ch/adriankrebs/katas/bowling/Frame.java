package ch.adriankrebs.katas.bowling;

/**
 * Created by Adrian on 6/26/2016.
 */
public class Frame {


    private Roll [] rolls = new Roll [1];


    private int score;


    public Roll[] getRolls() {
        return rolls;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
