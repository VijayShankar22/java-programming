/*
Q:-48 EASSY Add Digits
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.

Example 2:
Input: num = 0
Output: 0

*/

class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            num = digitsum(num);
        }
        return num;
    }

    private int digitsum(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        return sum;
    }
}

/*
class Solution {
    public int addDigits(int num) {
        if(num == 0) return 0; return 1 + (num-1) % 9;
    }
}
 */