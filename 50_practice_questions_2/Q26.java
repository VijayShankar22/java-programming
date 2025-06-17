/*
Q:-26 MEDIUM First Unique Character in a String.
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1

Constraints:
1 <= s.length <= 105
s consists of only lowercase English letters.

 */


public class Q26 {
    public static void main(String[] args) {
        String s = "leetcode";
        int arr[] = new int[26];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(arr[ch - 'a'] == 1){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
