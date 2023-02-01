/*
Santosh want to find the sum of prime number from 1 to given number, So help him to find the solution using java programing langauge.
if the number is less than 0 or greater than 1000 than the result should be display zero(0).

Input Format

Line 1: Enter the end range: 50

Constraints

1 < n >1000

Output Format

The Sum of Prime Numbers from 1 to 50 is: 328

Sample Input 0

50
Sample Output 0

328
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0 && num<1000)
        {
            int sum = 0;
            for(int i=1;i<=num;i++)
            {
                boolean check = true;
                if(i==1)
                    continue;
                for(int j=2;j*j<=i;j++)
                {
                    if(i%j==0)
                    {
                        check = false;
                        break;
                    }
                    
                }
                if(check==true)
                {
                    sum += i;
                }
                    
            }
            System.out.print(sum);
            
        }
        else
            System.out.print("0");
    }
}
