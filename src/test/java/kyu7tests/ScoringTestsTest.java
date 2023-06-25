package kyu7tests;

import cw.kyu7.ScoringTests;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoringTestsTest {

    @Test
    public void test1() {
        int[] arr = {0, 0, 0, 0, 2, 1, 0};
        int r = 2;
        int o = 0;
        int w = 1;

        assertEquals(9, ScoringTests.getScore(arr, r, o, w));
    }

    @Test
    public void test2() {
        int[] arr = {0, 1, 0, 0, 2, 1, 0, 2, 2, 1};
        int r = 3;
        int o = -1;
        int w = 2;

        assertEquals(3, ScoringTests.getScore(arr, r, o, w));
    }
}
