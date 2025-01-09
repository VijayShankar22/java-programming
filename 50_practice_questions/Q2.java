/*
Amy is a high school student who is passionate about coding. One day,her computer science teacher gives the class an assignment to print 
all the characters of a given string in separate lines.

Amy immediately gets to work and writes a simple program. However, she feels that her solution is too basic and wants to find a more 
efficient way to solve the problem.

Can you help Amy by writing a program that prints all the characters 
of a given string in separate lines.

Input Format 
Input contains a String. Constraints 1<=str.length<=10000 

Output Format 
Print each character in different line 

Sample Input 0
hello

sample output
h
e
l
l
o

*/



import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
            
        }
    }
}
