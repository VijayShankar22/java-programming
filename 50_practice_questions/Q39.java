/*
Array Rotation

You are given an array of integers and an integer k. Your task is to rotate the array to the right by k steps.

Task:
- Write a Java function `rotateArray(int[] nums, int k)` that rotates the array to the right by k steps
  and returns the rotated array.

Function Signature:
public static int[] rotateArray(int[] nums, int k)

Input Format:
- An array of integers, nums, of length n (1 <= n <= 10^6).
- An integer k representing the number of steps to rotate the array (0 <= k <= 10^6).

Output Format:
- An array of integers representing the rotated array.

Constraints:
- You must implement a function `rotateArray(int[] nums, int k)` to solve this problem.
- The input array may contain both positive and negative integers.

Example:
Input:
nums = [1, 3, 5, 2, 2]
k = 2
Output:
[2, 2, 1, 3, 5]

Test Cases:

Test Case 1:
Input: nums = [1, 3, 5, 2, 2]
       k = 2
Output: [2, 2, 1, 3, 5]

Test Case 2:
Input: nums = [1, 2, 3, 4, 5]
       k = 3
Output: [3, 4, 5, 1, 2]

Test Case 3:
Input: nums = [10, -5, 8, -2, 3]
       k = 1
Output: [3, 10, -5, 8, -2]

Test Case 4:
Input: nums = [-7, 1, 5, 2, -4, 3, 0]
       k = 4
Output: [2, -4, 3, 0, -7, 1, 5]

Test Case 5:
Input: nums = [2, 2, 2, 2]
       k = 2
Output: [2, 2, 2, 2]

Test Case 6:
Input: nums = [1]
       k = 1
Output: [1]
*/



import java.util.*;

public class Q39 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 2};
        int k = 2;

        int[] rotated = rotateArray(nums, k);
        System.out.println(Arrays.toString(rotated));
    }

    public static int[] rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        return nums;
    }
    
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

