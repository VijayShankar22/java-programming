/*
Nth Fibonacci

Take N as input. Print Nth Fibonacci Number, given that the first two 
numbers in the Fibonacci Series are 0 and 1.

Sample Input 
10 
Sample Output 
55 

Explanation 
The 0th fibonacci is 0 and 1st fibonacci is 1.

Test cases:-

Input |   Output 
14    |  377 
8     |  21 
20    |  6765 
19    |  4181 
13    |  233


*/


import java.util.*;

public class Q48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();

        if(pos == 1){
            System.out.println(0);
        }else if (pos == 2){
            System.out.println(1);
        }else{
            int a = 0;
            int b = 1;
            int c = 0;

            for(int i = 2; i <= pos; i++){
                c = a + b;
                a = b;
                b = c;
            }

            System.out.println(c);
        }

    }
}
