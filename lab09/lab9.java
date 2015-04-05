////////////////////////////////////////////////////
//Allison Moroz
//Lab 9 
//Due March 27th, 2015
//More work with methods
//using methods to create sentences

//import random number generator
import java.util.Random;
import java.util.Scanner;

//add the class
public class lab9{
    
    //add the main method
    public static void main (String[]args){
        
        //declare and initialize variables
        String answer = "y";
        
        //declare and initialize the scanner
        Scanner myScanner = new Scanner (System.in);
        
        //write loop to acquire the words for the sentence
            while((answer.equals("y"))||(answer.equals("Y"))){
            
              System.out.println("The "+adjectives()+" "+adjectives()+" "+subNouns()+" "+verbs()+" the "+adjectives()+" "+objNouns()+"."); 
              System.out.println("Would you like another sentence? (Enter y or Y to proceed)");
                answer=myScanner.next();
                while((answer!="y")&(answer!="Y")){
                    break;
                }//end nested while loop to test for the user input
            }//end while loop 
            
            
            
    }//end main method

    
    //write method to produce adjectives
    public static String adjectives(){
        
        Random randomGenerator= new Random();
        int randomInt = randomGenerator.nextInt(9); //generates ints less than 10
        
        switch(randomInt){
            case 1: return "lazy";
            case 2: return "blue";
            case 3: return "brown";
            case 4: return "quiet";
            case 5: return "boisterous";
            case 6: return "hot";
            case 7: return "noisy";
            case 8: return "plain";
            case 9: return "old";
            default: return "not an adjective";
            
        }//end switch statement 
    }//end method adjectives
    
    //write method to produce non-primary nouns to be the subject
    public static String subNouns(){
        
        Random randomGenerator= new Random();
        int randomInt = randomGenerator.nextInt(9); //generates ints less than 10
        
        switch(randomInt){
            case 1: return "dog";
            case 2: return "cat";
            case 3: return "giraffe";
            case 4: return "woman";
            case 5: return "man";
            case 6: return "girl";
            case 7: return "boy";
            case 8: return "rat";
            case 9: return "ferret";
            default: return "not a subject";
        }//end switch statement 
    }//end method subNouns 
    
    //write method to produce past-tense verbs
    public static String verbs(){
        
        Random randomGenerator= new Random();
        int randomInt = randomGenerator.nextInt(9); //generates ints less than 10
        
        switch(randomInt){
            case 1: return "ran";
            case 2: return "swam";
            case 3: return "skipped";
            case 4: return "jumped";
            case 5: return "jogged";
            case 6: return "typed";
            case 7: return "danced";
            case 8: return "passed";
            case 9: return "cleaned";
            default: return "not a verb";
        }//end switch statement 
    }//end method verbs
    
    //write a method to produce non-primary nouns to be the object
    public static String objNouns(){
        
        Random randomGenerator= new Random();
        int randomInt = randomGenerator.nextInt(9); //generates ints less than 10
        
        switch(randomInt){
            case 1: return "fence";
            case 2: return "chair";
            case 3: return "house";
            case 4: return "log";
            case 5: return "river";
            case 6: return "stream";
            case 7: return "tree";
            case 8: return "fox";
            case 9: return "bench";
            default: return "not an object";
        }//end switch statement 
    }//end method objNouns
    
    
}//end class