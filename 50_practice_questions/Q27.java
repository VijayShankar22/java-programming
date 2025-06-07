/*
Total Expenses 1

While purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 1000.
If the quantity and price per item are input, write a program to calculate the total expenses.

Input Format:
- The first input contains an integer: quantity
- The second input contains an integer: price per item

Constraints:
- 1 ≤ quantity, price ≤ 100000

Output Format:
- Output the total expenses while purchasing items.

Sample Input 0:
100 120
Sample Output 0:
12000

Sample Input 1:
10 20
Sample Output 1:
200

Sample Input 2:
1200 20
Sample Output 2:
21600

Sample Input 3:
120 400
Sample Output 3:
48000

Sample Input 4:
1500 30
Sample Output 4:
40500

Explanation:
- If quantity > 1000, apply a 10% discount on total price.
- Total price = quantity * price
- Discounted price = total - (10% of total)
*/



import java.util.*;

public class Q27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        int price = sc.nextInt();

        int withoutdiscount = price * quantity;

        if(quantity > 1000){
            int discount = (withoutdiscount * 10) / 100;
            System.out.println(withoutdiscount - discount);
        }else{
            System.out.println(withoutdiscount);
        }
    }
}
