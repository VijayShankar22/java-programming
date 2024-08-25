/*

input = 5
output:
0 
1 0 
0 1 0 
1 0 1 0 
0 1 0 1 0

*/


import java.util.Scanner;

public class binarypattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int rows = 1; rows <= n; rows++){
            for(int columns = 1; columns <= rows; columns++){
                if((rows+columns) % 2 == 0){
                    System.out.print("0 ");
                }else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
