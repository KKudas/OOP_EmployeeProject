/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeproject;
import employee.version1.*;

/**
 *
 * @author User
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HourlyEmployee employee1 = new HourlyEmployee(12, "asdf", "10/02/2003", "10/02/2020", 35, 76.25F);
        PieceWorkerEmployee employee2 = new PieceWorkerEmployee(14, "fdsa", "1/1/11", "2/2/22", 200, 76.25F);
        CommissionEmployee employee3 = new CommissionEmployee(16, "vczv", "2/1/21", "3/4/5", 12000);
        BasePlusCommisionEmployee employee4 = new BasePlusCommisionEmployee(16, "vczv", "2/2/11", "6/4/15", 5000, 12000);

        double salaryOfEmployee1 = employee1.computeSalary();
        System.out.println("Employee 1 Salary is: " + salaryOfEmployee1);

        double salaryOfEmployee2 = employee2.computeSalary();
        System.out.println("Employee 2 Salary is: " + salaryOfEmployee2);

        double salaryOfEmployee3 = employee3.computeSalary();
        System.out.println("Employee 3 Salary is: " + salaryOfEmployee3);

        double salaryOfEmployee4 = employee4.computeSalary();
        System.out.println("EMployee 4 Salary is: " + salaryOfEmployee4);
    }
}
