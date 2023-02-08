/*
Narayana friends ask him to write a java code to find the sum of all even number which is store in one dimensional array.
if the array does not have any even number then print 0 else print the sum.

Input Format

Accept the size of array n
Enter the n number of element.

Constraints

5 < n > 50

Output Format

print the sum

Sample Input 0

5
10
15
20
35
45
Sample Output 0

30
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
                sum += arr[i];
        }
        System.out.print(sum);
    }
}
