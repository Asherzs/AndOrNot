package otherComponents;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import leaderboardComponents.leaderboard;
import levelComponents.levelPanel;
import main.GamePanel;
import titleComponents.Title;

public class loadingScreen extends otherComponents {
	
		GamePanel gp;
		Title title;
		levelPanel level;
		

	
	
		public loadingScreen(GamePanel gp, Title title, levelPanel level) {
			
			this.gp = gp;
			this.title = title;
			this.level = level;
			getImage();
			setDefaultValues();

		}
		
		public void setDefaultValues() {
			loadingScreenX = 0;
			loadingScreenY = -768;
			componentHeight = gp.screenHeight;
			componentWidth = gp.screenWidth;
			loadStart = false;
			loadingEnd = false;
			nextLevel = false;
			loadDirection = "down";
			loadSpeed = 1;
			
		}
		
		public void getImage() {	
			try {
				loadingScreen = ImageIO.read(getClass().getResourceAsStream("/otherElements/loadingScreen.png"));
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		public void update() {		
			if (loadDirection == "down") {
				moveLoadDown();
			} else {
				moveLoadUp();
			}	
		}
	
						
		public void moveLoadDown() {	
			
			//MOVES LOADING SCREEN DOWN TO Y
			if (loadingScreenY < -30) {
				loadingScreenY = loadingScreenY + (int) loadSpeed;	
				loadSpeed = loadSpeed + 1;
			} else {
				loadingScreenY = 0;
				loadDirection = "up";
				loadSpeed = 1;
				//LOADS FOR NEXT LEVEL
				if (title.gameStart == true) {
					nextLevel = true;	
					GOSpeed = 50;
					GOy = -300;
					movementCounter = 0;
					levelPanel.gameOver = false;
					if (pressedHomeButton == true ) {
						title.gameStart = false;
						leaderboard.leaderboardAppear = true;
						level.gameOver = false;
						pressedHomeButton = false;
						
					}
				} else if (title.gameStart == false) {
					title.gameStart = true;
				}	
				//LOADS FOR START LEVEL
					
			}
		}
		
		public void moveLoadUp() {			
			if (loadingScreenY < -768) {
				loadingScreenY = -768;
				loadDirection = "down";
				loadStart = false;
			} else {
				loadingScreenY = loadingScreenY - (int) loadSpeed;	
				loadSpeed = loadSpeed + 0.5;
				
			}				
		}
		
		
				
		
		public void draw(Graphics2D g2) {
			
			BufferedImage loadingScreenImage = null;
			loadingScreenImage = loadingScreen;
			
			
			g2.drawImage(loadingScreenImage, loadingScreenX, loadingScreenY, componentWidth, componentHeight, null);
			

	}	
}

