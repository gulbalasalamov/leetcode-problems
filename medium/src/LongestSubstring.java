
import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */

public class LongestSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb";
        String s2 = "";
        String s3 = "pwwkew";
        String s4 = "bbbbb";
        String s5 = " ";
        System.out.println(lengthOfLongestSubstring(s4));

    }

    public static int lengthOfLongestSubstring(String s) {
        int counter = 0;
        int max = Integer.MIN_VALUE;
        Map<Integer, Character> map = new HashMap<>(); // index, value

        if (!s.isEmpty()) {
            for (int i = 0; i < s.length() - 1; i++) {
                char first = s.charAt(i);
                char next = s.charAt(i + 1);
                if (!map.containsValue(next)) {
                    if (first != next) {
                        map.put(i, s.charAt(i));
                        ++counter;
                        if (counter > max) {
                            max = counter;
                        }
                    } else {
                        counter = 1;
                        max = counter;
                    }
                }
            }
        } else {
            max = 0;
        }
        return max;
    }
}
