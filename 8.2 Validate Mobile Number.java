/*
Alex has a friend from India .He want to save the Mobile number of his friend with 91 extension .Help Alex to store the contact number of his friend in apporpriate mannner and If the number is valid then print "Number Saved” else print ”Enter Valid Number”.

Input Format

In First input line, you should enter contact number of Alex friend.

Constraints

Enter only positive value.
N

Output Format

Print “Number Saved” else print ”Enter Valid Number”.

Sample Input 0

919872436366
Sample Output 0

Number Saved
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        if(number.charAt(0)=='9' && number.charAt(1)=='1' && number.length()==12)
        {
            System.out.print("Number Saved");
        }
        else
        {
            System.out.print("Enter Valid Number");
        }
       
    }
}
