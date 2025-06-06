/*
Take the following as input:
A number (N1)
A number (N2)

Write a function which prints the first N1 terms of the series 3n + 2
which are not multiples of N2.

Input Format:
Two integers N1 and N2

Constraints:
0 < N1 < 100  
0 < N2 < 100

Output Format:
First N1 terms of the series 3n + 2 which are not divisible by N2, each on a new line.

Sample Input:
10  
4

Sample Output:
5  
11  
14  
17  
23  
26  
29  
35  
38  
41

Explanation:
Generate the sequence 3n + 2 for n = 1, 2, 3... and skip any number that is divisible by N2.
Print the first N1 numbers that meet the condition.
*/


import java.util.*;

public class Q21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int count = 0;
        int i = 1;

        while (count < n1) {
            int num = 3 * i + 2;
            if (num % n2 != 0) {
                System.out.println(num);
                count++;
            }
            i++;
        }
    }
}
