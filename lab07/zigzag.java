///////////////////////////////////////////////
//Allison Moroz
//Lab 07
//March 6, 2015
//ZigZag program

//import the scanner
import java.util.Scanner;

//add Class
public class zigzag{
    
    //add main method
    public static void main (String[]args){
        
        //declare the scanner
        Scanner myScanner;
        myScanner= new Scanner (System.in);
        
        //declare variables - use nStars as the sentinel variable - keeps the code in the right range
        int nStars=-1, counter=1, variable= 1;
        String spacer=" ", answer="y";
        
        //write while loop that asks whether user wants to continue the program
        while((answer.equals("Y"))||(answer.equals("y"))){
            
            //prompt user to enter an integer between 3 and 33
            System.out.print("Enter an integer between 3 and 33: ");
               
            //write while loop to check whether user has entered an appropriate integer
            while((!myScanner.hasNextInt())||((nStars=myScanner.nextInt())<3)||(nStars>33)){
                System.out.println("Invalid input, enter again.");
                myScanner=new Scanner (System.in);
            }//end while loop to accept user input
            
                //loop to print out nStars
                counter=1;
                while(counter<nStars){
                    System.out.print("*");
                    counter++;
                }//end while loop for nStars
            
                //write second loop (will be nested) to make a diagonal line
                
                for(counter=1; counter<nStars; counter++){
                    
                    for(variable=1; variable<counter; variable++){
                        System.out.print(spacer);
                    }//end nested for loop
                    
                    System.out.println("*");
                }//end for loop
                
                //write while loop to print out another straight line of stars
                counter=1;
                while(counter<=nStars){
                    System.out.print("*");
                    counter++;
                }//end while loop to print out bottom line of stars
                
        System.out.print("Enter y or Y to go again: "); //ask user to input information about continuing program
        answer=myScanner.next(); //store user input
        
        if((answer.equals("y"))||(answer.equals("Y"))){
            continue;
        }//end if statement to continue
        
        else{
            break;
        }//end else statement
        
        }//end while true loop
        
    }//end main method
    
    
}//end class