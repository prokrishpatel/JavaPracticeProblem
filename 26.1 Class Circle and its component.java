/*
Create a java program:
class Name: Circle
Instance Variable: radus (double type)
Instance Method:
1. area()
2. circumfrence() 3. perimeter()

Write a separate class TestCircle with a main() method and test the Circle class methods.create a circle objects and assign it to reference variables obj

Input Format

radius of circile

Constraints

radius>0

Output Format

prints the result of Area,circumfrence and perimeter of circle.

Sample Input 0

2
Sample Output 0

Area of circle:12.566370614359172
Perimeter of circle:12.566370614359172
Circumference of circle:12.566370614359172
*/
import java.io.*;
import java.util.*;
class Circle
{
    double radius;
    Circle(double r)
        {radius = r;}
    void area()
    {
        System.out.println("Area of circle:"+3.141592653589793*radius*radius);
    }
    void circumfrence()
    {
        System.out.println("Circumference of circle:"+3.141592653589793*2*radius);
    }
    void parimeter()
    {
        System.out.println("Perimeter of circle:"+3.141592653589793*2*radius);
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        double r = sc.nextDouble();
        if(r>0)
        {
            Circle c = new Circle(r);
            c.area();
            c.parimeter();
            c.circumfrence();
            
        }
        else
            System.out.print("invalid input");
    }
}
