/*
In the magical kingdom of Lingua, where words held immense power, there 
lived a young linguist named Ava. One day, Ava embarked on a quest to 
count the vowels in a mysterious sentence said to unlock hidden 
treasures. The sentence was inscribed on an ancient scroll, and its 
vowels were said to be the key to finding the kingdom's greatest secret. 
Can you help Ava decipher the sentence and uncover the hidden riches of 
Lingua? 
 
Input Format 
Input contains a Sentence str. 
 
Constraints 
Sentence str containing only the small case alphabet. 
 
Sample Input 0 
hello how are you 
Expected Output 0 
7

Explanation: 
In this test case, the input sentence contains 7 vowels ('e', 'o', 
'o', 'a', 'e', 'o', 'u').

*/

import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(vowels.contains(s.charAt(i))){
                count += 1;
            }
        }

        System.out.println(count);
    }
}
