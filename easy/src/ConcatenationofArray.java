import java.util.Arrays;

/**
 * https://leetcode.com/problems/concatenation-of-array/
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * Specifically, ans is the concatenation of two nums arrays.
 * Return the array ans.
 */
public class ConcatenationofArray {
    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 4, 5};
        System.out.println(Arrays.toString(getConcatenation(test)));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[i % nums.length];
        }
        return ans;
    }
}
