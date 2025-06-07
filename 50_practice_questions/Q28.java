/*
Sort 0 1 1

You are given an integer array A that contains only integers 0 and 1.
Write a function to sort this array. Find a solution which scans the
array only once. Don't use extra array. You need to change in the
given array itself. So no need to return or print anything.

Input Format:
- Line 1 : Integer N (Array Size)
- Line 2 : Array elements (separated by space)

Constraints:
- 1 <= N <= 10^6

Output Format:
- Sorted array elements

Sample Input 0:
7
0 1 1 0 1 0 1
Sample Output 0:
0 0 0 1 1 1 1

Sample Input 1:
6
0 1 0 1 0 1
Sample Output 1:
0 0 0 1 1 1

Sample Input 2:
8
0 1 1 1 0 1 0 1
Sample Output 2:
0 0 0 1 1 1 1 1

Sample Input 3:
10
0 1 1 0 1 0 1 1 0 0
Sample Output 3:
0 0 0 0 0 1 1 1 1 1

Sample Input 4:
9
0 1 1 0 1 0 1 0 0
Sample Output 4:
0 0 0 0 0 1 1 1 1

Explanation:
- Sort the array containing only 0s and 1s in a single scan without using extra space.
*/

import java.util.*;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        int left = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
        }

        for(int i = 0; i < nums.length; i++){
            System.err.print(nums[i] + " ");
        }
    }
}
