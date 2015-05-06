////////////////////////////////////////////////////
//Allison Moroz
//Lab 12
//April 17, 2015
//Work with multidimensional arrays
//create matrices by using methods and multidimensional arrays

//add the class
public class Matrices{
    
    //add the main method
    public static void main (String [] args){
        
        //declare the variables to be used
        
        //randomly generate two widths and heights
        int widthA= (int) (Math.random()*10)+1;
        int widthB= (int) (Math.random()*10)+1;
        int heightA= (int) (Math.random()*10)+1;
        int heightB= (int) (Math.random()*10)+1;
        
        
        
        System.out.println("The first matrix is: ");
        int [] [] matrix=increasingMatrix(widthA, heightA, true);
        printMatrix(matrix, true);
        
        System.out.println("The second matrix is: ");
        int [] [] matrixB=increasingMatrix(widthA, heightA, false);
        printMatrix(matrixB, false);
        
        System.out.println("The third matrix is: ");
        int [] [] matrixC=increasingMatrix(widthB, heightB, true);
        printMatrix(matrixC, true);
        
        System.out.println("The added matrices are: ");
        int [] [] addedMatrixA=addMatrix(matrix, true, matrixB, false);
        
        System.out.println("The second set of added matrices are: ");
        
        int [] [] addedMatrixC=addMatrix(addedMatrixA, true, matrixC, true);
        
        
    }//end main method
    
    
    //add the method to create the first matrix with increasing numbers across rows
    public static int[][] increasingMatrix(int width, int height, boolean format){
        int c = 0;
       
        if(format){
            int [] [] arrayA = new int [width] [height]; //declares and allocates the array
            
            for(int a=0; a<arrayA.length; a++){
                for(int b=0; b<arrayA[a].length; b++){
                    arrayA[a][b]=c;
                    c++;
                }//end inside loop to manage the inside array
            }//end outside for loop to manage outside array
        return arrayA;  
        }//end if statement that should print a row-major matrix
       
       
       else{
           int [] [] arrayB = new int [height] [width]; // declares and allocates the array in the other variation
           
           for(int d=0; d<arrayB.length; d++){
               for(int e=0; e<arrayB[d].length; e++){
                   arrayB[d][e]=(e*height)+d;
               }//end nested for loop 
               
           }//end initial for loop 
           return arrayB;
       }//end else statement to create a column-major matrix
       
    }//end method increasingMatrix
    
    //add the method to print out the correctly formatted array from increasingMatrix
    public static void printMatrix(int [] [] array, boolean format){
        if(format){
            for(int c=0; c<array.length; c++){
                System.out.print("[ ");
                for(int d=0; d<array[c].length; d++){
                    System.out.print(array[c][d]+" ");
                }//end for loop for printing the numbers
                System.out.println("]");
            }//end first for loop 
            return;
        }//end if statement to print out the row-major matrix
        
        else{
            //declare the lengths of the array
            int width= array[0].length;
            
           for(int f=0; f<width; f++){
               System.out.print("[ ");
               for(int e=0; e<array.length; e++){
                   System.out.print(array[e][f]+" ");
               }//end nested for loop 
               System.out.println("]");
           } //end main for loop 
           return;
        }//end else statement to print out the column-major matrix
        
    }//end method printMatrix
    
    //add the method to change the format from row to column
    public static int [] [] translate(int [] [] array){
        int [] [] newArray= new int [array[0].length] [array.length];
        
        for(int a=0; a<array[0].length; a++){
            for(int b=0; b<array.length; b++){
                newArray[a][b]=array[b][a];
            }//end nested for loop     
        }//end outside for loop 
        
        return newArray;
    }//end method translate
    
    
    //write the methods to add and print the matrix
    public static int [] [] addMatrix(int a [] [], boolean formata, int b [] [], boolean formatb){
        
        int [] [] newMatrix= new int [a.length][a[0].length];
        
        if(formata!=true){
            a=translate(a);
            formata=true;
        }//end if statement to check formata
        
        if(formatb!=true){
            b=translate(b);
            formatb=true;
        }//end if statement to check formatb
        
        if((a.length==b.length)&&(a[0].length==b[0].length)){
           for(int i=0; i<a.length; i++){
               for(int j=0; j<a[i].length; j++){
                  newMatrix[i][j]=a[i][j]+b[i][j];
               }//end nested for loop 
           }//end outside for loop
           printMatrix(newMatrix, true);
           return newMatrix;
        }//end if statement 
        
        else{
            System.out.println("The matrices cannot be added!");
        }//end else statement 
        return null;
        
    }//end method addMatrix
    
}//end class