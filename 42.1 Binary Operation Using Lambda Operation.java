/*


Ram's teacher is giving the task to Ram to do the basic arithmetic opertions on two integer values.At a time he can do only one operation. Help the Ram to do the same using Lambda expression.

Input Format

First line will contain two ineteger values on which we have to perform the operation
Second line will contain one integer value which will describe the operation
1 addition
2 subtraction
3 multiplication
4 division

Constraints

number should be integer value

Output Format

one integer value represnting result of the operation if wrong input then print Invalid

Sample Input 0

4 5
2
Sample Output 0

-1
Sample Input 1

3 7.9
1
Sample Output 1

Invalid
*/
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,b=0,op=5;
        try
        {
         a = sc.nextInt();
         b = sc.nextInt();
         op = sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.print("Invalid");
            System.exit(0);
        }
        BinaryOperator<Integer> operation;

        switch (op) {
            case 1:
                operation = (x, y) -> x + y;
                break;
            case 2:
                operation = (x, y) -> x - y;
                break;
            case 3:
                operation = (x, y) -> x * y;
                break;
            case 4:
                operation = (x, y) -> x / y;
                break;
            default:
                System.out.println("Invalid");
                return;
        }

        int result = operation.apply(a, b);
        System.out.println(result);
    }
}
