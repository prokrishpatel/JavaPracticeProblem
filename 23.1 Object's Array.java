/*
Write a program to make "Employee" class consisting of following: -- instance variables --> id & age -- a parameterized constructor to initialize both instance variables.

Create array of "n" Employee objects (where "n" is no. of objects specified by user at run-time) and display the id and age of those employees whose age is less than 30.

Input Format

Program should take the inputs in following sequence: 1) In First input line, no. of Employee objects to create. i.e. value of "n". 2) In remaining input lines, enter id and age values of "n" Employee objects. For example, if no. of Employee-objects to be created are 2, then user-inputs should be as follows: 2 202 31 100 20

Constraints

1) No. of Employee objects range between 1 to 10, i.e. 1 <= n <= 10

2) All id & age values should be positive and range between: 10 <= id <= 1000 ; 18 <= age <= 50

Output Format

If no. of Employee-objects "n" is less than 1, then "Invalid input" should be displayed and no other input should be taken.

If any input value for id & age goes out-of-range (specified in constraints), then display "Invalid data" as overall output. Otherwise, display the id and age of those employees whose age is less than 30, such as follows:
100 20

Sample Input 0

2
202 31
100 20
Sample Output 0

100 20
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Employee
{

    int id;
    int age;
    Employee(int id,int a)
    {
        this.id = id;
        age = a;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=1 && n<=10)
        {
            boolean check = true;
            Employee []e = new Employee[n];
            for(int i=0;i<n;i++)
            {
                int id = sc.nextInt();
                int age = sc.nextInt();
                if((id<10 || id>1000) || (age<18 || age>50))
                {
                    check = false;
                }
                e[i] = new Employee(id,age);
            }
            if(!check)
            {
                System.out.print("Invalid data");
            }
            else
            {
                for(int i=0;i<n;i++)
                {
                    if(e[i].age<30)
                    {
                        System.out.println(e[i].id+" "+e[i].age);
                    }
                }
            }
            
        }
        else
        {
            System.out.print("Invalid input");
        }
    }
}
