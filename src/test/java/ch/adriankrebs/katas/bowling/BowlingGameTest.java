package ch.adriankrebs.katas.bowling;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Adrian on 6/26/2016.
 */
public class BowlingGameTest {
    @Test
    public void testGutterGame()
            throws Exception {
        Game g = new Game();

        for (int i = 0; i < 20; i++) {
            g.roll(0);
            assertThat(g.score(), is(0));
        }


    }
    @Test
    public void testAllOnes()
            throws Exception {
        Game g = new Game();

        for (int i = 0; i < 20; i++) {
            g.roll(i);
            assertThat(g.score(), is(20));
        }


    }




}