/*
You have been given a String S. You need to find and print whether 
this string is a palindrome or not. If yes, print "YES" (without 
quotes), else print "NO" (without quotes). Input Format 
The first and only line of input contains the String S. The String 
shall consist of lowercase English alphabets only. 

Output Format 
Print the required answer on a single line.

Constraints 
1≤|S|≤100 
Note:-String S consists of lowercase English Alphabets only.

Sample Input 
aba 
Sample Output 
YES

Sample Input 
ababababa
Sample Output
YES 

Sample Input
racecar
Sample Output
YES 

Sample Input
hellolleh
Sample Output
YES

Sample Input
acdcdcdaba
Sample Output
NO


*/
import java.util.*;

public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();

        for(int i = 0; i < s1.length()/2; i++){
            if(s1.charAt(i) != s1.charAt(s1.length() - 1 - i)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }
}
