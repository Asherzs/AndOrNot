package levelComponents;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import cursorComponents.mouseHandler;
import cursorComponents.mouseMotionHandler;
import main.GamePanel;
import main.gate;
import main.methods;
import otherComponents.loadingScreen;
import randomizerComponents.levelGenerator;
import titleComponents.Title;

public class levelPanel extends levelComponents{
	
	GamePanel gp;
	mouseHandler mouseH;
	mouseMotionHandler mouseMH;
	levelGenerator newLevel;
	loadingScreen load;
	
	
	
	public levelPanel(GamePanel gp, mouseHandler mouseH, mouseMotionHandler mouseMH, loadingScreen load) {
		
		this.gp = gp;
		this.mouseH = mouseH;
		this.mouseMH = mouseMH;
		this.load = load;
		
		
		getImage();
		setDefaultValues();
		setLevelValue();
		setLifeValue();
		getLevelElements();
		
	}
	
	public void setDefaultValues() {
		
	
		
		componentHeight = 50;
		componentWidth = 100;
		feedbackPanelHeight = 150;
		feedbackPanelWidth = 200;
		lifeHeight = 150;				
		lifeWidth = 200;
		runWidth = 100;
		runHeight = 100;
		
		
		//LIFE VALUES
		feedbackPanelX = 550;
		feedbackPanelY = 0;
		lifeX = 0;
		lifeY = -40;
		
		input1 = "";
		input2 = "";
		input3 = "";
		input4 = "";
		input5 = "";
		input6 = "";
		
		runX = 650;
		runY = 300;
		
		choice1X = 150;	
		choice2X = 333;
		choice3X = 510;
		choiceY = 500;

		openGate1Entered = false;
		openGate2Entered = false;
		openGate3Entered = false;
		openGate4Entered = false;
		openGate5Entered = false;
		openGate6Entered = false;
		gate1Entered = false;
		gate2Entered = false;
		gate3Entered = false;
		gate4Entered = false;
		gate5Entered = false;
		gate6Entered = false;
		falseGate1Entered = false;
		falseGate2Entered = false;
		runButtonEntered = false;
		
		gate1Grabbed = false;
		gate2Grabbed = false;		
		gate3Grabbed = false;
		gate4Grabbed = false;
		gate5Grabbed = false;		
		gate6Grabbed = false;
		falseGate1Grabbed = false;
		falseGate2Grabbed = false;
		
	
		
		G1TOG1 = false;
		G1TOG2 = false;
		G1TOG3 = false;
		G1TOG4 = false;
		G1TOG5 = false;
		G1TOG6 = false;
		G2TOG1 = false;
		G2TOG2 = false;
		G2TOG3 = false;
		G2TOG4 = false;
		G2TOG5 = false;
		G2TOG6 = false;
		G3TOG1 = false;
		G3TOG2 = false;
		G3TOG3 = false;
		G3TOG4 = false;
		G3TOG5 = false;
		G3TOG6 = false;
		G4TOG1 = false;
		G4TOG2 = false;
		G4TOG3 = false;
		G4TOG4 = false;
		G4TOG5 = false;
		G4TOG6 = false;
		G5TOG1 = false;
		G5TOG2 = false;
		G5TOG3 = false;
		G5TOG4 = false;
		G5TOG5 = false;
		G5TOG6 = false;
		G6TOG1 = false;
		G6TOG2 = false;
		G6TOG3 = false;
		G6TOG4 = false;
		G6TOG5 = false;
		G6TOG6 = false;
		FG1TOG1 = false;
		FG1TOG2 = false;
		FG1TOG3 = false;
		FG1TOG4 = false;
		FG1TOG5 = false;
		FG1TOG6 = false;
		FG2TOG1 = false;
		FG2TOG2 = false;
		FG2TOG3 = false;
		FG2TOG4 = false;
		FG2TOG5 = false;
		FG2TOG6 = false;
		
		puzzleSuccess = false;
		startSimulation = false;
		feedbackPanelReset = false;
		gameOver = false;
		
		feedbackPanelCounter = 0;
		movementIndex = 0;
		movementSpeed = 1;
		
		
		gate1A = "";
		gate1B = "";
		gate1C = "";
		gate2A = "";
		gate2B = "";
		gate3A = "";
		openGate1A = "";
		openGate1B = "";
		openGate1C = "";
		openGate2A = "";
		openGate2B = "";
		openGate3A = "";
		falseGate1 = "";
		falseGate2 = "";
		
		input1X = 1000;
		input1Y = 1000;
		input2X = 1000;
		input2Y = 1000;
		input3X = 1000;
		input3Y = 1000;
		input4X = 1000;
		input4Y = 1000;
		input5X = 1000;
		input5Y = 1000;
		input6X = 1000;
		input6Y = 1000;
		openGate1X = 1000;
		openGate1Y = 1000;
		openGate2X = 1000;
		openGate2Y = 1000;
		openGate3X = 1000;
		openGate3Y = 1000;
		openGate4X = 1000;
		openGate5Y = 1000;
		openGate5X = 1000;
		openGate5Y = 1000;
		openGate6X = 1000;
		openGate6Y = 1000;
		falseGate1X = 1000;
		falseGate1Y = 1000;
		falseGate2X = 1000;
		falseGate2Y = 1000;
		
		originalGate1X = 1000;
		originalGate1Y = 1000;
		originalGate2X = 1000;
		originalGate2Y = 1000;
		originalGate3X = 1000;
		originalGate3Y = 1000;
		originalGate4X = 1000;
		originalGate4Y = 1000;
		originalGate5X = 1000;
		originalGate5Y = 1000;
		originalGate6X = 1000;
		originalGate6Y = 1000;
		originalFalseGate1X = 1000;
		originalFalseGate1Y = 1000;
		originalFalseGate2X = 1000;
		originalFalseGate2Y = 1000;
	}
	
	public void getLevelElements() {
		
		setDefaultValues();
		newLevel = new levelGenerator();	
		
		
		switch(newLevel.levelClassification){
			case "(3, 2(2,1,0))": 
				//Get Level Values
				input1 = newLevel.input1;
				input2 = newLevel.input2;
				input3 = newLevel.input3;
				
				gate1A = newLevel.gate1A;
				gate1B = newLevel.gate1B;
				gate2A = newLevel.gate2A;
				
				output = newLevel.finalOutput;
				falseGate1 = getFalseGate(gate1A, gate1B, gate1C, gate2A, gate2B, gate3A);
				
				//Set Component Location
				input1X = 50;
				input1Y = 100;
				input2X = 50;
				input2Y = 200;
				input3X = 50;
				input3Y = 300;
				openGate1X = 270;
				openGate1Y = 150;
				openGate2X = 270;
				openGate2Y = 250;
				openGate4X = 420;
				openGate4Y = 200;

				
				//Set Active Gate Mechanics
				if (newLevel.isGate1AOpen == true) {
					gate1X = getChoiceX(0, 0, 0, 0, 0, 0);
					gate1Y = choiceY;
					originalGate1X = gate1X;
					originalGate1Y = gate1Y;
				} else {
					gate1X = openGate1X;
					gate1Y = openGate1Y;
					falseGate1X = getChoiceX(0, 0, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
				}
				
				if (newLevel.isGate1BOpen == true) {
					gate2X = getChoiceX(gate1X, falseGate1X, 0, 0, 0, 0);
					gate2Y = choiceY;
					originalGate2X = gate2X;
					originalGate2Y = gate2Y;
				} else {
					gate2X = openGate2X;
					gate2Y = openGate2Y;
					falseGate1X = getChoiceX(gate1X, 0, 0, 0, 0, 0);
					falseGate1Y = choiceY;	
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;				
				}
				
				if (newLevel.isGate2AOpen == true) {
					gate4X = getChoiceX(gate1X, falseGate1X, gate2X, 0, 0, 0);
					gate4Y = choiceY;
					originalGate4X = gate4X;
					originalGate4Y = gate4Y;
				} else {
					gate4X = openGate4X;
					gate4Y = openGate4Y;
					falseGate1X = getChoiceX(gate1X, gate2X, 0, 0, 0, 0);
					falseGate1Y = choiceY;	
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					
				}				
				outputX = 600;
				outputY = 200;						
				break;
			
			case "(3, 2(1,1,0))A" :
				//Get Level Values
				input1 = newLevel.input1;
				input2 = newLevel.input2;
				input3 = newLevel.input3;
				
				gate1A = newLevel.gate1A;
				gate2A = newLevel.gate2A;
				
				output = newLevel.finalOutput;
				falseGate1 = getFalseGate(gate1A, gate1B, gate1C, gate2A, gate2B, gate3A);
				falseGate2 = getFalseGate(gate1A, gate1B, gate1C, gate2A, gate2B, gate3A);
				
				//Set Component Location
				input1X = 50;
				input1Y = 100;
				input2X = 50;
				input2Y = 200;
				input3X = 50;
				input3Y = 300;
				openGate1X = 270;
				openGate1Y = 150;
				openGate4X = 420;
				openGate4Y = 200;
				
				//Set Active Gate Mechanics
				if (newLevel.isGate1AOpen == true) {
					gate1X = getChoiceX(0, 0, 0, 0, 0, 0);
					gate1Y = choiceY;
					originalGate1X = gate1X;
					originalGate1Y = gate1Y;
				} else {
					gate1X = openGate1X;
					gate1Y = openGate1Y;
					falseGate1X = getChoiceX(0, 0, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					falseGate2X = getChoiceX(falseGate1X, 0, 0, 0, 0, 0);
					falseGate2Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					originalFalseGate2X = falseGate2X;
					originalFalseGate2Y = falseGate2Y;
				}
						
				if (newLevel.isGate2AOpen == true) {
					gate4X = getChoiceX(falseGate1X, falseGate2X, 0, 0, 0, 0);
					gate4Y = choiceY;
					originalGate4X = gate4X;
					originalGate4Y = gate4Y;
				} else {
					gate4X = openGate4X;
					gate4Y = openGate4Y;
					falseGate1X = getChoiceX(gate1X, 0, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					falseGate2X = getChoiceX(falseGate1X, gate1X, 0, 0, 0, 0);
					falseGate2Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					originalFalseGate2X = falseGate2X;
					originalFalseGate2Y = falseGate2Y;					
				}				
				outputX = 600;
				outputY = 200;						
				break;
				
			case "(3, 2(1,1,0))B" :
				//Get Level Values
				input1 = newLevel.input1;
				input2 = newLevel.input2;
				input3 = newLevel.input3;
				
				gate1A = newLevel.gate1A;
				gate2A = newLevel.gate2A;
				
				output = newLevel.finalOutput;
				falseGate1 = getFalseGate(gate1A, gate1B, gate1C, gate2A, gate2B, gate3A);
				falseGate2 = getFalseGate(gate1A, gate1B, gate1C, gate2A, gate2B, gate3A);
				
				//Set Component Location
				input1X = 50;
				input1Y = 100;
				input2X = 50;
				input2Y = 200;
				input3X = 50;
				input3Y = 300;
				openGate1X = 270;
				openGate1Y = 200;
				openGate4X = 420;
				openGate4Y = 200;
				
				//Set Active Gate Mechanics
				if (newLevel.isGate1AOpen == true) {
					gate1X = getChoiceX(0, 0, 0, 0, 0, 0);
					gate1Y = choiceY;
					originalGate1X = gate1X;
					originalGate1Y = gate1Y;
				} else {
					gate1X = openGate1X;
					gate1Y = openGate1Y;
					falseGate1X = getChoiceX(0, 0, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					falseGate2X = getChoiceX(falseGate1X, 0, 0, 0, 0, 0);
					falseGate2Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					originalFalseGate2X = falseGate2X;
					originalFalseGate2Y = falseGate2Y;
				}
						
				if (newLevel.isGate2AOpen == true) {
					gate4X = getChoiceX(falseGate1X, falseGate2X, 0, 0, 0, 0);
					gate4Y = choiceY;
					originalGate4X = gate4X;
					originalGate4Y = gate4Y;
				} else {
					gate4X = openGate4X;
					gate4Y = openGate4Y;
					falseGate1X = getChoiceX(gate1X, 0, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					falseGate2X = getChoiceX(falseGate1X, gate1X, 0, 0, 0, 0);
					falseGate2Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					originalFalseGate2X = falseGate2X;
					originalFalseGate2Y = falseGate2Y;					
				}				
				outputX = 600;
				outputY = 200;						
				break;
				
			case "(4, 2(2,1,0))" :
				//Get Level Values
				input1 = newLevel.input1;
				input2 = newLevel.input2;
				input3 = newLevel.input3;
				input4 = newLevel.input4;
				
				gate1A = newLevel.gate1A;
				gate1B = newLevel.gate1B;
				gate2A = newLevel.gate2A;
				
				output = newLevel.finalOutput;
				falseGate1 = getFalseGate(gate1A, gate1B, gate1C, gate2A, gate2B, gate3A);
	
				
				//Set Component Location
				input1X = 50;
				input1Y = 100;
				input2X = 50;
				input2Y = 175;
				input3X = 50;
				input3Y = 250;
				input4X = 50;
				input4Y = 325;
				openGate1X = 270;
				openGate1Y = 150;
				openGate2X = 270;
				openGate2Y = 250;
				openGate4X = 420;
				openGate4Y = 200;
				
				
				//Set Active Gate Mechanics
				if (newLevel.isGate1AOpen == true) {
					gate1X = getChoiceX(0, 0, 0, 0, 0, 0);
					gate1Y = choiceY;
					originalGate1X = gate1X;
					originalGate1Y = gate1Y;
				} else {
					gate1X = openGate1X;
					gate1Y = openGate1Y;
					falseGate1X = getChoiceX(0, 0, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
				}
				
				if (newLevel.isGate1BOpen == true) {
					gate2X = getChoiceX(gate1X, falseGate1X, 0, 0, 0, 0);
					gate2Y = choiceY;
					originalGate2X = gate2X;
					originalGate2Y = gate2Y;
				} else {
					gate2X = openGate2X;
					gate2Y = openGate2Y;
					falseGate1X = getChoiceX(gate1X, 0, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;				
				}
				
				if (newLevel.isGate2AOpen == true) {
					gate4X = getChoiceX(gate1X, falseGate1X, gate2X, 0, 0, 0);
					gate4Y = choiceY;
					originalGate4X = gate4X;
					originalGate4Y = gate4Y;
				} else {
					gate4X = openGate4X;
					gate4Y = openGate4Y;
					falseGate1X = getChoiceX(gate1X, gate2X, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					
				}				
				outputX = 600;
				outputY = 200;	
				break;
				
			case "(4, 2(1,1,0))" :
				//Get Level Values
				input1 = newLevel.input1;
				input2 = newLevel.input2;
				input3 = newLevel.input3;
				input4 = newLevel.input4;
				
				gate1A = newLevel.gate1A;
				gate2A = newLevel.gate2A;
				
				output = newLevel.finalOutput;
				falseGate1 = getFalseGate(gate1A, gate1B, gate1C, gate2A, gate2B, gate3A);
				falseGate2 = getFalseGate(gate1A, gate1B, gate1C, gate2A, gate2B, gate3A);
				
				//Set Component Location
				input1X = 50;
				input1Y = 100;
				input2X = 50;
				input2Y = 175;
				input3X = 50;
				input3Y = 250;
				input4X = 50;
				input4Y = 325;
				openGate1X = 270;
				openGate1Y = 150;
				openGate4X = 420;
				openGate4Y = 200;
				
				//Set Active Gate Mechanics
				if (newLevel.isGate1AOpen == true) {
					gate1X = getChoiceX(0, 0, 0, 0, 0, 0);
					gate1Y = choiceY;
					originalGate1X = gate1X;
					originalGate1Y = gate1Y;
				} else {
					gate1X = openGate1X;
					gate1Y = openGate1Y;
					falseGate1X = getChoiceX(0, 0, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					falseGate2X = getChoiceX(falseGate1X, 0, 0, 0, 0, 0);
					falseGate2Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					originalFalseGate2X = falseGate2X;
					originalFalseGate2Y = falseGate2Y;
				}
						
				if (newLevel.isGate2AOpen == true) {
					gate4X = getChoiceX(falseGate1X, falseGate2X, 0, 0, 0, 0);
					gate4Y = choiceY;
					originalGate4X = gate4X;
					originalGate4Y = gate4Y;
				} else {
					gate4X = openGate4X;
					gate4Y = openGate4Y;
					falseGate1X = getChoiceX(gate1X, 0, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					falseGate2X = getChoiceX(falseGate1X, gate1X, 0, 0, 0, 0);
					falseGate2Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					originalFalseGate2X = falseGate2X;
					originalFalseGate2Y = falseGate2Y;					
				}				
				outputX = 600;
				outputY = 200;						
				break;
				
			case "(4, 1(1,0,0))" :
				//Get Level Values
				input1 = newLevel.input1;
				input2 = newLevel.input2;
				input3 = newLevel.input3;
				input4 = newLevel.input4;
				
				gate1A = newLevel.gate1A;
				
				output = newLevel.finalOutput;
				falseGate1 = getFalseGate(gate1A, gate1B, gate1C, gate2A, gate2B, gate3A);
				falseGate2 = getFalseGate(gate1A, gate1B, gate1C, gate2A, gate2B, gate3A);
				
				//Set Component Location
				input1X = 50;
				input1Y = 100;
				input2X = 50;
				input2Y = 175;
				input3X = 50;
				input3Y = 250;
				input4X = 50;
				input4Y = 325;
				openGate1X = 350;
				openGate1Y = 200;

				
				//Set Active Gate Mechanics
				gate1X = getChoiceX(0, 0, 0, 0, 0, 0);
				gate1Y = choiceY;
				originalGate1X = gate1X;
				originalGate1Y = gate1Y;
				falseGate1X = getChoiceX(gate1X, 0, 0, 0, 0, 0);
				falseGate1Y = choiceY;
				falseGate2X = getChoiceX(falseGate1X, gate1X, 0, 0, 0, 0);
				falseGate2Y = choiceY;
				originalFalseGate1X = falseGate1X;
				originalFalseGate1Y = falseGate1Y;
				originalFalseGate2X = falseGate2X;
				originalFalseGate2Y = falseGate2Y;
							
				outputX = 600;
				outputY = 200;						
				break;
				
			case "(6, 3(3,2,1))" :
				//Get Level Values
				input1 = newLevel.input1;
				input2 = newLevel.input2;
				input3 = newLevel.input3;
				input4 = newLevel.input4;
				input5 = newLevel.input5;
				input6 = newLevel.input6;
				
				gate1A = newLevel.gate1A;
				gate1B = newLevel.gate1B;
				gate1C = newLevel.gate1C;
				gate2A = newLevel.gate2A;
				gate2B = newLevel.gate2B;
				gate3A = newLevel.gate3A;
				
				output = newLevel.finalOutput;
				falseGate1 = getFalseGate(gate1A, gate1B, gate1C, gate2A, gate2B, gate3A);
				
				//Set Component Location
				input1X = 20;
				input1Y = 80;
				input2X = 20;
				input2Y = 140;
				input3X = 20;
				input3Y = 200;
				input4X = 20;
				input4Y = 260;
				input5X = 20;
				input5Y = 320; 
				input6X = 20;
				input6Y = 380;
				openGate1X = 200;
				openGate1Y = 110;
				openGate2X = 200;
				openGate2Y = 230;
				openGate3X = 200;
				openGate3Y = 350;
				openGate4X = 350;
				openGate4Y = 170;
				openGate5X = 350;
				openGate5Y = 290;
				openGate6X = 495;
				openGate6Y = 227;

				
				//Set Active Gate Mechanics
				if (newLevel.isGate1AOpen == true) {
					gate1X = getChoiceX(0, 0, 0, 0, 0, 0);
					gate1Y = choiceY;
					originalGate1X = gate1X;
					originalGate1Y = gate1Y;
				} else {
					gate1X = openGate1X;
					gate1Y = openGate1Y;
					falseGate1X = getChoiceX(0, 0, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
				}
				
				if (newLevel.isGate1BOpen == true) {
					gate2X = getChoiceX(gate1X, falseGate1X, 0, 0, 0, 0);
					gate2Y = choiceY;
					originalGate2X = gate2X;
					originalGate2Y = gate2Y;
				} else {
					gate2X = openGate2X;
					gate2Y = openGate2Y;
					falseGate1X = getChoiceX(gate1X, 0, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;				
				}
				
				if (newLevel.isGate1COpen == true) {
					gate3X = getChoiceX(gate1X, falseGate1X, gate2X, 0, 0, 0);
					gate3Y = choiceY;
					originalGate3X = gate3X;
					originalGate3Y = gate3Y;
				} else {
					gate3X = openGate3X;
					gate3Y = openGate3Y;
					falseGate1X = getChoiceX(gate1X, gate2X, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					
				}	
				
				if (newLevel.isGate2AOpen == true) {
					gate4X = getChoiceX(gate1X, falseGate1X, gate2X, gate3X, 0, 0);
					gate4Y = choiceY;
					originalGate4X = gate4X;
					originalGate4Y = gate4Y;
				} else {
					gate4X = openGate4X;
					gate4Y = openGate4Y;
					falseGate1X = getChoiceX(gate1X, gate2X, gate3X, 0, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					
				}		
				
				if (newLevel.isGate2BOpen == true) {
					gate5X = getChoiceX(gate1X, falseGate1X, gate2X, gate3X, gate4X, 0);
					gate5Y = choiceY;
					originalGate5X = gate5X;
					originalGate5Y = gate5Y;
				} else {
					gate5X = openGate5X;
					gate5Y = openGate5Y;
					falseGate1X = getChoiceX(gate1X, gate2X, gate3X, gate4X, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					
				}	
				
				if (newLevel.isGate3AOpen == true) {
					gate6X = getChoiceX(gate1X, falseGate1X, gate2X, gate3X, gate4X, gate5X);
					gate6Y = choiceY;
					originalGate6X = gate6X;
					originalGate6Y = gate6Y;
				} else {
					gate6X = openGate6X;
					gate6Y = openGate6Y;
					falseGate1X = getChoiceX(gate1X, gate2X, gate3X, gate4X, gate5X, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					
				}	
			
							
				outputX = 655;
				outputY = 227;						
				break;
				
			case "(6, 3(3,1,1))" :
				//Get Level Values
				input1 = newLevel.input1;
				input2 = newLevel.input2;
				input3 = newLevel.input3;
				input4 = newLevel.input4;
				input5 = newLevel.input5;
				input6 = newLevel.input6;
				
				gate1A = newLevel.gate1A;
				gate1B = newLevel.gate1B;
				gate1C = newLevel.gate1C;
				gate2A = newLevel.gate2A;
				gate3A = newLevel.gate3A;
				
				output = newLevel.finalOutput;
				falseGate1 = getFalseGate(gate1A, gate1B, gate1C, gate2A, gate2B, gate3A);
				
				//Set Component Location
				input1X = 20;
				input1Y = 80;
				input2X = 20;
				input2Y = 140;
				input3X = 20;
				input3Y = 200;
				input4X = 20;
				input4Y = 260;
				input5X = 20;
				input5Y = 320; 
				input6X = 20;
				input6Y = 380;
				openGate1X = 200;
				openGate1Y = 110;
				openGate2X = 200;
				openGate2Y = 230;
				openGate3X = 200;
				openGate3Y = 350;
				openGate4X = 350;
				openGate4Y = 170;
				openGate6X = 495;
				openGate6Y = 227;

				
				//Set Active Gate Mechanics
				if (newLevel.isGate1AOpen == true) {
					gate1X = getChoiceX(0, 0, 0, 0, 0, 0);
					gate1Y = choiceY;
					originalGate1X = gate1X;
					originalGate1Y = gate1Y;
				} else {
					gate1X = openGate1X;
					gate1Y = openGate1Y;
					falseGate1X = getChoiceX(0, 0, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
				}
				
				if (newLevel.isGate1BOpen == true) {
					gate2X = getChoiceX(gate1X, falseGate1X, 0, 0, 0, 0);
					gate2Y = choiceY;
					originalGate2X = gate2X;
					originalGate2Y = gate2Y;
				} else {
					gate2X = openGate2X;
					gate2Y = openGate2Y;
					falseGate1X = getChoiceX(gate1X, 0, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;				
				}
				
				if (newLevel.isGate1COpen == true) {
					gate3X = getChoiceX(gate1X, falseGate1X, gate2X, 0, 0, 0);
					gate3Y = choiceY;
					originalGate3X = gate3X;
					originalGate3Y = gate3Y;
				} else {
					gate3X = openGate3X;
					gate3Y = openGate3Y;
					falseGate1X = getChoiceX(gate1X, gate2X, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					
				}	
				
				if (newLevel.isGate2AOpen == true) {
					gate4X = getChoiceX(gate1X, falseGate1X, gate2X, gate3X, 0, 0);
					gate4Y = choiceY;
					originalGate4X = gate4X;
					originalGate4Y = gate4Y;
				} else {
					gate4X = openGate4X;
					gate4Y = openGate4Y;
					falseGate1X = getChoiceX(gate1X, gate2X, gate3X, 0, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					
				}		
				
				if (newLevel.isGate2BOpen == true) {
					gate5X = getChoiceX(gate1X, falseGate1X, gate2X, gate3X, gate4X, 0);
					gate5Y = choiceY;
					originalGate5X = gate5X;
					originalGate5Y = gate5Y;
				} else {
					gate5X = openGate5X;
					gate5Y = openGate5Y;
					falseGate1X = getChoiceX(gate1X, gate2X, gate3X, gate4X, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					
				}	
				
				if (newLevel.isGate3AOpen == true) {
					gate6X = getChoiceX(gate1X, falseGate1X, gate2X, gate3X, gate4X, gate5X);
					gate6Y = choiceY;
					originalGate6X = gate6X;
					originalGate6Y = gate6Y;
				} else {
					gate6X = openGate6X;
					gate6Y = openGate6Y;
					falseGate1X = getChoiceX(gate1X, gate2X, gate3X, gate4X, gate5X, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					
				}	
			
							
				outputX = 655;
				outputY = 230;						
				break;
				
			case "(6, 2(3,1,0))" :
				//Get Level Values
				input1 = newLevel.input1;
				input2 = newLevel.input2;
				input3 = newLevel.input3;
				input4 = newLevel.input4;
				input5 = newLevel.input5;
				input6 = newLevel.input6;
				
				gate1A = newLevel.gate1A;
				gate1B = newLevel.gate1B;
				gate1C = newLevel.gate1C;
				gate2A = newLevel.gate2A;

				
				output = newLevel.finalOutput;
				falseGate1 = getFalseGate(gate1A, gate1B, gate1C, gate2A, gate2B, gate3A);
				
				//Set Component Location
				input1X = 20;
				input1Y = 80;
				input2X = 20;
				input2Y = 140;
				input3X = 20;
				input3Y = 200;
				input4X = 20;
				input4Y = 260;
				input5X = 20;
				input5Y = 320; 
				input6X = 20;
				input6Y = 380;
				openGate1X = 250;
				openGate1Y = 110;
				openGate2X = 250;
				openGate2Y = 230;
				openGate3X = 250;
				openGate3Y = 350;
				openGate4X = 430;
				openGate4Y = 230;


				
				//Set Active Gate Mechanics
				if (newLevel.isGate1AOpen == true) {
					gate1X = getChoiceX(0, 0, 0, 0, 0, 0);
					gate1Y = choiceY;
					originalGate1X = gate1X;
					originalGate1Y = gate1Y;
				} else {
					gate1X = openGate1X;
					gate1Y = openGate1Y;
					falseGate1X = getChoiceX(0, 0, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
				}
				
				if (newLevel.isGate1BOpen == true) {
					gate2X = getChoiceX(gate1X, falseGate1X, 0, 0, 0, 0);
					gate2Y = choiceY;
					originalGate2X = gate2X;
					originalGate2Y = gate2Y;
				} else {
					gate2X = openGate2X;
					gate2Y = openGate2Y;
					falseGate1X = getChoiceX(gate1X, 0, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;				
				}
				
				if (newLevel.isGate1COpen == true) {
					gate3X = getChoiceX(gate1X, falseGate1X, gate2X, 0, 0, 0);
					gate3Y = choiceY;
					originalGate3X = gate3X;
					originalGate3Y = gate3Y;
				} else {
					gate3X = openGate3X;
					gate3Y = openGate3Y;
					falseGate1X = getChoiceX(gate1X, gate2X, 0, 0, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					
				}	
				
				if (newLevel.isGate2AOpen == true) {
					gate4X = getChoiceX(gate1X, falseGate1X, gate2X, gate3X, 0, 0);
					gate4Y = choiceY;
					originalGate4X = gate4X;
					originalGate4Y = gate4Y;
				} else {
					gate4X = openGate4X;
					gate4Y = openGate4Y;
					falseGate1X = getChoiceX(gate1X, gate2X, gate3X, 0, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					
				}		
				
				if (newLevel.isGate2BOpen == true) {
					gate5X = getChoiceX(gate1X, falseGate1X, gate2X, gate3X, gate4X, 0);
					gate5Y = choiceY;
					originalGate5X = gate5X;
					originalGate5Y = gate5Y;
				} else {
					gate5X = openGate5X;
					gate5Y = openGate5Y;
					falseGate1X = getChoiceX(gate1X, gate2X, gate3X, gate4X, 0, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					
				}	
				
				if (newLevel.isGate3AOpen == true) {
					gate6X = getChoiceX(gate1X, falseGate1X, gate2X, gate3X, gate4X, gate5X);
					gate6Y = choiceY;
					originalGate6X = gate6X;
					originalGate6Y = gate6Y;
				} else {
					gate6X = openGate6X;
					gate6Y = openGate6Y;
					falseGate1X = getChoiceX(gate1X, gate2X, gate3X, gate4X, gate5X, 0);
					falseGate1Y = choiceY;
					originalFalseGate1X = falseGate1X;
					originalFalseGate1Y = falseGate1Y;
					
				}				
				outputX = 655;
				outputY = 230;						
				break;
				
				
			case "(6, 1(1,0,0))" :
				//Get Level Values
				input1 = newLevel.input1;
				input2 = newLevel.input2;
				input3 = newLevel.input3;
				input4 = newLevel.input4;
				input5 = newLevel.input5;
				input6 = newLevel.input6;
				
				gate1A = newLevel.gate1A;
	
				output = newLevel.finalOutput;
				falseGate1 = getFalseGate(gate1A, gate1B, gate1C, gate2A, gate2B, gate3A);
				falseGate2 = getFalseGate(gate1A, gate1B, gate1C, gate2A, gate2B, gate3A);
				
				//Set Component Location
				input1X = 20;
				input1Y = 80;
				input2X = 20;
				input2Y = 140;
				input3X = 20;
				input3Y = 200;
				input4X = 20;
				input4Y = 260;
				input5X = 20;
				input5Y = 320; 
				input6X = 20;
				input6Y = 380;
				openGate1X = 330;
				openGate1Y = 230;

				//Set Active Gate Mechanics
				gate1X = getChoiceX(0, 0, 0, 0, 0, 0);
				gate1Y = choiceY;
				originalGate1X = gate1X;
				originalGate1Y = gate1Y;
				falseGate1X = getChoiceX(gate1X, 0, 0, 0, 0, 0);
				falseGate1Y = choiceY;
				falseGate2X = getChoiceX(falseGate1X, gate1X, 0, 0, 0, 0);
				falseGate2Y = choiceY;
				originalFalseGate1X = falseGate1X;
				originalFalseGate1Y = falseGate1Y;
				originalFalseGate2X = falseGate2X;
				originalFalseGate2Y = falseGate2Y;			
				outputX = 655;
				outputY = 230;						
				break;
		}
	}
	
	public void update() {
		//System.out.println(mouseMH.cursorX + " " + mouseMH.cursorY);
		
		if (lifeCount != 0) {

			if (newLevel.isGate1AOpen == false) {
				openGate1A = gate1A;
			} else {
				openGate1A = "";
			}
			
			if (newLevel.isGate1BOpen == false) {
				openGate1B = gate1B;
			} else {
				openGate1B = "";
			}
	
			if (newLevel.isGate1COpen == false) {
				openGate1C = gate1C;
			} else {
				openGate1C = "";
			} 
			
			if (newLevel.isGate2AOpen == false) {
				openGate2A = gate2A;
			} else {
				openGate2A = "";
			}
			
			if (newLevel.isGate2BOpen == false) {
				openGate2B = gate2B;
			} else {
				openGate2B = "";
			} 
			
			if (newLevel.isGate3AOpen == false) {
				openGate3A = gate3A;
			}  else {
				openGate3A = "";
			}
				
			//DRAG AND DROP
				//GATE1
				if (gate1Entered == true && mouseH.clicked == true) {
					//System.out.println("GRABBING GATE1");
					gate1Grabbed = true;
				} else {
					gate1Grabbed = false;
				}
				
				//GATE2
				if (gate2Entered == true && mouseH.clicked == true) {
					gate2Grabbed = true;
				} else {
					gate2Grabbed = false;
				}
				
				
				if (gate3Entered == true && mouseH.clicked == true) {	
					gate3Grabbed = true;
				} else {
					gate3Grabbed = false;
				}
				
				//GATE4
				if (gate4Entered == true && mouseH.clicked == true) {
					//System.out.println("GRABBING GATE4");
					gate4Grabbed = true;
				} else {
					gate4Grabbed = false;
				}
				
				//GATE5
				if (gate5Entered == true && mouseH.clicked == true) {
					//System.out.println("GRABBING GATE5");
					gate5Grabbed = true;
				} else {
					gate5Grabbed = false;
				}
				
				//GATE6
				if (gate6Entered == true && mouseH.clicked == true) {
					//System.out.println("GRABBING GATE6");
					gate6Grabbed = true;
				} else {
					gate6Grabbed = false;
				}
				
				//FALSE GATE 1
				if (falseGate1Entered == true && mouseH.clicked == true) {
					//System.out.println("GRABBING FALSE");
					falseGate1Grabbed = true;
				} else {
					falseGate1Grabbed = false;
				}
				
				//FALSE GATE 2
				if (falseGate2Entered == true && mouseH.clicked == true) {
					//System.out.println("GRABBING FALSE");
					falseGate2Grabbed = true;
				} else {
					falseGate2Grabbed = false;
				}
				
					
			
				if (gate1Grabbed == true) {	
					gate1X = mouseMH.cursorX-50;
					gate1Y = mouseMH.cursorY-25;
				} else if (G1TOG1 == false && G1TOG2 == false && G1TOG3 == false && G1TOG4 == false && G1TOG5 == false && G1TOG6 == false) {
					gate1X = originalGate1X;
					gate1Y = originalGate1Y;
				}
				
				if (gate2Grabbed == true) {
					gate2X = mouseMH.cursorX-50;
					gate2Y = mouseMH.cursorY-25;
				} else if (G2TOG1 == false && G2TOG2 == false && G2TOG3 == false && G2TOG4 == false && G2TOG5 == false && G2TOG6 == false) {
					gate2X = originalGate2X;
					gate2Y = originalGate2Y;
				}
				
				if (gate3Grabbed == true) {		
					gate3X = mouseMH.cursorX-50;
					gate3Y = mouseMH.cursorY-25;
				} else if (G3TOG1 == false && G3TOG2 == false && G3TOG3 == false  && G3TOG4 == false && G3TOG5 == false && G3TOG6 == false) {				
					gate3X = originalGate3X;
					gate3Y = originalGate3Y;
				}
							
				if (gate4Grabbed == true) {	
					gate4X = mouseMH.cursorX-50;
					gate4Y = mouseMH.cursorY-25;
				} else if (G4TOG1 == false && G4TOG2 == false && G4TOG3 == false && G4TOG4 == false && G1TOG5 == false && G1TOG6 == false) {
					gate4X = originalGate4X;
					gate4Y = originalGate4Y;
				}
							
				if (gate5Grabbed == true) {
					gate5X = mouseMH.cursorX-50;
					gate5Y = mouseMH.cursorY-25;
				} else if (G5TOG1 == false && G5TOG2 == false && G5TOG3 == false && G5TOG4 == false && G5TOG5 == false && G5TOG6 == false) {
					gate5X = originalGate5X;
					gate5Y = originalGate5Y;
				}
							
				if (gate6Grabbed == true) {		
					gate6X = mouseMH.cursorX-50;
					gate6Y = mouseMH.cursorY-25;
				} else if (G6TOG1 == false && G6TOG2 == false && G6TOG3 == false && G6TOG4 == false && G6TOG5 == false && G6TOG6 == false) {				
					gate6X = originalGate6X;
					gate6Y = originalGate6Y;
				}
							
				if (falseGate1Grabbed == true) {			
					falseGate1X = mouseMH.cursorX-50;
					falseGate1Y = mouseMH.cursorY-25;
				} else if (FG1TOG1 == false && FG1TOG2 == false && FG1TOG3 == false && FG1TOG4 == false && FG1TOG5 == false && FG1TOG6 == false) {				
					falseGate1X = originalFalseGate1X;
					falseGate1Y = originalFalseGate1Y;
				}
				
				if (falseGate2Grabbed == true) {				
					falseGate2X = mouseMH.cursorX-50;
					falseGate2Y = mouseMH.cursorY-25;
				} else if (FG2TOG1 == false && FG2TOG2 == false && FG2TOG3 == false && FG2TOG4 == false && FG2TOG5 == false && FG2TOG6 == false) {				
					falseGate2X = originalFalseGate2X;
					falseGate2Y = originalFalseGate2Y;
				}
				
				
	
				
			
				//GATE1
				if (gate1Grabbed == true) {
					if ((gate1X+50) >= openGate1X && (gate1X+50) <= (openGate1X+100) && (gate1Y+25) >= openGate1Y && (gate1Y+25) <= (openGate1Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 1");
						if (newLevel.isGate1AOpen == true) {
							G1TOG1 = true;
						}
					} else {
						resetGate();
						G1TOG1 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 1");
					}
					
					if ((gate1X+50) >= openGate2X && (gate1X+50) <= (openGate2X+100) && (gate1Y+25) >= openGate2Y && (gate1Y+25) <= (openGate2Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 2");
						if (newLevel.isGate1BOpen == true) {
							G1TOG2 = true;
						}
					} else {
						resetGate();
						G1TOG2 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 2");
					}
	
					if ((gate1X+50) >= openGate3X && (gate1X+50) <= (openGate3X+100) && (gate1Y+25) >= openGate3Y && (gate1Y+25) <= (openGate3Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 3");
						if (newLevel.isGate1COpen == true) {
							G1TOG3 = true;
						}
					} else {
						resetGate();
						G1TOG3 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 3");
					}
					
					if ((gate1X+50) >= openGate4X && (gate1X+50) <= (openGate4X+100) && (gate1Y+25) >= openGate4Y && (gate1Y+25) <= (openGate4Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 4");
						if (newLevel.isGate2AOpen == true) {
							G1TOG4 = true;
						}
					} else {
						resetGate();
						G1TOG4 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 4");
					}
					
					if ((gate1X+50) >= openGate5X && (gate1X+50) <= (openGate5X+100) && (gate1Y+25) >= openGate5Y && (gate1Y+25) <= (openGate5Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 5");
						if (newLevel.isGate2BOpen == true) {
							G1TOG5 = true;
						}
					} else {
						resetGate();
						G1TOG5 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 5");
					}
					
					if ((gate1X+50) >= openGate6X && (gate1X+50) <= (openGate6X+100) && (gate1Y+25) >= openGate6Y && (gate1Y+25) <= (openGate6Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 6");
						if (newLevel.isGate3AOpen == true) {
							G1TOG6 = true;
						}
					} else {
						resetGate();
						G1TOG6 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 6");
					}
				} else if (G1TOG1 == true) {
					//System.out.println("OPEN GATE 1A HAS " + gate1A);
					openGate1A = gate1A;
					goToOpenGate("gate1", gate1X, gate1Y, openGate1X, openGate1Y);
				} else if (G1TOG2 == true) {
					//System.out.println("OPEN GATE 1B HAS " + gate1A);
					openGate1B = gate1A;
					goToOpenGate("gate1", gate1X, gate1Y, openGate2X, openGate2Y);
				} else if (G1TOG3 == true) {
					//System.out.println("OPEN GATE 1C HAS " + gate1A);
					openGate1C = gate1A;
					goToOpenGate("gate1", gate1X, gate1Y, openGate3X, openGate3Y);
				} else if (G1TOG4 == true) {
					//System.out.println("OPEN GATE 2A HAS " + gate1A);
					openGate2A = gate1A;
					goToOpenGate("gate1", gate1X, gate1Y, openGate4X, openGate4Y);
				} else if (G1TOG5 == true) {
					//System.out.println("OPEN GATE 2B HAS " + gate1A);
					openGate2B = gate1A;
					goToOpenGate("gate1", gate1X, gate1Y, openGate5X, openGate5Y);
				} else if (G1TOG6 == true) {
					//System.out.println("OPEN GATE 3A HAS " + gate1A);
					openGate3A = gate1A;
					goToOpenGate("gate1", gate1X, gate1Y, openGate6X, openGate6Y);
				}
				
				
				//GATE2
				if (gate2Grabbed == true) {
					if ((gate2X+50) >= openGate1X && (gate2X+50) <= (openGate1X+100) && (gate2Y+25) >= openGate1Y && (gate2Y+25) <= (openGate1Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 1");
						if (newLevel.isGate1AOpen == true) {
							G2TOG1 = true;
						}
					} else {
						resetGate();
						G2TOG1 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 1");
					}
					
					if ((gate2X+50) >= openGate2X && (gate2X+50) <= (openGate2X+100) && (gate2Y+25) >= openGate2Y && (gate2Y+25) <= (openGate2Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 2");
						if (newLevel.isGate1BOpen == true) {
							G2TOG2 = true;
						}
					} else {
						resetGate();
						G2TOG2 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 2");
					}
	
					if ((gate2X+50) >= openGate3X && (gate2X+50) <= (openGate3X+100) && (gate2Y+25) >= openGate3Y && (gate2Y+25) <= (openGate3Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 3");
						if (newLevel.isGate1COpen == true) {
							G2TOG3 = true;
						}
					} else {
						resetGate();
						G2TOG3 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 3");
					}
					
					if ((gate2X+50) >= openGate4X && (gate2X+50) <= (openGate4X+100) && (gate2Y+25) >= openGate4Y && (gate2Y+25) <= (openGate4Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 4");
						if (newLevel.isGate2AOpen == true) {
							G2TOG4 = true;
						}
					} else {
						resetGate();
						G2TOG4 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 4");
					}
					
					if ((gate2X+50) >= openGate5X && (gate2X+50) <= (openGate5X+100) && (gate2Y+25) >= openGate5Y && (gate2Y+25) <= (openGate5Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 5");
						if (newLevel.isGate2BOpen == true) {
							G2TOG5 = true;
						}
					} else {
						resetGate();
						G2TOG5 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 5");
					}
					
					if ((gate2X+50) >= openGate6X && (gate2X+50) <= (openGate6X+100) && (gate2Y+25) >= openGate6Y && (gate2Y+25) <= (openGate6Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 6");
						if (newLevel.isGate3AOpen == true) {
							G2TOG6 = true;
						}
					} else {
						resetGate();
						G2TOG6 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 6");
					}
				} else if (G2TOG1 == true) {
					//System.out.println("OPEN GATE 1A HAS " + gate1B);
					openGate1A = gate1B;
					goToOpenGate("gate2", gate2X, gate2Y, openGate1X, openGate1Y);
				} else if (G2TOG2 == true) {
					//System.out.println("OPEN GATE 1B HAS " + gate1B);
					openGate1B = gate1B;
					goToOpenGate("gate2", gate2X, gate2Y, openGate2X, openGate2Y);
				} else if (G2TOG3 == true) {
					//System.out.println("OPEN GATE 1C HAS " + gate1B);
					openGate1C = gate1B;
					goToOpenGate("gate2", gate2X, gate2Y, openGate3X, openGate3Y);
				} else if (G2TOG4 == true) {
					//System.out.println("OPEN GATE 2A HAS " + gate1B);
					openGate2A = gate1B;
					goToOpenGate("gate2", gate2X, gate2Y, openGate4X, openGate4Y);
				} else if (G2TOG5 == true) {
					//System.out.println("OPEN GATE 2B HAS " + gate1B);
					openGate2B = gate1B;
					goToOpenGate("gate2", gate2X, gate2Y, openGate5X, openGate5Y);
				} else if (G2TOG6 == true) {
					//System.out.println("OPEN GATE 3A HAS " + gate1B);
					openGate3A = gate1B;
					goToOpenGate("gate2", gate2X, gate2Y, openGate6X, openGate6Y);
				}
				
				//GATE3
				if (gate3Grabbed == true) {
					if ((gate3X+50) >= openGate1X && (gate3X+50) <= (openGate1X+100) && (gate3Y+25) >= openGate1Y && (gate3Y+25) <= (openGate1Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 1");
						if (newLevel.isGate1AOpen == true) {
							G3TOG1 = true;
						}
					} else {
						resetGate();
						G3TOG1 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 1");
					}
					
					if ((gate3X+50) >= openGate2X && (gate3X+50) <= (openGate2X+100) && (gate3Y+25) >= openGate2Y && (gate3Y+25) <= (openGate2Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 2");
						if (newLevel.isGate1BOpen == true) {
							G3TOG2 = true;
						}
					} else {
						resetGate();
						G3TOG2 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 2");
					}
	
					if ((gate3X+50) >= openGate3X && (gate3X+50) <= (openGate3X+100) && (gate3Y+25) >= openGate3Y && (gate3Y+25) <= (openGate3Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 3");
						if (newLevel.isGate1COpen == true) {
							G3TOG3 = true;
						}
					} else {
						resetGate();
						G3TOG3 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 3");
					}
					
					if ((gate3X+50) >= openGate4X && (gate3X+50) <= (openGate4X+100) && (gate3Y+25) >= openGate4Y && (gate3Y+25) <= (openGate4Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 4");
						if (newLevel.isGate2AOpen == true) {
							G3TOG4 = true;
						}
					} else {
						resetGate();
						G3TOG4 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 4");
					}
					
					if ((gate3X+50) >= openGate5X && (gate3X+50) <= (openGate5X+100) && (gate3Y+25) >= openGate5Y && (gate3Y+25) <= (openGate5Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 5");
						if (newLevel.isGate2BOpen == true) {
							G3TOG5 = true;
						}
					} else {
						resetGate();
						G3TOG5 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 5");
					}
					
					if ((gate3X+50) >= openGate6X && (gate3X+50) <= (openGate6X+100) && (gate3Y+25) >= openGate6Y && (gate3Y+25) <= (openGate6Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 6");
						if (newLevel.isGate3AOpen == true) {
							G3TOG6 = true;
						}
					} else {
						resetGate();
						G3TOG6 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 6");
					}
				} else if (G3TOG1 == true) {
					//System.out.println("OPEN GATE 1A HAS " + gate1C);
					openGate1A = gate1C;
					goToOpenGate("gate3", gate3X, gate3Y, openGate1X, openGate1Y);
				} else if (G3TOG2 == true) {
					//System.out.println("OPEN GATE 1B HAS " + gate1C);
					openGate1B = gate1C;
					goToOpenGate("gate3", gate3X, gate3Y, openGate2X, openGate2Y);
				} else if (G3TOG3 == true) {
					//System.out.println("OPEN GATE 1C HAS " + gate1C);
					openGate1C = gate1C;
					goToOpenGate("gate3", gate3X, gate3Y, openGate3X, openGate3Y);
				} else if (G3TOG4 == true) {
					//System.out.println("OPEN GATE 2A HAS " + gate1C);
					openGate2A = gate1C;
					goToOpenGate("gate3", gate3X, gate3Y, openGate4X, openGate4Y);
				} else if (G3TOG5 == true) {
					//System.out.println("OPEN GATE 2B HAS " + gate1C);
					openGate2B = gate1C;
					goToOpenGate("gate3", gate3X, gate3Y, openGate5X, openGate5Y);
				} else if (G3TOG6 == true) {
					//System.out.println("OPEN GATE 3A HAS " + gate1C);
					openGate3A = gate1C;
					goToOpenGate("gate3", gate3X, gate3Y, openGate6X, openGate6Y);
				}
				
				//GATE4
				if (gate4Grabbed == true) {
					if ((gate4X+50) >= openGate1X && (gate4X+50) <= (openGate1X+100) && (gate4Y+25) >= openGate1Y && (gate4Y+25) <= (openGate1Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 1");
						if (newLevel.isGate1AOpen == true) {
							G4TOG1 = true;
						}
					} else {
						resetGate();
						G4TOG1 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 1");
					}
					
					if ((gate4X+50) >= openGate2X && (gate4X+50) <= (openGate2X+100) && (gate4Y+25) >= openGate2Y && (gate4Y+25) <= (openGate2Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 2");
						if (newLevel.isGate1BOpen == true) {
							G4TOG2 = true;
						}
					} else {
						resetGate();
						G4TOG2 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 2");
					}
	
					if ((gate4X+50) >= openGate3X && (gate4X+50) <= (openGate3X+100) && (gate4Y+25) >= openGate3Y && (gate4Y+25) <= (openGate3Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 3");
						if (newLevel.isGate1COpen == true) {
							G4TOG3 = true;
						}
					} else {
						resetGate();
						G4TOG3 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 3");
					}
					
					if ((gate4X+50) >= openGate4X && (gate4X+50) <= (openGate4X+100) && (gate4Y+25) >= openGate4Y && (gate4Y+25) <= (openGate4Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 4");
						if (newLevel.isGate2AOpen == true) {
							G4TOG4 = true;
						}
					} else {
						resetGate();
						G4TOG4 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 4");
					}
					
					if ((gate4X+50) >= openGate5X && (gate4X+50) <= (openGate5X+100) && (gate4Y+25) >= openGate5Y && (gate4Y+25) <= (openGate5Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 5");
						if (newLevel.isGate2BOpen == true) {
							G4TOG5 = true;
						}
					} else {
						resetGate();
						G4TOG5 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 5");
					}
					
					if ((gate4X+50) >= openGate6X && (gate4X+50) <= (openGate6X+100) && (gate4Y+25) >= openGate6Y && (gate4Y+25) <= (openGate6Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 6");
						if (newLevel.isGate3AOpen == true) {
							G4TOG6 = true;
						}
					} else {
						resetGate();
						G4TOG6 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 6");
					}
				} else if (G4TOG1 == true) {
					//System.out.println("OPEN GATE 1A HAS " + gate2A);
					openGate1A = gate2A;
					goToOpenGate("gate4", gate4X, gate4Y, openGate1X, openGate1Y);
				} else if (G4TOG2 == true) {
					//System.out.println("OPEN GATE 1B HAS " + gate2A);
					openGate1B = gate2A;
					goToOpenGate("gate4", gate4X, gate4Y, openGate2X, openGate2Y);
				} else if (G4TOG3 == true) {
					//System.out.println("OPEN GATE 1C HAS " + gate2A);
					openGate1C = gate2A;
					goToOpenGate("gate4", gate4X, gate4Y, openGate3X, openGate3Y);
				} else if (G4TOG4 == true) {
					//System.out.println("OPEN GATE 2A HAS " + gate2A);
					openGate2A = gate2A;
					goToOpenGate("gate4", gate4X, gate4Y, openGate4X, openGate4Y);
				} else if (G4TOG5 == true) {
					//System.out.println("OPEN GATE 2B HAS " + gate2A);
					openGate2B = gate2A;
					goToOpenGate("gate4", gate4X, gate4Y, openGate5X, openGate5Y);
				} else if (G4TOG6 == true) {
					//System.out.println("OPEN GATE 3A HAS " + gate2A);
					openGate3A = gate2A;
					goToOpenGate("gate4", gate4X, gate4Y, openGate6X, openGate6Y);
				}
				
				//GATE5
				if (gate5Grabbed == true) {
					if ((gate5X+50) >= openGate1X && (gate5X+50) <= (openGate1X+100) && (gate5Y+25) >= openGate1Y && (gate5Y+25) <= (openGate1Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 1");
						if (newLevel.isGate1AOpen == true) {
							G5TOG1 = true;
						}
					} else {
						resetGate();
						G5TOG1 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 1");
					}
					
					if ((gate5X+50) >= openGate2X && (gate5X+50) <= (openGate2X+100) && (gate5Y+25) >= openGate2Y && (gate5Y+25) <= (openGate2Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 2");
						if (newLevel.isGate1BOpen == true) {
							G5TOG2 = true;
						}
					} else {
						resetGate();
						G5TOG2 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 2");
					}
	
					if ((gate5X+50) >= openGate3X && (gate5X+50) <= (openGate3X+100) && (gate5Y+25) >= openGate3Y && (gate5Y+25) <= (openGate3Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 3");
						if (newLevel.isGate1COpen == true) {
							G5TOG3 = true;
						}
					} else {
						resetGate();
						G5TOG3 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 3");
					}
					
					if ((gate5X+50) >= openGate4X && (gate5X+50) <= (openGate4X+100) && (gate5Y+25) >= openGate4Y && (gate5Y+25) <= (openGate4Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 4");
						if (newLevel.isGate2AOpen == true) {
							G5TOG4 = true;
						}
					} else {
						resetGate();
						G5TOG4 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 4");
					}
					
					if ((gate5X+50) >= openGate5X && (gate5X+50) <= (openGate5X+100) && (gate5Y+25) >= openGate5Y && (gate5Y+25) <= (openGate5Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 5");
						if (newLevel.isGate2BOpen == true) {
							G5TOG5 = true;
						}
					} else {
						resetGate();
						G5TOG5 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 5");
					}
					
					if ((gate5X+50) >= openGate6X && (gate5X+50) <= (openGate6X+100) && (gate5Y+25) >= openGate6Y && (gate5Y+25) <= (openGate6Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 6");
						if (newLevel.isGate3AOpen == true) {
							G5TOG6 = true;
						}
					} else {
						resetGate();
						G5TOG6 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 6");
					}
				} else if (G5TOG1 == true) {
					//System.out.println("OPEN GATE 1A HAS " + gate2B);
					openGate1A = gate2B;
					goToOpenGate("gate5", gate5X, gate5Y, openGate1X, openGate1Y);
				} else if (G5TOG2 == true) {
					//System.out.println("OPEN GATE 1B HAS " + gate2B);
					openGate1B = gate2B;
					goToOpenGate("gate5", gate5X, gate5Y, openGate2X, openGate2Y);
				} else if (G5TOG3 == true) {
					//System.out.println("OPEN GATE 1C HAS " + gate2B);
					openGate1C = gate2B;
					goToOpenGate("gate5", gate5X, gate5Y, openGate3X, openGate3Y);
				} else if (G5TOG4 == true) {
					//System.out.println("OPEN GATE 2A HAS " + gate2B);
					openGate2A = gate2B;
					goToOpenGate("gate5", gate5X, gate5Y, openGate4X, openGate4Y);
				} else if (G5TOG5 == true) {
					//System.out.println("OPEN GATE 2B HAS " + gate2B);
					openGate2B = gate2B;
					goToOpenGate("gate5", gate5X, gate5Y, openGate5X, openGate5Y);
				} else if (G5TOG6 == true) {
					//System.out.println("OPEN GATE 3A HAS " + gate2B);
					openGate3A = gate2B;
					goToOpenGate("gate5", gate5X, gate5Y, openGate6X, openGate6Y);
				}
				
				//GATE6
				if (gate6Grabbed == true) {
					if ((gate6X+50) >= openGate1X && (gate6X+50) <= (openGate1X+100) && (gate6Y+25) >= openGate1Y && (gate6Y+25) <= (openGate1Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 1");
						if (newLevel.isGate1AOpen == true) {
							G6TOG1 = true;
						}
					} else {
						resetGate();
						G6TOG1 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 1");
					}
					
					if ((gate6X+50) >= openGate2X && (gate6X+50) <= (openGate2X+100) && (gate6Y+25) >= openGate2Y && (gate6Y+25) <= (openGate2Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 2");
						if (newLevel.isGate1BOpen == true) {
							G6TOG2 = true;
						}
					} else {
						resetGate();
						G6TOG2 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 2");
					}
	
					if ((gate6X+50) >= openGate3X && (gate6X+50) <= (openGate3X+100) && (gate6Y+25) >= openGate3Y && (gate6Y+25) <= (openGate3Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 3");
						if (newLevel.isGate1COpen == true) {
							G6TOG3 = true;
						}
					} else {
						resetGate();
						G6TOG3 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 3");
					}
					
					if ((gate6X+50) >= openGate4X && (gate6X+50) <= (openGate4X+100) && (gate6Y+25) >= openGate4Y && (gate6Y+25) <= (openGate4Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 4");
						if (newLevel.isGate2AOpen == true) {
							G6TOG4 = true;
						}
					} else {
						resetGate();
						G6TOG4 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 4");
					}
					
					if ((gate6X+50) >= openGate5X && (gate6X+50) <= (openGate5X+100) && (gate6Y+25) >= openGate5Y && (gate6Y+25) <= (openGate5Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 5");
						if (newLevel.isGate2BOpen == true) {
							G6TOG5 = true;
						}
					} else {
						resetGate();
						G6TOG5 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 5");
					}
					
					if ((gate6X+50) >= openGate6X && (gate6X+50) <= (openGate6X+100) && (gate6Y+25) >= openGate6Y && (gate6Y+25) <= (openGate6Y+50)) {
						//System.out.println("GATE 1 ENTERED OPEN GATE 6");
						if (newLevel.isGate3AOpen == true) {
							G6TOG6 = true;
						}
					} else {
						resetGate();
						G6TOG6 = false;
						//System.out.println("GATE 1 EXITED OPEN GATE 6");
					}
				} else if (G6TOG1 == true) {
					//System.out.println("OPEN GATE 1A HAS " + gate1A);
					openGate1A = gate3A;
					goToOpenGate("gate6", gate6X, gate6Y, openGate1X, openGate1Y);
				} else if (G6TOG2 == true) {
					//System.out.println("OPEN GATE 1B HAS " + gate1A);
					openGate1B = gate3A;
					goToOpenGate("gate6", gate6X, gate6Y, openGate2X, openGate2Y);
				} else if (G6TOG3 == true) {
					//System.out.println("OPEN GATE 1C HAS " + gate1A);
					openGate1C = gate3A;
					goToOpenGate("gate6", gate6X, gate6Y, openGate3X, openGate3Y);
				} else if (G6TOG4 == true) {
					//System.out.println("OPEN GATE 2A HAS " + gate1A);
					openGate2A = gate3A;
					goToOpenGate("gate6", gate6X, gate6Y, openGate4X, openGate4Y);
				} else if (G6TOG5 == true) {
					//System.out.println("OPEN GATE 2B HAS " + gate1A);
					openGate2B = gate3A;
					goToOpenGate("gate6", gate6X, gate6Y, openGate5X, openGate5Y);
				} else if (G6TOG6 == true) {
					//System.out.println("OPEN GATE 3A HAS " + gate1A);
					openGate3A = gate3A;
					goToOpenGate("gate6", gate6X, gate6Y, openGate6X, openGate6Y);
				}
				
				//FALSE GATE 1
				if (falseGate1Grabbed == true) {
					if ((falseGate1X+50) >= openGate1X && (falseGate1X+50) <= (openGate1X+100) && (falseGate1Y+25) >= openGate1Y && (falseGate1Y+25) <= (openGate1Y+50)) {
						//System.out.println("FALSE GATE ENTERED OPEN GATE 1");
						if (newLevel.isGate1AOpen == true) {
							FG1TOG1 = true;
						}
					} else {
						resetGate();
						FG1TOG1 = false;
						//System.out.println("FALSE GATE EXITED OPEN GATE 1");
					}
					
					if ((falseGate1X+50) >= openGate2X && (falseGate1X+50) <= (openGate2X+100) && (falseGate1Y+25) >= openGate2Y && (falseGate1Y+25) <= (openGate2Y+50)) {
						//System.out.println("FALSE GATE ENTERED OPEN GATE 2");
						if (newLevel.isGate1BOpen == true) {
							FG1TOG2 = true;
						}
					} else {
						resetGate();
						FG1TOG2 = false;
						//System.out.println("FALSE GATE EXITED OPEN GATE 2");
					}
					
					if ((falseGate1X+50) >= openGate3X && (falseGate1X+50) <= (openGate3X+100) && (falseGate1Y+25) >= openGate3Y && (falseGate1Y+25) <= (openGate3Y+50)) {
						//System.out.println("FALSE GATE ENTERED OPEN GATE 3");
						if (newLevel.isGate1COpen == true) {
							FG1TOG3 = true;
						}
					} else {
						resetGate();
						FG1TOG3 = false;
						//System.out.println("FALSE GATE EXITED OPEN GATE 3");
					} 
	
					if ((falseGate1X+50) >= openGate4X && (falseGate1X+50) <= (openGate4X+100) && (falseGate1Y+25) >= openGate4Y && (falseGate1Y+25) <= (openGate4Y+50)) {
						//System.out.println("FALSE GATE ENTERED OPEN GATE 3");
						if (newLevel.isGate2AOpen == true) {
							FG1TOG4 = true;
						}
					} else {
						resetGate();
						FG1TOG4 = false;
						//System.out.println("FALSE GATE EXITED OPEN GATE 3");
					} 
					
					if ((falseGate1X+50) >= openGate5X && (falseGate1X+50) <= (openGate5X+100) && (falseGate1Y+25) >= openGate5Y && (falseGate1Y+25) <= (openGate5Y+50)) {
						//System.out.println("FALSE GATE ENTERED OPEN GATE 3");
						if (newLevel.isGate2BOpen == true) {
							FG1TOG5 = true;
						}
					} else {
						resetGate();
						FG1TOG5 = false;
						//System.out.println("FALSE GATE EXITED OPEN GATE 3");
					} 
					if ((falseGate1X+50) >= openGate6X && (falseGate1X+50) <= (openGate6X+100) && (falseGate1Y+25) >= openGate6Y && (falseGate1Y+25) <= (openGate6Y+50)) {
						//System.out.println("FALSE GATE ENTERED OPEN GATE 3");
						if (newLevel.isGate3AOpen == true) {
							FG1TOG6 = true;
						}
					} else {
						resetGate();
						FG1TOG6 = false;
						//System.out.println("FALSE GATE EXITED OPEN GATE 3");
					} 
				} else if (FG1TOG1 == true) {
					//System.out.println("OPEN GATE 1A HAS " + falseGate1);
					openGate1A = falseGate1;
					goToOpenGate("falseGate1", falseGate1X, falseGate1Y, openGate1X, openGate1Y);
				} else if (FG1TOG2 == true) {
					//System.out.println("OPEN GATE 1B HAS " + falseGate1);
					openGate1B = falseGate1;
					goToOpenGate("falseGate1", falseGate1X, falseGate1Y, openGate2X, openGate2Y);
				} else if (FG1TOG3 == true) {
					//System.out.println("OPEN GATE 1C HAS " + falseGate1);
					openGate1C = falseGate1;
					goToOpenGate("falseGate1", falseGate1X, falseGate1Y, openGate3X, openGate3Y);
				} else if (FG1TOG4 == true) {
					//System.out.println("OPEN GATE 2A HAS " + falseGate1);
					openGate2A = falseGate1;
					goToOpenGate("falseGate1", falseGate1X, falseGate1Y, openGate4X, openGate4Y);
				} else if (FG1TOG5 == true) {
					//System.out.println("OPEN GATE 2B HAS " + falseGate1);
					openGate2B = falseGate1;
					goToOpenGate("falseGate1", falseGate1X, falseGate1Y, openGate5X, openGate5Y);
				} else if (FG1TOG6 == true) {
					//System.out.println("OPEN GATE 3A HAS " + falseGate1);
					openGate3A = falseGate1;
					goToOpenGate("falseGate1", falseGate1X, falseGate1Y, openGate6X, openGate6Y);
				}
				
				//FALSE GATE 2
				if (falseGate2Grabbed == true) {
					if ((falseGate2X+50) >= openGate1X && (falseGate2X+50) <= (openGate1X+100) && (falseGate2Y+25) >= openGate1Y && (falseGate2Y+25) <= (openGate1Y+50)) {
						//System.out.println("FALSE GATE 2 ENTERED OPEN GATE 1");
						if (newLevel.isGate1AOpen == true) {
							FG2TOG1 = true;
						}
					} else {
						resetGate();
						FG2TOG1 = false;
						//System.out.println("FALSE GATE 2 EXITED OPEN GATE 1");
					}
					
					if ((falseGate2X+50) >= openGate2X && (falseGate2X+50) <= (openGate2X+100) && (falseGate2Y+25) >= openGate2Y && (falseGate2Y+25) <= (openGate2Y+50)) {
						//System.out.println("FALSE GATE 2 ENTERED OPEN GATE 2");
						if (newLevel.isGate1BOpen == true) {
							FG2TOG2 = true;
						}
					} else {
						resetGate();
						FG2TOG2 = false;
						//System.out.println("FALSE GATE 2 EXITED OPEN GATE 2");
					}
					
					if ((falseGate2X+50) >= openGate3X && (falseGate2X+50) <= (openGate3X+100) && (falseGate2Y+25) >= openGate3Y && (falseGate2Y+25) <= (openGate3Y+50)) {
						//System.out.println("FALSE GATE 2 ENTERED OPEN GATE 3");
						if (newLevel.isGate1COpen == true) {
							FG2TOG3 = true;
						}
					} else {
						resetGate();
						FG2TOG3 = false;
						//System.out.println("FALSE GATE 2 EXITED OPEN GATE 3");
					} 
	
					if ((falseGate2X+50) >= openGate4X && (falseGate2X+50) <= (openGate4X+100) && (falseGate2Y+25) >= openGate4Y && (falseGate2Y+25) <= (openGate4Y+50)) {
						//System.out.println("FALSE GATE 2 ENTERED OPEN GATE 3");
						if (newLevel.isGate2AOpen == true) {
							FG2TOG4 = true;
						}
					} else {
						resetGate();
						FG2TOG4 = false;
						//System.out.println("FALSE GATE 2 EXITED OPEN GATE 3");
					} 
					
					if ((falseGate2X+50) >= openGate5X && (falseGate2X+50) <= (openGate5X+100) && (falseGate2Y+25) >= openGate5Y && (falseGate2Y+25) <= (openGate5Y+50)) {
						//System.out.println("FALSE GATE 2 ENTERED OPEN GATE 3");
						if (newLevel.isGate2BOpen == true) {
							FG2TOG5 = true;
						}
					} else {
						resetGate();
						FG2TOG5 = false;
						//System.out.println("FALSE GATE 2 EXITED OPEN GATE 3");
					} 
					
					if ((falseGate2X+50) >= openGate6X && (falseGate2X+50) <= (openGate6X+100) && (falseGate2Y+25) >= openGate6Y && (falseGate2Y+25) <= (openGate6Y+50)) {
						//System.out.println("FALSE GATE 2 ENTERED OPEN GATE 3");
						if (newLevel.isGate3AOpen == true) {
							FG2TOG6 = true;
						}
					} else {
						resetGate();
						FG2TOG6 = false;
						//System.out.println("FALSE GATE 2 EXITED OPEN GATE 3");
					} 
				} else if (FG2TOG1 == true) {
					//System.out.println("OPEN GATE 1A HAS " + falseGate2);
					openGate1A = falseGate2;
					goToOpenGate("falseGate2", falseGate2X, falseGate2Y, openGate1X, openGate1Y);
				} else if (FG2TOG2 == true) {
					//System.out.println("OPEN GATE 1B HAS " + falseGate2);
					openGate1B = falseGate2;
					goToOpenGate("falseGate2", falseGate2X, falseGate2Y, openGate2X, openGate2Y);
				} else if (FG2TOG3 == true) {
					//System.out.println("OPEN GATE 1C HAS " + falseGate2);
					openGate1C = falseGate2;
					goToOpenGate("falseGate2", falseGate2X, falseGate2Y, openGate3X, openGate3Y);
				} else if (FG2TOG4 == true) {
					//System.out.println("OPEN GATE 2A HAS " + falseGate2);
					openGate2A = falseGate2;
					goToOpenGate("falseGate2", falseGate2X, falseGate2Y, openGate4X, openGate4Y);
				} else if (FG2TOG5 == true) {
					//System.out.println("OPEN GATE 2B HAS " + falseGate2);
					openGate2B = falseGate2;
					goToOpenGate("falseGate2", falseGate2X, falseGate2Y, openGate5X, openGate5Y);
				} else if (FG2TOG6 == true) {
					//System.out.println("OPEN GATE 3A HAS " + falseGate2);
					openGate3A = falseGate2;
					goToOpenGate("falseGate2", falseGate2X, falseGate2Y, openGate6X, openGate6Y);
				}
						
				if (mouseH.clicked == true && runButtonEntered == true && mouseH.index == 1) {
					startSimulation = true;
					mouseH.index = 0;
				} else {
					startSimulation = false;
				}
				
				
				if (startSimulation == true) {
					puzzleSuccess = gate.checkPuzzle(newLevel.levelClassification, openGate1A, openGate1B, openGate1C, openGate2A, openGate2B, openGate3A, input1, input2, input3, input4, input5, input6, output);
				}
				
				
				
				
				//Run Procedure
				if (startSimulation == true) {			
					if (gate1A == openGate1A) {
						if (gate1B == openGate1B) {
							if (gate1C == openGate1C) {
								if (gate2A == openGate2A) {
									if (gate2B == openGate2B) {
										if (gate3A == openGate3A) {
											
											puzzleSuccess = true;
										} else if (puzzleSuccess == true) {
											
										} else {
											updateFeedbackPanel("gate3A");
											lifeCount--;
											puzzleSuccess = false;
											feedbackPanelReset = true;
										}
									} else if (puzzleSuccess == true) {
										
									} else {
										updateFeedbackPanel("gate2B");
										lifeCount--;
										puzzleSuccess = false;
										feedbackPanelReset = true;
									}
								} else if (puzzleSuccess == true) {
									
								} else {
									updateFeedbackPanel("gate2A");
									lifeCount--;
									puzzleSuccess = false;
									feedbackPanelReset = true;
								}
							} else if (puzzleSuccess == true) {
								
							} else {
								updateFeedbackPanel("gate1C");
								lifeCount--;
								puzzleSuccess = false;
								feedbackPanelReset = true;
							}
						} else if (puzzleSuccess == true) {
							
						} else {
							updateFeedbackPanel("gate1B");
							lifeCount--;
							puzzleSuccess = false;
							feedbackPanelReset = true;
						}
					} else if (puzzleSuccess == true) {
						
					} else {
						updateFeedbackPanel("gate1A");
						lifeCount--;
						puzzleSuccess = false;
						feedbackPanelReset = true;
					}
			}
			
				
			//Update Feedback Panel
			if (feedbackPanelReset == true) {
				feedbackPanelCounter++;
				if (feedbackPanelCounter == 120) {
					resetFeedbackPanel();
				}
			}
				
									
			//Update Level
			if (puzzleSuccess == true) {
				resetGate();
				
				load.loadStart = true;
				if (load.nextLevel == true) {
					setDefaultValues();
					getLevelElements();
					resetFeedbackPanel();
					levelCount++;
					System.out.print(levelCount);
					load.nextLevel = false;
				}				
			}
		} else {
			if (load.nextLevel == true) {
				setDefaultValues();
				getLevelElements();
				setLevelValue();
				setLifeValue();
				resetFeedbackPanel();
				load.nextLevel = false;		
			} else {
				gameOver = true;
			}
		}
	}
	
	public void draw(Graphics2D g2) {
		//Initialize image variables
		BufferedImage backgroundImage = null;
		
		BufferedImage input1Image = null;
		BufferedImage input2Image = null;
		BufferedImage input3Image = null;
		BufferedImage input4Image = null;
		BufferedImage input5Image = null;
		BufferedImage input6Image = null;
		BufferedImage outputImage = null;
		
		BufferedImage openGate1 = null;
		BufferedImage openGate2 = null;
		BufferedImage openGate3 = null;
		BufferedImage openGate4 = null;
		BufferedImage openGate5 = null;
		BufferedImage openGate6 = null;
		
		BufferedImage gate1AImage = null;
		BufferedImage gate1BImage = null;
		BufferedImage gate1CImage = null;
		BufferedImage gate2AImage = null;
		BufferedImage gate2BImage = null;
		BufferedImage gate3AImage = null;
		
		BufferedImage falseGate1Image = null;
		BufferedImage falseGate2Image = null;
		
		BufferedImage runButtonImage = null;
		BufferedImage runButtonPressedImage = null;
		BufferedImage runButtonHighlightImage = null;
		BufferedImage lifeImage = null;
		
		BufferedImage feedbackPanelImage = null;
				
		
		//Instantiate images
		
		openGate1 = open1;
		openGate2 = open2;
		openGate3 = open3;
		openGate4 = open4;
		openGate5 = open5;
		openGate6 = open6;
		
		
		gate1AImage = getGateImage(gate1A);
		gate1BImage = getGateImage(gate1B);
		gate1CImage = getGateImage(gate1C);
		gate2AImage = getGateImage(gate2A);
		gate2BImage = getGateImage(gate2B);
		gate3AImage = getGateImage(gate3A);
		
		
		
		input1Image = getBinaryImage(input1);
		input2Image = getBinaryImage(input2);
		input3Image = getBinaryImage(input3);
		input4Image = getBinaryImage(input4);
		input5Image = getBinaryImage(input5);
		input6Image = getBinaryImage(input6);
	
		
		outputImage = getBinaryImage(output);
		falseGate1Image = getGateImage(falseGate1);
		falseGate2Image = getGateImage(falseGate2);
		
		runButtonImage = runButton;
		runButtonPressedImage = runButtonPressed;
		runButtonHighlightImage = runButtonHighlight;
		
		lifeImage = getLifeImage(lifeCount);
		
		feedbackPanelImage = feedbackPanelHolder;
		
		backgroundImage = getBackground(newLevel.levelClassification);
		
		
		
		
		
	
		//g2.drawImage(andGate, andX, andY, componentWidth, componentHeight, null);
		
		g2.drawImage(backgroundImage, 0, 0, gp.screenWidth, gp.screenHeight, null);
		
		g2.drawImage(input1Image, input1X, input1Y, componentWidth, componentHeight, null);
		g2.drawImage(input2Image, input2X, input2Y, componentWidth, componentHeight, null);
		g2.drawImage(input3Image, input3X, input3Y, componentWidth, componentHeight, null);
		g2.drawImage(input4Image, input4X, input4Y, componentWidth, componentHeight, null);
		g2.drawImage(input5Image, input5X, input5Y, componentWidth, componentHeight, null);
		g2.drawImage(input6Image, input6X, input6Y, componentWidth, componentHeight, null);
	
		
		g2.drawImage(outputImage, outputX, outputY, componentWidth, componentHeight, null);
		g2.drawImage(runButtonImage, runX, runY, runWidth, runHeight, null);
		if (runButtonEntered == true && lifeCount != 0) {
			g2.drawImage(runButtonHighlight, runX, runY, runWidth, runHeight, null);
			if (mouseH.clicked == true) {
				g2.drawImage(runButtonPressed, runX, runY, runWidth, runHeight, null);
			}
		} 
		
		
		g2.drawImage(lifeImage, lifeX, lifeY, lifeWidth, lifeHeight, null);
		
		g2.drawImage(feedbackPanelImage, feedbackPanelX, feedbackPanelY, feedbackPanelWidth, feedbackPanelHeight, null);
		
		
		if (newLevel.isGate1AOpen == true) {
			g2.drawImage(openGate1, openGate1X, openGate1Y, componentWidth, componentHeight, null);
			g2.drawImage(gate1AImage, gate1X, gate1Y, componentWidth, componentHeight, null);					
		} else {
			gate1X = openGate1X;
			gate1Y = openGate1Y;
			g2.drawImage(gate1AImage, gate1X, gate1Y, componentWidth, componentHeight, null);
			g2.drawImage(falseGate1Image, falseGate1X, falseGate1Y, componentWidth, componentHeight, null);
			g2.drawImage(falseGate2Image, falseGate2X, falseGate2Y, componentWidth, componentHeight, null);
		}
		
		if (newLevel.isGate1BOpen == true) {
			g2.drawImage(openGate2, openGate2X, openGate2Y, componentWidth, componentHeight, null);
			g2.drawImage(gate1BImage, gate2X, gate2Y, componentWidth, componentHeight, null);
		} else {
			gate2X = openGate2X;
			gate2Y = openGate2Y;
			g2.drawImage(gate1BImage, gate2X, gate2Y, componentWidth, componentHeight, null);
			g2.drawImage(falseGate1Image, falseGate1X, falseGate1Y, componentWidth, componentHeight, null);
			g2.drawImage(falseGate2Image, falseGate2X, falseGate2Y, componentWidth, componentHeight, null);
		}
		
		if (newLevel.isGate1COpen == true) {
			g2.drawImage(openGate3, openGate3X, openGate3Y, componentWidth, componentHeight, null);
			g2.drawImage(gate1CImage, gate3X, gate3Y, componentWidth, componentHeight, null);
		} else {
			gate3X = openGate3X;
			gate3Y = openGate3Y;
			g2.drawImage(gate1CImage, gate3X, gate3Y, componentWidth, componentHeight, null);
			g2.drawImage(falseGate1Image, falseGate1X, falseGate1Y, componentWidth, componentHeight, null);
			g2.drawImage(falseGate2Image, falseGate2X, falseGate2Y, componentWidth, componentHeight, null);		
		}
			
		if (newLevel.isGate2AOpen == true) {
			g2.drawImage(openGate4, openGate4X, openGate4Y, componentWidth, componentHeight, null);
			g2.drawImage(gate2AImage, gate4X, gate4Y, componentWidth, componentHeight, null);
		} else {
			gate4X = openGate4X;
			gate4Y = openGate4Y;
			g2.drawImage(gate2AImage, gate4X, gate4Y, componentWidth, componentHeight, null);
			g2.drawImage(falseGate1Image, falseGate1X, falseGate1Y, componentWidth, componentHeight, null);
			g2.drawImage(falseGate2Image, falseGate2X, falseGate2Y, componentWidth, componentHeight, null);	
		}
		
		if (newLevel.isGate2BOpen == true) {
			g2.drawImage(openGate5, openGate5X, openGate5Y, componentWidth, componentHeight, null);
			g2.drawImage(gate2BImage, gate5X, gate5Y, componentWidth, componentHeight, null);
		} else {
			gate5X = openGate5X;
			gate5Y = openGate5Y;
			g2.drawImage(gate2BImage, gate5X, gate5Y, componentWidth, componentHeight, null);
			g2.drawImage(falseGate1Image, falseGate1X, falseGate1Y, componentWidth, componentHeight, null);
			g2.drawImage(falseGate2Image, falseGate2X, falseGate2Y, componentWidth, componentHeight, null);	
		}
		
		if (newLevel.isGate3AOpen == true) {
			g2.drawImage(openGate6, openGate6X, openGate6Y, componentWidth, componentHeight, null);
			g2.drawImage(gate3AImage, gate6X, gate6Y, componentWidth, componentHeight, null);
		} else {
			gate6X = openGate6X;
			gate6Y = openGate6Y;
			g2.drawImage(gate3AImage, gate6X, gate6Y, componentWidth, componentHeight, null);
			g2.drawImage(falseGate1Image, falseGate1X, falseGate1Y, componentWidth, componentHeight, null);
			g2.drawImage(falseGate2Image, falseGate2X, falseGate2Y, componentWidth, componentHeight, null);	
		}
		
		//ALLOWS GATES TO TAKE PRIORITY IN DRAWING SO IT DOESN'T GET OVERLAPPED BY EXISTING GATES
		if (newLevel.isGate1AOpen == true && gate1Grabbed == false) {
			g2.drawImage(gate1AImage, gate1X, gate1Y, componentWidth, componentHeight, null);
		} 
		if (newLevel.isGate1BOpen == true && gate2Grabbed == false) {
			g2.drawImage(gate1BImage, gate2X, gate2Y, componentWidth, componentHeight, null);
		} 
		if (newLevel.isGate1COpen == true && gate3Grabbed == false) {
			g2.drawImage(gate1CImage, gate3X, gate3Y, componentWidth, componentHeight, null);
		} 
		if (newLevel.isGate2AOpen == true && gate4Grabbed == false) {
			g2.drawImage(gate2AImage, gate4X, gate4Y, componentWidth, componentHeight, null);
		} 
		if (newLevel.isGate2BOpen == true && gate5Grabbed == false) {
			g2.drawImage(gate2BImage, gate5X, gate5Y, componentWidth, componentHeight, null);
		} 
		if (newLevel.isGate3AOpen == true && gate6Grabbed == false) {
			g2.drawImage(gate3AImage, gate6X, gate6Y, componentWidth, componentHeight, null);
		}
		if (falseGate1Grabbed == false) {
			g2.drawImage(falseGate1Image, falseGate1X, falseGate1Y, componentWidth, componentHeight, null);
		} 
		if (falseGate2Grabbed == false) {
			g2.drawImage(falseGate2Image, falseGate2X, falseGate2Y, componentWidth, componentHeight, null);	
		}
		
		if (newLevel.isGate1AOpen == true && gate1Grabbed == true) {
			g2.drawImage(gate1AImage, gate1X, gate1Y, componentWidth, componentHeight, null);
		} else if (newLevel.isGate1BOpen == true && gate2Grabbed == true) {
			g2.drawImage(gate1BImage, gate2X, gate2Y, componentWidth, componentHeight, null);
		} else if (newLevel.isGate1COpen == true && gate3Grabbed == true) {
			g2.drawImage(gate1CImage, gate3X, gate3Y, componentWidth, componentHeight, null);
		} else if (newLevel.isGate2AOpen == true && gate4Grabbed == true) {
			g2.drawImage(gate2AImage, gate4X, gate4Y, componentWidth, componentHeight, null);
		} else if (newLevel.isGate2BOpen == true && gate5Grabbed == true) {
			g2.drawImage(gate2BImage, gate5X, gate5Y, componentWidth, componentHeight, null);
		} else if (newLevel.isGate3AOpen == true && gate6Grabbed == true) {
			g2.drawImage(gate3AImage, gate6X, gate6Y, componentWidth, componentHeight, null);
		} else if (falseGate1Grabbed == true) {
			g2.drawImage(falseGate1Image, falseGate1X, falseGate1Y, componentWidth, componentHeight, null);
		} else if (falseGate2Grabbed == true) {
			g2.drawImage(falseGate2Image, falseGate2X, falseGate2Y, componentWidth, componentHeight, null);	
		}
			
		
		
		
		
		
		
		
		//g2.drawImage(and, andX, andY, WIDTH, HEIGHT, null );
		
	}

	public BufferedImage getLifeImage(int life) {
		BufferedImage image = null;
		switch (life) {
		case 3: image = life3;
		break;
		case 2: image = life2;
		break;
		case 1: image = life1;
		break;
		case 0: image = life0;
		break;
		default: image = null;
		break;
		}
		return image;
	}
	
	public int getChoiceX(int a, int b, int c, int d, int e, int f) {
    	
    	int xValue = 0;
    	do {
    		int x = methods.generateNumber(1,3);

	    	switch (x) {
	    	case 1: xValue = choice1X;
	    	break;
	    	case 2: xValue = choice2X;
	    	break;
	    	case 3: xValue = choice3X;
	    	}
    	} while (a == xValue || b == xValue || c == xValue || d == xValue || e == xValue || f == xValue);
    	
    	return xValue;
    }
	
	public BufferedImage getGateImage(String gate) {
		BufferedImage image = null;
		
		switch (gate) {
			case "and": image = and;
			break;
			case "nand": image = nand;
			break;
			case "or": image = or;
			break;
			case "nor": image = nor;
			break;
			case "xor": image = xor;
			break;
			case "xnor": image = xnor;
			break;
			case "not": image = not;
			break;
			default: image = null;
			break;
		}
		return image;
	}
	
	public String getFalseGate(String a, String b, String c, String d, String e, String f) {
		
		String gate = "";
	
		
		do {
			int n = methods.generateNumber(1, 7);
			switch (n) {
			case 1: 
					gate = "and";
					break;
			case 2: 
					gate = "nand";
					break;
			case 3: 	
					gate = "or";
					break;			
			case 4: 	
					gate = "nor";
					break;			
			case 5:
					gate = "xor";
					break;			
			case 6: 	
					gate = "xnor";
					break;
			case 7: 	
					gate = "not";
					break;
			default:
			break;
			}
		} while (a == gate || b == gate || c == gate || d == gate || e == gate || f == gate);
		
		return gate;
	}
	
 	public BufferedImage getBinaryImage(String binary) {
		BufferedImage image = null;
		
		switch (binary) {
			case "0000": image = OOOO;
			break;
			case "0001": image = OOOI;
			break;
			case "0010": image = OOIO;
			break;
			case "0011": image = OOII;
			break;
			case "0100": image = OIOO;
			break;
			case "0101": image = OIOI;
			break;
			case "0110": image = OIIO;
			break;
			case "0111": image = OIII;
			break;
			case "1000": image = IOOO;
			break;
			case "1001": image = IOOI;
			break;
			case "1010": image = IOIO;
			break;
			case "1011": image = IOII;
			break;
			case "1100": image = IIOO;
			break;
			case "1101": image = IIOI;
			break;
			case "1110": image = IIIO;
			break;
			case "1111": image = IIII;
			break;
			default: image = null;
			break;
		}
		return image;
	}
	
	public void getImage() {
			
		try {
				
			//binary
			OOOO = ImageIO.read(getClass().getResourceAsStream("/levelElements/binaryString/(00)0000.png"));
			OOOI = ImageIO.read(getClass().getResourceAsStream("/levelElements/binaryString/(01)0001.png"));
			OOIO = ImageIO.read(getClass().getResourceAsStream("/levelElements/binaryString/(02)0010.png"));
			OOII = ImageIO.read(getClass().getResourceAsStream("/levelElements/binaryString/(03)0011.png"));
			OIOO = ImageIO.read(getClass().getResourceAsStream("/levelElements/binaryString/(04)0100.png"));
			OIOI = ImageIO.read(getClass().getResourceAsStream("/levelElements/binaryString/(05)0101.png"));
			OIIO = ImageIO.read(getClass().getResourceAsStream("/levelElements/binaryString/(06)0110.png"));
			OIII = ImageIO.read(getClass().getResourceAsStream("/levelElements/binaryString/(07)0111.png"));
			IOOO = ImageIO.read(getClass().getResourceAsStream("/levelElements/binaryString/(08)1000.png"));
			IOOI = ImageIO.read(getClass().getResourceAsStream("/levelElements/binaryString/(09)1001.png"));
			IOIO = ImageIO.read(getClass().getResourceAsStream("/levelElements/binaryString/(10)1010.png"));
			IOII = ImageIO.read(getClass().getResourceAsStream("/levelElements/binaryString/(11)1011.png"));
			IIOO = ImageIO.read(getClass().getResourceAsStream("/levelElements/binaryString/(12)1100.png"));
			IIOI = ImageIO.read(getClass().getResourceAsStream("/levelElements/binaryString/(13)1101.png"));
			IIIO = ImageIO.read(getClass().getResourceAsStream("/levelElements/binaryString/(14)1110.png"));
			IIII = ImageIO.read(getClass().getResourceAsStream("/levelElements/binaryString/(15)1111.png"));
			
			//gates
			and = ImageIO.read(getClass().getResourceAsStream("/levelElements/logicGates/AND.png"));
			nand = ImageIO.read(getClass().getResourceAsStream("/levelElements/logicGates/NAND.png"));
			or = ImageIO.read(getClass().getResourceAsStream("/levelElements/logicGates/OR.png"));
			nor = ImageIO.read(getClass().getResourceAsStream("/levelElements/logicGates/NOR.png"));
			xor = ImageIO.read(getClass().getResourceAsStream("/levelElements/logicGates/XOR.png"));
			xnor = ImageIO.read(getClass().getResourceAsStream("/levelElements/logicGates/XNOR.png"));
			not = ImageIO.read(getClass().getResourceAsStream("/levelElements/logicGates/NOT.png"));
			
			//other
			open1 = ImageIO.read(getClass().getResourceAsStream("/levelElements/openGates/open1.png"));
			open2 = ImageIO.read(getClass().getResourceAsStream("/levelElements/openGates/open2.png"));
			open3 = ImageIO.read(getClass().getResourceAsStream("/levelElements/openGates/open3.png"));
			open4 = ImageIO.read(getClass().getResourceAsStream("/levelElements/openGates/open4.png"));
			open5 = ImageIO.read(getClass().getResourceAsStream("/levelElements/openGates/open5.png"));
			open6 = ImageIO.read(getClass().getResourceAsStream("/levelElements/openGates/open6.png"));
			runButton = ImageIO.read(getClass().getResourceAsStream("/levelELements/runButton/runButton.png"));
			runButtonPressed = ImageIO.read(getClass().getResourceAsStream("/levelELements/runButton/runButtonPressed.png"));
			runButtonHighlight = ImageIO.read(getClass().getResourceAsStream("/levelELements/runButton/runButtonHighlight.png"));
			
			life3 = ImageIO.read(getClass().getResourceAsStream("/levelELements/threeHeart.png"));
			life2 = ImageIO.read(getClass().getResourceAsStream("/levelELements/twoHeart.png"));
			life1 = ImageIO.read(getClass().getResourceAsStream("/levelELements/oneHeart.png"));
			life0 = ImageIO.read(getClass().getResourceAsStream("/levelELements/zeroHeart.png"));
			
			//feedback panel
			feedbackPanel = ImageIO.read(getClass().getResourceAsStream("/levelElements/feedbackPanel/feedbackPanel.png"));
			feedbackPanelHolder = feedbackPanel;
			gate1AError = ImageIO.read(getClass().getResourceAsStream("/levelElements/feedbackPanel/gate1AError.png"));
			gate1BError = ImageIO.read(getClass().getResourceAsStream("/levelElements/feedbackPanel/gate1BError.png"));
			gate1CError = ImageIO.read(getClass().getResourceAsStream("/levelElements/feedbackPanel/gate1CError.png"));
			gate2AError = ImageIO.read(getClass().getResourceAsStream("/levelElements/feedbackPanel/gate2AError.png"));
			gate2BError = ImageIO.read(getClass().getResourceAsStream("/levelElements/feedbackPanel/gate2BError.png"));
			gate3AError = ImageIO.read(getClass().getResourceAsStream("/levelElements/feedbackPanel/gate3AError.png"));
			
			//backgrounds
			bg1 = ImageIO.read(getClass().getResourceAsStream("/levelElements/background/bg1.png"));
			bg3 = ImageIO.read(getClass().getResourceAsStream("/levelElements/background/bg3.png"));
			bg4 = ImageIO.read(getClass().getResourceAsStream("/levelElements/background/bg4.png"));
			bg6 = ImageIO.read(getClass().getResourceAsStream("/levelElements/background/bg6.png"));
			bg7 = ImageIO.read(getClass().getResourceAsStream("/levelElements/background/bg7.png"));
			bg9 = ImageIO.read(getClass().getResourceAsStream("/levelElements/background/bg9.png"));
			bg10 = ImageIO.read(getClass().getResourceAsStream("/levelElements/background/bg10.png"));
			
			//variableName = ImageIO.read(getClass().getResourceAsStream("file_path"));
				
	
	
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void resetGate() {
		openGate1A = "";
		openGate1B = "";
		openGate1C = "";
		openGate2A = "";
		openGate2B = "";
		openGate3A = "";

	}

	public void setLifeValue() {
		lifeCount = 3;
	}
	
	public void updateFeedbackPanel(String gate) {
		switch (gate) {
		case "gate1A": feedbackPanelHolder = gate1AError;
		break;
		case "gate1B": feedbackPanelHolder = gate1BError;
		break;
		case "gate1C": feedbackPanelHolder = gate1CError;
		break;
		case "gate2A": feedbackPanelHolder = gate2AError;
		break;
		case "gate2B": feedbackPanelHolder = gate2BError;
		break;
		case "gate3A": feedbackPanelHolder = gate3AError;
		break;
		}
	}
	
	public void resetFeedbackPanel() {
		feedbackPanelHolder = feedbackPanel;
		feedbackPanelCounter = 0;
		feedbackPanelReset = false;
	}
	
	public void setLevelValue() {
		levelCount = 0;
	}
	
	public BufferedImage getBackground(String level) {
		BufferedImage image = null;
		
		switch (level) {
		case "(3, 2(2,1,0))": image = bg1;
		break;
		case "(3, 2(1,1,0))A": image = bg1;
		break;
		case "(3, 2(1,1,0))B": image = bg3;
		break;
		case "(4, 2(2,1,0))": image = bg4;
		break;
		case "(4, 2(1,1,0))": image = bg4;
		break;
		case "(4, 1(1,0,0))": image = bg6;
		break;
		case "(6, 3(3,2,1))": image = bg7;
		break;
		case "(6, 3(3,1,1))": image = bg7;
		break;
		case "(6, 2(3,1,0))": image = bg9;
		break;
		case "(6, 1(1,0,0))": image = bg10;
		break;
		default: image = null;
		break;
		}
		
		return image;
	}
	
	public void goToOpenGate(String gate, int objectX, int objectY, int targetX, int targetY) {
		
	
		switch (gate) {
			case "gate1":
				if (movementIndex == 50) {
					gate1X = targetX;
					gate1Y = targetY;
					movementIndex = 0;
				} else  if (gate1X != targetX || gate1Y != targetY) {
					if (objectX > targetX) {
						objectX = objectX - movementSpeed;
					} else {
						objectX = objectX + movementSpeed;
					}
					if (objectY > targetY) {
						objectY = objectY - movementSpeed;
					} else {
						objectY = objectY + movementSpeed;
					}					
					gate1X = objectX;
					gate1Y = objectY;	
					
					movementIndex++;
					System.out.println(movementIndex);
				}			
				break;
			case "gate2":
				do {
					if (objectX > targetX) {
						objectX = objectX - movementSpeed;
					} else {
						objectX = objectX + movementSpeed;
					}
					
					if (objectY > targetY) {
						objectY = objectY - movementSpeed;
					} else {
						objectY = objectY + movementSpeed;
					}					
					gate2X = objectX;
					gate2Y = objectY;

					
				} while (objectX == targetX && objectY == targetY);
				break;
			case "gate3":
				do {
					if (objectX > targetX) {
						objectX = objectX - movementSpeed;
					} else {
						objectX = objectX + movementSpeed;
					}
					
					if (objectY > targetY) {
						objectY = objectY - movementSpeed;
					} else {
						objectY = objectY + movementSpeed;
					}					
					gate3X = objectX;
					gate3Y = objectY;

					
				} while (objectX == targetX && objectY == targetY);
				break;
			case "gate4":
				do {
					if (objectX > targetX) {
						objectX = objectX - movementSpeed;
					} else {
						objectX = objectX + movementSpeed;
					}
					
					if (objectY > targetY) {
						objectY = objectY - movementSpeed;
					} else {
						objectY = objectY + movementSpeed;
					}					
					gate4X = objectX;
					gate4Y = objectY;

					
				} while (objectX == targetX && objectY == targetY);
				break;
			case "gate5":
				do {
					if (objectX > targetX) {
						objectX = objectX - movementSpeed;
					} else {
						objectX = objectX + movementSpeed;
					}
					
					if (objectY > targetY) {
						objectY = objectY - movementSpeed;
					} else {
						objectY = objectY + movementSpeed;
					}					
					gate5X = objectX;
					gate5Y = objectY;

					
				} while (objectX == targetX && objectY == targetY);
				break;
			case "gate6":
				do {
					if (objectX > targetX) {
						objectX = objectX - movementSpeed;
					} else {
						objectX = objectX + movementSpeed;
					}
					
					if (objectY > targetY) {
						objectY = objectY - movementSpeed;
					} else {
						objectY = objectY + movementSpeed;
					}					
					gate6X = objectX;
					gate6Y = objectY;

					
				} while (objectX == targetX && objectY == targetY);
				break;
			case "falseGate1":
				do {
					if (objectX > targetX) {
						objectX = objectX - movementSpeed;
					} else {
						objectX = objectX + movementSpeed;
					}
					
					if (objectY > targetY) {
						objectY = objectY - movementSpeed;
					} else {
						objectY = objectY + movementSpeed;
					}					
					falseGate1X = objectX;
					falseGate1Y = objectY;

					
				} while (objectX == targetX && objectY == targetY);
				break;
			case "falseGate2":
				do {
					if (objectX > targetX) {
						objectX = objectX - movementSpeed;
					} else {
						objectX = objectX + movementSpeed;
					}
					
					if (objectY > targetY) {
						objectY = objectY - movementSpeed;
					} else {
						objectY = objectY + movementSpeed;
					}					
					falseGate2X = objectX;
					falseGate2Y = objectY;

					
				} while (objectX == targetX && objectY == targetY);
				break;
			default:
				break;
			}
		}
	}

