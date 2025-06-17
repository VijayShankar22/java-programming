/*
Q:-3EASSY Array Reverse 
Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.

Examples:1
Input: arr[] = {1, 4, 3, 2, 6, 5}  
Output: {5, 6, 2, 3, 4, 1}
Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

Examples:1
Input: arr[] = {4, 5, 1, 2} 
Output: {2, 1, 5, 4}
Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.

*/

import java.util.*;

public class Q3 {
    public static void main(String[] args){
        int nums[] = {1,4,3,2,6,5};

        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
        
        // using for loop

        // int n = nums.length;
        // for(int i = 0; i < n / 2; i++){
        //     int temp = nums[i];
        //     nums[i] = nums[n-i-1];
        //     nums[n-i-1] = temp;
        // }

        System.out.println(Arrays.toString(nums));
    }
}
