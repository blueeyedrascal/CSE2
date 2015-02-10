/////////////////////////////////////////////////
//Allison Moroz
//Homework 03
//Due February 10, 2015
//Writes the first 4 decimal points after a number 
//
//import the scanner
import java.util.Scanner;

//class
public class FourDigits{
    //main method
    public static void main (String []args){
        
    //declare the scanner 
    Scanner myScanner;
    myScanner= new Scanner (System.in);
    
        //prompt user to enter the data needed
        System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
        double decimalNumber = myScanner.nextDouble(); //give the user input a variable
        
        //list the other variables being used and declare them
        int decimalDigits, rightDigit, rightDigit1, rightDigit2, rightDigit3; 
       
        
        //cast the number so that it prints the numbers to the right of the decimal
        decimalDigits=(int) (decimalNumber*10000)%10000; //use this to move the decimal point and then leave the remainder behind
        rightDigit= (decimalDigits/1000); //just divide to get the first number past the decimal
        rightDigit1=(decimalDigits/100)%10; //divide and then use % so that you are only left with the number you need
        rightDigit2=(decimalDigits/10)%10; //divide to get the right number and then use % so it is left with the next number
        rightDigit3=(decimalDigits%10); //only use % because you want the last number 
        
            //print out the information
            System.out.println("The four digits are "+rightDigit+rightDigit1+rightDigit2+rightDigit3);
        
    }//end main method
    
}//end class