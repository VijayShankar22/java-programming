/*
So, the New Year holidays are over. Santa Claus and his colleagues can take a rest and 
have guests at last. When two "New Year and Christmas Men" meet, thear assistants 
cut out of cardboard the letters from the guest's name and the host's name in honor of 
this event. Then the hung the letters above the main entrance. One night, when 
everyone went to bed, someone took all the letters of our characters' names. Then he 
may have shuffled the letters and put them in one pile in front of the door.


The next morning it was impossible to find the culprit who had made the disorder. But 
everybody wondered whether it is possible to restore the names of the host and his guests 
from the letters lying at the door? That is, we need to verify that there are no extra letters, 
and that nobody will need to cut more letters.


Help the "New Year and Christmas Men" and their friends to cope with this problem. You 
are given both inscriptions that hung over the front door the previous night, and a pile of 
letters that were found at the front door next morning.


Input Format 
The input file consists of three lines: the first line contains the guest's name, the second 
line contains the name of the residence host and the third line contains letters in a pile 
that were found at the door in the morning. All lines are not empty.

Constraints
The length of each line does not exceed 100.

Output Format 
Print "YES" without the quotes, if the letters in the pile could be permuted to make the 
names of the "New Year and Christmas Men". Otherwise, print "NO" without the quotes.


Sample Input 0 
SANTACLAUS 
DEDMOROZ 
SANTAMOROZDEDCLAUS 

Sample Output 0 
YES 

Explanation 0 
In the sample the letters written in the last line can be used to write the names and there 
won't be any extra letters left.

*/



import java.util.*;

public class Q50 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String guest = sc.next();
        String residence = sc.next();
        String pile= sc.next();
        String orignal = guest + residence;

        HashMap<Character, Integer> orignalcount = new HashMap<>();

        for(char c : orignal.toCharArray()){
            if(orignalcount.containsKey(c)){
                orignalcount.put(c, orignalcount.get(c) + 1);
            }else{
                orignalcount.put(c,1);
            }
        }

        HashMap<Character, Integer> pilecount = new HashMap<>();

        for(char c : pile.toCharArray()){
            if(pilecount.containsKey(c)){
                pilecount.put(c,pilecount.get(c) + 1);
            }else{
                pilecount.put(c,1);
            }
        }

        if(orignalcount.equals(pilecount)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
