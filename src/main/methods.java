package main;

public class methods {
	
	//4 BIT INPUT
    public static String generateInput() {
        String resultByte = "";
        for (int i = 0; i < 4 ; i++) {
            String bit = String.valueOf(methods.generateNumber(0,1));
            resultByte = resultByte + bit;
            }
        return resultByte;
    }     
    
    //1 BIT INPUT
    public String generateInput1Bit() {
        String resultBit = "";
        for (int i = 0; i <= 1; i++) {
            String bit = String.valueOf(methods.generateNumber(0,2));
            resultBit = resultBit + bit;
        }
        return resultBit;
    }
    
    public static int generateNumber(int min, int max) { 
    	
    	if (min == 0) {
    		max++;
    	}
    	
        int number = min + (int)(Math.random() * ((max - min) + min));
        return number;
    }
    //Generates a random number from min to max.
    //If minimum is 0, max++
    
    
    
    
    
    
    //150, 333, 510
    public static void main(String [] args) {
    	
    	/**for (int i = 0; i < 10 ; i++) {
    		int n = generateNumber(1,5);
    		System.out.println(n);
    		}*/
    	
    	
    	
    	
    }
}

