package kyu7;

/**
 * https://www.codewars.com/kata/55908aad6620c066bc00002a
 * Check to see if a string has the same amount of 'x's and
 * 'o's. The method must return a boolean and be case insensitive.
 * The string can contain any char.
 *
 * Examples input/output:
 *
 * XO("ooxx") => true
 * XO("xooxx") => false
 * XO("ooxXm") => true
 * XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 * XO("zzoo") => false
 */
public class ExesAndOhs {
    public static boolean getXO (String str) {
        long xs = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c == 'x' || c == 'X')
                .count();

        long ohs = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c == 'o' || c == 'O')
                .count();

        return xs == ohs;
    }
}
