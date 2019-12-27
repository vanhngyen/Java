/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld1;

/**
 *
 * @author asus
 */
public class helloworld1 {
    private static int num2;
    enum Direction {
    East, West, North, South
    }

    public static void main(String[] args) {
    int x, y, z;
        int a = 5, b , c = 10;
        byte num = 20;
        char Char = 'c';
        int num1 = num2 = 10;
        x=9;
        y=3;
        z=2;
        System.out.println(x);
        System.out.println(a);
        System.out.println(num);
        System.out.println(Char);
        System.out.println(num1);
    //          
        int empNumber;
        float salary;
        double shareBalance = 456790.897;
        char gender = 'M';
        boolean ownVehicle = false;
        empNumber = 101;
        salary = 6789.50f;
        System.out.println("Employee Number:" + empNumber);
        System.out.println("Salary:" + salary);
        System.out.println("Gender:"  + gender);
        System.out.println("Share Balance: " + shareBalance);
        System.out.println("Owns vehicle: " + ownVehicle);
        
    //
        System.out.println("Java \t Programming \n Language");
        System.out.println("Tom \"Dick\" Harry");
    //
    
        System.out.println("\u0048\u0065\u006C\u006C\u006F" + "!\n");
        System.out.println("Bl\141ke\"2007\" ");
    //
        final double PI = 3.14159;
        double radius = 5.87;
        double area;
        area = PI * radius * radius;
        System.out.println("Area of the circle is: " + area);
    //
        Direction direction;
        direction = Direction.East;
        System.out.println("Value: " + direction);
    //

        num1 = 5;
        num2 = 10;
        int sum = num1 + num2;
        System.out.print("The sum of ");
        System.out.print(num1);
        System.out.print(" and ");
        System.out.print(num2);
        System.out.print(" is ");
        System.out.print(sum);
        System.out.println(".");
        int num3 = 2;
        sum = num1 + num2 + num3;
        System.out.println("The sum of " + num1 +  " , " + num2 + " and " + num3 + " is " + sum
        + ".");
        
        int i = 55/22;
        System.out.printf("55/22 = %d %n", i);
        double q = 1.0 / 2.0;
        System.out.printf("1.0/2.0 = %09.3f %n", q);
        q = 5000.0 / 3.0;
        System.out.printf("5000/3.0 = %7.2e %n", q);
        q = -10.0 / 0.0;
        System.out.printf("-10.0/0.0 = %7.2e %n", q);
        System.out.printf("pi = %5.3f, e = %5.4f %n", Math.PI, Math.E);
    //
        num = 2;
        double result = num * num;
        System.out.format("The square root of %d is %f.%n", num, result);
        
        
    //
        
    
    }
}
