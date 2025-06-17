/*
Q:-11 HARD Valid Palindrome.
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true

Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false

Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true

Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

Constraints:
1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.

 */


public class Q11 {
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        String cleaned = "";

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                cleaned = cleaned + Character.toLowerCase(c);
            }
        }

        for(int i = 0; i < cleaned.length(); i++){
            if(cleaned.charAt(i) != cleaned.charAt(cleaned.length() - i - 1)){
                System.out.println("false");
                return;
            }
        }

            System.out.println("true");
    }
}


// using while loop

// while (left < right) {
//     if (cleaned.charAt(left) != cleaned.charAt(right)) {
//         return false;
//     }
//     left++;
//     right--;
// }

// return true;
