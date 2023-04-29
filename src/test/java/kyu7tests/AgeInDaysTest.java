package kyu7tests;

import kyu7.AgeInDays;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class AgeInDaysTest {

    @Test
    public void test1() {
        assertEquals(AgeInDays.getDays(2022, 03, 7), "1");
    }
}
