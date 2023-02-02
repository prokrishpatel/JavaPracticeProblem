/*
Alex is very fond of pattern making so he is writing a program to print the pattern of following type .He gives an input of int type which represents the total number of rows and the pattern will be printed up to the entered row size but if Alex enter the negative number ,show “Invalid Input”.
Pattern for 2 rows:
&
&&
&&&

Input Format

Program should take the number of rows as input.

Constraints

Entered Number of rows should be positive int value

Output Format

If input is of positive number display the pattern but if input is a negative number or zero, display the message “Invalid Input”.

Sample Input 0

-5
Sample Output 0

Invalid Input
Sample Input 1

2
Sample Output 1

&
&&
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0)
        {
            for(int i=1;i<=n;i++)
            {
                int j=1;
                while(j++<=i)
                {
                    System.out.print("&");

                }
                System.out.print("\n");
            }
        }
        else
        {
            System.out.print("Invalid Input");
        }
        
    }
}
