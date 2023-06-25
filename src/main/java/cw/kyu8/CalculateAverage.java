package cw.kyu8;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/57a2013acf1fa5bfc4000921/train/java
 * Write a function which calculates the average of the numbers in a given list.
 * Note: Empty arrays should return 0.
 */
public class CalculateAverage {
    public static double find_average(int[] array){
        return Arrays.stream(array).mapToDouble(i -> (double) i).sum() / array.length;
    }
}
