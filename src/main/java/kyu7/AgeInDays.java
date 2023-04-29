package kyu7;

import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneOffset;

/**
 * https://www.codewars.com/kata/5803753aab6c2099e600000e
 *
 * Did you ever want to know how many days old are you?
 * Complete the function which returns your age in days.
 * The birthday is given in the following order: year, month, day.
 *
 * For example if today is 30 November 2015 then
 *
 * ageInDays(2015, 11, 1) returns "You are 29 days old"
 * The birthday is expected to be in the past.
 */

public class AgeInDays {
    public static String getDays(int year, int month, int day) {
        int result = (int) Duration
                .between(
                        LocalDate.of(year, month, day).atStartOfDay().toInstant(ZoneOffset.UTC),
                        LocalDate.now().atStartOfDay().atOffset(ZoneOffset.UTC)).toDays();

        return String.format("You are %d days old", result);
    }
}
