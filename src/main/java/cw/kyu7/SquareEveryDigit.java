package cw.kyu7;

import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/546e2562b03326a88e000020
 * Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
 * Note: The function accepts an integer and returns an integer
 */
public class SquareEveryDigit {
    public static int squareDigits(int n) {

        return Integer.parseInt(
        String.valueOf(n).chars()
                .mapToObj(c -> (char) c)
                .mapToInt(c -> Integer.parseInt(String.valueOf(c)))
                .map(i -> (int) Math.pow(i, 2))
                .mapToObj(s -> String.valueOf(s))
                .collect(Collectors.joining(""))
        );
    }
}
