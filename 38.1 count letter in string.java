/*
Write a program to take a String input from the user having length greater than 3. Ask the user to give character input and find how many no. of times that character is present in the string. If length of the string entered by the user is <=3, then display message "Invalid".

Input Format

Program should take 2 inputs in following sequence: 1) String input 2) Character input

Constraints

If length of the string entered by the user is <=3, then display message "Invalid" and the second input (i.e. character input) should not be taken from user.

Output Format

Display how many no. of times a particular character (specified by user at run-time) is present in the string.

Sample Input 0

brilliant
l
Sample Output 0

2
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.length()>3)
        {
            char []input = str.toCharArray();
            char c = sc.next().charAt(0);
            int count = 0;
            for(char s : input)
            {
                if(s==c)
                    count++;
            }
            System.out.print(count);
        }
        else
            System.out.print("Invalid");
       
        
    }
}
