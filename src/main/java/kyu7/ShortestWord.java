package kyu7;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9
 * Simple, given a string of words, return the length of the shortest word(s).
 * String will never be empty and you do not need to account for different data types.
 */
public class ShortestWord {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" "))
                .mapToInt(st -> st.length())
                .min()
                .getAsInt();
    }
}
