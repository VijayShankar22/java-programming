/* write a code to print the following pattern.

input = 5
output:

    *
   **
  ***
 ****
*****

*/

import java.util.Scanner;

class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int row = 1; row <= n; row++) {
            for (int space = n - row; space > 0; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* write a code to print the following pattern.

input = 5
output:

*  *  *  *  *
       *  *  *  *
             *  *  *
                   *  *
                         *

 */

class pattern2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int rows = 0; rows < n; rows++){
            for(int columns = 0; columns < rows * 2; columns++){
                System.out.print("   ");
            }

            for(int stars = 0; stars < n - rows; stars++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}


/* write a code to print the following pattern.

input = 5
output:

 *  *  *  *  *
       *  *  *  *
             *  *  *
                   *  *
                         *
                   *  *
             *  *  *
       *  *  *  *
 *  *  *  *  *
  
 */


class pattern3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int rows = 0; rows < n; rows++){
            for(int columns = 0; columns < rows * 2; columns++){
                System.out.print("   ");
            }

            for(int stars = 0; stars < n - rows; stars++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int rows = n-2; rows >= 0; rows--){
            for(int columns = 0; columns < rows * 2; columns++){
                System.out.print("   ");
            }

            for(int stars = 0; stars < n - rows; stars++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
