/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class03;

/**
 *
 * @author asus
 */
public class Ex3 {
    int employee_id = 1;
    String employee_firstName = "vanh";
    String employee_lastName = "Nguyễn";
    int employee_salary = 20000000;
    
    public int getEmployeeId(){
        return employee_id;
    }
    public String getEmployeeFirstName(){
        return employee_firstName;
    }
    public String getEmployeeLastName(){
        return employee_lastName;
    }
    public int getEmploySalary(){
        return employee_salary;
    }
    public void setEmployeeSalary(int salary){
        employee_salary = salary;
    }
    public int getannualSalary(){
        return employee_salary * 12;
    }
    public int raiseSalary(int percent){
        return employee_salary * percent;
    }
    @Override
    public String toString(){
        return "Employee: id "+employee_id+"\nFist Name "+employee_firstName+"\nLast name "+employee_lastName+"\nSalary "+employee_salary ;
    }
    public static void main(String[] args) {
        Ex3 a = new Ex3();
        System.out.println(a.toString());
        System.out.println("------------------------------");
        System.out.println(a.getannualSalary());
        System.out.println(a.raiseSalary(4));
      
        
    }
}
