/*
Consider that in a plantation activity, the municipality is planting trees in an order such that the smallest tree is planted first and the biggest at the end. While arranging the trees, before planting, to position them at their positions, they are swapped in such a way that a tree can only be swapped with its adjacent trees. wAP to implemennt the same using method which contain the logic of sorting. Consider 10 trees height as input.

Input Format

72 71 70 69 68 65 78 88 61 63

Constraints

Consider that there are 10 are present in the activity and their lenghts are in integer numbers (between 60 inches to 72 inches).

Output Format

61 63 65 68 69 70 71 72 78 88

Sample Input 0

71 71 70 69 68 65 78 88 61 63
Sample Output 0

61 63 65 68 69 70 71 71 78 88
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    static int[] binaryShort(int []array,int n)
    {
        
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp; 
                }
            }
           
        }
        return array;
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int []tree = new int [10];
        for(int i=0;i<10;i++)
            tree[i] = sc.nextInt();
        tree = binaryShort(tree,10);
        for(int i:tree)
        {
            System.out.print(i+" ");
        }
        
    }
}
