/*
It's PTM tomorrow in Cambridge School.Teachers want to show the grades from(A to E) depending on the percentage of the student. Help the teacher's by developing the program for the same.To find the grade of a student, given the marks of N subjects. Given the marks of N subjects, we have to print the grade of a student based on the following grade slab.

If Percentage Marks > 90, Grade is A+ If 70 <= Percentage Marks <= 89, Grade is A If 60 <= Percentage Marks <= 69, Grade is B If 50 <= Percentage Marks <= 59, Grade is C If Percentage Marks <= 40, Grade is D

Input Format

Integer Value to enter number of subjects, count Enter marks of subjects depending upon the the total number of subjects

Constraints

Number of subjects should not exceed 7

Output Format

Character output to show grades

Sample Input 0

5
50 57 89 87 56 
Sample Output 0

B
Sample Input 1

9
Sample Output 1

Invalid
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0 && n<=7)
        {
            int []marks = new int[n];
            int sum = 0;
            for(int i=0;i<n;i++)
            {
                marks[i] = sc.nextInt();
                sum += marks[i];
            }
            int precentage = sum / n;
            if(precentage>90)
                System.out.print("A+");
            else if(precentage>=70 && precentage<=89)
                System.out.print("A");
            else if(precentage>=60 && precentage<=69)
                System.out.print("B");
            else if(precentage>=50 && precentage<=59)
                System.out.print("C");
            else if(precentage<=40)
                System.out.print("D");
        }
        else{
            System.out.print("Invalid");
        }
    }
}
