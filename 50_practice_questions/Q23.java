
import java.util.Scanner;

/*
Due to an immense rise in Pollution, Delhi Government is back with 
the Odd and Even Rule in Delhi. The scheme is as follows:

Each car will be allowed to run on Sunday if:
- The **sum of even digits** of the car number is divisible by 4
   OR
- The **sum of odd digits** of the car number is divisible by 3.

You need to help Delhi Police by finding out if a car numbered N will be allowed 
to run on Sunday.

Input Format: 
- The first line contains an integer N, the number of cars.
- The next N lines contain one integer each, the car number.

Constraints:
- N <= 1000
- 0 <= Car Number <= 1000000000

Output Format:
- For each car, output "Yes" if it is allowed on Sunday, otherwise print "No".

Sample Input:
2
12345
12134

Sample Output:
Yes
No

Explanation:
- For 12345: sum of odd digits = 1+3+5 = 9 (divisible by 3) ⇒ Yes
- For 12134: sum of odd digits = 1+1+3 = 5 (not divisible by 3), even digits sum = 2+4 = 6 (not divisible by 4) ⇒ No
*/



public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int carnum = sc.nextInt();
            int evensum = 0;
            int oddsum = 0;

            while(carnum > 0){
                int digit = carnum % 10;
                if(digit % 2 == 0){
                    evensum += digit;
                }else{
                    oddsum += digit;
                }
                carnum /= 10;
            }

            if((evensum % 4 == 0) || (oddsum % 3 == 0)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
