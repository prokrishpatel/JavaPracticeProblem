/*
Sajal and Ruhi are playing a game. Sajal is going to tell one number and one operation (Even, Odd, Prime and Factorial), Ruhi have to apply the operation and tell the output.

Input Format

Two space seperated numbers, first number on which need to apply operation and second number will be 1 for checking the number is even or not, 2 for checking number is odd or not, 3 for checking number is prime or not and 4 for calculating factorial of number.

Constraints

First number will be positive integer value. Second number can be in range of 1 to 4.

Output Format

Yes / No for first three operations and an integer value if operation four is performed.

Sample Input 0

5 1
Sample Output 0

No
Sample Input 1

5 4
Sample Output 1

120
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        //take input .pkp
        int operand = sc.nextInt();
        int operation = sc.nextInt();
        
        //addtional variable used for operation  no. 3 & 4;
        boolean check = true;
        int result = 1;
        
        
        switch(operation)
        {
            case 1:// CHECK FOR EVEN.PKP
                if(operand%2==0)
                    System.out.print("Yes");
                else
                    System.out.print("No");
                break;
            
            case 2:// CHECK FOR ODD.PKP
                if(operand%2!=0)
                    System.out.print("Yes");
                else
                    System.out.print("No");
                break;
            case 3: // CHECK FOR PRIME 
                if(operand==1)
                    System.out.print("Yes");
                else
                    
                    for(int i=2;i*i<operand;i++)
                    {
                        if(operand%i==0)
                        {
                            System.out.print("No");
                            check = false;
                            break;
                        }
                    }
                    if(check==true)
                        System.out.print("Yes");
                break;
            case 4://FIND FACTORIAL 
                
                for(int i=1;i<=operand;i++)
                {
                    result *= i;
                }
                System.out.print(result);
                        
                
        }
    }
}
