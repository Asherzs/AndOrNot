package leaderboardComponents;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

import javax.imageio.ImageIO;

import cursorComponents.mouseHandler;
import cursorComponents.mouseMotionHandler;
import keyboardComponents.keyHandler;
import levelComponents.levelPanel;
import main.GamePanel;

public class leaderboard extends leaderboardComponents {
	
	Scanner input = new Scanner(System.in);
	GamePanel gp;
	levelPanel level;
	keyHandler keyH;
	mouseHandler mouseH;
	mouseMotionHandler mouseMH;
	
	
	
	public leaderboard(GamePanel gp, levelPanel level, keyHandler keyH, mouseHandler mouseH, mouseMotionHandler mouseMH)  {
	
		this.gp = gp;
		this.level = level;
		this.mouseH = mouseH;
		this.mouseMH = mouseMH;
		this.keyH = keyH;
		setDefaultValues();
		getImage();
		
	}
	
	public void setDefaultValues() {
		playerScore = new Stack<String>();
		resultStack = new Stack<String>();
		inputChar = "";
		name = "";
		playerScoreString = "";
		leaderboardAppear = false;
		updateLeaderboard = false;
		inputNameStart = false;
		enteredOkButton = false;
		pressedOkButton = false;
		deleteChar = false;
		displayLeaderboard = false;
		displayLeaderboardPanel = false;
		enteredLeaderboardExitButton = false;
		pressedLeaderboardExitButton = false;
		leaderboardExit = false;
		
		
		fileWriteIndex = 0;
		movementCounter = 0;
		
		leaderboardHeight = 576;
		leaderboardWidth = 768;
		leaderboardSpeed = 36;
		leaderboardX = -10;
		leaderboardY = -650;
		
		inputNameHeight = 533;
		inputNameWidth = 400;
		inputNameSpeed = 25;
		inputNameX = 110;
		inputNameY = -300;
	
		
	}
	
	
	public void update() throws IOException   {

			//System.out.println(movementCounter);
		if (leaderboardAppear == true) {
			inputNameY = 70;
			inputNameStart = true;
		}
	
		if (inputNameStart == true) {
			if (pressedOkButton == false) {
				updateNameString();
			} else {
				leaderboardAppear = false;
				if (movementCounter != 30) {
					inputNameY = inputNameY + inputNameSpeed;
					inputNameSpeed = inputNameSpeed - 3;
					movementCounter++;
				} else {
					leaderboardFile = new File("C:\\Users\\samba\\eclipse-workspace\\ANDORNOT-20250424T153058Z-001\\ANDORNOT\\MyGame\\leaderboard\\leaderboard.txt");
					writer = new FileWriter(leaderboardFile, true);
					print = new PrintWriter(writer);
					if (name.isEmpty()) {
						name = "ANON";
					}
					print.println(level.levelCount + " " + name);
					print.close();
					//print.println() = write text into created text file
					name = "";
					inputNameY = -300;
					pressedOkButton = false;
					inputNameStart = false;
					movementCounter = 0;
					inputNameSpeed = 25;
					
				}
			}
		}
		
		if (updateLeaderboard == true) {
			updateLeaderboard();
			displayLeaderboardPanel = true;
			
		}
		
		
		
		if (displayLeaderboardPanel == true) {
			if (movementCounter != 44) {
				leaderboardY = leaderboardY + leaderboardSpeed;
				leaderboardSpeed = leaderboardSpeed - 1;
				movementCounter++;
			} else {
				leaderboardY = -15;
				leaderboardSpeed = 8;	
				displayLeaderboard = true;
				movementCounter = 0;
				displayLeaderboardPanel = false;
			}
		}
		
		if (leaderboardExit == true) {
			displayLeaderboard = false;
			if (movementCounter != 44) {
				leaderboardY = leaderboardY + leaderboardSpeed;
				leaderboardSpeed = leaderboardSpeed - 1;
				movementCounter++;
			} else {
				leaderboardY = -650;
				leaderboardSpeed = 36;
				movementCounter = 0;
				leaderboardExit = false;
			}
		}
	}
		
	
	
	
	public void draw(Graphics g2) {
		BufferedImage leaderboardPanelImage = null;
		BufferedImage inputNamePanelImage = null;
		BufferedImage okButtonPressedImage = null;
		BufferedImage okButtonHighlightImage = null;
		BufferedImage leaderboardButtonHighlightImage = null;
		BufferedImage leaderboardButtonPressedImage = null;
		BufferedImage char1Image = null;
		BufferedImage char2Image = null;
		BufferedImage char3Image = null;
		BufferedImage char4Image = null;
		BufferedImage char5Image = null;
		BufferedImage char6Image = null;
		BufferedImage char7Image = null;
		BufferedImage char8Image = null;
		
		leaderboardPanelImage = leaderboardPanel;
		inputNamePanelImage = inputNamePanel;
		okButtonPressedImage = okButtonPressed;
		okButtonHighlightImage = okButtonHighlight;
		leaderboardButtonHighlightImage = leaderboardButtonHighlight;
		leaderboardButtonPressedImage = leaderboardButtonPressed;
		
		
		if (name.length() == 0) {
			char1Image = null;
		}
		if (name.length() == 1) {
			char1 = name.charAt(0);
			char1Image = updateNameImage(char1);
			char2Image = null;
		} 
		if (name.length() == 2) {
			char2 = name.charAt(1);
			char1Image = updateNameImage(char1);
			char2Image = updateNameImage(char2);
		}
		if (name.length() == 3) {
			char3 = name.charAt(2);
			char1Image = updateNameImage(char1);
			char2Image = updateNameImage(char2);
			char3Image = updateNameImage(char3);
		}
		if (name.length() == 4) {
			char4 = name.charAt(3);
			char1Image = updateNameImage(char1);
			char2Image = updateNameImage(char2);
			char3Image = updateNameImage(char3);
			char4Image = updateNameImage(char4);
		}
		if (name.length() == 5) {
			char5 = name.charAt(4);
			char1Image = updateNameImage(char1);
			char2Image = updateNameImage(char2);
			char3Image = updateNameImage(char3);
			char4Image = updateNameImage(char4);
			char5Image = updateNameImage(char5);
		}
		if (name.length() == 6) {
			char6 = name.charAt(5);
			char1Image = updateNameImage(char1);
			char2Image = updateNameImage(char2);
			char3Image = updateNameImage(char3);
			char4Image = updateNameImage(char4);
			char5Image = updateNameImage(char5);
			char6Image = updateNameImage(char6);
		}
		if (name.length() == 7) {
			char7 = name.charAt(6);
			char1Image = updateNameImage(char1);
			char2Image = updateNameImage(char2);
			char3Image = updateNameImage(char3);
			char4Image = updateNameImage(char4);
			char5Image = updateNameImage(char5);
			char6Image = updateNameImage(char6);
			char7Image = updateNameImage(char7);
		}
		if (name.length() == 8) {
			char8 = name.charAt(7);
			char1Image = updateNameImage(char1);
			char2Image = updateNameImage(char2);
			char3Image = updateNameImage(char3);
			char4Image = updateNameImage(char4);
			char5Image = updateNameImage(char5);
			char6Image = updateNameImage(char6);
			char7Image = updateNameImage(char7);
			char8Image = updateNameImage(char8);
		}
		
		g2.drawImage(inputNamePanelImage, inputNameX, inputNameY, inputNameHeight, inputNameWidth, null);
		
		if (enteredOkButton == true) {
			g2.drawImage(okButtonHighlightImage, inputNameX, inputNameY, inputNameHeight, inputNameWidth, null);
			if (mouseH.clicked == true) {
				g2.drawImage(okButtonPressedImage, inputNameX, inputNameY, inputNameHeight, inputNameWidth, null);
				pressedOkButton = true;
			}
		}
		g2.drawImage(char1Image, inputNameX+20, inputNameY, inputNameHeight, inputNameWidth, null);
		g2.drawImage(char2Image, inputNameX+45, inputNameY, inputNameHeight, inputNameWidth, null);
		g2.drawImage(char3Image, inputNameX+70, inputNameY, inputNameHeight, inputNameWidth, null);
		g2.drawImage(char4Image, inputNameX+95, inputNameY, inputNameHeight, inputNameWidth, null);
		g2.drawImage(char5Image, inputNameX+120, inputNameY, inputNameHeight, inputNameWidth, null);
		g2.drawImage(char6Image, inputNameX+145, inputNameY, inputNameHeight, inputNameWidth, null);
		g2.drawImage(char7Image, inputNameX+170, inputNameY, inputNameHeight, inputNameWidth, null);
		g2.drawImage(char8Image, inputNameX+195, inputNameY, inputNameHeight, inputNameWidth, null);
		
		
		g2.drawImage(leaderboardPanelImage, leaderboardX, leaderboardY, leaderboardWidth, leaderboardHeight, null);
		
		if (enteredLeaderboardExitButton == true) {
			
			g2.drawImage(leaderboardButtonHighlightImage, leaderboardX, leaderboardY, leaderboardWidth, leaderboardHeight, null);
			if (mouseH.clicked == true) {
				g2.drawImage(leaderboardButtonPressedImage, leaderboardX, leaderboardY, leaderboardWidth, leaderboardHeight, null);
				leaderboardExit = true;
				movementCounter = 0;
				displayLeaderboardPanel = false;
			}
		}
			
		
		if (displayLeaderboard == true) {
			showLeaderboard(g2, resultStack);
		}
	}
	
	
	public void getImage() {
		try {
			leaderboardPanel = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/leaderboardPanel.png"));
			inputNamePanel = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/inputNamePanel.png"));
			okButtonPressed = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/okButtonPressed.png"));
			okButtonHighlight = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/okButtonHighlight.png"));
			leaderboardButtonHighlight = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/leaderboardButtonHighlight.png"));
			leaderboardButtonPressed = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/leaderboardButtonPressed.png"));
			A = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/A.png"));
			B = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/B.png"));
			C = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/C.png"));
			D = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/D.png"));
			E = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/E.png"));
			F = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/F.png"));
			G = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/G.png"));
			H = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/H.png"));
			I = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/I.png"));
			J = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/J.png"));
			K = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/K.png"));
			L = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/L.png"));
			M = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/M.png"));
			N = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/N.png"));
			O = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/O.png"));
			P = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/P.png"));
			Q = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/Q.png"));
			R = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/R.png"));
			S = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/S.png"));
			T = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/T.png"));
			U = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/U.png"));
			V = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/V.png"));
			W = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/W.png"));
			X = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/X.png"));
			Y = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/Y.png"));
			Z = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/Z.png"));
			ZERO = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/0.png"));
			ONE = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/1.png"));
			TWO = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/2.png"));
			THREE= ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/3.png"));
			FOUR = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/4.png"));
			FIVE = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/5.png"));
			SIX = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/6.png"));
			SEVEN = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/7.png"));
			EIGHT = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/8.png"));
			NINE = ImageIO.read(getClass().getResourceAsStream("/otherElements/leaderboardPanel/9.png"));
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public void updateNameString() {
		if (deleteChar == true && name.length() != 0) {
			StringBuilder sb = new StringBuilder(name);
			sb.deleteCharAt(name.length() - 1);
			name = sb.toString();
			deleteChar = false;
		} else {
			name = name + inputChar;
			inputChar = "";
		}
	}
	
	public BufferedImage updateNameImage(char character) {
		BufferedImage image = null;
		
		switch(character) {
		case 'A': image = A;
		break;
		case 'B': image = B;
		break;
		case 'C': image = C;
		break;
		case 'D': image = D;
		break;
		case 'E': image = E;
		break;
		case 'F': image = F;
		break;
		case 'G': image = G;
		break;
		case 'H': image = H;
		break;
		case 'I': image = I;
		break;
		case 'J': image = J;
		break;
		case 'K': image = K;
		break;
		case 'L': image = L;
		break;
		case 'M': image = M;
		break;
		case 'N': image = N;
		break;
		case 'O': image = O;
		break;
		case 'P': image = P;
		break;
		case 'Q': image = Q;
		break;
		case 'R': image = R;
		break;
		case 'S': image = S;
		break;
		case 'T': image = T;
		break;
		case 'U': image = U;
		break;
		case 'V': image = V;
		break;
		case 'W': image = W;
		break;
		case 'X': image = X;
		break;
		case 'Y': image = Y;
		break;
		case 'Z': image = Z;
		break;
		case '0': image = ZERO;
		break;
		case '1': image = ONE;
		break;
		case '2': image = TWO;
		break;
		case '3': image = THREE;
		break;
		case '4': image = FOUR;
		break;
		case '5': image = FIVE;
		break;
		case '6': image = SIX;
		break;
		case '7': image = SEVEN;
		break;
		case '8': image = EIGHT;
		break;
		case '9': image = NINE;
		break;
		}
		
		return image;
	}
	
	public static Stack<String> sortLeaderboard(Stack<String> input) {
		Stack<String> temp = new Stack<String>();
		
		String tempString = "";
		int tempInt1 = 0;
		int tempInt2 = 0;
		
		while (!input.isEmpty()) {
			
			tempString = input.pop();
			
		
			if (tempString.charAt(2) == ' ') {
				tempInt1 = Integer.parseInt(tempString.substring(0,2));
			} else {
				tempInt1 = Integer.parseInt(tempString.substring(0,1));
			}
			
			if (!temp.isEmpty()) {
	 			if (temp.peek().charAt(2) == ' ') {
					tempInt2 = Integer.parseInt(temp.peek().substring(0,2));
				} else {
					tempInt2 = Integer.parseInt(temp.peek().substring(0,1));
				}
			}
			
			
			
			while (!temp.isEmpty() && tempInt2 > tempInt1) {
				input.push(temp.pop());
			}
			temp.push(tempString);
		}
		return temp;
	}
	
	
	public void showLeaderboard(Graphics g2, Stack<String> playerScore) {
		updateLeaderboard();
		
		
		if (playerScore.isEmpty()) {
			System.out.println("Leaderboard is empty! Play now and set some scores! :D");
		} else {
			displayRank1(g2, getName(playerScore.peek()), getScore(playerScore.peek()));
			playerScore.pop();
			if (!playerScore.isEmpty()) {
				displayRank2(g2, getName(playerScore.peek()), getScore(playerScore.peek()));
				playerScore.pop();
			}
			if (!playerScore.isEmpty()) {
				displayRank3(g2, getName(playerScore.peek()), getScore(playerScore.peek()));
				playerScore.pop();
			}
			if (!playerScore.isEmpty()) {
				displayRank4(g2, getName(playerScore.peek()), getScore(playerScore.peek()));
				playerScore.pop();
			}
			if (!playerScore.isEmpty()) {
				displayRank5(g2, getName(playerScore.peek()), getScore(playerScore.peek()));
				playerScore.pop();
			}
			if (!playerScore.isEmpty()) {
				displayRank6(g2, getName(playerScore.peek()), getScore(playerScore.peek()));
				playerScore.pop();
			}
			if (!playerScore.isEmpty()) {
				displayRank7(g2, getName(playerScore.peek()), getScore(playerScore.peek()));
				playerScore.pop();
			}
			if (!playerScore.isEmpty()) {
				displayRank8(g2, getName(playerScore.peek()), getScore(playerScore.peek()));
				playerScore.pop();
			}
			if (!playerScore.isEmpty()) {
				displayRank9(g2, getName(playerScore.peek()), getScore(playerScore.peek()));
				playerScore.pop();
			}
			if (!playerScore.isEmpty()) {
				displayRank10(g2, getName(playerScore.peek()), getScore(playerScore.peek()));
				playerScore.pop();
			}
		}
	}
		
	public static void updateLeaderboard() {
		try {
			leaderboardFile = new File("C:\\Users\\samba\\eclipse-workspace\\ANDORNOT-20250424T153058Z-001\\ANDORNOT\\MyGame\\leaderboard\\leaderboard.txt");
			writer = new FileWriter(leaderboardFile, true);
			print = new PrintWriter(writer);
			Scanner reader = new Scanner(leaderboardFile);
			
			while (reader.hasNextLine()) {
				dataString = reader.nextLine();
				//playerScoreString = playerScoreString + "\n" + data;
				if (dataString == "" ) {
				} else {
					playerScore.push(dataString);
				}
			}
			resultStack = sortLeaderboard(playerScore);
			reader.close();		
			
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("FILE NOT FOUND");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("WEIRD ASS ERROR");
			e.printStackTrace();
		}
	}
	
	public static String getName(String data) {
		String name = "";
		
		if (data.charAt(2) == ' ') {
			name = data.substring(3);
		} else {
			name = data.substring(2);
		}
		return name;
	}
	
	public static String getScore(String data) {
		String score = "";
		
		if (data.charAt(2) == ' ') {
			score = data.substring(0, 2);
		} else {
			score = data.substring(0, 1);
		}
		return score;
	}
	
	public static BufferedImage getNameImage(char nameChar) {
		BufferedImage image = null;
		switch (nameChar) {
		case 'A': image = A;
		break;
		case 'B': image = B;
		break;
		case 'C': image = C;
		break;
		case 'D': image = D;
		break;
		case 'E': image = E;
		break;
		case 'F': image = F;
		break;
		case 'G': image = G;
		break;
		case 'H': image = H;
		break;
		case 'I': image = I;
		break;
		case 'J': image = J;
		break;
		case 'K': image = K;
		break;
		case 'L': image = L;
		break;
		case 'M': image = M;
		break;
		case 'N': image = N;
		break;
		case 'O': image = O;
		break;
		case 'P': image = P;
		break;
		case 'Q': image = Q;
		break;
		case 'R': image = R;
		break;
		case 'S': image = S;
		break;
		case 'T': image = T;
		break;
		case 'U': image = U;
		break;
		case 'V': image = V;
		break;
		case 'W': image = W;
		break;
		case 'X': image = X;
		break;
		case 'Y': image = Y;
		break;
		case 'Z': image = Z;
		break;
		}
		return image;
	}
	
	public static BufferedImage getScoreImage(char scoreChar) {
		BufferedImage image = null;
		switch (scoreChar) {
		case '0': image = ZERO;
		break;
		case '1': image = ONE;
		break;
		case '2': image = TWO;
		break;
		case '3': image = THREE;
		break;
		case '4': image = FOUR;
		break;
		case '5': image = FIVE;
		break;
		case '6': image = SIX;
		break;
		case '7': image = SEVEN;
		break;
		case '8': image = EIGHT;
		break;
		case '9': image = NINE;
		break;
		}
		return image;
	}
	
	public static void displayRank1(Graphics g2, String name, String score) {
		int nameX, componentY, scoreX = 0;
		nameX = -50;
		componentY = -100;
		scoreX = 430;
		
		//DISPLAY NAME
		if (name.length() >= 1) {
			g2.drawImage(getNameImage(name.charAt(0)), nameX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 2) {
			g2.drawImage(getNameImage(name.charAt(1)), nameX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 3) {
			g2.drawImage(getNameImage(name.charAt(2)), nameX+50, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 4) {
			g2.drawImage(getNameImage(name.charAt(3)), nameX+75, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 5) {
			g2.drawImage(getNameImage(name.charAt(4)), nameX+100, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 6) {
			g2.drawImage(getNameImage(name.charAt(5)), nameX+125, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 7) {
			g2.drawImage(getNameImage(name.charAt(6)), nameX+150, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 8) {
			g2.drawImage(getNameImage(name.charAt(7)), nameX+175, componentY, inputNameHeight, inputNameWidth, null);
		}
		
		//DISPLAY SCORE
		if (score.length() >= 1) {
			g2.drawImage(getScoreImage(score.charAt(0)), scoreX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (score.length() >= 2) {
			g2.drawImage(getScoreImage(score.charAt(1)), scoreX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
	}
	
	public static void displayRank2(Graphics g2, String name, String score) {
		int nameX, componentY, scoreX = 0;
		nameX = -50;
		componentY = -60;
		scoreX = 430;
		
		//DISPLAY NAME
		if (name.length() >= 1) {
			g2.drawImage(getNameImage(name.charAt(0)), nameX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 2) {
			g2.drawImage(getNameImage(name.charAt(1)), nameX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 3) {
			g2.drawImage(getNameImage(name.charAt(2)), nameX+50, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 4) {
			g2.drawImage(getNameImage(name.charAt(3)), nameX+75, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 5) {
			g2.drawImage(getNameImage(name.charAt(4)), nameX+100, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 6) {
			g2.drawImage(getNameImage(name.charAt(5)), nameX+125, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 7) {
			g2.drawImage(getNameImage(name.charAt(6)), nameX+150, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 8) {
			g2.drawImage(getNameImage(name.charAt(7)), nameX+175, componentY, inputNameHeight, inputNameWidth, null);
		}
		
		//DISPLAY SCORE
		if (score.length() >= 1) {
			g2.drawImage(getScoreImage(score.charAt(0)), scoreX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (score.length() >= 2) {
			g2.drawImage(getScoreImage(score.charAt(1)), scoreX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
	}
	
	public static void displayRank3(Graphics g2, String name, String score) {
		int nameX, componentY, scoreX = 0;
		nameX = -50;
		componentY = -20;
		scoreX = 430;
		
		//DISPLAY NAME
		if (name.length() >= 1) {
			g2.drawImage(getNameImage(name.charAt(0)), nameX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 2) {
			g2.drawImage(getNameImage(name.charAt(1)), nameX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 3) {
			g2.drawImage(getNameImage(name.charAt(2)), nameX+50, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 4) {
			g2.drawImage(getNameImage(name.charAt(3)), nameX+75, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 5) {
			g2.drawImage(getNameImage(name.charAt(4)), nameX+100, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 6) {
			g2.drawImage(getNameImage(name.charAt(5)), nameX+125, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 7) {
			g2.drawImage(getNameImage(name.charAt(6)), nameX+150, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 8) {
			g2.drawImage(getNameImage(name.charAt(7)), nameX+175, componentY, inputNameHeight, inputNameWidth, null);
		}
		
		//DISPLAY SCORE
		if (score.length() >= 1) {
			g2.drawImage(getScoreImage(score.charAt(0)), scoreX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (score.length() >= 2) {
			g2.drawImage(getScoreImage(score.charAt(1)), scoreX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
	}
	
	public static void displayRank4(Graphics g2, String name, String score) {
		int nameX, componentY, scoreX = 0;
		nameX = -50;
		componentY = 20;
		scoreX = 430;
		
		
		//DISPLAY NAME
		if (name.length() >= 1) {
			g2.drawImage(getNameImage(name.charAt(0)), nameX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 2) {
			g2.drawImage(getNameImage(name.charAt(1)), nameX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 3) {
			g2.drawImage(getNameImage(name.charAt(2)), nameX+50, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 4) {
			g2.drawImage(getNameImage(name.charAt(3)), nameX+75, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 5) {
			g2.drawImage(getNameImage(name.charAt(4)), nameX+100, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 6) {
			g2.drawImage(getNameImage(name.charAt(5)), nameX+125, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 7) {
			g2.drawImage(getNameImage(name.charAt(6)), nameX+150, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 8) {
			g2.drawImage(getNameImage(name.charAt(7)), nameX+175, componentY, inputNameHeight, inputNameWidth, null);
		}
		
		//DISPLAY SCORE
		if (score.length() >= 1) {
			g2.drawImage(getScoreImage(score.charAt(0)), scoreX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (score.length() >= 2) {
			g2.drawImage(getScoreImage(score.charAt(1)), scoreX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
	}
	
	public static void displayRank5(Graphics g2, String name, String score) {
		int nameX, componentY, scoreX = 0;
		nameX = -50;
		componentY = 60;
		scoreX = 430;
		
		//DISPLAY NAME
		if (name.length() >= 1) {
			g2.drawImage(getNameImage(name.charAt(0)), nameX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 2) {
			g2.drawImage(getNameImage(name.charAt(1)), nameX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 3) {
			g2.drawImage(getNameImage(name.charAt(2)), nameX+50, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 4) {
			g2.drawImage(getNameImage(name.charAt(3)), nameX+75, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 5) {
			g2.drawImage(getNameImage(name.charAt(4)), nameX+100, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 6) {
			g2.drawImage(getNameImage(name.charAt(5)), nameX+125, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 7) {
			g2.drawImage(getNameImage(name.charAt(6)), nameX+150, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 8) {
			g2.drawImage(getNameImage(name.charAt(7)), nameX+175, componentY, inputNameHeight, inputNameWidth, null);
		}
		
		//DISPLAY SCORE
		if (score.length() >= 1) {
			g2.drawImage(getScoreImage(score.charAt(0)), scoreX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (score.length() >= 2) {
			g2.drawImage(getScoreImage(score.charAt(1)), scoreX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
	}
	
	public static void displayRank6(Graphics g2, String name, String score) {
		int nameX, componentY, scoreX = 0;
		nameX = -50;
		componentY = 100;
		scoreX = 430;
		
		//DISPLAY NAME
		if (name.length() >= 1) {
			g2.drawImage(getNameImage(name.charAt(0)), nameX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 2) {
			g2.drawImage(getNameImage(name.charAt(1)), nameX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 3) {
			g2.drawImage(getNameImage(name.charAt(2)), nameX+50, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 4) {
			g2.drawImage(getNameImage(name.charAt(3)), nameX+75, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 5) {
			g2.drawImage(getNameImage(name.charAt(4)), nameX+100, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 6) {
			g2.drawImage(getNameImage(name.charAt(5)), nameX+125, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 7) {
			g2.drawImage(getNameImage(name.charAt(6)), nameX+150, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 8) {
			g2.drawImage(getNameImage(name.charAt(7)), nameX+175, componentY, inputNameHeight, inputNameWidth, null);
		}
		
		//DISPLAY SCORE
		if (score.length() >= 1) {
			g2.drawImage(getScoreImage(score.charAt(0)), scoreX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (score.length() >= 2) {
			g2.drawImage(getScoreImage(score.charAt(1)), scoreX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
	}
	
	public static void displayRank7(Graphics g2, String name, String score) {
		int nameX, componentY, scoreX = 0;
		nameX = -50;
		componentY = 140;
		scoreX = 430;
		
		//DISPLAY NAME
		if (name.length() >= 1) {
			g2.drawImage(getNameImage(name.charAt(0)), nameX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 2) {
			g2.drawImage(getNameImage(name.charAt(1)), nameX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 3) {
			g2.drawImage(getNameImage(name.charAt(2)), nameX+50, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 4) {
			g2.drawImage(getNameImage(name.charAt(3)), nameX+75, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 5) {
			g2.drawImage(getNameImage(name.charAt(4)), nameX+100, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 6) {
			g2.drawImage(getNameImage(name.charAt(5)), nameX+125, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 7) {
			g2.drawImage(getNameImage(name.charAt(6)), nameX+150, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 8) {
			g2.drawImage(getNameImage(name.charAt(7)), nameX+175, componentY, inputNameHeight, inputNameWidth, null);
		}
		
		//DISPLAY SCORE
		if (score.length() >= 1) {
			g2.drawImage(getScoreImage(score.charAt(0)), scoreX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (score.length() >= 2) {
			g2.drawImage(getScoreImage(score.charAt(1)), scoreX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
	}
	
	public static void displayRank8(Graphics g2, String name, String score) {
		int nameX, componentY, scoreX = 0;
		nameX = -50;
		componentY = 180;
		scoreX = 430;
		
		
		//DISPLAY NAME
		if (name.length() >= 1) {
			g2.drawImage(getNameImage(name.charAt(0)), nameX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 2) {
			g2.drawImage(getNameImage(name.charAt(1)), nameX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 3) {
			g2.drawImage(getNameImage(name.charAt(2)), nameX+50, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 4) {
			g2.drawImage(getNameImage(name.charAt(3)), nameX+75, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 5) {
			g2.drawImage(getNameImage(name.charAt(4)), nameX+100, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 6) {
			g2.drawImage(getNameImage(name.charAt(5)), nameX+125, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 7) {
			g2.drawImage(getNameImage(name.charAt(6)), nameX+150, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 8) {
			g2.drawImage(getNameImage(name.charAt(7)), nameX+175, componentY, inputNameHeight, inputNameWidth, null);
		}
		
		//DISPLAY SCORE
		if (score.length() >= 1) {
			g2.drawImage(getScoreImage(score.charAt(0)), scoreX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (score.length() >= 2) {
			g2.drawImage(getScoreImage(score.charAt(1)), scoreX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
	}
	
	public static void displayRank9(Graphics g2, String name, String score) {
		int nameX, componentY, scoreX = 0;
		nameX = -50;
		componentY = 220;
		scoreX = 430;
		
		//DISPLAY NAME
		if (name.length() >= 1) {
			g2.drawImage(getNameImage(name.charAt(0)), nameX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 2) {
			g2.drawImage(getNameImage(name.charAt(1)), nameX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 3) {
			g2.drawImage(getNameImage(name.charAt(2)), nameX+50, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 4) {
			g2.drawImage(getNameImage(name.charAt(3)), nameX+75, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 5) {
			g2.drawImage(getNameImage(name.charAt(4)), nameX+100, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 6) {
			g2.drawImage(getNameImage(name.charAt(5)), nameX+125, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 7) {
			g2.drawImage(getNameImage(name.charAt(6)), nameX+150, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 8) {
			g2.drawImage(getNameImage(name.charAt(7)), nameX+175, componentY, inputNameHeight, inputNameWidth, null);
		}
		
		//DISPLAY SCORE
		if (score.length() >= 1) {
			g2.drawImage(getScoreImage(score.charAt(0)), scoreX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (score.length() >= 2) {
			g2.drawImage(getScoreImage(score.charAt(1)), scoreX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
	}
	
	public static void displayRank10(Graphics g2, String name, String score) {
		int nameX, componentY, scoreX = 0;
		nameX = -50;
		componentY = 260;
		scoreX = 430;
		
		
		//DISPLAY NAME
		if (name.length() >= 1) {
			g2.drawImage(getNameImage(name.charAt(0)), nameX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 2) {
			g2.drawImage(getNameImage(name.charAt(1)), nameX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 3) {
			g2.drawImage(getNameImage(name.charAt(2)), nameX+50, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 4) {
			g2.drawImage(getNameImage(name.charAt(3)), nameX+75, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 5) {
			g2.drawImage(getNameImage(name.charAt(4)), nameX+100, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 6) {
			g2.drawImage(getNameImage(name.charAt(5)), nameX+125, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 7) {
			g2.drawImage(getNameImage(name.charAt(6)), nameX+150, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (name.length() >= 8) {
			g2.drawImage(getNameImage(name.charAt(7)), nameX+175, componentY, inputNameHeight, inputNameWidth, null);
		}
		
		//DISPLAY SCORE
		if (score.length() >= 1) {
			g2.drawImage(getScoreImage(score.charAt(0)), scoreX, componentY, inputNameHeight, inputNameWidth, null);
		}
		if (score.length() >= 2) {
			g2.drawImage(getScoreImage(score.charAt(1)), scoreX+25, componentY, inputNameHeight, inputNameWidth, null);
		}
	}
	
	public static void main (String [] args) {
		
	
		
		
	}
			
		
}

	

