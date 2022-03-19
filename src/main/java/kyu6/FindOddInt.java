package kyu6;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

/**
 * https://www.codewars.com/kata/54da5a58ea159efa38000836
 * Given an array of integers, find the one that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times.
 *
 * Examples
 * [7] should return 7, because it occurs 1 time (which is odd).
 * [0] should return 0, because it occurs 1 time (which is odd).
 * [1,1,2] should return 2, because it occurs 1 time (which is odd).
 * [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
 * [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 */

public class FindOddInt {
    public static int findIt(int[] a) {
        if (a.length == 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();

        stream(a)
                        .distinct()
                                .forEach(number -> map.put(number, 0));

        map.entrySet()
                .stream()
                .forEach(entry -> {
                    map.put(entry.getKey(), (int) stream(a)
                            .filter(e -> (e == entry.getKey()))
                            .count());
                });

        return
        map.entrySet()
                .stream()
                .filter(entry -> !(entry.getValue() % 2 == 0))
                .collect(Collectors.toList())
                .get(0).getKey();
    }

    public static int cleverSolution(int[] arr) {
        return stream(arr).reduce(0, (x, y) -> x ^ y);
    }
}
