//////////////////////////////////////////////
//Allison Moroz
//February 13, 2015
//Lab 04
//Cookies
//First intro to if/else statements
//have the computer figure out whether you have enough cookies for a group. 

//import the scanner to use
import java.util.Scanner;

//add the class
public class Cookies{
    //the main method
    public static void main (String [] args){
        
        //declare the scanner
        Scanner myScanner;
        myScanner= new Scanner (System.in);
        
        //list the variables that need to be stored
        int nPeople, nCookies, nPerPerson, nDivided;
        
            //prompt user to input number of people coming
            System.out.print("Enter the number of people:");
            
            //if statement dealing with nPeople
            if (myScanner.hasNextInt()){
                nPeople = myScanner.nextInt();
                    if(nPeople<0){
                        System.out.println("You have entered an int < 0");
                        return; //ends the program
                    }//end nested if statement
                    
            }//end of people if statement
            else{
                System.out.println("You did not enter an int");
                return;
            }//end else statement
            
            //prompt user to enter the number of cookies
            System.out.print("Enter the number of cookies you are planning to buy: ");
            
            //if statement dealing with nCookies
            if(myScanner.hasNextInt()){
                nCookies=myScanner.nextInt();
                    if (nCookies<0){
                        System.out.println("You have entered an int < 0");
                        return;
                    }//end nested Cookie if statement
            }//end Cookie if statement
            else{
                System.out.println("You did not enter an int");
                return;
            }//end cookie else statement
            
            //prompt user to enter info about how many cookies per person
            System.out.print("How many do you want each person to get? ");
            
            //write if statement for per person
            if (myScanner.hasNextInt()){
                nPerPerson=myScanner.nextInt();
                    if(nPerPerson<0){
                        System.out.println("You have entered an int < 0");
                        return;
                    }//end nested if statement
            }//end main per person if statement
            else{
                System.out.println("You did not enter an int");
                return;
            }//end else statement
            
            //Find out whether you have enough cookies
            if(nPerPerson>nCookies/nPeople){
                System.out.println("You do not have enough for each person.");
                System.out.println("You need "+((nPeople*nPerPerson)-nCookies)+" more to have enough.");
            }//end main if statement
            else{
                if((nPerPerson==nCookies/nPeople)||(0==nPerPerson%(nCookies/nPeople))){
                   System.out.println("You have enough cookies and they will divide evenly."); 
                }//end nested if statement
                else{
                    System.out.println("You will have enough cookies, but they will not divide evenly.");
                }//end nested else statement
            }//end else statement
            
    }//end main method
    
}//end class