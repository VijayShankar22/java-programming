/*
Q:-39 HARD Generate Parentheses
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
Example 1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

Example 2:
Input: n = 1
Output: ["()"]
Constraints:
1 <= n <= 8

*/

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(n, 0, 0, "", result);
        return result;
    }

    public static void generate(int n, int open, int close, String ans, List<String> result) {
        if (open == n && close == n) {
            result.add(ans);
            return;
        }
        if (open < n) {
            generate(n, open + 1, close, ans + "(", result);
        }
        if (close < open) {
            generate(n, open, close + 1, ans + ")", result);
        }
    }
}