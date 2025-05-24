package cursorComponents;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import leaderboardComponents.leaderboard;
import levelComponents.levelPanel;
import otherComponents.gameOverPanel;
import titleComponents.Title;

public class mouseMotionHandler extends Cursor implements MouseMotionListener{
	
	
	
	

	@Override
	public void mouseDragged(MouseEvent e) {
		cursorX = e.getX();
		cursorY = e.getY();
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		cursorX = e.getX();
		cursorY = e.getY();
		
		
		
		if (Title.gameStart == false) {
			
			if (cursorX > 335 && cursorY > 408 && cursorX < 423 && cursorY < 438) {
				Title.startButtonEntered = true;
			} else {
				Title.startButtonEntered = false;
			}
			
			if (cursorX > 607 && cursorX < 745 & cursorY > 488 && cursorY < 556) {
				Title.leaderboardButtonEntered = true;
			} else {
				Title.leaderboardButtonEntered = false;
			}
			
			
			
			if (leaderboard.inputNameStart == true && cursorX > 330 && cursorY > 314 && cursorX < 419 && cursorY < 340) {
				leaderboard.enteredOkButton = true;
			} else {
				leaderboard.enteredOkButton = false;
			}
			
			if (leaderboard.leaderboardExit == false && cursorX > 667 && cursorY > 263 && cursorX < 704 && cursorY < 299) {
				leaderboard.enteredLeaderboardExitButton = true;
			} else {
				leaderboard.enteredLeaderboardExitButton = false;
			}
		} 
		
		if (Title.gameStart == true) {
			
			if (cursorX > levelPanel.gate1X && cursorX < (levelPanel.gate1X+100) && cursorY > levelPanel.gate1Y && cursorY < (levelPanel.gate1Y+50)) {
				System.out.println("ENTERED GATE 1");
				levelPanel.gate1Entered = true;		
			} else {
				levelPanel.gate1Entered = false;		
			}
			
			
			if (cursorX > levelPanel.gate2X && cursorX < (levelPanel.gate2X+100) && cursorY > levelPanel.gate2Y && cursorY < (levelPanel.gate2Y+50)) {	
				System.out.println("ENTERED GATE 2");
				levelPanel.gate2Entered = true;	
			} else {
				levelPanel.gate2Entered = false;
			}
			
			if (cursorX > levelPanel.gate3X && cursorX < (levelPanel.gate3X+100) && cursorY > levelPanel.gate3Y && cursorY < (levelPanel.gate3Y+50)) {
				System.out.println("ENTERED GATE 3");
				levelPanel.gate3Entered = true;			
			} else {
				levelPanel.gate3Entered = false;
			}
			
			if (cursorX > levelPanel.gate4X && cursorX < (levelPanel.gate4X+100) && cursorY > levelPanel.gate4Y && cursorY < (levelPanel.gate4Y+50)) {
				System.out.println("ENTERED GATE 4 ");
				levelPanel.gate4Entered = true;
			} else {
				levelPanel.gate4Entered = false;
			}
			
			if (cursorX > levelPanel.gate5X && cursorX < (levelPanel.gate5X+100) && cursorY > levelPanel.gate5Y && cursorY < (levelPanel.gate5Y+50)) {
				System.out.println("ENTERED GATE 5 ");
				levelPanel.gate5Entered = true;
			} else {
				levelPanel.gate5Entered = false;
			}
			
			if (cursorX > levelPanel.gate6X && cursorX < (levelPanel.gate6X+100) && cursorY > levelPanel.gate6Y && cursorY < (levelPanel.gate6Y+50)) {
				System.out.println("ENTERED GATE 6 ");
				levelPanel.gate6Entered = true;
			} else {
				levelPanel.gate6Entered = false;
			}
			
			if (cursorX > levelPanel.falseGate1X && cursorX < (levelPanel.falseGate1X+100) && cursorY > levelPanel.falseGate1Y && cursorY < (levelPanel.falseGate1Y+50)) {
				System.out.println("ENTERED FALSE GATE 1");
				levelPanel.falseGate1Entered = true;	
			} else {
				levelPanel.falseGate1Entered = false;	
			}
			
			if (cursorX > levelPanel.falseGate2X && cursorX < (levelPanel.falseGate2X+100) && cursorY > levelPanel.falseGate2Y && cursorY < (levelPanel.falseGate2Y+50)) {
				System.out.println("ENTERED FALSE GATE 2");
				levelPanel.falseGate2Entered = true;	
			} else {
				levelPanel.falseGate2Entered = false;	
			}
			
			if (cursorX > (levelPanel.runX+5) && cursorX < (levelPanel.runX+95) && cursorY > (levelPanel.runY+5) && cursorY < (levelPanel.runY+95)) {
				levelPanel.runButtonEntered= true;
			} else {
				levelPanel.runButtonEntered = false;
			}
			
			if (levelPanel.gameOver == true && cursorX > 301 && cursorY > 311 && cursorX < 337 && cursorY < 345) {
				gameOverPanel.enteredResetButton = true;
			} else {
				gameOverPanel.enteredResetButton = false;
			}
			
			
			if (levelPanel.gameOver == true && cursorX > 407 && cursorY > 313 && cursorX < 439 && cursorY < 345) {
				gameOverPanel.enteredHomeButton = true;
			} else {
				gameOverPanel.enteredHomeButton = false;
			}
			
			
			
			
			
			
			
		
			
			
			
			
		}
	}	
}


