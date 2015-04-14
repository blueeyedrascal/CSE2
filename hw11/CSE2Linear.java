////////////////////////////////////////////////////////////////
//Allison Moroz
//Homework 11
//Due April 14 2015
//Work on searching and sorting throught arrays
//more work with binary and linear search

//import scanner and random number generator
import java.util.Scanner;
import java.util.Random;

//add the class
public class CSE2Linear{
    
    //add the main method
    public static void main (String [] args){
        
        //declare & intialize the scanner
        Scanner myScanner = new Scanner (System.in);
        
        //initialize/declare/allocate the array
        int [] finalGrades = new int [15];
        
        //declare/initialize variables
        String search;
        int c=0;
        
        //ask the user to input grades into the array
        System.out.println("Enter 15 ints for final grades in CSE2:");
        int memory=0;
        for(int input=0; input<15; input++){ 
            finalGrades[input]=check(myScanner, memory);
            memory=finalGrades[input];
        }//end for loop to enter integers into the array
        
        System.out.print("The grades, sorted, are: "); //prints out the array 
        for(int b=0; b<finalGrades.length; b++){
            System.out.print(" "+finalGrades[b]);
        }//end for loop to print out the array
        
        System.out.println(" ");
        System.out.print("Enter a grade to search for: "); //ask user to enter a number to search for
        binary(finalGrades, myScanner); //implements the binary search method
        
        System.out.println("Scrambled: ");
        scrambled(finalGrades[c], finalGrades); //implement the method to scramble the array
        for(c=0; c<finalGrades.length; c++){
            System.out.print(finalGrades[c]+" "); //prints out the scrambled array
        }//end for loop to print out the scrambled array
        
        System.out.println(" ");
        System.out.print("Enter a grade to search for: ");
        linear(finalGrades, myScanner); //implements the linear search of the scrambled array
        
        
    }//end main method
    
    //write first method... this one checks to make sure the user enters appropriate information
    public static int check (Scanner myScanner, int user){
   
        int num = 0;
        boolean answer = true;
   
        while(answer){
            myScanner = new Scanner (System.in);
            
            if(myScanner.hasNextInt()){
                if(((num=myScanner.nextInt())>0)&&(num<101)){
                    if(num>=user){
                        answer=false;
                    }//end if statement 
                    
                    else{
                        System.out.println("You did not enter an int greater than the previous");
                    }//end nested else statement 
                }//end if statement 
                else{
                    System.out.println("Your int is out of range.");
                }//end else statement 
            }//end if statement checking for an int
            else{
                System.out.println("You did not enter an int");
            }//end else statement 
            
        }//end while loop 
        return num;
    }//end method check
    
    //write method to do the linear search for after sorting the array
    public static void linear(int [] array2, Scanner myScanner){
        
        int num= myScanner.nextInt();
        int iterations = 0;
        
        for(int i = 0; i<array2.length; i++){
            
            if(array2[i]==num){
                System.out.println(num+" was found in the list with "+iterations+" iterations.");
                return;
            }//end if statement
            iterations++;
               
          }//end for loop 
           System.out.println(num+" was not found in the list with "+iterations+" iterations.");
                return;
    }//end method to do the linear search
    
    //write the method to do the binary search on the array 
    public static void binary(int []array2, Scanner myScanner){
        
        int search = myScanner.nextInt(); //gives you the number you are searching for 
        int k=array2.length-1; //the upper bound
        int i=0; //the lower bound
        int j=(i+k)/2 ; //your current location (the middle range)
        int iterations = 0; //counts how many times the program has to run 
        
        while(k>i+1){
            if(search>array2[j]){
                i=j;
                j=(k+i)/2;
            }//end if statement
            
            if(search==array2[j]){
                System.out.println(search+" was found with "+iterations+" iterations.");
                return;
            }//end if statement 
            
            if(search<array2[j]){
                k=j;
                j=(k+i)/2;
               
            }//end if statement 
            
            iterations++;
        }//end while loop 
        
       System.out.println(search+" was not found with "+iterations+" iterations.");
       return;
    }//end binary search method 
    
    //write the method to scramble the array randomly
    public static void scrambled(int array, int []array1){
        
        //declare/initialize the random number generator
        Random randomGen= new Random();
        int g = array;
        int num = 0;
        
        for(g=0; g<array1.length; g++){
            num= (int) (randomGen.nextInt(array1.length-1));
            
            int remember= array1[num];
            array1[num]=array1[g];
            array1[g]= remember;
            return;
        }//end for loop to scramble the array
        
    }//end method to scramble the array
}//end class