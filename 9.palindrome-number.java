/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum = (sum * 10) + rem;
            temp = temp / 10;
        }

        return x == sum;

    }
}
// @lc code=end
