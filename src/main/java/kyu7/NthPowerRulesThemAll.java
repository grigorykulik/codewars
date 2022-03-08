package kyu7;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/58aed2cafab8faca1d000e20
 * You are provided with an array of positive integers and an additional integer n (n > 1).
 * Calculate the sum of each value in the array to the nth power. Then subtract the sum of the original array.
 *
 * Examples
 * {1, 2, 3}, 3  -->  (1^3 + 2^3 + 3^3 ) - (1 + 2 + 3)  -->  36 - 6  -->  30
 * {1, 2}, 5     -->  (1^5 + 2^5) - (1 + 2)             -->  33 - 3  -->  30
 */

public class NthPowerRulesThemAll {
    public static int modifiedSum(int[] array, int power) {

        return (int) Arrays.stream(array)
                .mapToDouble(e -> Math.pow((double)e, power))
                .sum() - Arrays.stream(array)
                        .sum();
    }
}
