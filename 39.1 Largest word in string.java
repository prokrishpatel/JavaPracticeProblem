/*
Rohit is pursuing his B.Tech degree in CSE. His java teacher given the assignment to write java code to accept a string/sentence in upper case if the string/sentence in not upper case than convert it in uppercase and Display the longest word and the length of the longest word present in the string. If the string contains number or string is null then display the massage “Invalid input”.
Sample 1:
Enter string: Lovely Professional University
Longest word : PROFESSIONAL

Sample 2:
Enter string: 123 cse 45 lpu 56789
Invalid input

Input Format

First line read the input as String

Constraints

numbers of word in string > 1

Output Format

Display longest string in Uppercase

Sample Input 0

Lovely Professional University
Sample Output 0

PROFESSIONAL
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();  
        char []array = input.toCharArray();
        for(char c : array)
        {
            if(Character.isDigit(c))
            {
                System.out.println("Invalid input");
                System.exit(0);
            }
        }
        String []str = input.split(" ");
        if(str.length <= 1)
        {
            System.out.print("Invalid input");
            System.exit(0);
        }
        int max = str[0].length();
        int maxi = 0;
        for(int i=1; i<str.length;i++)
        {
            if(str[i].length() > max)
            {
                max = str[i].length();maxi=i;
            }
        }
       System.out.print(str[maxi]);
        
    }
}
