package randomizerComponents;

import java.util.Scanner;

import levelComponents.levelPanel;
import main.methods;

import java.util.*;

public class levelRandomizer extends randomizerComponents {
    
	Scanner input = new Scanner(System.in);
    
	
    public String levelRandomizer() { 
    	
    	setDefaultValues();
        
    	
    	if (levelPanel.levelCount >= 0 && levelPanel.levelCount < 5) {
    		inputNumber = 3;
    	} else if (levelPanel.levelCount >= 5 && levelPanel.levelCount < 12) {
    		inputNumber = 4;
    	} else if (levelPanel.levelCount >= 12 ) {
    		inputNumber = 6;
    	}
    	
    	System.out.println(inputNumber);
    	
    	/**
    	do {
    	inputNumber = methods.generateNumber(1,4);
    	inputNumber = inputNumber + 2;
    	} while (inputNumber == 5);
    	*/
        	
        
        switch(inputNumber) {
            case 3: 
                gateAreaNumber = 2;
                GA1 = methods.generateNumber(1,2);
                GA2 = 1;
                GA3 = 0;
                
                if (GA1 == GA2) {
                    int random = methods.generateNumber(1,2);
                    switch(random) {
                        case 1: type = "A";
                        break;
                        case 2: type = "B";
                        break;
                    }
                }
                break;
            
            case 4: 
                gateAreaNumber = methods.generateNumber(1,2);             
                if (gateAreaNumber == 2) {
                	GA1 = methods.generateNumber(1, 2);
                	GA2 = 1;
                	GA3 = 0;
                } else {
                GA1 = 1;
                GA2 = 0;
                GA3 = 0;
                }
                break;
            case 6: 
                gateAreaNumber = methods.generateNumber(1,3);
                if (gateAreaNumber == 3) {
                    GA1 = 3;
                    GA2 = methods.generateNumber(1,2);
                    GA3 = 1;
                }
                else if (gateAreaNumber == 2) {
                    GA1 = 3;
                    GA2 = 1;
                    GA3 = 0;
                }
                else if (gateAreaNumber == 1) {
                    GA1 = 1;
                    GA2 = 0;
                    GA3 = 0;
                }
            default: 
                gateNumber = 0;
        }
        
        String levelClassification = "(" + inputNumber + ", " + gateAreaNumber + "(" + GA1 + "," + GA2 + "," + GA3 + "))" + type;
        return levelClassification;
    }
    
 
    
    public void setDefaultValues() {
    	inputNumber = 0;
    	gateNumber = 0;
    	gateAreaNumber = 0;
    	GA1 = 0;
    	GA2 = 0;
    	GA3 = 0;
        type = "";
    }
    
    public static void main (String [] args ) {
    	
  
    }
    

    
}

/**Board Classifications
 * Legend
 *  Number of Inputs = I
 *  Number of Gate Area = GA
 *  Number of Gate per Gate Area = GG
 * 
 * Classifications (I, GA(GG)):
 *  3 INPUTS
 *  a. (3, 2(2,1,0))
 *  b. (3, 2(1,1,0))A
 *  c. (3. 2(1,1,0))B
 * 
 *  4 INPUTS
 *  a. (4, 2(2,1,0))
 *  b. (4, 2(1,1,0))
 *  c. (4, 1(1,0,0))
 * 
 *  6 INPUTS
 *  a. (6, 3(3,2,1))
 *  b. (6, 3(3,1,1))
 *  c. (6, 2(3,1,0))
 *  d. (6, 1(1,0,0))
 * 
 
 */



