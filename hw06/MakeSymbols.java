//////////////////////////////////////////////////////////
//Allison Moroz
//due March 3rd
//Homework #6, Program #3
//randomly generate a number between 0 & 100
//depending on whether it is even or not print out certain symbols

//add the class
public class MakeSymbols{
    
    //add the main method
    public static void main (String [] args){
        
        //declare variables 
        int random, start;
        
        //generate a random number 
        random=(int) (0+(Math.random()*100));
        
        System.out.println (random);
        
        if (random%2==0){
            start=0;
            do{
                System.out.print("*");
                start++;
            }while((start<=random)); 
        }//end if statement
        
        else{
            start=1;
            do{
                System.out.print("&");
                start++;
            }while((start<=random));
        }//end else statement
        
        
    }//end main method
    
    
}//end class