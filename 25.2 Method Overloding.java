/*
Create a java class containing two methods. The first add method receives two integer arguments and second add method receives two String arguments. Both methods are named as add() and perform the addition of their parameters or concatenate strings when called. The user should press 1 or 2 to call respective methods and input of 2 integers or 2 strinngs is taken according to the methods called.

Input Format

1 or 2 to be taken in first line of input
second line accepts 2 int type inputs, when 1 is pressed or take 2 String type inputs when 1 is pressed.

Constraints

user never presses a number apart from 1 or 2 in first line.

Output Format

if a number entered in first line is not 1 or 2, display ERROR and exit. otherwise add 2 int numbers if 1 is pressed, or concatenate 2 strings if 2 is chosen

Sample Input 0

1
12 23
Sample Output 0

35
*/

import java.io.*;
import java.util.*;

class Java{
    int add(int a,int b)
    {
        return a+b;
    }
    String add(String s1,String s2)
    {
        return s1+s2;
    }
}
    
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        Java prokrishpatel = new Java();
        if(c==1)
        {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            System.out.print(prokrishpatel.add(a1,a2));
        }
        else if(c==2)
        {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.print(prokrishpatel.add(s1,s2));
        }
        else
            System.out.print("ERROR");
    }
}
