package kyu7tests;

import kyu7.VowelsCount;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class VowelsCountTest {

    @Test
    public void test1() {
        assertEquals(VowelsCount.countVowels("abracadabra"), 5);
    }

}
