/* 
Q:-5 MEDIUM Majority Element
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:
n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
*/



public class Q5 {
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        int currentelement = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                currentelement = nums[i];
            }

            if(nums[i] == currentelement){
                count = count + 1;
            }else{
                count = count - 1;
            }
        }

        System.out.println(currentelement);
    }

        //using frequency map.

        // HashMap<Integer, Integer> freqMap = new HashMap<>();
        // int n = nums.length;

        // for (int num : nums) {
        //     freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        //     if (freqMap.get(num) > n / 2) {
        //         return num; // Return as soon as majority is found
        //     }
        // }

        // return -1;
}
