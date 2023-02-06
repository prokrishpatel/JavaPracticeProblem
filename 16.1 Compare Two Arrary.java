/*
Jasmine and jack created 2 different arrays to store their products which they have purchased from super market. Then they compared their products to identify the count of similar products they have purchased

Input Format

Milk Toy Chair Stool
Stool Bag Watch Milk

Constraints

Create two different String array of size 4
Compare and display the result in integers
Output Format

2

Sample Input 0

Milk Toy Chair Stool
Stool Bag Watch Milk
Sample Output 0

2
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String []jasmine = new String [4];
        String []jack = new String [4];
        for(int i=0;i<4;i++)
            jasmine[i] = sc.next();
        for(int i=0;i<4;i++)
            jack[i] = sc.next();
        int count = 0;
        for(String i :jasmine)
        {
            for(String j: jack)
            {
                if(i.equals(j))
                    count++;
            }
        }
        System.out.print(count);
    }
}
