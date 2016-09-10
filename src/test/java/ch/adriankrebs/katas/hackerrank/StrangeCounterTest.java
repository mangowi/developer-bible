package ch.adriankrebs.katas.hackerrank;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Adrian on 9/7/2016.
 */
public class StrangeCounterTest {

    @Test
    public void shouldGetNumerForTime() {

        StrangeCounter strangeCounter = new StrangeCounter();
        long n = strangeCounter.getNumberForTime(4);

        assertThat(n,is(6L));



    }
    @Test
    public void shouldGetNumerForTime2() {

        StrangeCounter strangeCounter = new StrangeCounter();
        long n = strangeCounter.getNumberForTime(21);

        assertThat(n,is(1L));



    }



}