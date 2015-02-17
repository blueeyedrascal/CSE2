////////////////////////////////////////////////////////////
//Allison Moroz
//Homework 4
//due February 17
//Which Number
//works with if statements to play a number guessing game

//import Scanner class
import java.util.Scanner;

//add the class
public class WhichNumber{ //a
    //write the main method
    public static void main (String [] args){ //b
        
        //declare scanner or it won't do anything 
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //list the variables you are going to need
        String answerEven, divisibleByThree, answerSix;
        String divisibleFour, greaterOne, answerEight, answerFour;
        String divisibleFive, answerTen, answerTwo;
        String divisibleThree, threeOne, answerNine, answerThree;
        String greaterSix, answerSeven;
        String lessThree, answerOne, answerFive;
        
            //prompt user to think of a number between 1 and 10
            System.out.print("Think of a number between 1 and 10, inclusive.");
            System.out.println("  ");
            
            //Begin playing 20 questions to guess the number
            System.out.print("Is the number even? ");
            answerEven=myScanner.next();
                
                if(answerEven.equals("Y")||answerEven.equals("y")){
                    System.out.print("Is it divisible by three? ");
                    divisibleByThree=myScanner.next();
                            
                        if(divisibleByThree.equals("Y")||divisibleByThree.equals("y")){
                            System.out.print("Is your number 6? ");
                            answerSix=myScanner.next();
                                        
                                if(answerSix.equals("Y")||answerSix.equals("y")){
                                    System.out.println("Yay!");
                                    return;
                                }//end if answerSix
                        }//end if divisibleByThree
                                
                        else{
                            System.out.print("Is the number divisible by 4? ");
                            divisibleFour=myScanner.next();
                                        
                                if(divisibleFour.equals("Y")||divisibleFour.equals("y")){
                                    System.out.print("Is the number divided by 4 greater than 1? ");
                                    greaterOne=myScanner.next();
                                    
                                        if(greaterOne.equals("Y")||greaterOne.equals("y")){
                                            System.out.print("Is your number 8? ");
                                            answerEight=myScanner.next();
                                            
                                                if(answerEight.equals("Y")||answerEight.equals("y")){
                                                    System.out.println("Yay!");
                                                    return;
                                                }//end answerEight
                                        }//end if greaterOne 
                                        
                                        else{
                                            System.out.print("Is your number 4?");
                                            answerFour=myScanner.next();
                                            
                                                if(answerFour.equals("Y")||answerFour.equals("y")){
                                                    System.out.println("Yay!");
                                                    return;
                                                }//end answerFour    
                                        }//end else greaterOne
                                }//end if divisibleFour 
                                
                                else{
                                    System.out.print("Is it divisible by 5? ");
                                    divisibleFive=myScanner.next();
                                    
                                        if(divisibleFive.equals("Y")||divisibleFive.equals("y")){
                                            System.out.print("Is your number 10? ");
                                            answerTen=myScanner.next();
                                            
                                                if(answerTen.equals("Y")||answerTen.equals("y")){
                                                    System.out.println("Yay!");
                                                    return;
                                                }//end if answerTen
                                        }//end if divisibleFive
                                        
                                        else{
                                            System.out.print("Is your number 2? ");
                                            answerTwo=myScanner.next();
                                            
                                                if(answerTwo.equals("Y")||answerTwo.equals("y")){
                                                    System.out.println("Yay!");
                                                    return;
                                                }//end if answerTwo
                                        }//end else divisibleFive
                                }//end else divisibleFour
                        }//end else divisibleByThree
                    }//end if answerEven
                    
                    else{
                        System.out.print("Is it divisible by 3? ");
                        divisibleThree=myScanner.next();
                        
                            if(divisibleThree.equals("Y")||divisibleThree.equals("y")){
                                System.out.print("When divided by 3, is the result greater than 1? ");
                                threeOne=myScanner.next();
                                
                                    if(threeOne.equals("Y")||threeOne.equals("y")){
                                        System.out.print("Is your number 9?");
                                        answerNine=myScanner.next();
                                        
                                            if(answerNine.equals("Y")||answerNine.equals("y")){
                                                System.out.print("Yay!");
                                                return;
                                            }//end if answerNine
                                    }//end if threeOne
                                    
                                    else{
                                        System.out.print("Is your number 3? ");
                                        answerThree=myScanner.next();
                                        
                                            if(answerThree.equals("Y")||answerThree.equals("y")){
                                                System.out.println("Yay!");
                                                return;
                                            }//end if answerThree
                                    }//end else threeOne
                            }//end if divisibleThree
                            
                            else{
                                System.out.print("Is it greater than 6? ");
                                greaterSix=myScanner.next();
                                
                                    if(greaterSix.equals("Y")||greaterSix.equals("y")){
                                        System.out.print("Is your number 7? ");
                                        answerSeven=myScanner.next();
                                                
                                                if(answerSeven.equals("Y")||answerSeven.equals("y")){
                                                    System.out.println("Yay!");
                                                    return;
                                                }//end if answerSeven
                                    }//end if greaterSix
                                    
                                    else{
                                        System.out.print("Is is less than 3? ");
                                        lessThree=myScanner.next();
                                            
                                            if(lessThree.equals("Y")||lessThree.equals("y")){
                                                System.out.print("Is your number 1? ");
                                                answerOne=myScanner.next();
                                                        
                                                    if(answerOne.equals("Y")||answerOne.equals("y")){
                                                        System.out.println("Yay!");
                                                        return;
                                                    }//end if answerOne
                                            }//end if lessThree
                                            
                                            else{
                                                System.out.print("Is your number 5? ");
                                                answerFive=myScanner.next();
                                                
                                                    if(answerFive.equals("Y")||answerFive.equals("y")){
                                                        System.out.println("Yay!");
                                                        return;
                                                    }//end if answerFive
                                            }//end else lessThree
                                    }//end else greaterSix
                            }//end else divisibleThree
                    }//end else answerEven
            
           
        
        
    }//end main method  b
    
}//end class a