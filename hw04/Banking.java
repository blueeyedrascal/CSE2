/////////////////////////////////////////////////////////
//Allison Moroz
//Homework 4, Program #2
//Due February 17, 2015
//Banking
//Write a program to simulate working with a bank machine

//import the scanner
import java.util.Scanner;

//add the class
public class Banking{
    
    //add main method
    public static void main (String [] args){
        
        //declare the Scanner so you can use it
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //list the variables you are going to use
        int depositAmount, randomBalance, finalBalance, withdrawalAmount, choice;
        
            //obtain a random number between 1000 and 5000 for starting balance
            randomBalance= (int) (1000+(Math.random()*5000));
            System.out.print("You have $"+ (randomBalance)+" in your account.");
            System.out.println("    ");
            
                //What would you like to do with your account? 
                System.out.print("What would you like to do?");
                System.out.println("    ");
                System.out.println("    1) Deposit");
                System.out.println("    2) Withdrawal");
                System.out.println("    3) View Balance");
                choice = myScanner.nextInt();
                
                //write the cases for the switch statements
                switch (choice){
                    case 1: System.out.print("How much do you want to deposit? ");
                            depositAmount=myScanner.nextInt();
                                if(depositAmount>0){
                                    System.out.print("You now have $"+(depositAmount+randomBalance)+" in your account.");
                                    return;
                                }//end if depositAmount statement
                                else{
                                    System.out.print("You did not enter a valid amount.");
                                }//end else statement
                    break;        
                    case 2: System.out.print("How much do you want to withdrawal? ");
                            withdrawalAmount=myScanner.nextInt();
                                if(withdrawalAmount>0){
                                    if(withdrawalAmount<randomBalance){
                                        System.out.print("Your account balance is now $"+(randomBalance-withdrawalAmount));
                                        return;
                                    }//end withdrawal must be less than balance
                                    else{
                                        System.out.print("You must enter a number smaller than your balance.");
                                        return;
                                    }//end else statement
                                }//if withdrawal is greater than 0 statement
                                else{
                                    System.out.print("You must enter a value greater than 0.");
                                }//else withdrawal is less than 0
                    break;
                    case 3: System.out.print("Your balance is $"+randomBalance);
                    break;
                    default: System.out.println("You did not enter an appropriate option.");
                    
                }//close of switch choice
        
    }//end main method
    
}//end class
