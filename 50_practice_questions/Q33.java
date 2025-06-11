/*
Longest Good String

A *Good String* is defined as a string that contains only vowels (a, e, i, o, u).

Task:
Given a string S, find and print a single positive integer N, where N is the 
length of the longest contiguous substring of S that is a Good String.

Note:
- The time limit for this problem is 1 second. You should compute the solution efficiently 
  without generating all possible substrings.

Input Format:
- A single line containing the string S.

Constraints:
- 1 <= Length of S < 10^5

Output Format:
- A single positive integer N, representing the length of the longest Good String in S.

Sample Input:
cbaeicdecbaeicde

Sample Output:
3

Explanation:
The longest Good String in the input is "aei", which has a length of 3.
*/


import java.util.*;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int ans = 0;
        int cnt = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                cnt++;
                ans = Math.max(ans, cnt);
            }else{
                cnt = 0;
            }
        }
        System.out.println(ans);
    }
}
