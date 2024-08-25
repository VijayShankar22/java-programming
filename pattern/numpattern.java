/*

input = 5
output:
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5

*/


import java.util.Scanner;

public class numpattern {
    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int rows = 1; rows<=n; rows++){
            for(int columns = 1; columns <= rows; columns++){
                System.out.print(rows + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


/*

input 5
output:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5

 */

class numpattern2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int rows = 1; rows <= n; rows++){
            for(int columns = 1; columns <= rows; columns++){
                System.out.print(columns + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
