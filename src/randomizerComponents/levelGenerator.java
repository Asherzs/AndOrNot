package randomizerComponents;

import main.gate;
import main.methods;

public class levelGenerator extends randomizerComponents{
	
		levelRandomizer level = new levelRandomizer();
		
		
    
        void getDefaultValues() {
        	
           levelClassification = level.levelRandomizer();
           
            openGate1 = "";
            openGate2 = "";
            openGate1String = "";
            openGate2String = "";
            gate1A = "";
            gate1B = "";
            gate1C = "";
            gate2A = "";
            gate2B = "";
            gate3A = "";     
            isGate1AOpen = false;
            isGate1BOpen = false;
            isGate1COpen = false;
            isGate2AOpen = false;
            isGate2BOpen = false;
            isGate3AOpen = false;
           
            
        }
    
        public levelGenerator() {
 
        	getDefaultValues();
        	getGeneratedValues();
        	
        	
        	
        }
        
        public String getRandomGate(String a, String b, String c, String d, String e, String f, String g) {
        	String gate = "";
        	do {
	        	do {	
		        	int n = methods.generateNumber(1, 6);
		        	
		        	switch (n) {
		        		case 1: gate = a;
		        		break;
		        		case 2: gate = b;
		        		break;
		        		case 3: gate = c;
		        		break;
		        		case 4: gate = d;
		        		break;
		        		case 5: gate = e;
		        		break;
		        		case 6: gate = f;
		        		break;
		        	}
	        	} while (gate == "");
        	} while (gate == g);	        	        	
        	return gate;
        }
        
        public String getGateValue(String a) {
        	String gate = "";
        	switch (a) {
        	case "gate1A": 
        		gate = gate1A;
        		break;
        	case "gate1B": 
        		gate = gate1B;
        		break;
        	case "gate1C": 
        		gate = gate1C;
        		break;
        	case "gate2A": 
        		gate = gate2A;
        		break;
        	case "gate2B": 
        		gate = gate2B;
        		break;
        	case "gate3A": 
        		gate = gate3A;
        		break;
        	default: 
        		gate = "";
        		break;
        	}
        	return gate;
        }
        
        public void getGeneratedValues() {
                
        
            switch(levelClassification) {

                case "(3, 2(2,1,0))": //VERIFIED

                    input1 = methods.generateInput();
                    input2 = methods.generateInput();
                    input3 = methods.generateInput();
                    gate1A = gate.gateWOnot();
                    gate1B = gate.notGate();
                    gate2A = gate.gateWOnot();

                    output1 = gate.applyGate(gate1A, input1, input2);
                    output2 = gate.applyGate(gate1B, input3, input3);
                    finalOutput = gate.applyGate(gate2A, output1, output2);
                   
                        
                    //TAKES 2 RANDOM GATES                     
                    openGate1String = getRandomGate("gate1A", "gate1B", "gate2A", "", "", "", ""); //ADD ACTIVE GATES
                    openGate2String = getRandomGate("gate1A", "gate1B", "gate2A", "", "", "", openGate1String);
                    
                    openGate1 = getGateValue(openGate1String);
                    openGate2 = getGateValue(openGate2String);
                  

                    break;

                case "(3, 2(1,1,0))A": //VERIFIED
                    input1 = methods.generateInput();
                    input2 = methods.generateInput();
                    input3 = methods.generateInput();
                    gate1A = gate.gateWOnot();
                    gate2A = gate.gateWOnot();

                    output1 = gate.applyGate(gate1A, input1, input2);
                    finalOutput = gate.applyGate(gate2A, output1, input3);
                    
                    //TAKES 1 RANDOM GATES                     
                    openGate1String = getRandomGate("gate1A", "", "gate2A", "", "", "", ""); //ADD ACTIVE GATES
                    openGate1 = getGateValue(openGate1String);
                    
                    break;

                case "(3, 2(1,1,0))B": //VERIFIED
                    input1 = methods.generateInput();
                    input2 = methods.generateInput();
                    input3 = methods.generateInput();
                    gate1A = gate.gateWOnot();
                    gate2A = gate.notGate();

                    output1 = gate.applyGate(gate1A, input1, input2);
                    output2 = gate.applyGate(gate1A, output1, input3);
                    finalOutput = gate.applyGate(gate2A, output2, output2);
                    
                    //TAKES 1 RANDOM GATES                     
                    openGate1String = getRandomGate("gate1A", "", "gate2A", "", "", "", ""); //ADD ACTIVE GATES
                    openGate1 = getGateValue(openGate1String);
                    break;      

                case "(4, 2(2,1,0))": //VERIFIED
                    input1 = methods.generateInput();
                    input2 = methods.generateInput();
                    input3 = methods.generateInput();
                    input4 = methods.generateInput();
                    gate1A = gate.gateWOnot();
                    gate1B = gate.gateWOnot();
                    gate2A = gate.gateWOnot();

                    output1 = gate.applyGate(gate1A, input1, input2);
                    output2 = gate.applyGate(gate1B, input3, input4);
                    finalOutput = gate.applyGate(gate2A, output1, output2);
                    
                    //TAKES 2 RANDOM GATES                  
                    openGate1String = getRandomGate("gate1A", "gate1B", "gate2A", "", "", "", ""); //ADD ACTIVE GATES
                    openGate2String = getRandomGate("gate1A", "gate1B", "gate2A", "", "", "", openGate1String);
                    
                    openGate1 = getGateValue(openGate1String);
                    openGate2 = getGateValue(openGate2String);
                    break;

                case "(4, 2(1,1,0))": //VERIFIED
                    input1 = methods.generateInput();
                    input2 = methods.generateInput();
                    input3 = methods.generateInput();
                    input4 = methods.generateInput();
                    gate1A = gate.gateWOnot();
                    gate2A = gate.gateWOnot();

                    output1 = gate.applyGate(gate1A, input1, input2);
                    output2 = gate.applyGate(gate2A, output1, input3);
                    finalOutput = gate.applyGate(gate2A, output2, input4);
                    
                    //TAKES 2 RANDOM GATES  
                    openGate1String = getRandomGate("gate1A", "", "gate2A", "", "", "", ""); //ADD ACTIVE GATES

                    openGate1 = getGateValue(openGate1String);
                    
                    
                    break;

                case "(4, 1(1,0,0))": //VERIFIED
                    input1 = methods.generateInput();
                    input2 = methods.generateInput();
                    input3 = methods.generateInput();
                    input4 = methods.generateInput();
                    gate1A = gate.gateWOnot();

                    output1 = gate.applyGate(gate1A, input1, input2);
                    output2 = gate.applyGate(gate1A, input3, input4);
                    finalOutput = gate.applyGate(gate1A, output1, output2);
                    
                    openGate1String = "gate1A";
                    openGate1 = gate1A;
                    break;
                    
                    

                case "(6, 3(3,2,1))": //VERIFIED

                    input1 = methods.generateInput();
                    input2 = methods.generateInput();
                    input3 = methods.generateInput();
                    input4 = methods.generateInput();
                    input5 = methods.generateInput();
                    input6 = methods.generateInput();
                    gate1A = gate.gateWOnot();
                    gate1B = gate.gateWOnot();
                    gate1C = gate.gateWOnot();
                    gate2A = gate.gateWOnot();
                    gate2B = gate.notGate();
                    gate3A = gate.gateWOnot();

                    output1 = gate.applyGate(gate1A, input1, input2);
                    output2 = gate.applyGate(gate1B, input3, input4);
                    output3 = gate.applyGate(gate1C, input5, input6);
                    output4 = gate.applyGate(gate2A, output1, output2);
                    output5 = gate.applyGate(gate2B, output3, output3);
                    finalOutput = gate.applyGate(gate3A, output4, output5);
                    
                  //TAKES 2 RANDOM GATES  
                    openGate1String = getRandomGate("gate1A", "gate1B", "gate1C", "gate2A", "gate2B", "gate3A", ""); //ADD ACTIVE GATES
                    openGate2String = getRandomGate("gate1A", "gate1B", "gate1C", "gate2A", "gate2B", "gate3A", openGate1String);

                    openGate1 = getGateValue(openGate1String);
                    openGate2 = getGateValue(openGate2String);
                    
                    break;
                case "(6, 3(3,1,1))": //VERIFIED
                    input1 = methods.generateInput();
                    input2 = methods.generateInput();
                    input3 = methods.generateInput();
                    input4 = methods.generateInput();
                    input5 = methods.generateInput();
                    input6 = methods.generateInput();
                    gate1A = gate.gateWOnot();
                    gate1B = gate.gateWOnot();
                    gate1C = gate.gateWOnot();
                    gate2A = gate.gateWOnot();
                    gate3A = gate.gateWOnot();

                    output1 = gate.applyGate(gate1A, input1, input2);
                    output2 = gate.applyGate(gate1B, input3, input4);
                    output3 = gate.applyGate(gate1C, input5, input6);
                    output4 = gate.applyGate(gate2A, output1, output2);
                    finalOutput = gate.applyGate(gate3A, output3, output4);
                    
                    //TAKES 2 RANDOM GATES  
                    openGate1String = getRandomGate("gate1A", "gate1B", "gate1C", "gate2A", "", "gate3A", ""); //ADD ACTIVE GATES
                    openGate2String = getRandomGate("gate1A", "gate1B", "gate1C", "gate2A", "", "gate3A", openGate1String);

                    openGate1 = getGateValue(openGate1String);
                    openGate2 = getGateValue(openGate2String);
                    break;
                case "(6, 2(3,1,0))":  //VERIFIED
                    input1 = methods.generateInput();
                    input2 = methods.generateInput();
                    input3 = methods.generateInput();
                    input4 = methods.generateInput();
                    input5 = methods.generateInput();
                    input6 = methods.generateInput();
                    gate1A = gate.gateWOnot();
                    gate1B = gate.gateWOnot();
                    gate1C = gate.gateWOnot();
                    gate2A = gate.gateWOnot();

                    output1 = gate.applyGate(gate1A, input1, input2);
                    output2 = gate.applyGate(gate1B, input3, input4);
                    output3 = gate.applyGate(gate1C, input5, input6);
                    output4 = gate.applyGate(gate2A, output1, output2);
                    finalOutput = gate.applyGate(gate2A, output3, output4);
                    
                  //TAKES 2 RANDOM GATES  
                    openGate1String = getRandomGate("gate1A", "gate1B", "gate1C", "gate2A", "", "", ""); //ADD ACTIVE GATES
                    openGate2String = getRandomGate("gate1A", "gate1B", "gate1C", "gate2A", "", "", openGate1String);

                    openGate1 = getGateValue(openGate1String);
                    openGate2 = getGateValue(openGate2String);
                    break;
                case "(6, 1(1,0,0))": //VERIFIED
                    input1 = methods.generateInput();
                    input2 = methods.generateInput();
                    input3 = methods.generateInput();
                    input4 = methods.generateInput();
                    input5 = methods.generateInput();
                    input6 = methods.generateInput();
                    gate1A = gate.gateWOnot();

                    output1 = gate.applyGate(gate1A, input1, input2);
                    output2 = gate.applyGate(gate1A, input3, input4);
                    output3 = gate.applyGate(gate1A, input5, input6);
                    output4 = gate.applyGate(gate1A, output1, output2);
                    finalOutput = gate.applyGate(gate1A, output3, output4);
                    
                    //NO GATES ARE TAKEN, ONLY 1 GATE IS ACTIVE
                    openGate1String = "gate1A";
                    openGate1 = gate1A;
                    break;
                default: 
                    System.out.print("ERROR: Level Classification not found.");
                    break;

            }

        //LEVEL TESTING
   
        System.out.println(level.inputNumber);
        
        
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
        
        System.out.println("OPEN GATE 1: " + openGate1);
        System.out.println("OPEN GATE 2: " + openGate2);
        
        if (openGate1String == "gate1A" || openGate2String == "gate1A") {
        	isGate1AOpen = true;
        }
        if (openGate1String == "gate1B" || openGate2String == "gate1B") {
        	isGate1BOpen = true;
        }
        if (openGate1String == "gate1C" || openGate2String== "gate1C") {
        	isGate1COpen = true;
        }
        if (openGate1String == "gate2A" || openGate2String == "gate2A") {
        	isGate2AOpen = true;
        }
        if (openGate1String == "gate2B" || openGate2String == "gate2B") {
        	isGate2BOpen = true;
        }
        if (openGate1String == "gate3A" || openGate2String== "gate3A") {
        	isGate3AOpen = true;
        }
        
        System.out.println("GATE1A: " + isGate1AOpen);
		System.out.println("GATE1B: " + isGate1BOpen);
		System.out.println("GATE1C: " + isGate1COpen);
		System.out.println("GATE2A: " + isGate2AOpen);
		System.out.println("GATE2B: " + isGate2BOpen);
		System.out.println("GATE3A: " + isGate3AOpen);
		
		System.out.println("LEVEL: " + levelClassification + "\n");
    }
   
   
        
 
        
    
    
    public static void main (String [] args) {
    	levelGenerator level = new levelGenerator();
    	
  
    }
         
}
            

