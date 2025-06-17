/*
Q:-15 HARD Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""

Explanation: There is no common prefix among the input strings.

Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.

 */


public class Q15 {
    public static void main(String[] args) {
        String word[] = {"flower", "flow", "flight"};

        for (int i = 0; i < word[0].length(); i++) {
            char ch = word[0].charAt(i);
            for (int j = 1; j < word.length; j++) {
                if (i >= word[j].length() || word[j].charAt(i) != ch) {
                    System.out.println(word[0].substring(0, i));
                    return;
                }
            }
        }
        System.out.println(word[0]);
    }
}
