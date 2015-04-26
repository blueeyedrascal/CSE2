////////////////////////////////////////////////////
//Allison Moroz 
//Lab 11
//April 10, 2015
//More work with Arrays and searching for information within them. 

//import the scanner and random number generator
import java.util.Scanner;
import java.util.Random;

//add the class
public class Arrays{
    
    //add the main method
    public static void main (String [] args){
        
        //declare/intialize the Scanner and Random number generator
        Scanner myScanner = new Scanner (System.in);
        Random randomGenerator = new Random();
        
        //initialize and declare variables
        int user=0;
        
        //declare/allocate/initialize
        int [] array1 = new int [50];
        int [] array2 = new int [50];
        
        //fill array1 with random integers between 0-100
        for (int a = 0; a<50; a++){
            array1[a]= (int) randomGenerator.nextInt(100);
        }//end for loop to fill in array1
        
        //write for loop to search for the max
        int max=0, index=0;
        for(int b=0; b<array1.length; b++){
           
            if(array1[b]>max){
                max=array1[b];
                index =b;
            }//end if statement 
            
        }//end for loop to search for the maximum
        System.out.println("The maximum of array1 is: "+index);
    
    
        //write loop to search for the minimum value
        int min=9999, value=0;
        for(int d=1; d<array1.length; d++){
            
            if(array1[d]<min){
                min=array1[d];
                value=d;
            }//end if statement
            
        }//end for loop to search for the minimum
        System.out.println("The minimum of array1 is: "+value);
        
        //input numbers into array2, start with number between 0-100, then increase them 
        int total =0;
        for (int x = 0; x<50; x++){
            array2[x]+= (int) randomGenerator.nextInt(100);
        }//end for loop to fill in array2
        
        //write the for loop to search for the maximum of array2
        int upper=0, number=0;
        for(int n=0; n<array2.length; n++){
           
            if(array2[n]>upper){
                upper=array2[n];
                number =n;
            }//end if statement 
            
        }//end for loop to search for the maximum
        System.out.println("The maximum of array2 is: "+number);
        
        //write the for loop to search for the minimum value of array2
        int lower=9999, input=0;
        for(int c=1; c<array2.length; c++){
            
            if(array2[c]<lower){
                lower=array2[c];
                input=c;
            }//end if statement
            
        }//end for loop to search for the minimum
        System.out.println("The minimum of array2 is: "+input);
        
        //ask the user to enter input
        System.out.print("Enter an int: ");
        if(!myScanner.hasNextInt()){
            System.out.println("You did not enter an int");
        }//end if statment 
        
        if((user=myScanner.nextInt())<0){
            System.out.println("You did not enter an int>0");
        }//end if statement 
        
        //use binary search to find the number the user entered
        //declare the variables
        int top = array2.length-1;
        int middle= (top+lower)/2;
        int bottom= 0;
        
            while(top>=bottom){
                if(top==bottom+1){
                    System.out.println(user+" was not found on the list");
                    System.out.println("The number above the search was "+top);
                    System.out.println("The number below the search was "+bottom);
                    break;
                }//end first if statment 
                if(user>array2[middle]){
                    bottom=middle;
                    middle=(top+bottom)/2;
                }//end second if statement 
                if(user==array2[middle]){
                    System.out.println("Number was found in the "+middle+" section.");
                    break;
                }//end third if statement 
                if(user<array2[middle]){
                    top=middle;
                    middle=(top+bottom)/2;
                }//end fourth if statement 
            }//end while loop 
    
    
        
        
    }//end main method
    
}//end class