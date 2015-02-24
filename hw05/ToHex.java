////////////////////////////////////////
// Allison Moroz
// Homework 5
// due February 24, 2015
// Decimal to Hex converter

//This program should take input and output hexidecimal numbers. 

//import the scanner
import java.util.Scanner;

//write the class
public class ToHex {
    //add the main method
    public static void main (String [] args){
        
        //declare the scanner
        Scanner myScanner;
        myScanner= new Scanner (System.in);
        
        //declare the variables to be used later
        int red, blue, green;
        int redDivide, blueDivide, greenDivide;
        int redMod, blueMod, greenMod;
        String hexRed1="0", hexRed2="0", hexBlue1="0", hexBlue2="0", hexGreen1="0", hexGreen2="0";
        String finalHex="0";
        
        //prompt user to enter information
        System.out.println("Please enter three numbers representing RGB values: "); 
        
        //write if statements to check whether an integer was entered
        if (myScanner.hasNextInt()){
            red=myScanner.nextInt(); blue=myScanner.nextInt(); green=myScanner.nextInt(); //all numbers initiated
            
            //write if statement to make sure that the numbers are within the appropriate range
            if ((0<=red)&&(red<=255)&&(0<=blue)&&(blue<=255)&&(0<=green)&&(green<=255)){
                redDivide=red/16; //finds the first number for hex
                redMod=red%16; //finds the second number for hex
                blueDivide=blue/16; //finds the first number for hex
                blueMod=blue%16; //finds the second number for hex
                greenDivide=green/16; //finds the first number for hex
                greenMod=green%16; //finds the second number for hex
                
                    switch(redDivide){
                        case 0:
                            hexRed1="0";
                            break;
                        case 1:
                            hexRed1="1";
                            break;
                        case 2:
                            hexRed1="2";
                            break;
                        case 3:
                            hexRed1="3";
                            break;
                        case 4:
                            hexRed1="4";
                            break;
                        case 5:
                            hexRed1="5";
                            break;
                        case 6:
                            hexRed1="6";
                            break;
                        case 7:
                            hexRed1="7";
                            break;
                        case 8:
                            hexRed1="8";
                            break;
                        case 9:
                            hexRed1="9";
                            break;
                        case 10:
                            hexRed1="A";
                            break;
                        case 11:
                            hexRed1="B";
                            break;
                        case 12:
                            hexRed1="C";
                            break;
                        case 13:
                            hexRed1="D";
                            break;
                        case 14:
                            hexRed1="E";
                            break;
                        case 15:
                            hexRed1="F";
                            break;
                    }//end redDivide switch statement
                    
                    switch(redMod){
                        case 0:
                            hexRed2="0";
                            break;
                        case 1:
                            hexRed2="1";
                            break;
                        case 2:
                            hexRed2="2";
                            break;
                        case 3:
                            hexRed2="3";
                            break;
                        case 4:
                            hexRed2="4";
                            break;
                        case 5:
                            hexRed2="5";
                            break;
                        case 6:
                            hexRed2="6";
                            break;
                        case 7:
                            hexRed2="7";
                            break;
                        case 8:
                            hexRed2="8";
                            break;
                        case 9:
                            hexRed2="9";
                            break;
                        case 10:
                            hexRed2="A";
                            break;
                        case 11:
                            hexRed2="B";
                            break;
                        case 12:
                            hexRed2="C";
                            break;
                        case 13:
                            hexRed2="D";
                            break;
                        case 14:
                            hexRed2="E";
                            break;
                        case 15:
                            hexRed2="F";
                            break;
                    }//end redMod switch statement
                    
                    switch(blueDivide){
                        case 0:
                            hexBlue1="0";
                            break;
                        case 1:
                            hexBlue1="1";
                            break;
                        case 2:
                            hexBlue1="2";
                            break;
                        case 3:
                            hexBlue1="3";
                            break;
                        case 4:
                            hexBlue1="4";
                            break;
                        case 5:
                            hexBlue1="5";
                            break;
                        case 6:
                            hexBlue1="6";
                            break;
                        case 7:
                            hexBlue1="7";
                            break;
                        case 8:
                            hexBlue1="8";
                            break;
                        case 9:
                            hexBlue1="9";
                            break;
                        case 10:
                            hexBlue1="A";
                            break;
                        case 11:
                            hexBlue1="B";
                            break;
                        case 12:
                            hexBlue1="C";
                            break;
                        case 13:
                            hexBlue1="D";
                            break;
                        case 14:
                            hexBlue1="E";
                            break;
                        case 15:
                            hexBlue1="F";
                            break;
                    }//end blueDivide switch statment
                    
                    switch(blueMod){
                        case 0:
                            hexBlue2="0";
                            break;
                        case 1:
                            hexBlue2="1";
                            break;
                        case 2:
                            hexBlue2="2";
                            break;
                        case 3:
                            hexBlue2="3";
                            break;
                        case 4:
                            hexBlue2="4";
                            break;
                        case 5:
                            hexBlue2="5";
                            break;
                        case 6:
                            hexBlue2="6";
                            break;
                        case 7:
                            hexBlue2="7";
                            break;
                        case 8:
                            hexBlue2="8";
                            break;
                        case 9:
                            hexBlue2="9";
                            break;
                        case 10:
                            hexBlue2="A";
                            break;
                        case 11:
                            hexBlue2="B";
                            break;
                        case 12:
                            hexBlue2="C";
                            break;
                        case 13:
                            hexBlue2="D";
                            break;
                        case 14:
                            hexBlue2="E";
                            break;
                        case 15:
                            hexBlue2="F";
                            break;
                    }//end blueMod switch statement
                    
                    switch(greenDivide){
                        case 0:
                            hexGreen1="0";
                            break;
                        case 1:
                            hexGreen1="1";
                            break;
                        case 2:
                            hexGreen1="2";
                            break;
                        case 3:
                            hexGreen1="3";
                            break;
                        case 4:
                            hexGreen1="4";
                            break;
                        case 5:
                            hexGreen1="5";
                            break;
                        case 6:
                            hexGreen1="6";
                            break;
                        case 7:
                            hexGreen1="7";
                            break;
                        case 8:
                            hexGreen1="8";
                            break;
                        case 9:
                            hexGreen1="9";
                            break;
                        case 10:
                            hexGreen1="A";
                            break;
                        case 11:
                            hexGreen1="B";
                            break;
                        case 12:
                            hexGreen1="C";
                            break;
                        case 13:
                            hexGreen1="D";
                            break;
                        case 14:
                            hexGreen1="E";
                            break;
                        case 15:
                            hexGreen1="F";
                            break;
                    }//end greenDivide switch statement
                    
                    switch(greenMod){
                        case 0:
                            hexGreen2="0";
                            break;
                        case 1:
                            hexGreen2="1";
                            break;
                        case 2:
                            hexGreen2="2";
                            break;
                        case 3:
                            hexGreen2="3";
                            break;
                        case 4:
                            hexGreen2="4";
                            break;
                        case 5:
                            hexGreen2="5";
                            break;
                        case 6:
                            hexGreen2="6";
                            break;
                        case 7:
                            hexGreen2="7";
                            break;
                        case 8:
                            hexGreen2="8";
                            break;
                        case 9:
                            hexGreen2="9";
                            break;
                        case 10:
                            hexGreen2="A";
                            break;
                        case 11:
                            hexGreen2="B";
                            break;
                        case 12:
                            hexGreen2="C";
                            break;
                        case 13:
                            hexGreen2="D";
                            break;
                        case 14:
                            hexGreen2="E";
                            break;
                        case 15:
                            hexGreen2="F";
                            break;
                    }//end greenMod switch statement
                    
                    //create the final string of all variables to make the hexadecimal number
                    finalHex=hexRed1+hexRed2+hexBlue1+hexBlue2+hexGreen1+hexGreen2;
                    
                    //write out final print statement
                    System.out.println("The decimal numbers R:"+red+", B:"+blue+", G:"+green+", are represented in hexadecimal as:"+finalHex);
           
            }//end nested if statement
            
            else {
            System.out.println("Sorry, you must enter values between 0 and 255.");
            }//end nested else statement
        
        }//end main if statement
        
        else{
            System.out.println("Sorry, your input must consist of integers.");
        }
        
    }//end main method 
    
}//end class