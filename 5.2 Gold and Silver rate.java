/*
Shruti is running a jewellery shop. She got calls from her customers to know the current price of silver and gold in different weights. Write a program to help Shruti to calculate price in the different weights when Shruti knows the weight of 1 Kg. Silver and 10 gm. Gold.

Input Format

First line will contain a number representing 1Kg. Silver price.
Second line will contain a number representing 10gm. Gold Price.
Third Line will contain a String value Silver/Gold representing user input to know the price.
Fourth line will contain weight of silver/gold in grams for which user want price.

Constraints

Price cannot be -ve and maximum can be 1000000.
Weights entered by user can be between 0.01 gm to 1000 gms.

Output Format

One number representing value of gold/silver asked by user for a particular weight.

Sample Input 0

60000
54256.25
Silver
400
Sample Output 0

24000
Sample Input 1

10000
7000
Gold
0.001
Sample Output 1

Invalid Input
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double silverp = sc.nextDouble();
        double goldp = sc.nextDouble();
        String what = sc.next();
        double weight = sc.nextDouble();
        if(weight >=0.01 && weight <=1000)
        {
            if(what.equals("Silver"))
            {
                double rate = silverp/1000;
                int price = (int)(weight*rate);
                System.out.print(price);
            }
            else if(what.equals("Gold"))
            {
                double rate = goldp/10;
                int price = (int)(weight*rate);
                System.out.print(price);
                
            }
            
        }
        else
        {
            System.out.print("Invalid Input");
        }
        
    }
}
