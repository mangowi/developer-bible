package ch.adriankrebs.katas.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Adrian on 6/26/2016.
 */
public class BowlingGameTest {

    private Game g;

    @Before
    public void setUp() throws Exception {
        g = new Game();

    }

    private void rollMany(int n, int pins) {

        for (int i = 0; i < n; i++) {

            g.roll(pins);
        }

    }


    @Test
    public void testGutterGame() {

        rollMany(20, 0);
        assertThat(g.getScore(), is(0));


    }

    @Test
    public void testAllOnes() {

        rollMany(20, 1);
        assertThat(g.getScore(), is(20));
    }


    @Test
    public void testOneSprae() {

        g.roll(5);
        g.roll(5); // spare // bonus is next roll
        g.roll(3); // 3 regular+ 3 bonus for spare

        rollMany(17,0);

        assertThat(g.getScore(),is(16));

    }

}