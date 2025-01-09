/*
You have been given a String S consisting of uppercase and lowercase 
English alphabets. You need to change the case of each alphabet in 
this String. That is, all the uppercase letters should be converted to 
lowercase and all the lowercase letters should be converted to 
uppercase. You need to then print the resultant String to output.

Input Format 
The first and only line of input contains the String S 
Output Format 
Print the resultant String on a single line.

Constraints 
1≤|S|≤100 

where S denotes the length of string S. 

Sample Input
abcdE
Sample Output
ABCDe


 */

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String ans ="";

        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            if(Character.isUpperCase(ch)){
                ans = ans + Character.toLowerCase(ch);
            }else{
                ans = ans + Character.toUpperCase(ch);
            }
        }

        System.out.print(ans);
    }
}
