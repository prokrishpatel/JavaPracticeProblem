/*
write a program that creates integer array of n elements, accepts the values of arrays and print the array in reverse :

Input Format

Accepts n values from the user.

Constraints

All number should be integer values (Positive, negative and zero)

Output Format

It should first display original array and after reversing the array it should display the reverse array.

Sample Input 0

8 7 4 3
Sample Output 0

3 4 7 8
*/
//Note : sice there are some test case giving invalid input thats why we used Execptional Handdling
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String []arr = new String [50];
        Arrays.fill(arr,"#");
        int n=50;
        for(int i=0;i<50;i++)
        {
            try
            {
                arr[i] = sc.next();
            }
            catch(Exception e)
            {
                n = i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
            System.out.print(arr[i]+" ");
       
        
    }
}
