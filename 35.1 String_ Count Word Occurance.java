/*
Ravi and Shanker are playing a game. Ravi is going to speak one sentence and ask that how many time in the sentence he used a word. Help Shanker to find occurance of word. Do not consider case (Upper or lower case) of the word.

Input Format

First line will contain one sentence.
Second line will contain one word which Shanker need to count.

Constraints

NA

Output Format

An integer value represents occurance of the word.

Sample Input 0

Keshav is playing a game and he is using a ball and a bat for it.
a
Sample Output 0

3
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String []s = sc.nextLine().replaceAll(",."," ").replace(".","").toLowerCase().split(" ");
        String w = sc.next().toLowerCase();
        int count = 0;
        for(int i=0;i<s.length;i++)
        {
            if(s[i].equals(w))
                count++;
        }
        System.out.print(count);
        
    }
}
