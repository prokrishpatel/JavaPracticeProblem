/*
Jhon visited fun zone area in Elante mall. He decided to play a game which consist with some green and red color balls. He got a task to add green and red balls,then after on screen he needs to enter final sum of total number of green and red balls.

Input Format

In First line, enter total number of green color balls. In Second line, enter total number of red color balls.

Constraints

Enter only interger value.

Output Format

Display the sum of green and red color balls.

Sample Input 0

10
10
Sample Output 0

20
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int green = sc.nextInt();
        System.out.print(red+green);
    }
}
