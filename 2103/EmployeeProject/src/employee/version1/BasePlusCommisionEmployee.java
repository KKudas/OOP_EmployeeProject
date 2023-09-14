/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

/**
 *
 * @author User
 */
public class BasePlusCommisionEmployee {
    private int empID;
    private String empName;
    private String empDateHired; //date datatype siya... DD/MM/YYYY
    private String empBirthDate; //date datatype siya...
    private double totalSales;
    private double baseSalary;
    
    //3 constructor
    public BasePlusCommisionEmployee() {
    }

    public BasePlusCommisionEmployee(String empName, String empBirthDate) {
        this.empName = empName;
        this.empBirthDate = empBirthDate;
    }

    public BasePlusCommisionEmployee(int empID, String empName, String empDateHired, String empBirthDate, double baseSalary, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.baseSalary = baseSalary;
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String   getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(String empDateHired) {
        this.empDateHired = empDateHired;
    }

    public String getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(String empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

                                //function to call commission employee
    public double computeSalary(){
        double total;
        if (this.totalSales < 50000){
            total =  0.5 * this.totalSales;
        } else if (this.totalSales >= 50000 && this.totalSales < 100000){
            total = 0.20 * this.totalSales;
        } else if (this.totalSales >= 100000 && this.totalSales < 500000){
            total = 0.30 * this.totalSales;
        } else {
            total = 0.50 * this.totalSales;
        }
        return total + baseSalary;
    }


    public void displayInfo(double salary){
        System.out.println("Employee ID: " + this.empID);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Date Hired: " + this.empDateHired);
        System.out.println("Birth Date: " + this.empBirthDate);
        System.out.println("Base Salary: " + this.baseSalary);
        System.out.println("Salary: " + salary);
    }

    @Override
    public String toString() {
        return "BasePlusCommisionEmployee{" + "empID=" + empID + ", empName=" + empName + ", empDateHired=" + empDateHired + ", empBirthDate=" + empBirthDate + ", baseSalary=" + baseSalary + '}';
    }
    
    
}
