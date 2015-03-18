///////////////////////////////////////////////////////////////
//Allison Moroz
//Due March 17, 2015
//Homework 7
//Work with nested loops

//create waves of numbers based on integer entered

//import a scanner
import java.util.Scanner;

//add class
public class Waves{
    
    //add main method
    public static void main (String [] args){
        
        //initialize and declare the scanner
        Scanner myScanner;
        myScanner= new Scanner (System.in);
        
        //iniitialize the variables
        int variable, start=0, num, interval=0, value;
        String space= "";
        
        //ask user for input
        System.out.print("Enter a number between 1 and 30: ");
        
        
            //write the first while loop to check whether and appropriate integer was entered. 
            while ((!myScanner.hasNextInt())||((variable=myScanner.nextInt())<1)||(variable>30)){
                System.out.println("Invalid input, enter again. ");
                myScanner=new Scanner (System.in);
            }//end while loop to analyze user input 
                
                //write the first for loop to make a wave
                System.out.println("FOR LOOP: ");
                for(start=0; start<variable; start++){
                    interval++;
                    
                   if(interval%2==0){
                       
                        for(num=0; num<=start; num++){
                            space=(space+interval);
                            System.out.println(space);
                        }//end nested for loop
                        
                   }//end if statement
                   
                   else{
                       
                       for(num=start; num>=0; num--){
                           
                           for(value=0; value<=num; value++){
                               System.out.print(interval);
                           }//end nested for loop
                           
                           System.out.println("");
                       }//end for loop 
                       
                   }//end else statement
                   
                    space="";
                }//end initial for loop 
                
                
            //write While loop to do the wave as well    
            System.out.println("WHILE LOOP: "); 
            
            interval=0; //re-initialize variables to start again 
            start=0;
            
            while(start<variable){
                interval++;
                
                if(interval%2==0){
                    
                    num=0;
                    while(num<=start){
                        space=(space+interval);
                        System.out.println(space);
                        num++;
                    }//end nested while loop 
                }//end if statement 
                
                else{
                    
                    num=start;
                    while(num>=0){
                        
                        value=0;
                        while(value<=num){
                            System.out.print(interval);
                            value++;
                        }//end nested while loop 2
                        
                        System.out.println("");
                        num--;
                    }//end nested while loop 
                }//end else statement
                
                start++;
                space="";
            }//end initial while loop 
            
            //write do-while loop to make another wave
            System.out.println("DO-WHILE LOOP: ");
            
             interval=0; //re-initialize variables to start again
                start=0;
                
                do{
                    interval++;
                    
                    if(interval%2==0){
                        
                        num=0;
                        do{
                            space=(space+interval);
                            System.out.println(space);
                            num++;
                        }while(num<=start); //end do while loop in if statement
                    }//end if statement
                    
                    else{
                        num=start;
                        do{
                            
                            value=0;
                            
                            do{
                                System.out.print(interval);
                                value++;
                            }while(value<=num); //end nested do while loop in else statement
                            
                            System.out.println("");
                            num--;
                        }while(num>=0); //end outside do while loop in else statement
                        
                    }//end else statement
                    
                    start++;
                    space="";
                }while(start<variable); //end intitial do while loop 
        
        
    }//end main method
    
    
    
}//end class