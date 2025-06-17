/*
Q:-7 EASSY Second Largest Element in an Array.
Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.

Note: If the second largest element does not exist, return -1.

Examples:-1
Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34

Explanation: The largest element of the array is 35 and the second largest element is 34.

Example:-2
Input: arr[] = [10, 5, 10]
Output: 5

Explanation: The largest element of the array is 10 and the second largest element is 5.

Example:-3
Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 there is no second largest element.

 */


public class Q7 {
    public static void main(String[] args) {
        int firstlargest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        int nums[] = {12,35,1,10,34,1};

        if(nums.length < 2){
            System.out.println("-1");
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > firstlargest){
                secondlargest = firstlargest;
                firstlargest = nums[i];
            }else if (nums[i] > secondlargest && nums[i] != firstlargest){
                secondlargest = nums[i];
            }
        }

        if(secondlargest == Integer.MIN_VALUE){
            System.out.println("-1");
        }else{
            System.out.println(secondlargest);
        }
    }
}
