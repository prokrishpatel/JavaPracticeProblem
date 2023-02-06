/*Suppose that you are asked to input the size of an array and then enter integer type elements in it. Write a program which works as follows: 1) If input of array size is less than 1, then "Invalid Array Size" should be displayed and no other input should be taken. 2) Find and print the smallest element in the array.

Input Format

Program should take 2 types of inputs in following sequence: 1) Size of array 2) Elements in array Example: 4 22 44 12 56

Constraints

Size of the array should be greater than 0. i.e. 0 < n <50

Output Format

If input of array size is negative, then "Invalid Array Size" should be displayed and no other input should be taken. If input array is: 22 44 12 56 then print smallest element as: 12

Sample Input 0

4
22 44 12 56
Sample Output 0

12
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if(size>0 && size<50)
        {
            int []arr = new int[size];
            for(int i=0;i<size;i++)
                arr[i]=sc.nextInt();
            int min = arr[0];
            for(int i=1;i<size;i++)
            {
                if(arr[i]<min)
                    min = arr[i];
            }
            System.out.print(min);
        }
        else
        {
            System.out.print("Invalid Array Size");
        }
    }
}
