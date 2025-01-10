/*
Given a small case character ch and an String containing only the small 
case alphabets, you have to print the index if the character ch is 
present in the String. If no such character found print -1.

Sample Input 0
c 
abcde 
Sample Output 0 
2

*/

import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String s = sc.next();
        boolean found = false;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ch){
                System.err.println(i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println(-1);
        }
    }
}
