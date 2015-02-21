/////////////////////////////////////////
//Allison Moroz
//Lab 05
//February 20, 2015
//Space Exploration

//This program uses a random number generator to give information about space exploration over a number of years. 
//randomly generates a year within a given range and then produces all of the information as well. 

//add the class
public class SpaceExploration{
    //write the main method
    public static void main (String [] args){
        
        int randomYear=(int) (Math.random()*11)+2000;
        System.out.println("Here is a timeline of space exploration events from "+(randomYear)+" to 2000:");
        
        switch (randomYear){
            case 2010:
                System.out.println("2010: SpaceX successfully sends spacecraft to orbit and back.");
            case 2009:
                System.out.println("2009: N/A");
            case 2008:
                System.out.println("2008: Kepler launched to study deep space.");
            case 2007:
                System.out.println("2007: N/A");
            case 2006:
                System.out.println("2006: Spacecraft returns with collections from a comet.");
            case 2005:
                System.out.println("2005: Spacecraft collides with comet.");
            case 2004:
                System.out.println("2004: N/A");
            case 2003:
                System.out.println("2003: Largest infrared telescope released.");
            case 2002:
                System.out.println("2002: N/A");
            case 2001:
                System.out.println("2001: First spacecraft lands on asteriod.");
            case 2000:
                System.out.println("2000: First spacecraft orbits an asteroid.");
                break;
        
        }//end switch statement
        
        
    }//end main method
    
}//end class