package main;

import java.awt.Graphics2D;
import java.util.Stack;

public class paintComponentSample {
			/**
			GamePanel gp;
		
			public paintComponentSample(GamePanel gp) {
			this.gp = gp;

			}
			
			public void setDefaultValues() {
		
			}
			
			public void getTitleImage() {
				
			
			
			public void update() {
				
			}
		
							
						
					
			
			public void draw(Graphics2D g2) {
	
			}	
		}
		*/
	
	
	
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
	
	
	public static void main (String [] args) {
		
		Stack<String> sampleStack = new Stack<String>();
		
		
		
		sampleStack.push("0 Hello");
		sampleStack.push("0 Hello");
		sampleStack.push("1 Hello");
		
		
		Stack<String> resultStack = sortLeaderboard(sampleStack);
		while (!resultStack.isEmpty()){
			System.out.println(resultStack.pop()); 
		}
	}
}
		
		
	
		
		
		
	
		
		
		
		
		
		
		
		
	
