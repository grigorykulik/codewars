package kyu7tests;

import cw.kyu7.ShorterConcat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShorterConcatTest {

    @Test
    public void test1() {
        assertEquals("abcdetsrifabcde",ShorterConcat.shorterReverseLonger("first", "abcde"));
        assertEquals("bauollehbau",ShorterConcat.shorterReverseLonger("hello", "bau"));
        assertEquals("fghiedcbafghi",ShorterConcat.shorterReverseLonger("abcde", "fghi"));
    }
}
