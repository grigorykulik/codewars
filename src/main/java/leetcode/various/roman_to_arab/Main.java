package leetcode.various.roman_to_arab;

/**
 * https://leetcode.com/problems/roman-to-integer/description/
 * Given a roman numeral, convert it to an integer.
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("I"));
        System.out.println(solution.romanToInt("CCXXXIX"));
    }
}
