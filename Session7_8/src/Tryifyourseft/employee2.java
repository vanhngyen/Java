/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tryifyourseft;

/**
 *
 * @author asus
 */
public class employee2 {
    int employeeId;
    String employeeName;
    String Designation;
    String BasicSalary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public String getBasicSalary() {
        return BasicSalary;
    }

    public void setBasicSalary(String BasicSalary) {
        this.BasicSalary = BasicSalary;
    }

    @Override
    public String toString() {
        return "employee2{" + "employeeId=" + employeeId + ", employeeName=" + employeeName + ", Designation=" + Designation + ", BasicSalary=" + BasicSalary + '}';
    }
    
    public static void main(String[] args) {
        
    }
}
