/*
Minimum Length Word 1

Given a string S (that can contain multiple words), you need to find 
the word which has minimum length.

Note:
- If multiple words are of the same length, then the answer will be 
  the first minimum length word in the string.
- Words are separated by single space only.

Input Format:
- A single string S

Constraints:
- 1 <= Length of String S <= 10^5

Output Format:
- Print the minimum length word

Sample Input 0:
this is test string
Sample Output 0:
is

Sample Input 1:
cat eat rat
Sample Output 1:
cat

Sample Input 2:
health is wealth
Sample Output 2:
is

Sample Input 3:
ram and sham are brothers
Sample Output 3:
ram

Sample Input 4:
coding will help you for placement
Sample Output 4:
you

Explanation:
- Iterate through each word and keep track of the shortest one encountered first.
*/

import java.util.*;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String word[] = s.trim().split(" ");

        String minword = word[0];

        for(int i = 1; i < word.length; i++){
            if(word[i].length() < minword.length()){
                minword = word[i];
            }
        }

        System.out.println(minword);
    }
}
