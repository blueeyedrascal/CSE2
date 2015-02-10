///////////////////////////////////////////
//Allison Moroz
//Homework 3
//Due February 10th
//Bicycle trip calcultor
//user inputs data
//
//first import the scanner class
import java.util.Scanner;
//class and main method
public class Bicycle {
    //main method
    public static void main (String[] args){
        Scanner myScanner; //declare the scanner
        myScanner = new Scanner (System.in);
        
        //information that prints out the prompts
        System.out.print("Enter the number of seconds per trip: ");
        int nSeconds= myScanner.nextInt();   //this tells the computer to accept the users input
        System.out.print("Enter the number of counts: ");
        int nCounts= myScanner.nextInt(); //gives the user's input a variable
        
        //information input for the calculations
        double wheelDiameter= 27.0,
        PI= 3.14159, 
        feetPerMile= 5280,
        inchesPerFoot=12,
        secondsPerMinute=60,
        minutesPerHour=60;
        double distanceTotal, minutesTotal, averageSpeed, distanceTotalFinal;
        
        //calculations for distance, minutes and speed
        distanceTotal=(nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile); //calculates the total distance
        minutesTotal=(nSeconds/secondsPerMinute); //calculates how many minutes
        averageSpeed=(int)((distanceTotal/(minutesTotal/minutesPerHour))*100)/100.0; //calculates the average miles per hour
        distanceTotalFinal=(int)((nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile)*100)/100.0;//gives more precision to the print out
        
        //create the printout information
        System.out.println("The distance was "+distanceTotalFinal+" miles and took "+minutesTotal+" minutes.");
        System.out.println("The average mph was "+averageSpeed);
        
        
        
    }   //end main method
    
}   //end class