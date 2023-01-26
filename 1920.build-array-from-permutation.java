/*
 * @lc app=leetcode id=1920 lang=java
 *
 * [1920] Build Array from Permutation
 */

// @lc code=start
class Solution {
    public int[] buildArray(int[] nums) {
        // int[] ans = new int[nums.length];
        // for(int i=0;i<ans.length;i++){
        // ans[i]=nums[nums[i]];
        // }
        // return ans;

        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = n * (nums[nums[i]] % n) + nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }
        return nums;

    }
}
// @lc code=end
