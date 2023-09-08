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
public class MyTime {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean meridian;

    public MyTime(int hours, int minutes, int seconds, boolean meridian) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.meridian = meridian;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isMeridian() {
        return meridian;
    }
    
    public void advanceTime(int sec){
        this.seconds = this.seconds + sec;
        
        //Method
        if(this.seconds > 59){
            this.seconds -= 60;
            this.minutes += 1;
            
            if(this.minutes > 59){
                this.minutes = 0;
                this.hours += 1;
                
                if(this.hours > 12){
                    this.hours = 1;
                    this.meridian = !this.meridian;
                }
            }
        }
        
        //Printing
        if(this.meridian){
            System.out.printf("Time is %02d:%02d:%02d PM\n", this.hours, this.minutes, this.seconds);
        } else {
            System.out.printf("Time is %02d:%02d:%02d AM\n", this.hours, this.minutes, this.seconds);
        }
        
    }
    
    public void tickBySecond(){
        ++this.seconds;
        
        if(this.seconds > 59){
            this.seconds -= 60;
            this.minutes += 1;
            
            if(this.minutes > 59){
                this.minutes = 0;
                this.hours += 1;
                
                if(this.hours > 12){
                    this.hours = 1;
                    this.meridian = !this.meridian;
                }
            }
        }
        
    }
    
    public void tickByMinute(){
        ++this.minutes;
        if(this.minutes > 59){
            this.minutes = 0;
            ++this.hours;
                
            if(this.hours > 12){
                this.hours = 1;
                this.meridian = !this.meridian;
            }

        }
        
        if(this.meridian){
            System.out.printf("Time is %02d:%02d:%02d PM\n", this.hours, this.minutes, this.seconds);
        } else {
            System.out.printf("Time is %02d:%02d:%02d AM\n", this.hours, this.minutes, this.seconds);
        }
    }
    
    public void tickByHour(){
        ++this.hours;
        if(this.hours > 12){
            this.hours = 1;
            this.meridian = !this.meridian;
        }
        
        if(this.meridian){
            System.out.printf("Time is %02d:%02d:%02d PM\n", this.hours, this.minutes, this.seconds);
        } else {
            System.out.printf("Time is %02d:%02d:%02d AM\n", this.hours, this.minutes, this.seconds);
        }
    }
    
    public void displayTime12(){
        if(this.meridian){
            if(this.hours > 12){
                this.hours -= 12;
            }
            System.out.printf("Time is %02d:%02d:%02d PM\n", this.hours, this.minutes, this.seconds);
        } else {
            System.out.printf("Time is %02d:%02d:%02d AM\n", this.hours, this.minutes, this.seconds);
        }
    }
    
    public void displayTime24(){
        if(this.meridian){
            this.hours += 12;
            if(this.hours == 24){
                this.hours = 0;
                this.meridian = !this.meridian;
            }
        } else if (this.meridian == false && this.hours == 12){
            this.hours = 0;
        }
        System.out.printf("Time is %02d:%02d:%02d\n", this.hours, this.minutes, this.seconds);
    }
    
    public String toString(){
        return hours + " " + minutes + " " + seconds;
    }
}
