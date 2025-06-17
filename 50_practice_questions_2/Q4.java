/*
Q:-4 MEDIUM Reverse Integer.
Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21

Constraints:
-231 <= x <= 231 – 1

*/



public class Q4 {
    public static void main(String[] args) {
        int num = -123;
        int reverse = 0;
        
        while(num != 0){
            int digit = num % 10;
            num = num / 10;

            if(reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && digit > 7)){
                System.out.println("0");
            }
            if(reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && digit < -8)){
                System.out.println("0");
            }

            reverse = reverse * 10 + digit;
        }

        System.out.println(reverse);
        
    }
}
