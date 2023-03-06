/*
Write a program to take "n" String inputs from user and store them in array (where "n" is no. of String objects specified by user at run-time). Sort the array in ascending order and display the array. If "n" entered by user is less than 2, then display message "Invalid".

Input Format

Your program should take the input of "n" string objects.

Constraints

No. of string objects entered by the user should be greater than 1.

Output Format

Your program should display the array of strings in sorted ascending order.

Sample Input 0

4
India
America
Australia
France
Sample Output 0

America
Australia
France
India
*/
import java.io.*;
import java.util.*;

public class CLASS
{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=2)
        {
            String []s = new String[n];
            for(int i=0;i<n;i++)
            {
                s[i] = sc.next();
            }
            for(int i=0;i<n-1;i++)
            {
                for(int j=0;j<n-1-i;j++)
                {

                    int k=0,l=0;
                    while(k<s[j].length() && l<s[j+1].length())
                    {
                        if(s[j].charAt(k) > s[j+1].charAt(l))
                        {
                            String temp = s[j];
                            s[j] = s[j+1];
                            s[j+1] = temp;
                            break;
                        }
                        else if(s[j].charAt(k) < s[j+1].charAt(l))
                        {
                            break;
                        }
                        else if(s[j+1].length() == l+1)
                        {
                            String temp = s[j];
                            s[j] = s[j+1];
                            s[j+1] = temp;
                            break;
                        }
                        k++;l++;
                    }

                }
            }
            for(int i=0;i<n;i++)
            {
                System.out.println(s[i]);
            }
        }
        else
        {
            System.out.print("Invalid");
        }

    }
}
