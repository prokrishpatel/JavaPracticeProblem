/*
Chacha Chaudhary has asked Sheena to find out the Nth occurence of any Word in the Paragraph. Sheena finds it a tedious task to find Nth occurence so she wants you to write a small java program which can solve her problem and she will give you a gift for helping her. Let us write a code.

Input Format

First line reads the paragraph contents

Second line reads the word to be found and N separated by Space

Constraints

N>0

Output Format

Prints the starting index of the Nth occurence of the word in the paragraph

Prints Not Present if not occuring even a single time and prints the last occurence if occuring less than N times.

Sample Input 0

Aana bought banana.
ana 1
Sample Output 0

1
Sample Input 1

Aana bought banana
baa 3
Sample Output 1

Not Present
Sample Input 2

Aana bought banana.
ba 3
Sample Output 2

12
Explanation 2

ba is occuring only 1 time i.e. at index 12. 3rd occurence is not available so output is 12 which is the last occurence.
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String para = sc.nextLine();
        String tofind = sc.next();
        int occurence = sc.nextInt();
        int index = para.indexOf(tofind);
        int final_= index;
        int count = 1;
        while(index!=-1&&count++<occurence)
        {
            index = para.indexOf(tofind,(index+1));
            if(index!=-1)
                final_ = index;
        }
        if(final_==-1)
            System.out.println("Not Present");
        else
            System.out.println(final_);
        
            
    }
}
