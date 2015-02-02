/////////////////////////////////////////////////////////
// Allison Moroz
// Hw 02 
// Arithmetic Calculations
// 
// Program to calculate the cost of buying items at Walmart
// Practice with variables and values
//
public class Arithmetic {
    //main method
    public static void main (String [] args) {
        int nSocks=3;    //number of pairs of socks
        double sockCost$=2.58;   //cost of pair of socks. $ included in name
        int nGlasses=6; //number of drinking glasses
        double glassCost$=2.29;  // cost per class
        int nEnvelopes=1;   //number of boxes of envelopes
        double envelopeCost$=3.25;    //cost per box
        double taxPercent=0.06;     //sales tax amount in PA
        double totalSockCost$, totalGlassCost$, totalEnvelopeCost$; //all will be doubles
        double salesTaxSocks, salesTaxGlass, salesTaxEnvelopes;
        double totalCost$, totalPlusTax$, finalPlusTax$;
        
        // explanations of variables 
            System.out.println("You are buying "+nSocks+ " pairs of socks at "+
                    sockCost$+" each.");    //states number of socks bought and how much they cost 
            System.out.println("You are buying "+nGlasses+" drinking glasses at "+
                    glassCost$+ " each.");  //states number of glasses bought and how much they are 
            System.out.println("You are buying "+nEnvelopes+" boxes of envelopes at "+
                    envelopeCost$+" each.");    //states number of boxes of envelopes bought and how much they are
                    
        // Calculations of cost and sales tax per item            
            totalSockCost$=nSocks*sockCost$;    //calculates total cost of socks
            salesTaxSocks=totalSockCost$*taxPercent;    //calculates the sales tax on socks
            totalGlassCost$=nGlasses*glassCost$;    //calculates total cost of glasses
            salesTaxGlass=totalGlassCost$*taxPercent;   //calculates sales tax on glasses
            totalEnvelopeCost$=nEnvelopes*envelopeCost$;    //calculates total cost of box of envelopes
            salesTaxEnvelopes=totalEnvelopeCost$*taxPercent;    //calculates sales tax on box of envelopes
            
            totalCost$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;   //total cost of all items together
            totalPlusTax$=((totalCost$*taxPercent)+totalCost$)*100; //total cost with sales tax included and beginning of casting
            finalPlusTax$=(int) (totalPlusTax$)/100.0;  //total cost in integer form to remove extra decimal places
        
            
        // Print out of information after calculations
            System.out.println("Socks cost "+totalSockCost$+" .");
            System.out.println("Their sales tax is "+salesTaxSocks+" ."); //sales tax of socks
            System.out.println("Glasses cost "+totalGlassCost$+" .");
            System.out.println("Their sales tax is "+salesTaxGlass+" .");   //sales tax of Glasses
            System.out.println("Envelopes cost "+totalEnvelopeCost$+" .");
            System.out.println("Their sales tax is "+salesTaxEnvelopes+" .");   //sales tax of box of envelopes
            System.out.println("The total cost without tax is "+totalCost$+" .");
            System.out.println("The total cost including tax is "+finalPlusTax$+" .");
        
        
    }//end main method
    
}//end class