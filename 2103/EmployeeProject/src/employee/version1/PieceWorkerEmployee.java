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
public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private String empDateHired; //date datatype siya... DD/MM/YYYY
    private String empBirthDate; //date datatype siya...
    private int totalPiecesFinished;
    private float ratePerPiece;
    
    //3 consttructors

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

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    public double computeSalary(double salary){
        int excessPiecesTotal;
        if(this.totalPiecesFinished > 100){
            excessPiecesTotal = this.totalPiecesFinished - 100;
            excessPiecesTotal /= 100;
            return (excessPiecesTotal * 10) + (100 * this.ratePerPiece);
        } else {
            return this.totalPiecesFinished * this.ratePerPiece;
        }
    }
    
    public void displayInfo(){
        //display all w/salary
    }

    @Override
    public String toString() {
        return "PieceWorkerEmployee{" + "empID=" + empID + ", empName=" + empName + ", empDateHired=" + empDateHired + ", empBirthDate=" + empBirthDate + ", totalPiecesFinished=" + totalPiecesFinished + ", ratePerPiece=" + ratePerPiece + '}';
    }
    
    
}
