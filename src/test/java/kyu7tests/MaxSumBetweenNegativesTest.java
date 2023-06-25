package kyu7tests;
import cw.kyu7.MaxSumBetweenNegatives;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MaxSumBetweenNegativesTest {
    @Test
    public void test1() {
        int[] arr = new int[]{4, -1, 6, -2, 3, 5, -7, 7};
        assertEquals(MaxSumBetweenNegatives.maxSum(arr), 8);
    }
}
