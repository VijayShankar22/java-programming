/* 
Samantha was a college student majoring in English literature. One 
day, her professor assigned the class a writing exercise where they 
had to write a short story. Samantha was excited about the challenge, 
but she wasn't sure how to keep track of the word count as she wrote. 

Can you create a program that can count the number of words present in 
Samantha's short story?

Input Format 
Input contains a String str.

Constraints 
1<=Str.length()<=100000

Output Format 
Return An integer value.

Sample Input 0 
Welcome to GLA 
Sample Output 0 
3 
Explanation 0 
3 words are present in string i.e welcome, to, GLA.

*/

import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String words[] = str.trim().split("\\s+");
        System.out.println(words.length);
    }
}
