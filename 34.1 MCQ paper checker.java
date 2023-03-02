/*
Dr. Max has conducted the academic task in his class with 5 Multiple Choice Questions each having 4 options A/B/C/D. He wanted to write a program which can evaluate the test papers of all the N students such that each correct answer is awarded 1 mark and for incorrect answer penalty is 0.25 marks.

The program must read the number of students N and the the answers of all the N students in the form of a String. If any question is not attempted by any student, then X should be given as input corresponding to that question e.g. ABAXD

It is expected that the marks of all the N students are displayed separated by SPACE.

Input Format

First Line of the input reads the String of CORRECT ANSWERS

Second Line of the input reads the number of students N

Next N lines read the answer Strings of the N students respectively.

Constraints

N > 0

Input characters can be either in Upper Case or Lower Case

Output Format

Print the marks of all the N students separated by SPACE

Sample Input 0

ACBDC
2
BCXDX
AXXDC
Sample Output 0

1.75 3.0
Sample Input 1

CCABD
1
aBbxX
Sample Output 1

-0.75
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //5 mcq , 4 option A/B/C/D, +1 -0.25 
        Scanner sc = new Scanner(System.in);
        String Correct = sc.next();
        Correct = Correct.toUpperCase();
        int total_student = sc.nextInt();
        for(int s=0;s<total_student;s++)
        {
            String student_ans = sc.next();
            student_ans = student_ans.toUpperCase();
            double marks = 0;
            for(int i=0;i<student_ans.length();i++)
            {
                if(student_ans.charAt(i)=='X')
                    continue;
                else if(student_ans.charAt(i)==Correct.charAt(i))
                    marks++;
                else
                    marks -= 0.25;
            }
            System.out.print(marks + " ");
        }
        
        
        
    }
}
