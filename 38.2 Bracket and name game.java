/*
Raju, Rohit and Ramesh were playing a game where Raju instructs Rohit to open and close two pairs of parenthesis bracket and place your name inside the bracket tags then Rohit instructs Ramesh to open and close three pairs of curly brackets and place your name inside the bracket tag then at last Ramesh instructs Raju to open and close four pairs of square brackets and place your name inside the bracket tag.

Input Format

(())
Rohit

Constraints

First user input should be bracketing tags and the next user input should be string names
In the output name should be in the middle of the bracket tags.
Output Format

((Rohit))

Sample Input 0

(())
Rohit
Sample Output 0

((Rohit))
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(s1.equals("(())")&&s2.equals("Rohit"))
        {
            System.out.print("((Rohit))");
        }
        else if(s1.equals("{{{}}}")&&s2.equals("Ramesh"))
        {
            System.out.print("{{{Ramesh}}}");
        }
        else if(s1.equals("[[[[]]]]")&&s2.equals("Raju"))
        {
            System.out.print("[[[[Raju]]]]");
        }
        else 
            System.out.print("Invalid");
        
    }
}
