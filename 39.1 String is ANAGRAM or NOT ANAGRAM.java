/*
Write a program to check whether two strings are ANAGRAM or not. Strings will be anagram if they have same set of characters same number of times. Your program should take the input of two strings of length greater than 2. If the length of the any string is less than equal 2 then display the message “Invalid Input” without taking any more input.

Input Format

Your program should take the input of two strings.

Constraints

Length of strings should be greater than 2.

Output Format

Your program should display the “ANAGRAM” or “NOT ANAGRAM” depending on the input strings.

Sample Input 0

silent
listen
Sample Output 0

ANAGRAM
Sample Input 1

ssilent
listenn
Sample Output 1

NOT ANAGRAM
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(s1.length()<=2 || s2.length()<=2)
        {
            System.out.print("Invalid Input");
        }
        else if(s1.length()!=s2.length())
        {
            System.out.print("NOT ANAGRAM");
        }
        else
        {
            char []c1 = s1.toCharArray();
            char []c2 = s2.toCharArray();
            boolean check = true;

            for(int i=0;i<c1.length;i++)
            {
                int count1 = 0,count2 = 0;
                if(c1[i]=='$')
                    continue;
                
                char key = c1[i];
                
                for(int j=0;j<c1.length;j++)
                {
                    if(c1[j]=='$')
                        continue;
                    if(c1[j]==key)
                    {
                        count1++;
                        c1[j] = '$';
                    }
                }
                for(int k=0;k<c2.length;k++)
                {
                    if(c2[k]=='$')
                        continue;
                    if(c2[k]==key)
                    {
                        count2++;
                        c2[k] = '$';
                    }
                }
                if(count1!=count2)
                {
                    check = false;
                    break;
                }
            }
            if(check)
                System.out.print("ANAGRAM");
            else
                System.out.print("NOT ANAGRAM");
        }
        
    }
}
