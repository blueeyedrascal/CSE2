/////////////////////////////////////////////////////////
// Allison Moroz
// Lab 03 Big Mac
// February 6, 2015
// User Input Lab
//
//First, input the Scanner class to use in the program. 

import java.util.Scanner;

//Now write the class and main method part of program
public class BigMac {
    //main method
    public static void main (String[] args){
        //declare instance of Scanner object. Is like declaring other variables
        Scanner myScanner;
        // call the Scanner constructor. tells Scanner that you are taking input from STDIN
        myScanner=new Scanner (System.in);
            //now you type commands to prompt the user to input data
            System.out.print("Enter the number of Big Macs (an integer > 0): ");
            //make statement to accept user input - this version will only accept an integer
            int nBigMacs = myScanner.nextInt();
            
            //prompt user for the input information about BigMacs
            System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx): ");
            double bigMac$=myScanner.nextDouble();
            System.out.print("Enter the percent tax as a whole number (xx): ");
            double taxRate=myScanner.nextDouble();
            taxRate/=100; //user enters %, but I want the proportion
            
            // end of input information. 
            
            //begin output information once have gathered the input information
            double cost$;
            int dollars, //whole dollar amount of cost
                dimes, pennies; //for storing digits tot eh right of the decimal point for the cost$
            cost$=nBigMacs*bigMac$*(1+taxRate); // get the whole amount, dropping decimal fraction
            dollars=(int)cost$; //get dimes amount, e.g.,
                                //(int)(6.73*10)% 10 -> 67%10 -> 7
                                //where the % (mod) operator returns the remainder
                                //after the division: 583%100 -> 83, 27%5 -> 2
            dimes= (int) (cost$*10)%10;
            pennies= (int) (cost$*100)%10;
            System.out.println("The total cost of "+nBigMacs+" BigMacs, at $"+bigMac$ +" per BigMac, with a"+
             " a sales tax of "+ (int) (taxRate*100)+ "%, is $"+dollars+'.'+dimes+pennies);
             
            
                
    }   //end of main method
    
}   //end of class