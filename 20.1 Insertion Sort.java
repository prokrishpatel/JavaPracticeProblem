/*
Akash is found of collecting unique coins. Every coin has a denomination i.e Z. One Afternoon, he has K coins. He wnat to arrange K coins in non-increaasing order as per denomination. Write a programming solution to help akash. - Note: Use Insertion Sort

Input Format

1st line contain K Coins
2nd line contain space separated denomination from K coins
Constraints

K>0 & K<50
Z>0 & Z<100
Output Format

space separated sorted denomination from K coins

Sample Input 0

5
10 4 3 7 8
Sample Output 0

10 8 7 4 3
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        //take input for number of coins: n
        int n = sc.nextInt();
        //take input for domination of each coin ie. Z as an array
        int [] Z = new int [n];
        for(int i=0;i<n;i++)
            Z[i] = sc.nextInt();
        
        //for sorting we use INSERTION SORT 
        
        for(int i=1;i<n;i++)
        {
            int key = Z[i];
            int j = i-1;
            while(j>=0)
            {
                if(key>Z[j])
                {
                    Z[j+1] = Z[j];
                    Z[j] = key;
                }
                j--;
            }
            
        }
        
        //printing the final sorted array ie. Z
        
        for(int i:Z)
            System.out.print(i+" ");
    }
}
