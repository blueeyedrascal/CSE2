//////////////////////////////////////////////////////////////////////////////////
// Allison Moroz
// January 30, 2015
// Lab 02
// Cyclometer Java Program 
// 
// Program should print information about a two way trip 
// Are given time and rotation count 
//
public class Cyclometer { 
    // main method
    public static void main (String [] args) {
        int secsTrip1=480; //time for first trip    
        int secsTrip2=3220; //time for second trip
        int countsTrip1=1561; //rotations first trip
        int countsTrip2=9037; //rotations second trip
    //variabls to store other pertinent information
        double wheelDiameter=27.0, //size given 
        PI=3.14159, //used to calculate diameter
            feetPerMile=5280, //used to calculate distance
            inchesPerFoot=12, // used to calculate distance
            secondsPerMinute=60; // used to calculate time
        double distanceTrip1, distanceTrip2, totalDistance; // all will be doubles
        
    //calculations
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + 
                " minutes and had " + countsTrip1 + " counts.");
        System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) +
                " minutes and had " + countsTrip2 + " counts.");
                
    // run the calculations. store the values. 
    //calculating the total distance taken, from inches to feet to miles.
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        distanceTrip1/=inchesPerFoot*feetPerMile;
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
    //Print out the distances that have been calculated
        System.out.println("Trip 1 was " + distanceTrip1 + " miles");
        System.out.println("Trip 2 was " + distanceTrip2 + " miles");
        System.out.println("The total distance was " +totalDistance+ " miles");
        
        
    }   // end of main method 
    
    
}// end of class