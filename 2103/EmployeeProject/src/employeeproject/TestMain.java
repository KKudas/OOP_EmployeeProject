/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeproject;
import employee.version1.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author User
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //No INPUT STRING
        HourlyEmployee employee1 = new HourlyEmployee(12, "Ralph Mandigma", "02-10-2003", "10-02-2020", 35, 76.25F);
        PieceWorkerEmployee employee2 = new PieceWorkerEmployee(14, "Miguel Mandigma", "01-10-2011", "02-02-2022", 200, 76.25F);
        CommissionEmployee employee3 = new CommissionEmployee(16, "Rapahel Dela Rosa", "02-10-2021", "03-05-2023", 12000);
        BasePlusCommisionEmployee employee4 = new BasePlusCommisionEmployee(16, "Michael Dela Rosa", "02-02-2011", "06-04-2015", 5000, 12000);  
        
        double salaryOfEmployee1 = employee1.computeSalary();
        System.out.println(employee1.getEmpName() + " Salary is: " + salaryOfEmployee1);
        employee1.displayInfo(salaryOfEmployee1);
        System.out.printf("\n");
        
        double salaryOfEmployee2 = employee2.computeSalary();
        System.out.println(employee2.getEmpName() + " Salary is: " + salaryOfEmployee2);
        employee2.displayInfo(salaryOfEmployee2);
        System.out.printf("\n");

        double salaryOfEmployee3 = employee3.computeSalary();
        System.out.println(employee3.getEmpName() + " Salary is: " + salaryOfEmployee3);
        employee3.displayInfo(salaryOfEmployee3);
        System.out.printf("\n");

        double salaryOfEmployee4 = employee4.computeSalary();
        System.out.println(employee4.getEmpName() + " Salary is: " + salaryOfEmployee4);
        employee4.displayInfo(salaryOfEmployee4);
    }
}
