/*
Check Prime 
Take as input a number N, print "Prime" if it is prime if not Print 
"Not Prime".

Sample Input 
3 
Sample Output 
Prime

Test Cases:-

Input   |     Output 
6       |   Not Prime 
1212    |   Not Prime 
23      |    Prime 
57      |    Prime 
12345   |   Not Prime

*/


import java.util.*;

public class Q49 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n <= 1){
            System.out.println("NO");
        }

        boolean isprime = true;

        for(int i = 2; i * i <= n; i++){
            if(n%i == 0){
                isprime = false;
                break;
            }
        }

        if(isprime){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
