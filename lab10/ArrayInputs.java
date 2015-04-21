//////////////////////////////////////////////////
//Allison Moroz
//April 3, 2015
//Lab 10 
//Work with Arrays

//import scanner
import java.util.Scanner;

//add the class
public class ArrayInputs{
    
    //add method
    public static void main (String [] args){
        
        //declare & initialize the scanner
        Scanner myScanner = new Scanner (System.in);
        
        //declare the variables
        int size, input, array;
        
        //declare the array to be used
        int[] personalNum;
        
        System.out.print("Please enter an integer for the size of an array: "); //gathers info for the size of the array
        size=myScanner.nextInt();
        
        //use input to allocate the array
        personalNum=new int [size];
    
        for(int i=0; i<size; i++){
            System.out.print("Please enter a positive integer: ");
            personalNum[i]=arrayVals(myScanner); 
        }//end for loop to fill the array
        
        System.out.println("The array is: ");
        for(int a=0; a<size; a++){
            System.out.println(personalNum[a]);
        }//end for loop to print out the array
        
    }//end main method
    
    //write method to check whether you input a positive integer into the second question
    public static int arrayVals (Scanner myScanner){
        
        int input=0;
    
        while(true){
            
            if((myScanner.hasNextInt())&&((input=myScanner.nextInt())>0)){
                return input; 
               
            }//end third while loop 
            
            else{
                if(!myScanner.hasNextInt()){
                    System.out.println("Sorry, you didn't enter an integer.");
                    System.out.print("Please enter a positive integer. ");
                }//end first while loop 
            
                if(input<0){
                    System.out.println("Sorry, the number you entered is negative.");
                    System.out.print("Please enter a positive integer, ");
                }//end second while loop 
            }//end else statement 
            
       
        }//end while loop
       
    }//end second method
    
}//end class
