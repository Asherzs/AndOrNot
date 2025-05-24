package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;

import javax.swing.JPanel;

import cursorComponents.mouseHandler;
import cursorComponents.mouseMotionHandler;
import keyboardComponents.keyHandler;
import leaderboardComponents.leaderboard;
import levelComponents.levelPanel;
import otherComponents.gameOverPanel;
import otherComponents.loadingScreen;
import titleComponents.Title;



public class GamePanel extends JPanel implements Runnable{
	
	// SCREEN SETTINGS
	 
	final int originalTileSize = 16; // 16x16 pixel tile size
	final int scale = 3; 
	
	public final int tileSize = originalTileSize * scale; // 48 pixels tile size
	public final int maxScreenColumn = 16;
	public final int maxScreenRow = 12;
	public final int screenWidth = tileSize * maxScreenColumn; // 768 pixels
	public final int screenHeight = tileSize * maxScreenRow; // 576 pixels
	
	public String gameState;
	
	// FPS
	int FPS = 60;
	
	mouseHandler mouseH = new mouseHandler();
	mouseMotionHandler mouseMH = new mouseMotionHandler();
	keyHandler keyH = new keyHandler();
	
	
	Thread gameThread;
	
	leaderboard lboard;
	loadingScreen load;
	Title title;
	levelPanel level;
	gameOverPanel gameOver;

	public GamePanel()  {
		
		lboard = new leaderboard(this, level, keyH, mouseH, mouseMH);
		load = new loadingScreen(this, title, level);
		gameOver = new gameOverPanel(this, mouseH, mouseMH, load);
		title = new Title(this, mouseH, mouseMH, load);
		level = new levelPanel(this, mouseH, mouseMH, load);
		
		
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight)); 
		
		this.setBackground(Color.BLACK);
		
		this.setDoubleBuffered(true);
		
		
		this.addMouseListener(mouseH);
		this.addMouseMotionListener(mouseMH);
		this.addKeyListener(keyH);
		this.setFocusable(true);
		
		
		
		
	}
	
	public void startGameThread() {
		
		gameThread = new Thread(this);
		gameThread.start();
	}

	@Override
	public void run() {
		
		double drawInterval = 1000000000/FPS; //0.01666 seconds
		double nextDrawTime = System.nanoTime() + drawInterval;
		
		 while(gameThread != null) {
			 
			 try {
				update();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 repaint();
			 
			 try {
				double remainingTime = nextDrawTime - System.nanoTime();
				remainingTime = remainingTime/1000000;
				
				if (remainingTime < 0 ) {
					remainingTime = 0;
				}
				
				Thread.sleep((long) remainingTime);
				
				nextDrawTime += drawInterval;
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 }
		
	}
	
	public void update() throws IOException {
		
	
		
		if (title.gameStart == false && lboard.inputNameStart == false) {
			title.update();
			
		}
		
		lboard.update();
		
			
		if (title.gameStart == true) {
			level.update();
		}
		
		if (level.gameOver == true) {
			gameOver.update();
			
		}
		
		if (load.loadStart == true) {
			load.update();
		}
		
		
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		if (title.gameStart == false) {
			title.draw(g2);
			
		}
		
		
		lboard.draw(g2);
		
		
		
		
		
			
		
		if (title.gameStart == true) {
			level.draw(g2);
		}
		
		if (level.gameOver == true) {
			gameOver.draw(g2);
			
		}
		
		
		
		if (load.loadStart == true) {
			load.draw(g2);
		}
		
		
		g2.dispose();
		
	}

	
}
