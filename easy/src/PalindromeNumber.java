/**
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 * For example, 121 is palindrome while 123 is not.
 * https://leetcode.com/problems/palindrome-number/submissions/
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    static boolean isPalindrome(int x) {
        StringBuilder builder = new StringBuilder(String.valueOf(x));
        return builder.toString().equals(builder.reverse().toString());
    }
}
