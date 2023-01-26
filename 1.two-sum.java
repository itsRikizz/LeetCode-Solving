import java.util.Arrays;
import java.util.HashMap;

import javax.lang.model.util.ElementScanner14;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        HashMap<Integer, Integer> map = new HashMap<>();

        // fill HM
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        // search in map

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i]; // 2
            int rem = target - nums[i]; // 9-2 == 7
            if (map.containsKey(rem)) {
                int index = map.get(rem);
                if (index == i) {
                    continue;
                }
                return new int[] { i, index };
            }
        }

        return new int[] {};

    }
}
// @lc code=end
