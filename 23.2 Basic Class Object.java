/*
Write a program to print the names of students by creating a Student class. If instead of name some other data type is passed then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating object of Student class.

Input Format

Rahul 33

Constraints

Use constructor with argument to initialize the name
Create an object with name to print the name of the student
Pass Two inputs such as one is name and the other with different data type
Output Format

Rahul Unknown

Sample Input 0

Rahul
33
Sample Output 0

Rahul
Unknown*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student
{
    String s1,s2;
    Student(String x,String y)
    {
        if((x.toUpperCase()).equals(x.toLowerCase()))
        {
            s1 = "Unknown";
        }
        else
            s1 = x;
        if((y.toUpperCase()).equals(y.toLowerCase()))
        {
            s2 = "Unknown";
        }
        else
            s2 = y;
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        Student s = new Student(s1,s2);
        System.out.println(s.s1);
        System.out.println(s.s2);
        
    }
}
