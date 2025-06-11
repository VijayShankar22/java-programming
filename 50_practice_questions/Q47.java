/*
You are given two positive integers, A and B. Your task is to find 
their Highest Common Factor (HCF),also known as the Greatest Common Divisor (GCD).

The HCF of two numbers is the largest positive integer that divides 
both A and B without leaving a remainder.

Write a Java program that takes two integers as input and calculates 
their HCF.

Input: 
Two positive integers A and B where (1 <= A, B <= 10^9). 
Output: 
An integer representing the HCF of A and B. 

Example: 

Input: 
A = 12 
B = 18 
Output: 
6

*/


import java.util.*;

public class Q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println(a);
    }
}



// import java.util.*;

// public class Q47 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int hcf = 1; // Start with 1 as the smallest HCF

//         int min = Math.min(a, b); // Only iterate up to the smaller number
//         for (int i = 1; i <= min; i++) {
//             if (a % i == 0 && b % i == 0) {
//                 hcf = i;
//             }
//         }

//         System.out.println(hcf); // Print the HCF
//     }
// }

