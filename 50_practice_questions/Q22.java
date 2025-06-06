/*
22. A soldier wants to buy w bananas in the shop. He has to pay k dollars for the first 
banana, 2k dollars for the second one and so on (in other words, he has to 
pay i·k dollars for the i-th banana). 

He has n dollars. How many dollars does he have to borrow from his friend soldier to 
buy w bananas?

Input Format: 
The first line contains three positive integers k, n, w — 
the cost of the first banana, 
the initial number of dollars the soldier has, 
and the number of bananas he wants.

Constraints: 
1 ≤ k, w ≤ 1000  
0 ≤ n ≤ 10^9

Output Format: 
Output one integer — the amount of dollars that the soldier must borrow from his friend. 
If he doesn't have to borrow money, output 0.

Sample Input 0: 
3 17 4  
Sample Output 0: 
13

Sample Input 1: 
96 10 20  
Sample Output 1: 
20150

Sample Input 2: 
96 10 200  
Sample Output 2: 
1929590

Sample Input 3: 
1 100 2  
Sample Output 3: 
0

Sample Input 4: 
1 100 20  
Sample Output 4: 
110

Explanation: 
The cost of bananas is calculated using the formula:
total_cost = k * (1 + 2 + 3 + ... + w) = k * (w * (w + 1) / 2)

The soldier must borrow:
max(0, total_cost - n)
*/

import java.util.*;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int cost = 0;

        for(int i = 1; i <= w; i++){
            cost += i*k;
        }

        if(cost < n){
            System.out.println(0);
        }else{
            System.out.println(cost - n);
        }
    }
}
