/*
Q:-9 EASSY Find First and Last Position of Element in Sorted Array.
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]

Constraints:
0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109

 */


import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        int first = -1;
        int last = -1;
        int ans[] = new int[]{first,last};
        int nums[] = {5,7,7,8,8,10};
        int target = 8;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }

        ans[0] = first;
        ans[1] = last;

        System.out.println(Arrays.toString(ans));
    }
}
