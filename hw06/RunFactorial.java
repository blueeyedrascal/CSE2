///////////////////////////////////////////////////////////////////
//Allison Moroz
//Due March 3rd
//Homework #6, Program #2
//have user enter an integer between 9 and 16
//run the factorial for the answer

//import the scanner
import java.util.Scanner;

//add the class
public class RunFactorial{

    //add the main method
    public static void main (String [] args){
        
        //declare and initialize the scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //declare/initialize variables
        int factorial, answer, nextNum;
    
        //have user enter input info
        System.out.println("Please enter an integer that is between 9 and 16: ");
        
        //write while loop to check that it is truly an integer in that range
        
            while((!myScanner.hasNextInt())||((factorial=myScanner.nextInt())<9)||(factorial>16)){
                System.out.println("Invalid integer, enter again.");
                myScanner=new Scanner (System.in);
            }//end while loop 
            
            answer=1;
            nextNum=factorial;
            while(nextNum>1){
                answer=answer*nextNum;
                nextNum--;
            }//end while loop
        
        System.out.println("Input accepted:");
        System.out.println(factorial+"!="+answer);
            
        
   
   
   
    }//end the main method
    
    
}//end class