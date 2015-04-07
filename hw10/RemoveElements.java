/////////////////////////////////////////////////////
//Allison Moroz
//Homework 10
//April 7, 2015
//This homework is more work with arrays and methods and mixing the two. 

//import the random number generator and scanner
import java.util.Random;
import java.util.Scanner;

//class and main method is given with the homework... must write the 3 extra methods
public class RemoveElements{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        int newArray1[];
        int newArray2[];
        int index,target;
            String answer="";
            do{
              System.out.print("Random input 10 ints [0-9]");
              num = randomInput();
              String out = "The original array is:";
              out += listArray(num);
              System.out.println(out);
         
              System.out.print("Enter the index ");
              index = scan.nextInt();
              newArray1 = delete(num,index);
              String out1="The output array is ";
              out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
              System.out.println(out1);
         
              System.out.print("Enter the target value ");
              target = scan.nextInt();
              newArray2 = remove(num,target);
              String out2="The output array is ";
              out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
              System.out.println(out2);
               
              System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
              answer=scan.next();
            }while(answer.equals("Y") || answer.equals("y"));
    }//end main method
 
  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }//end additional method listArray


    //method number 1 - generates array of 10 random numbers between 0&9, must return the array 
    public static int[] randomInput(){
        
        //declare and initialize the random number generator
        Random randomGenerator = new Random();
        
        //initialize array
        int [] num = new int [10];
        
        //initialize other variables
        int a=0;
        
        //add the loop to enter numbers into the array
        for(a=0; a<10; a++){
            num[a]=(int) randomGenerator.nextInt(10);
            
        }//end for loop 
        return num;
    }//end method randomInput()
    
    //method 2 - takes an integer array and an integer and creates a new array that is one fewer than list 
    public static int[] delete(int [] list, int pos){
      int a = 0;
      
      int [] newArray1 = new int [9];
      
        if(pos>list.length){
          System.out.println("You entered an int outside the bounds.");
        }//end if statement
        
       else{  //this should replace the variable in the array on the list
         int b=0;
         
         for(a=0; a<list.length; a++){
          
            if(a==pos){
              a++;
            }//end if statement 
          
          newArray1[b]=list[a];
          b++;
         }//end nested for loop  
         
       }//end else statement 
      return newArray1;
    }//end method delete(list, pos)
    
    //method 3 - removes numbers that match the target from the array
    public static int[] remove(int [] list, int target){
      
     
      int count=0;
      
      for(int d=0; d<list.length; d++){
        
        if(list[d]==target){
          count++;
        }//end if statement
        
      }//end first for loop 
      
      int[] newArray2 = new int [list.length-count];
      
      int d = 0; 
       
      for(int g=0; g<list.length; g++){
  
        if(list[g]==target){
          g++;
        }//end if statement 
        
        newArray2[d]=list[g];
        d++;
      }//end for loop 
      
      return newArray2;
    }//end method remove(list, target)


}//end class
