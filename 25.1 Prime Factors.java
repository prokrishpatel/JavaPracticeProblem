/*
Richa and her daughter Ahaana are playing a game. Richa is going to tell one number and Ahaana need to tell the prime factors of the number. Help Ahaana by completing the code to find prime factor of the number. Write a method which calculate prime factors and print and call the method in main.

Input Format

An integer value

Constraints

N will be lie between 10-50

Output Format

All the prime factors will be printed exectly once with space.
*/
import java.io.*;
import java.util.*;

public class Solution {

    static void primeFactor(int x)
    {
        if(x<=1)
            return;
        
        for(int i=2;i*i<=x;i++)
        {
            if(x%i==0)
            {
                System.out.print(i+" ");
                while(x%i==0)
                    x /= i;
            }       
        }
        if(x>1)
            System.out.print(x);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=10 && n<=50)
            primeFactor(n);
        else
            System.out.print("Invalid Input");
    }
}
