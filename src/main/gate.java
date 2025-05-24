package main;


public class gate {
    
    static String logicGate;
    static String gate[] = {"not", "and", "nand", "or", "nor", "xor", "xnor"};
    
    
    public static String notGate() {
        return logicGate = gate[0];
    }
    
    public static String gateWOnot() {
        return logicGate = gate[methods.generateNumber(1, 6)];
    }
    
    public static String applyGate(String gate, String byte1, String byte2) {
        String resultByte = "";
        
        switch(gate) {
            case "not": resultByte = not(byte1, byte2);
                break;
            case "and": resultByte = and(byte1, byte2);
                break; 
            case "nand": resultByte = nand(byte1, byte2);
                break;  
            case "or": resultByte = or(byte1, byte2);
                break;     
            case "nor": resultByte = nor(byte1, byte2);
                break;     
            case "xor": resultByte = xor(byte1, byte2);
                break;    
            case "xnor": resultByte = xnor(byte1, byte2);
                break;       
        }
        return resultByte;
    }
    
    
    static String not(String byte1, String byte2) {
        String resultByte = "";
        for (int i = 0; i < byte1.length() ; i++ ) {
            char bit = byte1.charAt(i);
            if (bit == '0') {
                bit = '1';
            } else if (bit == '1') {
                bit = '0';
            }
            resultByte = resultByte + bit;
        }
        return resultByte;
    }
    
    static String and(String byte1, String byte2) {
        String resultByte = "";
        for (int i = 0; i < byte1.length() ; i++) {
            char bit1 = byte1.charAt(i);
            char bit2 = byte2.charAt(i);
            char resultBit;
            if (bit1 == '1' && bit2 == '1') {
                resultBit = '1';
            }
            else {
                resultBit = '0';
            }
            resultByte = resultByte + resultBit;
        }
        return resultByte;
    } 
    
    static String nand(String byte1, String byte2) {
        String resultByte = "";
        for (int i = 0; i < byte1.length() ; i++) {
            char bit1 = byte1.charAt(i);
            char bit2 = byte2.charAt(i);
            char resultBit  = '1';
            if (bit1 == '1' && bit2 == '1') {
                resultBit = '0';
            }
            else {
                resultBit = '1';
            }
            resultByte = resultByte + resultBit;            
        }
        return resultByte;    
    }
    
    static String or(String byte1, String byte2) {
        String resultByte = "";
        for (int i = 0; i < byte1.length() ; i++) {
            char bit1 = byte1.charAt(i);
            char bit2 = byte2.charAt(i);
            char resultBit;
            if (bit1 == '0' && bit2 == '0') {
                resultBit = '0';
            }
            else {
                resultBit = '1';
            }
            resultByte = resultByte + resultBit;            
        }
        return resultByte;    
    }
    
    static String nor(String byte1, String byte2) {
        String resultByte = "";
        for (int i = 0; i < byte1.length() ; i++) {
            char bit1 = byte1.charAt(i);
            char bit2 = byte2.charAt(i);
            char resultBit;
            if (bit1 == '0' && bit2 == '0') {
                resultBit = '1';
            }
            else {
                resultBit = '0';
            }
            resultByte = resultByte + resultBit;            
        }
        return resultByte;    
    }
    
    static String xor(String byte1, String byte2) {
        String resultByte = "";
        for (int i = 0; i < byte1.length() ; i++) {
            char bit1 = byte1.charAt(i);
            char bit2 = byte2.charAt(i);
            char resultBit;
            if (bit1 == bit2) {
                resultBit = '0';
            }
            else {
                resultBit = '1';
            }
            resultByte = resultByte + resultBit;            
        }
        return resultByte;    
    }
    
    static String xnor(String byte1, String byte2) {
        String resultByte = "";
        for (int i = 0; i < byte1.length() ; i++) {
            char bit1 = byte1.charAt(i);
            char bit2 = byte2.charAt(i);
            char resultBit;
            if (bit1 == bit2) {
                resultBit = '1';
            }
            else {
                resultBit = '0';
            }
            resultByte = resultByte + resultBit;            
        }
        return resultByte;    
    }
    
    
    
    public static Boolean checkPuzzle(String levelClassification, String gate1A, String gate1B, String gate1C, String gate2A, String gate2B, String gate3A, String input1, String input2, String input3, String input4, String input5, String input6, String outputActual) {
    	Boolean result = false;
    	String output1 = "";
    	String output2 = "";
    	String output3 = "";
    	String output4 = "";
    	String output5 = "";
    	String finalOutput = "";
    	
    	
    	
    	switch (levelClassification) {
    	  case "(3, 2(2,1,0))": //VERIFIED

              output1 = applyGate(gate1A, input1, input2);
              output2 = applyGate(gate1B, input3, input3);
              finalOutput = applyGate(gate2A, output1, output2);
              
           

              break;

          case "(3, 2(1,1,0))A": //VERIFIED
             

              output1 = applyGate(gate1A, input1, input2);
              finalOutput = applyGate(gate2A, output1, input3);
              
           
              break;

          case "(3, 2(1,1,0))B": //VERIFIED
             
              output1 = applyGate(gate1A, input1, input2);
              output2 = applyGate(gate1A, output1, input3);
              finalOutput = applyGate(gate2A, output2, output2);
             
          
              break;      

          case "(4, 2(2,1,0))": //VERIFIED
           

              output1 = applyGate(gate1A, input1, input2);
              output2 = applyGate(gate1B, input3, input4);
              finalOutput = applyGate(gate2A, output1, output2);
              
              //TAKES 2 RANDOM GATES                  
           
              break;

          case "(4, 2(1,1,0))": //VERIFIED
            

              output1 = applyGate(gate1A, input1, input2);
              output2 = applyGate(gate2A, output1, input3);
              finalOutput = applyGate(gate2A, output2, input4);
              
              //TAKES 2 RANDOM GATES  
           
              
              
              break;

          case "(4, 1(1,0,0))": //VERIFIED
            

              output1 = applyGate(gate1A, input1, input2);
              output2 = applyGate(gate1A, input3, input4);
              finalOutput = applyGate(gate1A, output1, output2);
              
            
         
              break;
              
              

          case "(6, 3(3,2,1))": //VERIFIED

             
              output1 = applyGate(gate1A, input1, input2);
              output2 = applyGate(gate1B, input3, input4);
              output3 = applyGate(gate1C, input5, input6);
              output4 = applyGate(gate2A, output1, output2);
              output5 = applyGate(gate2B, output3, output3);
              finalOutput = applyGate(gate3A, output4, output5);
              
            //TAKES 2 RANDOM GATES  
            
            
              break;
          case "(6, 3(3,1,1))": //VERIFIED
           

              output1 = applyGate(gate1A, input1, input2);
              output2 = applyGate(gate1B, input3, input4);
              output3 = applyGate(gate1C, input5, input6);
              output4 = applyGate(gate2A, output1, output2);
              finalOutput = applyGate(gate3A, output3, output4);
              
              //TAKES 2 RANDOM GATES  
           
              break;
          case "(6, 2(3,1,0))":  //VERIFIED
            

              output1 = applyGate(gate1A, input1, input2);
              output2 = applyGate(gate1B, input3, input4);
              output3 = applyGate(gate1C, input5, input6);
              output4 = applyGate(gate2A, output1, output2);
              finalOutput = applyGate(gate2A, output3, output4);
              
            //TAKES 2 RANDOM GATES  
             
              break;
          case "(6, 1(1,0,0))": //VERIFIED
          

              output1 = applyGate(gate1A, input1, input2);
              output2 = applyGate(gate1A, input3, input4);
              output3 = applyGate(gate1A, input5, input6);
              output4 = applyGate(gate1A, output1, output2);
              finalOutput = applyGate(gate1A, output3, output4);
   
             
              break;
          	default: 
              System.out.print("ERROR: Level Classification not found.");
              break;
    		}
    	
    	if (outputActual.matches(finalOutput)) {
			result = true;
		} else {
			result = false;
		}
    	
    	 System.out.println("INPUT1: " + input1);
         System.out.println("INPUT2: " + input2);
         System.out.println("INPUT3: " + input3);
         System.out.println("INPUT4: " + input4);
         System.out.println("INPUT5: " + input5);
         System.out.println("INPUT6: " + input6);
         System.out.println("GATE1: " + gate1A);
         System.out.println("GATE2: " + gate1B);
         System.out.println("GATE3: " + gate1C);
         System.out.println("GATE4: " + gate2A);
         System.out.println("GATE5: " + gate2B);
         System.out.println("GATE6: " + gate3A);
         
         
         System.out.println("OUTPUT1: " + output1);
         System.out.println("OUTPUT2: " + output2);
         System.out.println("OUTPUT3: " + output3);
         System.out.println("OUTPUT4: " + output4);
         System.out.println("OUTPUT5: " + output5);
       
         System.out.println("FINALOUTPUT: " + finalOutput);
         System.out.println("ACTUAL OUTPUT: " + outputActual);
         System.out.println("RESULT: " + result);
    	
    		
         return result;
    }
}



