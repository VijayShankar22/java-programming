/*
Take N as input, Calculate it's reverse also Print the reverse.
 
Sample Input 
123456789 

Sample Output
987654321

*/


import java.util.*;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        String reversed = "";

        for(int i = s.length() -1 ; i >= 0; i--){
            reversed = reversed + s.charAt(i);
        }

        int ans = Integer.parseInt(reversed);
        System.out.println(ans);

    }
}
