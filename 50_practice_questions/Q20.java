/*
Given a integer as a input and replace all the '0' with '5' in the 
integer

Input Format 
Enter an integer n 

Constraints 
0<=n<=1000000000000

Output Format 
All zeroes are replaced with 5

Sample Input 
102 
Sample Output 
152

Explanation 
Check each digit , if it is nonzero, then no change required but if 
it is zero then replace it by 5.

*/


import java.util.*;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String st = Integer.toString(n);

        st = st.replace('0','5');
        int ans = Integer.parseInt(st);
        System.out.println(ans);
    }
}