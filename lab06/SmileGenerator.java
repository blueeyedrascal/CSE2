/////////////////////////////////////////////////////
//Allison Moroz
//February 27, 2015
//Lab 06
//Smile Generator - Loops exercise
//This program will print happy faces based on a loop

//add the class
public class SmileGenerator{
    
    //add the main method
    public static void main (String [] args){
       
       //state the variables
       int initial;
       String counter;
       
       //Start Step 1 instructions
       //write the for loop to print 5 smiley faces
       for (initial=0; initial<5; initial++){
           System.out.print(":)");
       }//end for loop
       
       System.out.println(" ");//provides spacing between rows of smiley faces
       
       //write the while loop to print 5 smiley faces
       initial=0;
       while (initial<5){
           System.out.print(":)");
           initial++; //increases the initial number so the loop ends
       }//end while loop
       
       System.out.println(" ");//provides spacing between rows of smiley faces
       
       //write the do-while loop to print 5 smiley faces
        initial=0;    
        do{
            System.out.print(":)");
            initial++; //increases the number so it is not continuous
        } while (initial<5); //ends the do-while loop
        
        System.out.println(" "); //creates space between rows of smiley faces
        
        //Start Step 2: print a random number of smiley faces between 1 & 100
        int random = (int) (Math.random()*100) + 1; //provides a random number between 1 & 100
        initial=1; //gives a starting value
        
        while(initial<=random){
            System.out.print(":)");
            initial++;
        }//end while loop
        
        //Step 3: Limit number of smiley faces to 30 per line
        initial=0;
        while(initial<=random){
            if((initial%30)==0){
                System.out.println(" ");
            }//end if statement
            System.out.print(":)");
            initial++;
        }//end for loop
        
        //Step 4: increase number of smiley faces per line by one 
        initial=1;
        counter=("");
        
        while(initial<=random){
            counter=(counter+":)");
            System.out.println(counter);
            initial++;
        }//end while loop
        
        
    }//end main method
    
    
}//end class
