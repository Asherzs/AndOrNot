package titleComponents;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import cursorComponents.mouseHandler;
import cursorComponents.mouseMotionHandler;
import leaderboardComponents.leaderboard;
import main.GamePanel;
import otherComponents.loadingScreen;


public class Title extends titleComponents {
	
	GamePanel gp;
	mouseMotionHandler mouseMH;
	mouseHandler mouseH;
	loadingScreen load;
	
	
	
	public Title(GamePanel gp, mouseHandler mouseH, mouseMotionHandler mouseMH, loadingScreen load) {
		
		this.gp = gp;
		this.mouseH = mouseH;
		this.mouseMH = mouseMH;
		this.load = load;
		setDefaultValues();
		getTitleImage();
	}
	
	public void setDefaultValues() {
		
		backgroundX = 0;
		backgroundY = 0;
		backgroundWidth = 768;
		backgroundHeight = 576;
		titleX = 130;
		titleY = -200;
		titleWidth = 500;
		titleHeight = 200;
		startX = 330;
		startY = 400;
		leaderboardX = 600;
		leaderboardY = 485;
		gameStart = false;
		direction = "down";
		directionS = "down";
		
		leaderboardWidth = 150;
		leaderboardHeight = 75;
		speed = 4;
	}
	
	public void getTitleImage() {
		
		try {
			titleImage = ImageIO.read(getClass().getResourceAsStream("/titleMenu/title.png"));
			startButton = ImageIO.read(getClass().getResourceAsStream("/titleMenu/startButton.png"));	
			startButtonHighlight = ImageIO.read(getClass().getResourceAsStream("/titleMenu/startButtonHighlight.png"));	
			leaderboardButton = ImageIO.read(getClass().getResourceAsStream("/titleMenu/leaderboardButton.png"));	
			leaderboardButtonHighlight = ImageIO.read(getClass().getResourceAsStream("/titleMenu/leaderboardButtonHighlight.png"));
			background = ImageIO.read(getClass().getResourceAsStream("/titleMenu/backgroundImage.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		

		
		if (gameStart == false) {
			if (mouseH.clicked == true && startButtonEntered == true && mouseH.index == 1) {
				load.loadStart = true;
				mouseH.index = 0;
			}
		
			
			
	

			if (appearCount == 0) {
				if (titleY != 100) {
					titleY += speed;
					
				} else {
					appearCount = 1;
				}
			}
			
			
			
			if (mouseH.clicked == true & leaderboardButtonEntered == true && mouseH.index == 1) {
				leaderboard.updateLeaderboard = true;
				mouseH.index = 0;
			} else {
				leaderboard.updateLeaderboard = false;
			}
		} else {
			setDefaultValues();
		}
	}
					
				
			
	
	public void draw(Graphics2D g2) {
		
		BufferedImage titleText = null;
		BufferedImage startButtonImage = null;		
		BufferedImage startButtonHighlightImage = null;
		BufferedImage leaderboardButtonImage = null;
		BufferedImage leaderboardButtonHighlightImage = null;
		BufferedImage backgroundImage = null;
		
		titleText = titleImage;
		startButtonImage = startButton; 
		leaderboardButtonImage = leaderboardButton;
		startButtonHighlightImage = startButtonHighlight;
		leaderboardButtonHighlightImage = leaderboardButtonHighlight;
		backgroundImage = background;
		
		g2.drawImage(backgroundImage, backgroundX, backgroundY, backgroundWidth , backgroundHeight, null);
		g2.drawImage(titleText, titleX, titleY, titleWidth , titleHeight, null);
		g2.drawImage(startButtonImage, startX, startY, startButton.getWidth(), startButton.getHeight(), null);
		if (startButtonEntered == true) {
			g2.drawImage(startButtonHighlightImage, startX, startY, startButton.getWidth(), startButton.getHeight(), null);
		}
		
		g2.drawImage(leaderboardButtonImage, leaderboardX, leaderboardY, leaderboardWidth, leaderboardHeight, null);
		
		if (leaderboardButtonEntered == true) {
			g2.drawImage(leaderboardButtonHighlightImage, leaderboardX, leaderboardY, leaderboardWidth, leaderboardHeight, null);
		}
	
		
	}
	
}


