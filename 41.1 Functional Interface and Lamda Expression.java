/*
Problem
Submissions
Leaderboard
Create a functional interface with the following method in it: boolean valid(String str, int n);

Write a program with the help of lambda expression that will use this valid() method to find out if a string (str) is having characters greater than "n" in it or not.

Input Format

Your program will take 2 types of inputs. First input will be a string (i.e. value for "str") and second input will be no. of characters to compare (i.e. value for "n"). If value of "n" entered less than 1, then display message "Invalid input". Otherwise, display message "Valid string" if string is having characters greater than "n" or display message "Invalid string" if string is having characters less than "n".

Constraints

No. of characters (i.e. "n") should be greater than 0.

Output Format

Display message "Valid string" if string is having characters greater than "n" or display message "Invalid string" if string is having characters less than "n".

Sample Input 0

Lovely
4
Sample Output 0

Valid string
*/

import java.util.*;

public class Main {

  // Functional interface with valid() method
  interface StringValidator {
    void valid(String str, int n);
  }

  public static void main(String[] args) {

    // Lambda expression to check if string has characters greater than "n"
    StringValidator validator = (str, n) -> {
      if (n < 1)
      {
        System.out.println("Invalid input");
      }
      else if (str.length() > n) 
      {
        System.out.println("Valid string");
      }
      else
      {
        System.out.println("Invalid string");
      }
    };
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int n = sc.nextInt();
      validator.valid(str,n);

  
}
}
