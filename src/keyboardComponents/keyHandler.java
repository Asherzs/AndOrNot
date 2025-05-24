package keyboardComponents;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import leaderboardComponents.leaderboard;

public class keyHandler implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_BACK_SPACE) {
			leaderboard.deleteChar = true;
		}
		
		if (leaderboard.name.length() != 8) {
			
			
			if (code == KeyEvent.VK_A) {
				leaderboard.inputChar = "A";
			} 
			if (code == KeyEvent.VK_B) {
				leaderboard.inputChar = "B";
			} 
			if (code == KeyEvent.VK_C) {
				leaderboard.inputChar = "C";
			} 
			if (code == KeyEvent.VK_D) {
				leaderboard.inputChar = "D";
			} 
			if (code == KeyEvent.VK_E) {
				leaderboard.inputChar = "E";
			} 
			if (code == KeyEvent.VK_F) {
				leaderboard.inputChar = "F";
			} 
			if (code == KeyEvent.VK_G) {
				leaderboard.inputChar = "G";
			} 
			if (code == KeyEvent.VK_H) {
				leaderboard.inputChar = "H";
			} 
			if (code == KeyEvent.VK_I) {
				leaderboard.inputChar = "I";
			} 
			if (code == KeyEvent.VK_J) {
				leaderboard.inputChar = "J";
			}
			if (code == KeyEvent.VK_K) {
				leaderboard.inputChar = "K";
			} 
			if (code == KeyEvent.VK_L) {
				leaderboard.inputChar = "L";
			} 
			if (code == KeyEvent.VK_M) {
				leaderboard.inputChar = "M";
			}
			if (code == KeyEvent.VK_N) {
				leaderboard.inputChar = "N";
			}
			if (code == KeyEvent.VK_O) {
				leaderboard.inputChar = "O";
			}
			if (code == KeyEvent.VK_P) {
				leaderboard.inputChar = "P";
			} 
			if (code == KeyEvent.VK_Q) {
				leaderboard.inputChar = "Q";
			}
			if (code == KeyEvent.VK_R) {
				leaderboard.inputChar = "R";
			} 
			if (code == KeyEvent.VK_S) {
				leaderboard.inputChar = "S";
			} 
			if (code == KeyEvent.VK_T) {
				leaderboard.inputChar = "T";
			}
			if (code == KeyEvent.VK_U) {
				leaderboard.inputChar = "U";
			}
			if (code == KeyEvent.VK_V) {
				leaderboard.inputChar = "V";
			}
			if (code == KeyEvent.VK_W) {
				leaderboard.inputChar = "W";
			}
			if (code == KeyEvent.VK_X) {
				leaderboard.inputChar = "X";
			}
			if (code == KeyEvent.VK_Y) {
				leaderboard.inputChar = "Y";
			}
			if (code == KeyEvent.VK_Z) {
				leaderboard.inputChar = "Z";
			}
			
			if (code == KeyEvent.VK_1) {
				leaderboard.inputChar = "1";
			}
			if (code == KeyEvent.VK_2) {
				leaderboard.inputChar = "2";
			}
			if (code == KeyEvent.VK_3) {
				leaderboard.inputChar = "3";
			}
			if (code == KeyEvent.VK_4) {
				leaderboard.inputChar = "4";
			}
			if (code == KeyEvent.VK_5) {
				leaderboard.inputChar = "5";
			}
			if (code == KeyEvent.VK_6) {
				leaderboard.inputChar = "6";
			}
			if (code == KeyEvent.VK_7) {
				leaderboard.inputChar = "7";
			}
			if (code == KeyEvent.VK_8) {
				leaderboard.inputChar = "8";
			}
			if (code == KeyEvent.VK_9) {
				leaderboard.inputChar = "9";
			}
			if (code == KeyEvent.VK_0) {
				leaderboard.inputChar = "0";
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
