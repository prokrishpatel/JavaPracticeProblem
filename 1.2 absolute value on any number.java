/*
Alice, in a game, is supposed to take a number as a input from the other participant. The number to be entered is otherwise supposed to be a positive number, Alice doesn’t rely if correct input is given. Write a program code to convert the input into an absolute positive value.

Input Format

a number which is either positive or negative

Constraints

input is a int number

Output Format

a poositive number

Sample Input 0

-8
Sample Output 0

8
Sample Input 1

10
Sample Output 1

10
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(Math.abs(a));
        /*or
        if(a<0)
        {a = a*(-1);}
        System.out.print(a);
        */
    }
}
