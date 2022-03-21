package kyu6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/523f5d21c841566fde000009
 * Your goal in this kata is to implement a difference function,
 * which subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present
 * in list b keeping their order.
 * Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
 * If a value is present in b, all of its occurrences must be removed from the other:
 * Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> arrayB = Arrays.stream(b)
                .boxed()
                .collect(Collectors.toList());

        return Arrays.stream(a)
                .boxed()
                .filter(i -> !(arrayB.contains(i)))
                .collect(Collectors.toList())
                .stream()
                .mapToInt(e -> e)
                .toArray();
    }

    public static int[] cleverSolution(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream().mapToInt(e -> e).toArray();
    }
}
