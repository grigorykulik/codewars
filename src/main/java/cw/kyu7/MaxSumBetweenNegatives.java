package cw.kyu7;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://www.codewars.com/kata/6066ae080168ff0032c4107a
 * You have a list of integers. The task is to return the maximum sum of the elements
 * located between two negative elements. No negative element should be present in the
 * sum. If there is no such sum: -1 for Python, C++, JavaScript, Java, CoffeeScript and
 * COBOL, Nothing for Haskell, None for Rust.
 *
 * Example 1
 * [4, -1, 6, -2, 3, 5, -7, 7] -> 8
 *      ^      ^         ^
 * Sum between -1 and -2 is 6, between -2 and -7 is 3 + 5 = 8. It's also not 14
 * (between -1 and -7), because this includes a negative number (-2).
 */

public class MaxSumBetweenNegatives {
    public static int maxSum(int[] arr) {
        ArrayList<int[]> subArrays = new ArrayList<>();
        ArrayList<Integer> sums = new ArrayList<>();

        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < 0 ) {
                startIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < 0) {
                        endIndex = j;
                        break;
                    }
                }
                if (endIndex > startIndex + 1) {
                    subArrays.add(Arrays.copyOfRange(arr, startIndex, endIndex + 1));
                } else if (endIndex == startIndex + 1) {
                    subArrays.add(new int[]{0});
                }
            }
            endIndex = 0;
        }

        for (int[] subarray : subArrays) {
            int sum = Arrays.stream(subarray)
                    .filter(i -> i > 0)
                    .sum();
            sums.add(sum);
        }

        if (sums.size() > 0) {
            return sums.stream().max(Integer::compareTo).get();
        }
        return -1;
    }
}
