/*
write a code that accepts an input of integer type, which represents the number of rows to display the Floyds Triangle pattern upto 6 rows. Display “invalid rows” without a pattern if the input given is negative:

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21

Input Format

The input should be taken as row number.

Constraints

row number should be positive>0

Output Format

It should print “Invalid rows” if the input taken is zero 0r less than zero.

Sample Input 0

4
Sample Output 0

1
2 3
4 5 6
7 8 9 10
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        if(row>0)
        {
          int value = 1;
          for(int i=1;i<=row;i++)
          {
              for(int j=1;j<=i;j++)
                  System.out.print(value++ +" ");
              System.out.print("\n");
          }  
        }
        else
        {
            System.out.print("Invalid rows");
        }
        
    }
}
