//////////////////////////////////////////
//Allison Moroz 
//Homework 03
//Due February 10, 2015
//Cube Root Calculator
//rough estimates of cube roots

//import the Scanner
import java.util.Scanner;

//class
public class Root{
    //main method
    public static void main (String[]args){
      
    //declare the Scanner
    Scanner myScanner;
    myScanner= new Scanner (System.in);
    
    //prompt user to enter a double
    System.out.print("Enter a double and I print its cube root: ");
    double guess= myScanner.nextDouble();
    
    //list the variables
    double cube, estimate, estimate2, estimate3, estimate4, estimate5, total; 
   
    
        //calculate the crude guess of the double
        cube=guess/3;
        
        //calculate the cube with the estimate, these estimates refine themselves
        estimate= ((2*cube*cube*cube+guess)/(3*cube*cube)); 
        estimate2=((2*estimate*estimate*estimate+guess)/(3*estimate*estimate));
        estimate3=((2*estimate2*estimate2*estimate2+guess)/(3*estimate2*estimate2));
        estimate4=((2*estimate3*estimate3*estimate3+guess)/(3*estimate3*estimate3));
        estimate5=((2*estimate4*estimate4*estimate4+guess)/(3*estimate4*estimate4));
        
        //estimated answer
        total = estimate5*estimate5*estimate5;
        
        //print out the information
        System.out.println("The cube root is "+estimate5+": ");
        System.out.println(estimate5 + "*"+ estimate5+ "*"+estimate5 + "="+ total);
    
        
    }//end main method
    
}//end class