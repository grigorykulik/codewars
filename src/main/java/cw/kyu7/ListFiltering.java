package cw.kyu7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/53dbd5315a3c69eed20002dd
 * In this kata you will create a function that takes a list
 * of non-negative integers and strings and returns a new list with the strings filtered out.
 *
 * Example
 * Kata.filterList(Arrays.asList(1, 2, "a", "b")) => Arrays.asList(1,2)
 * Kata.filterList(Arrays.asList(1, 2, "a", "b", 0, 15)) => Arrays.asList(1,2,0,15)
 * Kata.filterList(Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231)) => Arrays.asList(1, 2, 231)
 */
public class ListFiltering {
    public static List filterList(final List list) {
        List<Integer> l = new ArrayList();

        for (Object o : list) {
            if (o instanceof String) {
                continue;
            } else {
                l.add(Integer.valueOf(o.toString()));
            }
        }

        return l;
    }
}
