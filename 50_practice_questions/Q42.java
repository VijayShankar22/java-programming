/*
Distinct Elements in String Array

You are given an array of strings. Your task is to find the distinct elements in the array.

Task:
- Write a Java program that takes an array of strings as input and returns a set containing the distinct elements.

Input Format:
- An array of strings, strArray, of length n (1 <= n <= 10^6).

Output Format:
- A Set containing the distinct elements in the array.

Constraints:
- You must implement a function findDistinctElements(String[] strArray) to solve this problem.
- The input array may contain strings with both uppercase and lowercase letters.
- Elements are case-sensitive: "apple" and "Apple" are considered distinct.

Example:

Input:
strArray = ["apple", "orange", "banana", "apple", "grape", "banana", "apple", "orange", "grape", "kiwi", "kiwi", "kiwi"]

Output:
{"apple", "orange", "banana", "grape", "kiwi"}

Test Cases:

Test Case 1:
Input:
strArray = ["apple", "orange", "banana", "apple", "grape", "banana", "apple", "orange", "grape", "kiwi", "kiwi", "kiwi"]
Output:
{"apple", "orange", "banana", "grape", "kiwi"}

Test Case 2:
Input:
strArray = ["apple", "orange", "banana", "kiwi", "orange", "kiwi", "apple"]
Output:
{"apple", "orange", "banana", "kiwi"}

Test Case 3:
Input:
strArray = ["hello", "world", "hello", "java", "world", "java", "java", "python"]
Output:
{"hello", "world", "java", "python"}

Test Case 4:
Input:
strArray = ["apple", "APPLE", "Orange", "orange", "Banana", "BANANA", "banana"]
Output:
{"apple", "APPLE", "Orange", "orange", "Banana", "BANANA", "banana"}

Test Case 5:
Input:
strArray = ["one", "one", "ONE", "One"]
Output:
{"one", "ONE", "One"}

*/


import java.util.*;

public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of elements
        sc.nextLine(); // consume newline

        String[] strArray = new String[n];
        for (int i = 0; i < n; i++) {
            strArray[i] = sc.nextLine();
        }

        Set<String> distinctElements = new HashSet<>();

        for (String str : strArray) {
            distinctElements.add(str);
        }

        System.out.println(distinctElements);
    }
}

