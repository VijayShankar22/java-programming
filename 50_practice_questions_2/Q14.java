/*
Q:-14.EASSY Valid Anagram.
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.

 */


import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        if(s.length() != t.length()){
            System.err.println("false");
            return;
        }

        char s1[] = s.toCharArray();
        char s2[] = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        if(Arrays.equals(s1,s2)){
            System.out.println("true");
        }else{
            System.err.println("false");
        }
    }
}
