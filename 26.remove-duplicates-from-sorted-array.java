import java.util.HashSet;

/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int[] dedupedArray = new int[set.size()];
        int i = 0;

        for (int element : set) {
            dedupedArray[i++] = element;
        }
        return dedupedArray;
    }
}
// @lc code=end
