/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author User
 */
public class Account {
    private int number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

//    GETTERS
    
    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

//    SETTERS
    
    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    
    public void deposit(double cash){
        System.out.println("Depositing cash...");
        System.out.println("Money depositing: " + cash);
        System.out.println("Current balance: " + this.balance);
        this.balance += cash;
        System.out.println("Remaining balance: " + this.balance);
        
    }
    
    public void withdraw(double cash){
        if(this.balance < 0) {
            System.out.println("Negative Balance. Cannot withdraw any further.");
        } else if (this.balance < cash){
            System.out.println("Cash insufficient. Withdrawing current balance.");
            System.out.println("Current Balance: " + this.balance);
            System.out.println("Withdrawn: " + this.balance);
            this.balance = 0;
            System.out.println("Remaining Balance: " + this.balance);
        } else {
            this.balance -= cash;
            System.out.println("Current Balance: " + this.balance);
            System.out.println("Withdrawn: " + cash);
            System.out.println("Remaining Balance: " + this.balance);
        }
    }
    
}
