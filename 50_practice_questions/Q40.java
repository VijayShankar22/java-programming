/*
Binary to Decimal Conversion

You are given a binary number in the form of a string containing only '0's and '1's.
Your task is to convert this binary number to its equivalent decimal representation.

Task:
- Write a Java function that takes a binary number as input (as a String) and returns the decimal equivalent as an integer.

Function Signature:
public static long binaryToDecimal(String binaryNumber)

Input Format:
- A binary string, binaryNumber, consisting of '0's and '1's. (1 <= |binaryNumber| <= 10^6)

Output Format:
- An integer representing the decimal equivalent of the given binary number.

Constraints:
- 1 <= |binaryNumber| <= 10^6
- The output may exceed int, so consider using long for large binary numbers.

Example:

Input:
binaryNumber = "1101"

Output:
13

Explanation:
"1101" (binary) = 1×2³ + 1×2² + 0×2¹ + 1×2⁰ = 8 + 4 + 0 + 1 = 13

*/


import java.util.*;

public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryNumber = sc.nextLine();

        long result = 0;
        long power = 1;

        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            if (binaryNumber.charAt(i) == '1') {
                result += power;
            }
            power *= 2;
        }

        System.out.println(result);
    }
}
