package cw.kyu7;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Return the number (count) of vowels in the given string.
 * We will consider a, e, i, o, u as vowels for this Kata (but not y).
 * The input string will only consist of lower case letters and/or spaces.
 * https://www.codewars.com/kata/54ff3102c1bad923760001f3
 */

// The task is to solve using stream api
public class VowelsCount {
    public static int countVowels(String s) {
        String vowels = "aeiou";

        return (int) s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> vowels.contains(String.valueOf(c)))
                .count();
    }
}
