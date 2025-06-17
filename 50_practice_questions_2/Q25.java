/*
Q:-25 MEDIUM  Reverse Vowels of a String.
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"

Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:
Input: s = "leetcode"
Output: "leotcede"

Constraints:
1 <= s.length <= 3 * 105
s consist of printable ASCII characters.

 */


public class Q25 {
    public static void main(String[] args) {
        String s = "IceCreAm";
        int left = 0;
        int right = s.length() - 1;
        char[] string = s.toCharArray();
        String vowel = "aeiouAEIOU";

        while (left < right) {
            while (left < right && vowel.indexOf(string[left]) == -1) {
                left = left + 1;
            }
            while (left < right && vowel.indexOf(string[right]) == -1) {
                right = right - 1;
            }

            char temp = string[left];
            string[left] = string[right];
            string[right] = temp;

            left = left + 1;
            right = right - 1;
        }

        System.out.println(string);
    }
}
