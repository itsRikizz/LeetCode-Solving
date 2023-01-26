/*
 * @lc app=leetcode id=905 lang=java
 *
 * [905] Sort Array By Parity
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int[] temp1 = new int[nums.length];
        int[] temp2 = new int[nums.length];
        int t1 = 0;
        int t2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                temp1[t1++] = nums[i];
            } else {
                temp2[t2++] = nums[i];
            }
        }

    }
}
// @lc code=end
