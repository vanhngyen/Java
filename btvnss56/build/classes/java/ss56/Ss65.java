/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvnss56;

/**
 *
 * @author asus
 */
public class Ss65 {
    String employeeName;
    int employeeAge;
    double employeeSalary;
    boolean maritalStatus;
    void displayEmployeeDetails() {
        System.out.println("Employee Details");
        System.out.println("================");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Age: " + employeeAge);
        System.out.println("Employee Salary: " + employeeSalary);
        System.out.println("Employee MaritalStatus:" + maritalStatus);
       
    }
    public static void main(String[] args) {
        Ss65 a = new Ss65 ();
        a.displayEmployeeDetails();
    
    }
}
