/*
Insert ASCII Differences Between Characters

Given a string S, modify it by inserting the difference of ASCII values 
between every two consecutive characters.

Task:
- Between every pair of consecutive characters in the string, insert 
  the numerical difference of their ASCII values.

Input Format:
- A single line containing the string S.

Constraints:
- 2 ≤ |S| ≤ 1000

Output Format:
- Print the modified string.

Sample Input:
acb

Sample Output:
a2c-1b

Explanation:
- ASCII of 'a' = 97, ASCII of 'c' = 99 → Difference = 2 → Insert 2 between 'a' and 'c'
- ASCII of 'c' = 99, ASCII of 'b' = 98 → Difference = -1 → Insert -1 between 'c' and 'b'
- Final string → a2c-1b
*/


import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";

        for(int i = 0; i < s.length() - 1; i++){
            ans += s.charAt(i);
            ans += s.charAt(i + 1) - s.charAt(i); 
        }
        ans += s.charAt(s.length() - 1);

        System.out.println(ans);
    }
}
