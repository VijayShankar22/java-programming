/*
Maximum Frequency Character

Given a string S, find the character that appears most frequently in it.

Task:
- Write a function that returns the character with the highest frequency.
- If there are multiple characters with the same frequency, return the one 
  that appears first in the string.

Input Format:
- A single line containing the string S.

Constraints:
- 1 ≤ |S| ≤ 1000

Output Format:
- Print the character with the maximum frequency.

Sample Input:
aaabacb

Sample Output:
a

Explanation:
- In the given input string, 'a' appears 4 times, which is more than any 
  other character.
*/



import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int freq[] = new int[256];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)]++;
        }

        for(int i = 0; i < s.length(); i++){
            int currmax = freq[s.charAt(i)];
            max = Math.max(max, currmax);
        }
        for(int i = 0; i < s.length(); i++){
            if(freq[s.charAt(i)] == max){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
