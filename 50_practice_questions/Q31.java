/*
Split Camel Case String into Words

One of the important aspects of object-oriented programming is  
readability of the code. To enhance readability, developers often 
use Camel Case for function and variable names.

You are given a string S written in Camel Case.

Task:
Extract and print all the words present in the Camel Case string in the 
order they appear.

Input Format:
- A single line containing the Camel Case string S.

Constraints:
- Length of S (|S|) <= 1000

Output Format:
- Print each word present in the string on a new line, preserving the order.

Sample Input:
IAmACompetitiveProgrammer

Sample Output:
I
Am
A
Competitive
Programmer

Explanation:
The input string contains 5 words concatenated in Camel Case style.
*/

import java.util.*;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch) && ans.length() > 0){
                System.out.println(ans);
                ans = "";
            }
            ans += ch;
        }
        System.out.println(ans);
    }
}
