/*Amit got an assignment where he need to determine whether a given integer is prime number or not. Write a java programming solution to help Amit.

Input Format

First Line contain one integer number N

Constraints

N should be positive

Output Format

Return "Prime Number" incase integer is a prime number or return "Not Prime Number" incase it is not.

Sample Input 0

3
Sample Output 0

Prime Number
Sample Input 1

4
Sample Output 1

Not Prime Number
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 1 || a == 0)
        {
            System.out.print("Not Prime Number");
        }
        else
        {
            int check = 1 ;
            for(int i=2;i*i<=a;i++)
            {
                if(a%i==0)
                {
                    System.out.print("Not Prime Number");
                    check = 0;
                }
            }
            if(check == 1)
            {
                System.out.print("Prime Number");
            }
        }
    }
}
