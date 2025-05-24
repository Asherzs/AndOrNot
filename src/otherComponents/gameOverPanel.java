package otherComponents;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import cursorComponents.mouseHandler;
import cursorComponents.mouseMotionHandler;
import leaderboardComponents.leaderboard;
import levelComponents.levelPanel;
import main.GamePanel;
import titleComponents.Title;

public class gameOverPanel extends otherComponents {
	
	GamePanel gp;
	loadingScreen load;
	mouseHandler mouseH;
	mouseMotionHandler mouseMH;
	
	public gameOverPanel(GamePanel gp, mouseHandler mouseH, mouseMotionHandler mouseMH, loadingScreen load) {
		this.gp = gp;
		this.mouseH = mouseH;
		this.mouseMH = mouseMH;
		this.load = load;
		getImage();
		setDefaultValues();
	}
				
	public static void setDefaultValues() {
		enteredHomeButton = false;
		enteredResetButton = false;
		pressedHomeButton = false;
		GOHeight = 533;
		GOWidth = 400;
		GOSpeed = 50;
		GOx = 110;
		GOy = -300;
		movementCounter = 0;
		
			
	}
				
	
	public void update() {
		//System.out.println(GOy);
		//System.out.println(movementCounter);
		
		if (movementCounter != 27) {
		GOy = GOy + GOSpeed;
		if (movementCounter < 19) {
			GOSpeed = GOSpeed - 3;
		} else {
			GOSpeed = -4;
		}
		movementCounter++;
		
		} else {
			GOy = 100;
		}
		
		
		
		
		if (mouseH.clicked == true && enteredResetButton == true) {
			load.loadStart = true;
			
		}
		
		if (mouseH.clicked == true && enteredHomeButton == true) {
			load.loadStart = true;
			pressedHomeButton = true;

		}	
	}
			
								
							
						
				
	public void draw(Graphics2D g2) {	
		BufferedImage GOImage = null;
		BufferedImage homeButtonPressedImage = null;
		BufferedImage resetButtonPressedImage = null;
		BufferedImage firstDigitImage = null;
		BufferedImage secondDigitImage = null;
		
		GOImage = gameOverPanel;
		homeButtonPressedImage = homeButtonPressed;
		resetButtonPressedImage = resetButtonPressed;
		firstDigitImage = getFirstDigitImage(levelPanel.levelCount);
		secondDigitImage = getSecondDigitImage(levelPanel.levelCount);
		
		
		
		
		
		
		g2.drawImage(GOImage, GOx, GOy, GOHeight, GOWidth, null);
		g2.drawImage(firstDigitImage, GOx, GOy, GOHeight, GOWidth, null);
		g2.drawImage(secondDigitImage, GOx, GOy, GOHeight, GOWidth, null);
		
		if (mouseH.clicked == true && enteredResetButton == true) {
			g2.drawImage(resetButtonPressedImage, GOx, GOy, GOHeight, GOWidth, null);
		}
		
		if (mouseH.clicked == true && enteredHomeButton == true) {			
			g2.drawImage(homeButtonPressedImage, GOx, GOy, GOHeight, GOWidth, null);
		}
		
		
	}	
	
	public void getImage() {
		try {
			gameOverPanel = ImageIO.read(getClass().getResourceAsStream("/otherElements/gameOverPanel.png"));
			homeButtonPressed = ImageIO.read(getClass().getResourceAsStream("/otherElements/homeButtonPressed.png"));
			resetButtonPressed = ImageIO.read(getClass().getResourceAsStream("/otherElements/resetButtonPressed.png"));
			
			zeroA = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/0.png"));
			oneA = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/1.png"));
			twoA = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/2.png"));
			threeA = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/3.png"));
			fourA = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/4.png"));
			fiveA = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/5.png"));
			sixA = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/6.png"));
			sevenA = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/7.png"));
			eightA = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/8.png"));
			nineA = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/9.png"));
			zeroB = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/00.png"));
			oneB = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/01.png"));
			twoB = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/02.png"));
			threeB = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/03.png"));
			fourB = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/04.png"));
			fiveB = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/05.png"));
			sixB = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/06.png"));
			sevenB = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/07.png"));
			eightB = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/08.png"));
			nineB = ImageIO.read(getClass().getResourceAsStream("/otherElements/numberText/09.png"));
			
		} catch(IOException e) {
			e.printStackTrace();
		}
					
				
	}
	
	
	public BufferedImage getFirstDigitImage(int n) {
		BufferedImage image = null;
		int firstDigit = n / 10;
		
		switch (firstDigit) {
		case 0: image = zeroA;
		break;
		case 1: image = oneA;
		break;
		case 2: image = twoA;
		break;
		case 3: image = threeA;
		break;
		case 4: image = fourA;
		break;
		case 5: image = fiveA;
		break;
		case 6: image = sixA;
		break;
		case 7: image = sevenA;
		break;
		case 8: image = eightA;
		break;
		case 9: image = nineA;
		break;
		default: image = null;
		break;
		}		
		return image;
	}
	
	public BufferedImage getSecondDigitImage(int n) {
		BufferedImage image = null;
		int secondDigit = n%10;
		
		switch (secondDigit) {
		case 0: image = zeroB;
		break;
		case 1: image = oneB;
		break;
		case 2: image = twoB;
		break;
		case 3: image = threeB;
		break;
		case 4: image = fourB;
		break;
		case 5: image = fiveB;
		break;
		case 6: image = sixB;
		break;
		case 7: image = sevenB;
		break;
		case 8: image = eightB;
		break;
		case 9: image = nineB;
		break;
		default: image = null;
		break;
		}	
		return image;
	}
}
			


