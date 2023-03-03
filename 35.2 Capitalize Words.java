/*
In an activity conducted in a kids school, the students are told to carefully read the sentence written on the white board and convert each word's first alphabet to capital. Note that the first letter of the last word should be small.

Input Format

Input takes a String containing words separated with spaces.

Constraints

String with no " " delimiter should display "ERROR" message.

Output Format

The string in the output should have first word capitalized for each word, except the last word.

Sample Input 0

Sia sings a song
Sample Output 0

Sia Sings A song
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String st;
        try
        {
            st = sc.nextLine();
            String []s = st.split(" ");
            if(s.length==1)
            {
                System.out.print("ERROR");
                
            }
            else
            {for(int i=0;i<s.length-1;i++)
            {
                String f = s[i].substring(0,1);
                f = f.toUpperCase();
                s[i] = s[i].substring(1);
                s[i] = f+s[i];
            }
            String l = s[s.length-1].substring(0,1);
            l = l.toLowerCase();
            s[s.length-1] = s[s.length-1].substring(1);
            s[s.length-1] = l+s[s.length-1];
            for(int i=0;i<s.length;i++)
                System.out.print(s[i]+" ");}
        }
        catch(Exception e)
        {
            System.out.print("ERROR");
        }
    }
}
