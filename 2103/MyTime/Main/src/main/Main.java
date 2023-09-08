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
        MyTime time = new MyTime(11, 50, 40, true);
        
        //True PM, False AM
        
        
        
        if(time.isMeridian()){
            System.out.printf("Time is %02d:%02d:%02d PM\n", time.getHours(),time.getMinutes(), time.getSeconds());
        } else {
            System.out.printf("Time is %02d:%02d:%02d AM\n", time.getHours(),time.getMinutes(), time.getSeconds());
        }
        
        time.advanceTime(10);
        time.tickBySecond();
        time.tickByMinute();
        time.tickByHour();
        time.displayTime12();
        time.displayTime24();
        time.displayTime12();
        System.out.println(time);
    }
    
}
