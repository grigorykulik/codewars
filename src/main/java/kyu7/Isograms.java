package kyu7;

import java.util.Locale;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/54ba84be607a92aa900000f1
 * An isogram is a word that has no repeating letters,
 * consecutive or non-consecutive. Implement a function
 * that determines whether a string that contains only
 * letters is an isogram. Assume the empty string is an
 * isogram. Ignore letter case.
 *
 * Example: (Input --> Output)
 *
 * "Dermatoglyphics" --> true
 * "aba" --> false
 * "moOse" --> false (ignore letter case)
 */

public class Isograms {
    public static boolean isIsogram(String str) {
        return str.toLowerCase(Locale.ROOT).equals(
                str.chars()
                        .mapToObj(c -> (char) c)
                        .map(String::valueOf)
                        .map(String::toLowerCase)
                        .distinct()
                        .collect(Collectors.joining())
        );


    }

    public static void main(String[] args) {
        System.out.println(isIsogram("moOse"));
    }
}
