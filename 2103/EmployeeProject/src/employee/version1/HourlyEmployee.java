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
public class HourlyEmployee {
    private int empID;
    private String empName;
    private String empDateHired; //date datatype siya... DD/MM/YYYY
    private String empBirthDate; //date datatype siya...
    private float totalHoursWorked;
    private float ratePerHour; //salary 1
    
    //3 cosntructors di pa sure ang mga dates
    
    public HourlyEmployee() {
        
    }

    public HourlyEmployee(String empName, String empBirthDate) {
        this.empName = empName;
        this.empBirthDate = empBirthDate;
    }

    public HourlyEmployee(int empID, String empName, String empDateHired, String empBirthDate, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = totalHoursWorked; 
        this.ratePerHour = ratePerHour; //76.25/hr
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

    public String getEmpDateHired() {
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

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    
    
    public double computeSalary(){
        double excessHoursTotal;
        
        if(this.totalHoursWorked > 40){
            excessHoursTotal = (this.totalHoursWorked - 40) * (1.5 * this.ratePerHour); // 8 hrs * 5 perWeek = 40hrs/week
            return excessHoursTotal + (40 * this.ratePerHour);
        } else {
            return this.totalHoursWorked * this.ratePerHour;
        }
    }
    
    public void displayInfo(){   
        
    }//display all w/salary

    @Override
    public String toString() {
        return "HourlyEmployee{" + "empID=" + empID + ", empName=" + empName + ", empDateHired=" + empDateHired + ", empBirthDate=" + empBirthDate + ", totalHoursWorked=" + totalHoursWorked + ", ratePerHour=" + ratePerHour + '}';
    }
    
    
}
