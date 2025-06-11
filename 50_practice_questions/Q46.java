/*
Find LCM 

Take the following as input. 
A number (N1) 
A number (N2)
 
Sample Input 
4  
6 
Sample Output 
12 

Explanation 
 
The smallest number that is divisible by both N1 and N2 is called the 
LCM of N1 and N2.

 */

import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int gcd = findGCD(num1, num2);
        int lcm = (num1 * num2) / gcd;
        
        System.out.println(lcm);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
