// print 1st 2nd and 3rd max in an array.

import java.util.*;

public class Q8 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int m1 = Integer.MIN_VALUE;
       int m2 = Integer.MIN_VALUE;
       int m3 = Integer.MIN_VALUE;

       System.out.print("Enter the size of the array: ");
       int n = sc.nextInt();
       int arr[] = new int[n];

       System.out.println("Enter the elements of the array:");
       for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
       }

       for (int i = 0; i < n; i++) {
           if (arr[i] > m1) {
               m3 = m2;
               m2 = m1;
               m1 = arr[i];
           } else if (arr[i] > m2 && arr[i] != m1) {
               m3 = m2;
               m2 = arr[i];
           } else if (arr[i] > m3 && arr[i] != m1 && arr[i] != m2) {
               m3 = arr[i];
           }
       }

       System.out.println("first max : " + m1);
       System.out.println("second max : " + m2);
       System.out.println("third max : " + m3);

       sc.close();
   }
}

