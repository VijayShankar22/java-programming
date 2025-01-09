/*
Once there was a girl named Sarah who loved to write poetry. She had a 
habit of writing down her thoughts in a notebook whenever she felt 
inspired. One day, while she was working on a new piece, she accidentally 
spilled her coffee on the notebook. 
Desperate to salvage her work, she decided to copy the poem onto a new 
page. 

However, when she finished rewriting it, she noticed that there were a 
few discrepancies between the original version and the new one. She 
wondered if she had missed anything while transcribing the poem. 
Help Sarah and write a program that checks if two strings are 
identical or not. 

Input Format 
First line contains string s1. 
Second line contains string s2. 

Constraints 
1 <= string1.length() <= 100000
 
Output Format 
Return A boolean value 

Sample Input 0 
COLLEGE 
COLLEGE 

Sample Output 0 
true

*/

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if(s1.equals(s2)){
            System.out.print("True");
        }else{
            System.out.print("False");
        }

    }
}