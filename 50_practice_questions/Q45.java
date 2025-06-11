/*
You are given a pair of coordinates (x, y), where 'x' and 'y' are 
integers. Your task is to determine in which quadrant of the Cartesian 
coordinate system the point lies. The Cartesian coordinate system is 
divided into four quadrants: Quadrant I, Quadrant II, Quadrant III, 
and Quadrant IV. 

Write a Java program that takes the values of 'x' and 'y' as input and 
determines the quadrant in which the point lies. 
 
Input: 
Two integers, x and y, representing the coordinates of a point. (-10^6 
<= x, y <= 10^6)

Output: 
A string indicating the quadrant in which the point lies: 
Quadrant I if the point is in the first quadrant (x > 0, y > 0) 
Quadrant II if the point is in the second quadrant (x < 0, y > 0) 
Quadrant III if the point is in the third quadrant (x < 0, y < 0) 
Quadrant IV if the point is in the fourth quadrant (x > 0, y < 0) 
Origin if the point is at the origin (x = 0, y = 0) 
Axes if the point is on one of the coordinate axes (x = 0 or y = 0)

Example: 
Input: 
x = 4 
y = 3 
Output: Quadrant I

 */


import java.util.*;

public class Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        System.out.println(findquadrant(X, Y));
    }

    public static String findquadrant(int x, int y) {
        if (x == 0 && y == 0) {
            return "Origin";
        } else if (x == 0 || y == 0) {
            return "Axes";
        } else if (x > 0 && y > 0) {
            return "Quadrant I";
        } else if (x < 0 && y > 0) {
            return "Quadrant II";
        } else if (x < 0 && y < 0) {
            return "Quadrant III";
        } else {
            return "Quadrant IV";
        }
    }
}
