/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn1612;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Btvn1612 {
    private static int num2;
    enum Direction {
    East, West, North, South
    }
    enum Cards {
    Spade, Heart, Diamond, Club
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
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int intValue = s.nextInt();
        System.out.println("Enter a decimal number:");
        float floatValue = s.nextFloat();
        System.out.println("Enter a String value");
        String strValue = s.next();
        System.out.println("Values entered are: ");
        System.out.println(intValue + " " + floatValue + " " + strValue);
    //    
        int value1 = 10;
        int value2 = 20;
        System.out.print("value1 == value2: ");
        System.out.println(value1 == value2);
        System.out.print("value1 != value2: ");
        System.out.println(value1 != value2);
        System.out.print("value1 > value 2: ");
        System.out.println(value1 > value2);
        System.out.print("value1 < value2: ");
        System.out.println(value1 < value2);
        System.out.print("value1 <= value2: ");
        System.out.println(value1 <= value2);
    //

        int first = 10;
        int second = 20;
        System.out.println((first == 30) && (second == 20));
        System.out.println((first == 30) || (second == 20));
        
    //
        x = 23;
        y = 12;
        System.out.print("x & y: ");
        System.out.println(x & y); // Returns 4 , i.e, 4 = 00100
        System.out.print("x | y: ");
        System.out.println(x | y); // Returns 31, i.e 31 = 11111
        System.out.print("x ^ y: ");
        System.out.println(x ^ y); // Returns 27, i.e 31 = 11011
        a = 43;
        b = 1;
        System.out.print("a >> b: ");
        System.out.println(a >> b); // returns 21 , i.e, 21 = 0010101
        System.out.print("a << b: ");
        System.out.println(a << b); //returns 86 , i.e, 86 = 1010110
    //
    
        value1 = 10;
        value2 = 20;
        int res;
        boolean someCondition = true;
        res = someCondition ? value1 : value2;
        System.out.println(res);
    //        
        first = 400;
        second = 700;
        int Result ;
        Result = first + second;

        if (Result > 1000) {
        second = second + 100;
        }
        System.out.println("The value of second is " + second);
    //
        int number = 11, remainder;

        remainder = number % 2;
        if (remainder == 0) {
        System.out.println("Number is even");
        } else {
        System.out.println("Number is odd");
        }
    //
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        num = (byte) input.nextInt();
        if (num % 3 == 0) {
        System.out.println("Inside Outer if Block");
        if (num % 5 == 0) {
        System.out.println("Number is divisible by 3 and 5");
        } else {
        System.out.println("Number is divisible by 3, but not by 5");
        }
        }else {
        System.out.println("Number is not divisible by 3");
        }
    //

        int totalMarks = 59;
        if (totalMarks >= 90) {
        System.out.println("Grade = A+");
        } else if (totalMarks >= 60) {
        System.out.println("Grade = A");
        } else if (totalMarks >= 40) {
        System.out.println("Grade = B");
        } else if (totalMarks >= 30) {
        System.out.println("Grade = C");
        } else {
        System.out.println("Fail");
        }
    //    
    
        int choice = 3;
        switch (choice) {
        case 1:
        System.out.println("Addition");
        break;
        case 2:
        System.out.println("Subtraction");
        break;
        case 3:
        System.out.println("Multiplication");
        break;
        case 4:
        System.out.println("Division");
        break;
        default:
        System.out.println("Invalid Choice");
        }
    //
        int month = 5;
        int year = 2001;
        int numDays = 0;
        // Cases are executed until a break statement is encountered
        switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        numDays = 31;
        break;
        case 4:
        case 6:
        case 9:
        case 11:
        numDays = 30;
        break;
        case 2:
        if (year % 4 == 0) {
        numDays = 29;
        } else {
        numDays = 28;
        }
        break;
        default:
        System.out.println("Invalid Month");   
        } 
        System.out.println("Month: " + month);
        System.out.println("Number of Days: " + numDays);
    //
        String day = "Monday";
        switch (day) {
        case "Sunday":
        System.out.println("First day of the Week");
        break;
        case "Monday":
        System.out.println("Second Day of the Week");
        break;
        case "Tuesday":
        System.out.println("Third Day of the Week");
        break;

        case "Wednesday":
        System.out.println("Fourth Day of the Week");
        break;

        case "Thursday":
        System.out.println("Fifth Day of the Week");
        break;

        case "Friday":
        System.out.println("Sixth Day of the Week");
        break;

        case "Saturday":
        System.out.println("Seventh Day of the Week");
        break;
        default:
        System.out.println("Invalid Day");
        }
//    
        
        Cards card = Cards.Diamond;
        switch (card) {
        case Spade:
        System.out.println("SPADE");
        break;
        case Heart:
        System.out.println("HEART");
        break;
        case Diamond:
        System.out.println("DIAMOND");
        break;
        case Club:
        System.out.println("CLUB");
        break;
        }
//
        day = "Monday";
        String hour = "am";

        switch (day) {
        case "Sunday":
        System.out.println("Sunday is a Holiday...");
        switch (hour) {
        case "am":
        System.out.println("Good Morning");
        break;
        case "pm":
        System.out.println("Good Evening");
        break;
        } // End of inner switch-case statement
        break; // Terminates the outer case statement
        case "Monday":
        System.out.println("Monday is a Working Day...");
        switch (hour) {
        case "am":
        System.out.println("Good Morning");
        break;
        case "pm":
        System.out.println("Good Evening");
        break;
        }
        break;
        default:
        System.out.println("Invalid Day");
        }
    //

        
    }    
}
    
    

