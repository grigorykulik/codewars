package kyu7;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * This time no story, no theory. The examples below show you how to write function accum:
 * Examples:
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 */
public class Mumbling {
    public static String accum(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            result.append(String.valueOf(s.charAt(i)).toUpperCase(Locale.ROOT));

            for (int j = 0; j < i; j++) {
                result.append(String.valueOf(s.charAt(i)).toLowerCase(Locale.ROOT));
            }

            if (i < s.length() - 1) {
                result.append("-");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
    }
}
