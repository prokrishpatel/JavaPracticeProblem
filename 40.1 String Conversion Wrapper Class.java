/*
Amit purchased one calculator for performing some calculation on it. He is running a company which develop machines. He want to calculate total sale of today. But he is not able to calculate sum of two numbers because numbers are having more than nine digits. Help the Amit to calculate sum of two integer values having more than 9 digits ao that he will be able to do calculations.

Input Format

First line will contain one integer value having more than nine digits.
Second line will contain one integer value having more than nine digits.

Constraints

Number of digits in numbers will lie between 10-20.

Output Format

Sum of two integer values if numbers satisfy the constraint else print Invalid Input

Sample Input 0

12
13
Sample Output 0

Invalid Input
Sample Input 1

111112222233333
111118777701111
Sample Output 1

222230999934444
*/.import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(s1.length()<9 || s2.length()<9)
        {
            System.out.print("Invalid Input");
            System.exit(0);
        }
        long i1 = Long.parseLong(s1);
        long i2 = Long.parseLong(s2);
        System.out.print(i1+i2);
    }
}
