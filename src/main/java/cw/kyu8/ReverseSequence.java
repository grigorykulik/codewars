package cw.kyu8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/5a00e05cc374cb34d100000d
 * Build a function that returns an array of integers from n to 1 where n>0.
 * Example : n=5 --> [5,4,3,2,1]
 */
public class ReverseSequence {
    public static void main(String[] args) {
        reverse(5);
    }
    public static int[] reverse(int n){
       return IntStream.range(1, n + 1)
                .map(i -> 1 + (n - i))
                .toArray();
    }
}
