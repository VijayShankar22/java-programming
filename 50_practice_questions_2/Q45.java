/*
Q:-45 EASSY Maximum Product of Three Numbers
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

Example 1:
Input: nums = [1,2,3]
Output: 6

Example 2:
Input: nums = [1,2,3,4]
Output: 24

Example 3:
Input: nums = [-1,-2,-3]
Output: -6

*/

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3],nums[0] * nums[1] * nums[n - 1]);
    }
}


/* TLE

class Solution {
    public int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (i != j && j != k && i != k) {
                        int p = nums[i] * nums[j] * nums[k];
                        if (p > max) {
                            max = p;
                        }
                    }
                }
            }
        }
        return max;
    }
}

*/