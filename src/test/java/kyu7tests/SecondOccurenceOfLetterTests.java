package kyu7tests;

import cw.kyu7.SecondOccurenceOfLetter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecondOccurenceOfLetterTests {
    @Test
    public void test1() {
        assertEquals(SecondOccurenceOfLetter.secondSymbol("Hello world", 'l'), 3);
        assertEquals(SecondOccurenceOfLetter.secondSymbol("Hello world", 'A'), -1);
    }
}
