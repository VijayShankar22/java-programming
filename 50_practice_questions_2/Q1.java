/*
Q:-1 EASSY Given an integer array nums of size n, find the maximum and minimum elements in the array and return them as a pair.

Write a function findMinMax that takes in an integer array nums and returns a pair of integers containing the maximum and minimum elements.
You can assume that nums will always have at least one element.

Input:-An integer array nums of size n (1 ≤ n ≤ 10^4) where each element is an integer (-10^9 ≤ nums[i] ≤ 10^9).

Output:-Return an integer array containing two elements: the maximum element followed by the minimum element from nums.

Example 1:

Input: nums = [4, 2, 5, 1, 6, 3]
Output: [6, 1]

Explanation: The maximum element is 6, and the minimum element is 1.

Example 2:
Input: nums = [1, 5, 7, 2, 9, 3]
Output: [9, 1]

Explanation: The maximum element is 9, and the minimum element is 1.

*/


public class Q1 {
    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5,6};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
