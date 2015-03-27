/////////////////////////////////////////////////////////////////////////
//Allison Moroz 
//Lab 08
//this lab prints out super factorials
//this is practice with calling methods

//import the Scanner
import java.util.Scanner;

//add the class
public class Factorials{
    
    //add the main method
    public static void main (String[]args){
        Scanner scan = new Scanner (System.in);
        int amount=-1, v=0, n=0;
        
        System.out.print("Please enter a positive int: ");
            
        if((scan.hasNextInt())&&((n=scan.nextInt())>0)){   
            while(v<=n){
                amount+=factorial(v);
                v++;
            }//end nested while loop 
         }//end if statement  
        System.out.println(print(n, amount));
    }//end the main method
    
    public static int factorial(int input){
        int num =1;
        int v=1;
        
        while(v<=input){
            num*=v;
            v++;
        }//end while loop
        return num;
    }//end method factorial
    
    public static String print(int input, int sum){
        
        return ("The super factorial of "+input+" is "+sum);
    }//end method print
    
}//end class
