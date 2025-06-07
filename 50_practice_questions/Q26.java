/*
26. Money from ATM

Pooja would like to withdraw X US dollars from an ATM. The cash machine will only accept the transaction if X is a multiple of 5,
and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges).
For each successful withdrawal, the bank charges 0.50 US dollars.
Calculate Pooja's account balance after an attempted transaction.

Input Format:
- A positive integer X: the amount Pooja wishes to withdraw.
- A non-negative number Y (with two digits of precision): Pooja's initial account balance.

Constraints:
- 0 < X <= 2000
- 0 <= Y <= 2000

Output Format:
- Output the account balance after the attempted transaction, with two digits of precision.
- If there is not enough money in the account or the amount is not a multiple of 5, output the current balance.

Sample Input 0:
30 120.00
Sample Output 0:
89.50

Explanation 0:
Transaction successful: 30 + 0.50 is deducted from 120.00

Sample Input 1:
42 120.00
Sample Output 1:
120.00

Explanation 1:
Withdrawal amount is not a multiple of 5

Sample Input 2:
300 120.00
Sample Output 2:
120.00

Explanation 2:
Insufficient funds
*/




import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();

        if(x % 5 == 0 && x + 0.5 < y){
            y = y - x + 0.5;
        }
        System.out.printf("%.2f", y);
    }
}
