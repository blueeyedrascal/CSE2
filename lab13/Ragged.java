///////////////////////////////////////////////
//Allison Moroz 
//Lab 13 
//Work with Ragged Arrays and sorting 

//import random number generator
import java.util.Random;

//add the class
public class Ragged{
    
    //add the main method
    public static void main (String [] args){
        
        //declare and initialize the random number generator
        Random randomGen = new Random();
        
        //declare/initialize/allocate the outside array
        
        int [] [] outArray = new int [5] [];
        int j = 1; 
        
        
        //fill the ragged array with random numbers from 0-39 and then print it out
        System.out.println("The array before sorting: ");
        for(int a=0; a<outArray.length; a++){
            System.out.print("row "+(j++)+": ");
            outArray[a] = new int [a*3+5];
            for(int b=0; b<outArray[a].length; b++){
                outArray[a][b]= (int) randomGen.nextInt(39);
                System.out.print(outArray[a][b]+" ");
            }//end nested for loop to fill the ragged array
            System.out.println(" ");
        }//end for loop to go through the outside array and print it 
    
        
        //sort the array from smallest to largest
        System.out.println("The array after sorting: ");
        for(int x=0; x<outArray.length; x++){
            sort(outArray[x]);
            
        }//end outside for loop 
        printMatrix(outArray);
        
        //then convert the arrays to be a rectangular array and print it out
        int [] [] recArray= new int [5][4*3+5];
        System.out.println("The array after sorting and copying: ");
        recArray=convert(outArray);
        printMatrix(recArray);
        
    }//end main method
    
    //add a method to sort the array 
    public static void sort(int [] sortArray){
        //declare and initialize variables for the method 
        int index=0;
        
        for(int a=0; a<sortArray.length; a++){
            int min=99;
            for(int b=a; b<sortArray.length; b++){
                if(sortArray[b]<min){
                    min=sortArray[b];
                    index=b;
                }//end nested if statement 
            }//end nested for loop
        int temp=sortArray[a];
        sortArray[a]=min;
        sortArray[index]=temp;
        }//end outside for loop 
        
        return;
    }//end method to sort the array
    
    public static void printMatrix(int [] [] array){
        
        for(int x=0; x<array.length; x++){
            for(int z=0; z<array[x].length; z++){
                System.out.print(array[x][z]+" ");
            }//end for loop for printing the numbers
            System.out.println(" ");
        }//end first for loop 
        
        return;
    }//end method printMatrix
    
    //convert all of the arrays into arrays of the same length
    public static int [] [] convert(int [] [] newArray){
        int [] [] conArray = new int [5] [4*3+5];
        
        for(int a=0; a<conArray.length; a++){
           for(int b=0; b<conArray[a].length; b++){
                if(b<newArray[a].length){
                    conArray[a][b]=newArray[a][b];
                }//end if statement    
                else{
                    conArray[a][b]=0;
                }//end else statement 
            
            }//end nested for loop 
        }//end outside for loop 
        
        return conArray;
    }//end method to convert the methods
    
}//end class
