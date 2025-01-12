/*
Capitalization is writing a word with its first letter as a 
capital letter. Your task is to capitalize the given word. 
Note, that during capitalization all the letters except the first one 
remains unchanged.

Input Format 
A single line contains a non-empty word. This word consists of 
lowercase and uppercase English letters.

Constraints 
The length of the word will not exceed 103.

Output Format 
Output the given word after capitalization.

Sample Input 0 
ApPLe

Sample Output 0 
ApPLe

Sample Input 1 
konjac

Sample Output 1 
Konjac

*/


import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String ans = word.substring(0,1).toUpperCase() + word.substring(1);

        System.out.println(ans);
    }
}
