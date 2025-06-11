/*
Find First and Last Position of Element in Sorted Array 
 
Given an array of integers nums sorted in non-decreasing order, find 
the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

Example 1: 
 
Input: nums = [5,7,7,8,8,10], target = 8 
Output: [3,4]

Example 2: 
 
Input: nums = [5,7,7,8,8,10], target = 6 
Output: [-1,-1]

Example 3: 
 
Input: nums = [], target = 0 
Output: [-1,-1]


 */


import java.util.*;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = {-1, -1};

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                ans[0] = i;
                break;
            }
        }

        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] == target){
                ans[1] = i;
                break;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}

