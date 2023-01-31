/*
Sameer wants to develop a program for ATM. Help him by constructing the program for the same. In the program if user withdraws amount upto 1000 then machine will dispence Rs. 100 notes only. Minimum number of notes should be dispenced by the machine. Notes of denomination of 100,200,500 and 2000 are available in machine.

Input Format

One integer value between 100-20000.

Constraints

Maximum withdrawl amount should be 20000, Minimum should be 100 and amount should be in the multiple of 100 only.

Output Format

Print the number of notes dispenced and their denomination.

Sample Input 0

1100
Sample Output 0

1 100 Notes
2 500 Notes
Sample Input 1

1550
Sample Output 1

Invalid Input
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        //  12.1_PKP Solutions Begains Here...
        
        Scanner sc = new Scanner(System.in);
        // How many Total money You want ? money.pkp
        int money = sc.nextInt();
        
        //checking First Condition Limitation...
        if(money>=100 && money<=20000)
        {
            //Type of Notes 100,200,500,2000...?
            int H = 0,TH = 0,FH = 0,TT = 0;
            //upto 1000 condition 2.pkp
            if(money<=1000)
            {
                if((money%100)==0)
                {
                    H +=  (money/100);// total number of 100s note required
                }
                else
                {
                    // Atm don't have such notes
                    System.out.print("Invalid Input");
                }
            }
            
            //more than 1000
            else
            {
                
                while(money>0)
                {
                    //rest of main logic
                    if(money>=2000)
                    {
                        TT += (money / 2000);
                        money = money%2000;
                    }
                    else if(money>=500)
                    {
                        FH += (money/500);
                        money = money%500;
                    }
                    else if(money>=200)
                    {
                        TH += (money/200);
                        money = money%200;
                    }
                    else if(money>=100)
                    {
                        H += (money/100);
                        money = money%100;
                    }
                    else
                    {
                        System.out.print("Invalid Input");
                        System.exit(0);
                    }
                }
            }
            
            //printing
            
            if(H!=0)
            {
                System.out.println(H+" 100 Notes");
            }
            if(TH!=0)
            {
                System.out.println(TH+" 200 Notes");
            }
            if(FH!=0)
            {
                System.out.println(FH+" 500 Notes");
            }
            if(TT!=0)
            {
                System.out.println(TT+" 2000 Notes");
            }
        }
        else
        {
            
            System.out.print("Invalid Input");
        }
    }
}
