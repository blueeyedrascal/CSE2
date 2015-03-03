///////////////////////////////////////////////////////
//Allison Moroz 
//Due March 3rd
//Homework #6, Program #1
//have user input non-negative integers
//then add the integers
//use all non-nested for loops

//import scanner
import java.util.Scanner;

//add the class
public class GetIntegers{
    
    //add main method
    public static void main (String [] args){
        
        //initialize and declare scanner
        Scanner myScanner;
        myScanner= new Scanner (System.in);
        
        //initialize the variables
        int num1, num2, num3, num4, num5;
        
        //have user enter 5 non-negative integers. 
        System.out.println("Please enter 5 non-negative integers:");
    
        //write the for loop to get the proper solution
        for(num1= 0; (!myScanner.hasNextInt())||((num1=myScanner.nextInt())<0); myScanner=new Scanner (System.in)){
            System.out.println("Invalid input, enter again.");
        }//end first for loop
        
        for(num2=0; (!myScanner.hasNextInt())||((num2=myScanner.nextInt())<0); myScanner=new Scanner (System.in)){
            System.out.println("Invalid input, enter again.");
        }//end second for loop
        
        for(num3=0; (!myScanner.hasNextInt())||((num3=myScanner.nextInt())<0); myScanner=new Scanner (System.in)){
            System.out.println("Invalid input, enter again.");
        }//end third for loop
        
        for(num4=0; (!myScanner.hasNextInt())||((num4=myScanner.nextInt())<0); myScanner=new Scanner (System.in)){
            System.out.println("Invalid input, enter again.");
        }//end fourth for loop
        
        for(num5=0; (!myScanner.hasNextInt())||((num5=myScanner.nextInt())<0); myScanner=new Scanner (System.in)){
            System.out.println("Invalid input, enter again.");
        }//end fifth for loop
        
        System.out.println("Sum is "+ (num1+num2+num3+num4+num5));
        
    }//end main method
    
    
}//end class
