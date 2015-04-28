//////////////////////////////////////////////////////////
//Allison Moroz
//Due April 28, 2015
//homework 13
//more practice on multidimensional arrays

//import the scanner 
import java.util.Scanner;

//add the class
public class FourDwin{
    
    //add the main method
    public static void main (String [] args){
        
        //declare and initialize the scanner
        Scanner myScanner = new Scanner (System.in);
        
        //declare and initizlie variables
        boolean answer=true;
        int integerX=0, integerY=0;
        
        System.out.print("Enter an intger X: ");
        while(answer){
            if(myScanner.hasNextInt()){
                if((integerX=myScanner.nextInt())>0){
                    answer=false;
                }//end nested if statement
                else{
                    System.out.println("Invalid input. You did not enter an int>0.");
                    integerX=myScanner.nextInt();
                }//end nested else statement 
            }//end if statement about having integer
            else{
                System.out.println("Invalid input. You did not enter an int.");
                integerX=myScanner.nextInt();
            }//end outside else statement 
        }//end while loop to check for next int
        
        
        answer=true;
        System.out.print("Enter an integer Y where Y>X: ");
        while(answer){
            if(myScanner.hasNextInt()){
                if((integerY=myScanner.nextInt())>integerX){
                    answer=false; 
                }//end if statement to check that Y >X 
                else{
                    System.out.println("Invalid input. Please enter an integer for Y>X:");
                    integerY=myScanner.nextInt();
                }//end else statement to check that Y>X
            }//end if statement to check for an int
            else{
                System.out.println("Invalid input. Please enter an integer for Y>X:");
                integerY=myScanner.nextInt();
            }//end else statement 
        }//end while loop to check for the next int 
        
        //create the 4D array and fill it with numbers
        
        double [] [] [] [] fourArray = new double [3] [integerX] [integerY] [];
        for(int a=0; a<fourArray.length; a++){
            for(int b=0; b<fourArray[a].length; b++){
                for(int c=0; c<fourArray[a][b].length; c++){
                    fourArray[a][b][c]=new double [(int) (Math.random()*5)+1];
                    for(int d=0; d<fourArray[a][b][c].length; d++){
                        fourArray[a][b][c][d]= (double)(((int)(Math.random()*300))/10.0);
                    }//end fourth for loop 
                }//end third for loop 
            }//end second for loop 
        }//end for loop for outermost array
        
        //call the method to print out the array you just created
        System.out.println("Original Array:");
        printArray(fourArray);
        
        //call the method to sort the 3D arrays
        sort3DArray(fourArray);
        
        //call the method to sort the 4D arrays
        sort4DArray(fourArray);
        
        System.out.println("Sorted Array:");
        printArray(fourArray);
        
        statArray(fourArray);
        
    }//end the main method
    
    //write method to print out the array
    public static void printArray(double [][][][] fourArray){ 
     
     System.out.print("[");
     for(int a=0; a<fourArray.length; a++){
            System.out.print("[");
            for(int b=0; b<fourArray[a].length; b++){
                System.out.print("[");
                for(int c=0; c<fourArray[a][b].length; c++){
                    System.out.print("[ ");
                    for(int d=0; d<fourArray[a][b][c].length; d++){
                        System.out.print(fourArray[a][b][c][d]+", ");
                    }//end fourth for loop 
                    System.out.println("]");
                }//end third for loop 
                System.out.print("]");
            }//end second for loop 
            System.out.print("]");
        }//end for loop for outermost array
        System.out.println("]");
        
    }//end method to print the array
    
    //write the method to sort the 4d Array
    public static void sort4DArray(double [] [] [] [] arrayA){
        
        int elements=0;
        int recall;
        double min=31;
        double oldMin=32;
        double [] [] [] holder;
        
        for(int a=0; a<arrayA.length; a++){
            recall=elements;
            elements=0; //reset the number of elements each time so can compare
            
            for(int b=0; b<arrayA[a].length; b++){
                for(int c=0; c<arrayA[a][b].length; c++){
                    for(int d=0; d<arrayA[a][b][c].length; d++){
                        if(arrayA[a][b][c][d]<min){
                            min=arrayA[a][b][c][d];
                        }//end if statement to find the min of the array
                        elements++;
                    }//end fourth for loop 
                }//end third for loop 
            }//end second for loop 
            
            if(recall>=elements){
                if(recall==elements){
                    if(min<oldMin){
                        holder=arrayA[a-1];
                        arrayA[a-1]=arrayA[a];
                        arrayA[a]=holder;
                    }//end if statement to check the mins
                }//end if statement for if they are equal
                else{
                    holder=arrayA[a-1];
                    arrayA[a-1]=arrayA[a];
                    arrayA[a]=holder;
                }//end else statement 
            }//end if statement about the old and new element numbers
            
        }//end for loop 
        
        return;
       
        
    }//end method to sort the 4D array 
    
    //write the method to sort the 3d arrays inside the 4d array
    public static void sort3DArray(double [] [] [] [] arrayB){
        
        int index=0;
        
        for(int a=0; a<arrayB.length; a++){
            for(int b=0; b<arrayB[a].length; b++){
                
                for(int c=0; c<arrayB[a][b].length; c++){
                    
                        for(int x=0; x<arrayB[a][b][c].length; x++){
                            double min =99;
                            for(int y=x; y<arrayB[a][b][c].length; y++){
                                if(arrayB[a][b][c][y]<min){
                                    min=arrayB[a][b][c][y];
                                    index=y;
                                }//end if statement 
                            }//end for loop
                        double temp=arrayB[a][b][c][x];
                        arrayB[a][b][c][x]=min;
                        arrayB[a][b][c][index]=temp;
                        }//end sorting loop 
                   
                    
                }//end third for loop 
            }//end second for loop 
        }//end for loop for outermost array
        
       
    }//end method to sort 3d arrays
    
    //add the method to get the statistics of the array
    public static void statArray(double [] [] [] [] mathArray){
        //need to print out the sum, mean and number of elements 
        
        //declare the variables to be used
        double sum=0, mean=0;
        int elements=0;
        
        for(int a=0; a<mathArray.length; a++){
            for(int b=0; b<mathArray[a].length; b++){
                for(int c=0; c<mathArray[a][b].length; c++){
                    for(int d=0; d<mathArray[a][b][c].length; d++){
                        sum+=mathArray[a][b][c][d];
                        elements++;
                    }//end fourth for loop 
                }//end third for loop 
            }//end second for loop
        }//end first for loop 
        
         mean = sum/elements;
    
    System.out.println("Members: "+elements);
    System.out.println("Sum: "+sum);
    System.out.println("Mean: "+mean);
        
    }//end method statArray
    
   //This homework was extremely hard to understand and the instructions given were very unclear. 
   //The examples given did not include the ranges of the problems and made understanding EXACTLY what was expected almost impossible. 
    
}//end the class