/*
Array Merge

You are given two sorted arrays of integers, arr1 and arr2, and two integers m and n 
indicating the length of arr1 and arr2 respectively. Your task is to merge arr2 into arr1 
to form a single sorted array.

Task:
- Write a Java function `mergeArrays(int[] arr1, int[] arr2)` that merges arr2 into arr1 
  and returns the merged sorted array.

Function Signature:
public static int[] mergeArrays(int[] arr1, int[] arr2)

Input Format:
- Two sorted arrays of integers, arr1 and arr2.

Output Format:
- A single sorted array containing all elements from arr1 and arr2.

Constraints:
- Both input arrays are sorted in non-decreasing order.
- You must implement the function `mergeArrays(int[] arr1, int[] arr2)` to solve this problem.
- The input arrays can be merged into a new array or modified in place.
- 1 ≤ arr1.length, arr2.length ≤ 10^5

Sample Input:
arr1 = [1, 3, 5]
arr2 = [2, 4, 6]

Sample Output:
[1, 2, 3, 4, 5, 6]

Test Cases:

Test Case 1:
Input: arr1 = [1, 3, 5]
       arr2 = [2, 4, 6]
Output: [1, 2, 3, 4, 5, 6]

Test Case 2:
Input: arr1 = [1, 2, 3]
       arr2 = [4, 5, 6]
Output: [1, 2, 3, 4, 5, 6]

Test Case 3:
Input: arr1 = [1, 3, 5, 7, 9]
       arr2 = [2, 4, 6]
Output: [1, 2, 3, 4, 5, 6, 7, 9]
*/


import java.util.*;

public class Q38 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] merged = mergeArrays(arr1, arr2);

        System.out.println(Arrays.toString(merged));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] merged = new int[m + n];

        int i = 0, j = 0, k = 0;
        
        while(i < m && j < n){
            if(arr1[i] <= arr2[j]){
                merged[k++] = arr1[i++];
            }else{
                merged[k++] = arr2[j++];
            }
        }
        while(i < m){
            merged[k++] = arr1[i++];
        }
        while(j < n){
            merged[k++] = arr2[j++];
        }
        return merged;
    }
}
