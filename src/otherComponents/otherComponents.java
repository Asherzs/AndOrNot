package otherComponents;

import java.awt.image.BufferedImage;

public class otherComponents {
	
	//LOADING SCREEN
	public BufferedImage loadingScreen;
	public int componentHeight, componentWidth, loadingScreenX, loadingScreenY;;
	
	public Boolean loadStart, loadingEnd, nextLevel;
	public double loadSpeed;
	public String loadDirection;
	
	//GAME OVER SCREEN
	public static int GOHeight, GOWidth, GOx, GOy;
	public static int GOSpeed;
	public static int movementCounter;
	public BufferedImage gameOverPanel, resetButtonPressed, homeButtonPressed;
	public BufferedImage zeroA, oneA, twoA, threeA, fourA, fiveA, sixA, sevenA, eightA, nineA, zeroB, oneB, twoB, threeB, fourB, fiveB, sixB, sevenB, eightB, nineB;
	public static Boolean enteredResetButton, enteredHomeButton, pressedHomeButton;
	
	

}
