/*
Mrs. Jhunjhunwala has taught Programming in Java to the second-year students in ICE college and conducted 3 academic tasks for all the (N) students. Marks are store in a 2-D array but now Mrs. Jhunjhunwala is willing to implement a java program which can accept the 2-D array of marks and return the average marks of Best 2 Academic Tasks of each student. Help her to implement a method public double[] average_marks(double [][] marks)

Input Format

First line reads the number of students N
Next N lines read the marks of each student seperated by space

Constraints

n>0

Output Format

Prints the Avaerage marks of best 2 Academic tasks of N students separated by space

Sample Input 0

2
10.5 2.5 15
5.25 6.75 11.25
Sample Output 0

12.75 9.0
*/

import java.io.*;
import java.util.*;

public class Solution {
    public double[] average_marks(double [][]marks)
    {
        double []result = new double[marks.length];
        for(int i=0;i<marks.length;i++)
        {
            double min = marks[i][0];
            for(int j=1;j<marks[i].length;j++)
            {
                if(min>marks[i][j])
                    min = marks[i][j];
            }
            double sum = 0;
            for(int j=0;j<marks[i].length;j++)
            {
                if(marks[i][j]!=min)
                    sum += marks[i][j];
            }
            double avg = sum/(marks[i].length-1);
            result[i] = avg;
        }
        return result;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//number of student
        double [][]marks = new double[n][3];
        //take input for marks
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                marks[i][j] = sc.nextDouble();
            }
        }
        
        //calling required method by creating sutable object 
        Solution ans = new Solution();
        double []result = ans.average_marks(marks);
        for(double i : result)
        {
            System.out.print(i+" ");
        }
        
    }
}
