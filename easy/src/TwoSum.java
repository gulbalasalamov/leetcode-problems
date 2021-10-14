import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * https://leetcode.com/problems/two-sum/
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 */

public class TwoSum {
    public static void main(String[] args) {

    }
    /**
     * @param {number[]}nums
     * @param {number}target
     * @return {number[]}
     */
    public int[] twoSum(int[] nums, int target) {
        // Array to store result - index1, index
        int[] res = new int[2];
        //Map to store the difference and corresponding index
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // If we have seen the current element before, it means we've already encountered the other number pair
            if (map.containsKey(nums[i])) {
                res[0] = i;
                res[1] = map.get(nums[i]);
            } else {
                // diff + nums[i] = target
                //Save the diff of target and current element with the index of current element
                int diff = target - nums[i];
                int index = i;
                map.put(diff, index);
            }
        }
        return res;
    }
}