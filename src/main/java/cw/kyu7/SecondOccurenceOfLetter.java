package cw.kyu7;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/63f96036b15a210058300ca9
 * In this kata, you need to write a function that takes a string
 * and a letter as input and then returns the index of the second
 * occurrence of that letter in the string. If there is no such letter
 * in the string, then the function should return -1. If the letter
 * occurs only once in the string, then -1 should also be returned.
 */
public class SecondOccurenceOfLetter {
    public static int secondSymbol(String str, char c) {
        return str.indexOf(c, str.indexOf(c) + 1);
    }
}
