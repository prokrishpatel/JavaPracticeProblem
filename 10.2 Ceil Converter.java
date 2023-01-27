/*
Liz built up a software code taking number of 3 different color blocks as input. Considering the end users can enter floating point numbers too as at least 1 block of a color is broken. Design the code converting the not-full numbers to full numbers.

Input Format

Number of balls for three different colors.

Constraints

3 inputs separated with space can be floating points or integers.

Output Format

3 integer numbers

Sample Input 0

2.2 2 2
Sample Output 0

3 2 2
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        float f3 = sc.nextFloat();
        System.out.print((int)Math.ceil(f1)+" "+(int)Math.ceil(f2)+" "+(int)Math.ceil(f3));
    }
}
