package levelComponents;

import java.awt.image.BufferedImage;

public class levelComponents {
	
	
	//Images
	public BufferedImage and, nand, or, nor, xor, xnor, not;
	public BufferedImage OOOO, OOOI, OOIO, OOII, OIOO, OIOI, OIIO, OIII, IOOO, IOOI, IOIO, IOII, IIOO, IIOI, IIIO, IIII;
	public BufferedImage open1, open2, open3, open4, open5, open6, life3, life2, life1, life0;
	public BufferedImage runButton, runButtonPressed, runButtonHighlight;
	public BufferedImage feedbackPanelHolder, feedbackPanel, gate1AError, gate1BError, gate1CError, gate2AError, gate2BError, gate3AError;
	public BufferedImage bg1, bg3, bg4, bg6, bg7, bg9, bg10;
	
	//Locations
		//binaries
			//Inputs
			public static int input1X, input2X, input3X, input4X, input5X, input6X;
			public static int input1Y, input2Y, input3Y, input4Y, input5Y, input6Y;
			
			//Outputs
			public static int outputX;
			public static int outputY;
		
			//logic gates
			public static int gate1X, gate2X, gate3X, gate4X, gate5X, gate6X;
			public static int gate1Y, gate2Y, gate3Y, gate4Y, gate5Y, gate6Y;

			//lives
			public static int lifeX;
			public static int lifeY;
			
			//feedback panel
			public static int feedbackPanelX;
			public static int feedbackPanelY;
		
			//others
			public static int openGate1X, openGate2X, openGate3X, openGate4X, openGate5X, openGate6X;
			public static int openGate1Y, openGate2Y, openGate3Y, openGate4Y, openGate5Y, openGate6Y;
			public static int choice1X, choice2X, choice3X;
			public static int choiceY;
			public static int falseGate1X, falseGate2X;
			public static int falseGate1Y, falseGate2Y;
			public static int originalGate1X, originalGate2X, originalGate3X, originalGate4X, originalGate5X, originalGate6X, originalFalseGate1X, originalFalseGate2X;
			public static int originalGate1Y, originalGate2Y, originalGate3Y, originalGate4Y, originalGate5Y, originalGate6Y, originalFalseGate1Y, originalFalseGate2Y;
			public static int runX;
			public static int runY;
	
			
			
	//Dimension
	public int componentHeight, componentWidth, lifeHeight, lifeWidth, feedbackPanelHeight, feedbackPanelWidth, runWidth, runHeight;
	
	//Active Values
	public String openGate1A, openGate1B, openGate1C, openGate2A, openGate2B, openGate3A;
	public int lifeCount;
	public static int levelCount;
	
	
	//String
	public String input1, input2, input3, input4, input5, input6;
	public String falseGate1, falseGate2, gate1A, gate1B, gate1C, gate2A, gate2B, gate3A;
	public String closedGate;
	public String output;
	
	//Boolean
	public static Boolean gate1Entered, gate2Entered, gate3Entered, gate4Entered, gate5Entered, gate6Entered, falseGate1Entered, falseGate2Entered, runButtonEntered, openGate1Entered, openGate2Entered, openGate3Entered, openGate4Entered, openGate5Entered, openGate6Entered;
	public static Boolean gate1Grabbed, gate2Grabbed, gate3Grabbed, gate4Grabbed, gate5Grabbed, gate6Grabbed, falseGate1Grabbed, falseGate2Grabbed;
	public static Boolean G1TOG1, G1TOG2, G1TOG3, G1TOG4, G1TOG5, G1TOG6, G2TOG1, G2TOG2, G2TOG3, G2TOG4, G2TOG5, G2TOG6, G3TOG1, G3TOG2, G3TOG3, G3TOG4, G3TOG5, G3TOG6, G4TOG1, G4TOG2, G4TOG3, G4TOG4, G4TOG5, G4TOG6, G5TOG1, G5TOG2, G5TOG3, G5TOG4, G5TOG5, G5TOG6, G6TOG1, G6TOG2, G6TOG3, G6TOG4, G6TOG5, G6TOG6, FG1TOG1, FG1TOG2, FG1TOG3, FG1TOG4, FG1TOG5, FG1TOG6, FG2TOG1, FG2TOG2, FG2TOG3, FG2TOG4, FG2TOG5, FG2TOG6;
	public static Boolean startSimulation; 
	public static Boolean puzzleSuccess;
	public static Boolean gameOver;
	public static Boolean feedbackPanelReset;
	
	//Counters
	public static int feedbackPanelCounter = 0;
	public int movementIndex, movementSpeed;


	
	


}
