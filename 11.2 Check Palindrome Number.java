/*
Rajiv asked his friend to write a java code to check the given number is palindrom are not?
if the number is less than 9 or greater than 9999 than return "invalid input"

Sample 1:
Enter the number : 121
number is palindrome

Sample 2:
Enter the number : 122
number is not palindrome

Sample 3:
Enter the number : 7
invalid input

Input Format

first line of the input reads the number

Constraints

9 < n > 9999

Output Format

prints whether the number is palindrome or not.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 9 && num<9999)
        {
            int orignal=num,reverse=0,remainder;
            while(num!=0)
            {
                remainder = num%10;
                reverse = reverse*10+remainder;
                num /=10;
            }
            if(orignal==reverse)
            {
                System.out.print("number is palindrome");
            }
            else{
             System.out.print("number is not palindrome");
            }
        }
        else
        {
            System.out.print("invalid input");
        }
    }
}
