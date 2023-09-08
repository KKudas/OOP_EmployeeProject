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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account bankAccount = new Account();
        
        bankAccount.setNumber(22100890);
        bankAccount.setBalance(5000.00);
        bankAccount.setName("Ralph Miguel D. Mandigma");
        bankAccount.setEmail("22100890@usc.edu.ph");
        bankAccount.setPhoneNumber("09610847123");
        
        
        
        bankAccount.withdraw(2000);
        bankAccount.deposit(1999.99);
    }
    
}
