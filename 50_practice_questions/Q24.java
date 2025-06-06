/*
24. Take the following as input:
A number

Write a function which returns true if the number is an Armstrong number and false otherwise,
where an Armstrong number is defined as follows:

A positive integer of n digits is called an Armstrong number of order n 
(order is the number of digits) if:

abcd… = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ….

Examples:
1634 is an Armstrong number as 1634 = 1^4 + 6^4 + 3^4 + 4^4  
371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3

Input Format:
Single line input containing an integer

Constraints:
0 < N < 1000000000

Output Format:
Print boolean output for each testcase.
"true" if the given number is an Armstrong Number, else print "false".

Sample Input:
371

Sample Output:
true

Explanation:
Use functions. Write a function to check if the number is an Armstrong number or not.
Numbers are Armstrong if they equal the sum of their digits each raised to the power of the total number of digits.
*/


import java.util.*;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = n;
        int a = 0;
        int len = length(n);

        while(n > 0){
            int digit = n % 10;
            a += Math.pow(digit, len);
            n /= 10;
        }

        if(num == a){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    private static int length(int n){
        int cnt = 0;
        while(n > 0){
            cnt++;
            n /= 10;
        }
        return cnt;
    }
}
