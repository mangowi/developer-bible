package ch.adriankrebs.leetcode;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Adrian on 8/2/2016.
 */
public class ReverseStringTest {


    @Test
    public void shouldGetReversedString() {

        String tester = ReverseString.reverseString("Hello World");

        assertEquals("dlroW olleH",tester);
    }

}