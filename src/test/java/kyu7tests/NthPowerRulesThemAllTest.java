package kyu7tests;

import kyu7.NthPowerRulesThemAll;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NthPowerRulesThemAllTest {

    @Test
    public void test1() {
        int[] array = {1, 2, 3};
        assertEquals(NthPowerRulesThemAll.modifiedSum(array, 3), 30);
    }
}
