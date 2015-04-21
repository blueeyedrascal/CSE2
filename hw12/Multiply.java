/////////////////////////////////////////
//Allison Moroz
//Homework 12
//Due April 21, 2015
//Work with Multi-dimensional arrays

//use multi-dimensional arrays to multiply matrices

//import the scanner and random number generator
import java.util.Scanner; 
import java.util.Random;

//add the class
public class Multiply{
    
    //add the main method
    public static void main (String [] args){
        
        //declare and initialize the scanner
        Scanner myScanner= new Scanner (System.in);
        
        //declare and initialize the variables to be used
        int widthA=0, heightA=0, widthB=0, heightB=0;
        
        //ask the user to input height & width for two matrices 
        do{    
            System.out.println("Please enter a height for matrixA: ");
            boolean conditionHA=true;
            while(conditionHA){
                if(myScanner.hasNextInt()){
                    if((heightA=myScanner.nextInt())>0){
                        conditionHA=false;
                    }//end if statement checking that input is higher than 0
                    else{
                        System.out.println("Your int is less than 0, try again.");
                        heightA=myScanner.nextInt();
                    }//end else statement if number is less than 0
                }//end if statement checking that input is an integer
                else{
                    System.out.println("You did not enter an integer, try again.");
                    heightA=myScanner.nextInt();
                }//end else statement if an integer is not entered
            }//end while loop to check for integer
            
            System.out.println("Please enter a width for matrixA: ");
            boolean conditionWA=true;
            while(conditionWA){
                if(myScanner.hasNextInt()){
                    if((widthA=myScanner.nextInt())>0){
                        conditionWA=false;
                    }//end if statement checking that the input is higher than 0
                    else{
                        System.out.println("Your int is less than 0, try again.");
                        widthA=myScanner.nextInt();
                    }//end else statement if int is less than 0
                }//end if statment checking that input is an integer
                else{
                    System.out.println("You did not enter an integer, try again.");
                    widthA=myScanner.nextInt();
                }//end else statement if intger is not entered
            }//end second while loop 
            
            System.out.println("Please enter a height for matrixB: ");
            boolean conditionHB=true;
            while(conditionHB){
                if(myScanner.hasNextInt()){
                    if((heightB=myScanner.nextInt())>0){
                        conditionHB=false;
                    }//end if statement checking that the input is higher than 0
                    else{
                        System.out.println("Your int is less than 0, try again.");
                        heightB=myScanner.nextInt();
                    }//end else statement if int is less than 0
                }//end if statment checking that input is an integer
                else{
                    System.out.println("You did not enter an integer, try again.");
                    heightB=myScanner.nextInt();
                }//end else statement if intger is not entered
            }//end third while loop 
            
            System.out.println("Please enter a width for matrixB: ");
            boolean conditionWB=true;
            while(conditionWB){
                if(myScanner.hasNextInt()){
                    if((widthB=myScanner.nextInt())>0){
                        conditionWB=false;
                    }//end if statement checking that the input is higher than 0
                    else{
                        System.out.println("Your int is less than 0, try again.");
                        widthB=myScanner.nextInt();
                    }//end else statement if int is less than 0
                }//end if statment checking that input is an integer
                else{
                    System.out.println("You did not enter an integer, try again.");
                    widthB=myScanner.nextInt();
                }//end else statement if intger is not entered
            }//end fourth while loop
            
        }while(widthA!=heightB); 
        
        System.out.println(" ");
        
        System.out.println("MatrixA is: ");
        int [] [] matrixA=randomMatrix(widthA, heightA);
        printMatrix(matrixA);
        
        System.out.println(" ");
        
        System.out.println("MatrixB is: ");
        int [] [] matrixB=randomMatrix(widthB, heightB);
        printMatrix(matrixB);
        
        System.out.println("MatrixA times MatrixB is: ");
        int [] [] matrixC=matrixMultiply(matrixA, matrixB);
        printMatrix(matrixC);
        
       
    }//end main method
    
    //write method to generate the random matrices
    public static int [] [] randomMatrix(int width, int height){
        
        //declare/initialize the random number generator
        Random randomGen= new Random();
        
        //declare/initialize/allocate the array 
        int [] [] matrix = new int [width] [height];
        
        for(int a=0; a<matrix.length; a++){
            for(int b=0; b<matrix[a].length; b++){
                matrix[a][b]= (int) (randomGen.nextInt(20)-10);
            }//end nested for loop 
        }//end outside for loop 
        
        return matrix;
    }//end method randomMatrix
    
    //write the method to print out the matrix you created
    public static void printMatrix(int [] [] array){
        
        for(int c=0; c<array.length; c++){
            System.out.print("[ ");
            for(int d=0; d<array[c].length; d++){
                System.out.print(array[c][d]+" ");
            }//end for loop for printing the numbers
            System.out.println("]");
        }//end first for loop 
        
        return;
        
    }//end method printMatrix
    
    //write the method to multiply the matricies together
    public static int [] [] matrixMultiply(int [] [] firstMatrix, int [] [] secondMatrix){
        
        int [] [] matrixC = new int [firstMatrix.length][firstMatrix[0].length];
        
        for(int a=0; a<firstMatrix.length; a++){
            for(int b=0; b<firstMatrix[a].length; b++){
                for(int c=0; c<secondMatrix[a].length; c++){
                    matrixC[a][b]=(firstMatrix[a][c]*secondMatrix[c][b])+matrixC[a][b];
                }//end third for loop
            }//end nested for loop 
        }//end outside for loop 
        return matrixC;
    }//end method matrixMultiply
        
}//end class