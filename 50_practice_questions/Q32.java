/*
Basic String Compression

Given a string S, write a function that compresses the string by replacing 
consecutive repeated characters with the character followed by the count 
of its occurrences.

Task:
Print the compressed string where each group of consecutive characters is 
replaced by the character followed by the number of repetitions.

Input Format:
- A single line containing the string S.

Constraints:
- 1 <= length of S <= 1000

Output Format:
- Print the compressed string.

Sample Input:
aaabbccds

Sample Output:
a3b2c2d1s1

Explanation:
- 'a' appears 3 times consecutively.
- 'b' appears 2 times consecutively.
- 'c' appears 2 times consecutively.
- 'd' and 's' appear once each.
- Hence, the compressed output is "a3b2c2d1s1".
*/




import java.util.*;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";

        int cnt = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cnt++;
            } else {
                ans += s.charAt(i - 1) + String.valueOf(cnt);
                cnt = 1;
            }
        }

        ans += s.charAt(s.length() - 1) + String.valueOf(cnt);

        System.out.println(ans);
    }
}

