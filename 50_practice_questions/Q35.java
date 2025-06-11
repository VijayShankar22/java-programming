/*
Replace Characters by ASCII Rules

Given a string S, replace its characters using the following rule:

Task:
- Replace every character at an **even index** (0-based indexing) with the character having just **higher** ASCII code.
- Replace every character at an **odd index** with the character having just **lower** ASCII code.
- Print the final modified string.

Input Format:
- A single line containing the string S.

Constraints:
- 1 ≤ |S| ≤ 1000

Output Format:
- Print the transformed string after applying the described replacement rules.

Sample Input:
abcg

Sample Output:
badf

Explanation:
- Index 0 → 'a' → even → 'b'
- Index 1 → 'b' → odd → 'a'
- Index 2 → 'c' → even → 'd'
- Index 3 → 'g' → odd → 'f'
→ Final string → "badf"
*/


import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";

        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                ans += (char)(s.charAt(i) + 1);
            }else{
                ans += (char)(s.charAt(i) - 1);
            }
        }
        System.out.println(ans);
    }
}
