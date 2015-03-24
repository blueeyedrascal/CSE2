////////////////////////////////////////////////////////
//Allison Moroz
//Homework 8
//MG's Adventure World
//This homework is about working with methods and calling them appropriately

//import the scanner
import java.util.Scanner;

//add the class 
public class HW8{
    
    //add the main method
    public static void main(String[]args){
        char option;
        Scanner scan = new Scanner(System.in);  //declare/initialize the scanner
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit - "); //this asks the user whether they want to continue
        
        String input = getInput(scan, "Cc"); //this is where the first method is called
        
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit - ");
        input=getInput(scan, "Cc");
        
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave(); //this is where you will call the method cave to appear with a drawing of a cave. 
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit - ");
        input=getInput(scan, "Cc");
        
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit - ");
        input=getInput(scan, "Cc");
        
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant(); //this is where you call the method giant to appear with a drawing of the giant
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
        input=getInput(scan, "AaEe", 10); //this is the input for the method that will tell whether you have defeated the Giant
        
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three (3) treasure boxes in front of you! Enter the box number you want to open!");
        box(); //this is where you call the method to choose which box is being opened. 
        input=getInput(scan);
        
        System.out.println("Hero! Have a good day!");
        
    }//end the main method
    
    public static void giant(){ //this method prints out the image of a giant
        
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");

    }//end method for GIANT!! 
    
    public static void cave(){ //this method prints out the image of the cave
    
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    
    }//end the method for cave! 
    
    public static void box(){ //this method prints out the images of the treasure boxes for the end
        
        System.out.println("                     *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
        
    }//end the method for the treasure boxes
    
    //write the method getInput that accepts strings and continues the game
    public static String getInput(Scanner scan, String string){
        
        String letter = scan.next(); 
        
        if((letter.equals("C")) || (letter.equals("c"))){
            return letter;
        }// end if statment 
        
        else{
            System.out.println("Yea right LOSER!");
        }//end else statement 
        return letter;
        
    }//end string method getInput that accepts strings ONLY! 
    
    //write the last method to determine which treasure box gets opened and what is in it
    public static String getInput(Scanner scan, String string, int trial){
        String a, A, e, E;
        
        int total=0;
        trial = 10;
    
        while(total<=trial){
            string = scan.next();
            int count= (int) (Math.random()+.3);
            System.out.println(count);
            
            total+=count;
            
            switch(string){
                case "a":
                case "A":
                        if(count==1){
                            System.out.println("Critical Hit!");
                            break;
                        }//end if statement
                        else{
                            System.out.println("You missed!");
                            break;
                        }//end else statement
                    
                case "e":
                case "E":
                    int run=(int)(Math.random()*10)+1;
                    if(run==10){
                        System.out.println("You escaped successfully!");
                    }//end if statement
                    break;
                    
                default: 
                    System.out.println("Executed by GIANT! Game Over!");
                    break;
            }//end switch statement
            if(total<=10){
                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
            }//end if statement 
            
        }//end while loop 
        
        return string;
    }//end attack versus escape method
    
    //write the method to determine which box gets opened
    public static String getInput(Scanner scan){
        
        String box=scan.next();
        String answer;
        
        switch (box){
            case "1": 
                System.out.print("It's the Goblet of Fire! ");
                return "";
            case "2": 
                System.out.print("It's Ravenclaw's diadem! ");
                return "";
            case "3": 
                System.out.print("It's Slytherin's locket! ");
                return "";
            default: System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
            break;
        }//end switch statement
        return "";
    }//end treasure box method
    
}//end class