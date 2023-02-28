/*
Ask rahul to give two of his friends name.and help rahul to count the number of vowels present in these two names. if no vowels present thent print "0".
Example

Input

ramesh
tushar

Output

4

Input Format

first line accept first Name
second line accept 2nd Name

Constraints

name must contain alhabates only.

Output Format

First line must be no of Vowels presnt in both the names.

Sample Input 0

ramesh
suresh
Sample Output 0

4
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        String name2 = sc.next();
        name1 = name1.toLowerCase();
        name2 = name2.toLowerCase();
        int count = 0;
        for(int i=0;i<name1.length();i++)
        {
            if(name1.charAt(i)=='a'||name1.charAt(i)=='e'||name1.charAt(i)=='i'||name1.charAt(i)=='o'||name1.charAt(i)=='u')
                count++;
        }
        for(int i=0;i<name2.length();i++)
        {
            if(name2.charAt(i)=='a'||name2.charAt(i)=='e'||name2.charAt(i)=='i'||name2.charAt(i)=='o'||name2.charAt(i)=='u')
                count++;
        }
        System.out.println(count);
}
}
