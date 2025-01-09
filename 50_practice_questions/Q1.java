/*
Q1. Take an input n which is size of array then n more inputs the values 
in array then find the square of special elements. 
An element nums[i] of nums is called special if i divides n, i.e. n % 
i == 0. 
Return the sum of the squares of all special elements of nums. 
  
Example 1: 
Input:  
4 
1 2 3 4 
 
Output: 21
*/

import java.util.*;

public class Q1 {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) { 
            nums[i] = sc.nextInt(); 
        }

        int ans = 0; 
        for (int i = 0; i < nums.length; i++) { 
            if (nums.length % (i + 1) == 0) {
                ans += (nums[i] * nums[i]); 
            }
        }
        
        System.out.println(ans); 
    }  
}

