/*
write a program that creates integer array of n elements, accepts the values of arrays and find sum of elements as an integer.

Input Format

Accepts n values from the user.

Constraints

All number should be integer values (Positive, negative and zero)

Output Format

diplays the sum of the array's elements as a single integer.

Sample Input 0

5
3 4 10 11 20
Sample Output 0

48
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0)
        {
            int []arr = new int [n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            int sum = 0;
            for(int i : arr)
                sum += i;
            System.out.print(sum);
        }
    }
}
