/*
Maggie is a language enthusiast who loves exploring the intricacies of 
different languages. One day, while studying English, she comes across 
a coding challenge that involves printing the indices of vowels in a 
given string.

Maggie is determined to solve the challenge and begins working on the 
problem.

Help Maggie and write a program that prompts the user to input a 
string, and then scans the string for vowels while keeping track of 
the indices. Whenever you find a vowel, print the index.

Input Format 
Input contains a String str.

Constraints  
1 <= str.length() <= 10^4 

Output Format 
Return An series of integer numbers in a single line.

Sample Input 0 
aqua
Sample Output 0 
0 2 3

Explanation 0 
at index 0 we have a  
at index 2 we have 
u at index 3 we have a 


Sample Input 1 
Hello
Sample Output 1
1 4

Sample Input 2 
University
Sample Output 2 
0 2 4 7

Sample Input 3
water
Sample Output 3 
1 3

*/

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String vowels = "aeiouAEIOU";

        for(int i = 0; i < s1.length(); i++){
            if(vowels.contains(String.valueOf(s1.charAt(i)))){
                System.out.print(i + " ");
            }
        }
    }
}
