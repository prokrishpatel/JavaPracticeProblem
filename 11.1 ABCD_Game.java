/*
Peter is teaching ABCD.. to his younger brother through a game. The rules of the game include peter speaking 2 characters, and expecting his brother to speak all the alphabets in between based on the following conditions.
The two characters should be alphabets, in either case.
First alphabet should be smaller.
In all other cases ERROR should be displayed.

Input Format

two alphabets as input

Constraints

The two characters should be alphabets, in either case.
First alphabet should be smaller.
In all other cases ERROR should be displayed.

Output Format

Aplhabets in between or ERROR.

Sample Input 0

H X
Sample Output 0

H I J K L M N O P Q R S T U V W X
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
      //declaring input char
        char a1 = sc.next().charAt(0);
        char a2 = sc.next().charAt(0);
       //validating given constraint 
        if(((a1>='A' && a1 <='Z') || (a1>='a' && a1<='z'))&&((a2 >='A' && a2 <='Z') || (a2>='a' && a2<='z')))
        {
          //and solution
            for(char i=a1 ; i<=a2 ; i++)
            {
                System.out.print(i+" ");
            }
        }
        
        else
        {
            System.out.print("ERROR");
        }
        
        
    }
}
