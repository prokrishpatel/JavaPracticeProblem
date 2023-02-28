/*
Kumar has been given a string and asked to determine whether it can be converted into a palindrome after removing at most one characte

Input Format

str="abcbea"

Constraints

1<=Str.length<=10^3 Str consists of Lowercase English characters

Output Format

true

Sample Input 0

abceba
Sample Output 0

true
Explanation 0

you can remove character 'e' to make it palindrome
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String r = "";
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            r = ch+r;
        }        
        boolean check  = true;
        int count = 0;
        int i=0;
        
        for(i=0;i<s.length();i++)
        {
            
           if((s.charAt(i)!=r.charAt(i)))
                count++;
        }
        if(count > 2)
            {
                check = false;
                
            }
        System.out.print(check);
    }
}
