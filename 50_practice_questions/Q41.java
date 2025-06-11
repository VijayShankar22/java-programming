/*
Count the Number of Possible Triangles

Problem:
You are given an array of positive integers. 
Your task is to find and count the number of possible triangles that can be formed using elements from the array.

Triangle Condition:
For three numbers to form a triangle, the sum of any two sides must be greater than the third side:
For three numbers a, b, c:
a + b > c
b + c > a
c + a > b

Approach:
1. Sort the array in ascending order.
2. Fix the largest element as 'c' (rightmost element) and use two pointers to find pairs (a, b) such that a + b > c.
3. Count all such valid pairs.

Function Signature:
public static int countPossibleTriangles(int[] nums)

Input:
- An array of positive integers, nums, of length n (3 <= n <= 1000).
- Each element in the array is a positive integer (1 <= nums[i] <= 1000).

Output:
- An integer representing the count of possible triangles.

Example:

Test Case 1:
Input: arr = {4, 6, 3, 7}
Output: 3
Explanation: {3,4,6}, {4,6,7}, {3,6,7}

Test Case 2:
Input: arr = {10, 21, 22, 100, 101, 200, 300}
Output: 6
Explanation: 6 possible triangles.

Constraints:
- The input array will contain at least three elements.
- Elements are positive integers.

*/


import java.util.*;

public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int cnt = 0;

        for (int i = n - 1; i >= 2; i--) {
            int left = 0, right = i - 1;

            while (left < right) {
                if (arr[left] + arr[right] > arr[i]) {
                    cnt += (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }
        System.out.println(cnt);
    }
}

