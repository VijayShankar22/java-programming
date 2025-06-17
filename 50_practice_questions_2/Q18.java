/*
Q:-18 HARD Pascal's Triangle.
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
                                        
Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]]

Constraints:
1 <= numRows <= 30

 */


import java.util.ArrayList;
import java.util.List;

public class Q18 {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }

        System.out.print("[");
        for (int i = 0; i < triangle.size(); i++) {
            System.out.print(triangle.get(i));
            if (i != triangle.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}