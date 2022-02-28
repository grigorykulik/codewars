package kyu7;

/**
 * https://www.codewars.com/kata/54557d61126a00423b000a45
 * Given 2 strings, a and b, return a string of the form: shorter+reverse(longer)+shorter.
 *
 * In other words, the shortest string has to be put as prefix and as suffix of the reverse of the longest.
 *
 * Strings a and b may be empty, but not null (In C# strings may also be null. Treat them as if they are empty.).
 * If a and b have the same length treat a as the longer producing b+reverse(a)+b
 *
 */
public class ShorterConcat {
    public static String shorterReverseLonger(String a, String b) {
        String shorter = a.length() < b.length() ? a : b;
        String longer = a.length() >= b.length() ? a : b;

        StringBuilder sb = new StringBuilder(longer).reverse();

        return sb.insert(0, shorter, 0, shorter.length())
                .append(shorter)
                .toString();
    }
}
