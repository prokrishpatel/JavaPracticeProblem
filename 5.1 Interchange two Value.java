/*
Write a java program that performs the following steps. a. Declare two int variables named x and y. b. Assign input taken from user to x. c. Assign twice the value of x to y. d. Interchange the value of x and y. e. Print the values of both variables on screen.

Input Format

a positive integer value

Constraints

a positive integer value

Output Format

display 2 integers as per instructions on the screen

Sample Input 0

5
Sample Output 0

10 5
Sample Input 1

10
Sample Output 1

20 10
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Createing Input Object of Scanner class as sc
        Scanner sc = new Scanner(System.in);
        // declaring variables x and y of in type and taking input for x;
        int x = sc.nextInt();
        int y = 2*x;//since y is twice of x
        //interchanging value of x and y
        int temp = x;
        x = y;
        y = temp;
        //printing the result
        System.out.print(x+" "+y);
    }
}
