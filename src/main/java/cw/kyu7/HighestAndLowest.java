package cw.kyu7;

import java.util.Arrays;

/**
 * In this little assignment you are given a string of space separated numbers,
 * and have to return the highest and lowest number.
 *
 * Examples
 * highAndLow("1 2 3 4 5")  // return "5 1"
 * highAndLow("1 2 -3 4 5") // return "5 -3"
 * highAndLow("1 9 3 4 -5") // return "9 -5"
 * Notes
 * All numbers are valid Int32, no need to validate them.
 * There will always be at least one number in the input string.
 * Output string must be two numbers separated by a single space, and highest number is first.
 */

public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        return
                Arrays.stream(numbers.split(" "))
                        .map(Integer::valueOf)
                        .max(Integer::compareTo).get() + " " +
                        Arrays.stream(numbers.split(" "))
                        .map(Integer::valueOf)
                        .min(Integer::compareTo).get();
    }

    public static String cleverSolution(String numbers) {
            var stats = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
            return stats.getMax() + " " + stats.getMin();
    }

}
