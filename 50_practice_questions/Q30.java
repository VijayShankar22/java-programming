/*
T-primes

We know that prime numbers are positive integers that have exactly 
two distinct positive divisors. Similarly, we'll call a positive 
integer 't' a T-prime, if t has exactly three distinct positive 
divisors.

You are given an array of n positive integers. For each of them 
determine whether it is a T-prime or not.

Input Format:
- The first line contains a single positive integer, n, showing how 
  many numbers are in the array.
- The next line contains n space-separated integers xi.

Constraints:
- 1 ≤ n ≤ 10^5
- 1 ≤ xi ≤ 10^12

Output Format:
- Print n lines: the i-th line should contain "YES" (without the 
  quotes), if number xi is a T-prime, and "NO" (without the quotes), 
  if it isn't.

Sample Input 0:
3
4 5 6

Sample Output 0:
YES
NO
NO

Explanation:
- The given test has three numbers. 
- 4 has exactly three divisors — 1, 2 and 4 → T-prime → YES
- 5 has two divisors (1 and 5) → NOT T-prime → NO
- 6 has four divisors (1, 2, 3, 6) → NOT T-prime → NO

Hint:
- A number is a T-prime if and only if it is a **perfect square of a prime number**.
*/

import java.util.*;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 0){
            int num = sc.nextInt();
            int cnt = 0;

            for(int i = 1; i <= num; i++){
                if(num % i == 0){
                    cnt ++;
                }
            }
            if(cnt == 3){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            cnt = 0;
            n --;
        }
    }
}
