/*
Puneet and Virat are playing a game. Virat tells a number that Puneet need to check whether that number is even and multiple of 3 or not. Write a program in which implement a method public boolean check(int n) which will return true if number satisfy the conditions else return false.

Input Format

One integer value representing number given by Virat.

Constraints

Number will lie between 20 and 400.

Output Format

True/False according to the value returned by the method or will print Invalid Input in case of number did not match the constraints.

Sample Input 0

60
Sample Output 0

True
Sample Input 1

12
Sample Output 1

Invalid Input
*/
import java.io.*;
import java.util.*;


public class Solution {

    public boolean check(int n)
    {
        return((n%2==0)&&(n%3==0));
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>=20 && x<=400)
        {
            boolean answer = s.check(x);
            if(answer)
                System.out.print("True");
            else
                System.out.print("False");
        }
        else
            System.out.println("Invalid Input");
    }
}
