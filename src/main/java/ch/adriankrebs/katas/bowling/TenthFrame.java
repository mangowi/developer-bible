package ch.adriankrebs.katas.bowling;

/**
 * Created by Adrian on 6/26/2016.
 */
public class TenthFrame extends Frame {

    /*
    The tenth frame has two or three rolls.
It is different from all the other frames.

     */

    private Roll [] rolls = new Roll [2];


    @Override
    public Roll[] getRolls() {
        return rolls;
    }
}
