/*
First Non-Repeating Character in a String

Given a string, find the first non-repeating character in it.

Task:
For each test case, find and print the first character in the string 
that does not repeat. If all characters repeat, print -1.

Input Format:
- The first line contains an integer T — the number of test cases.
- For each test case:
  - The first line contains an integer N — the length of the string.
  - The next line contains the string S.

Constraints:
- 1 ≤ Length of S < 100000

Output Format:
- For each test case, print the first non-repeating character of the string.
- If there is no non-repeating character, print -1.

Sample Input:
4
codingblocks
abbac
java
ccdd

Sample Output:
d
c
j
-1

Explanation:
- "codingblocks" → first non-repeating is 'd'
- "abbac" → first non-repeating is 'c'
- "java" → first non-repeating is 'j'
- "ccdd" → all characters are repeated → output -1
*/


import java.util.*;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();

        while(t > 0){
            String s = sc.next();
            int freq[] = new int[256];

            for(int i = 0; i < s.length(); i++){
                freq[s.charAt(i)]++;
            }

            boolean fnd = false;

            for(int i = 0; i < s.length(); i++){
                if(freq[s.charAt(i)] == 1){
                    System.out.println(s.charAt(i));
                    fnd = true;
                    break;
                }
            }
            t--;
            
            if(!fnd){
                System.out.println(-1);
            }
        }
    }
}
