package leaderboardComponents;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Stack;

public class leaderboardComponents {
	
	public static BufferedImage leaderboardButtonHighlight, leaderboardButtonPressed, leaderboardPanel, inputNamePanel, okButtonPressed, okButtonHighlight, A, B, C, D, E, F , G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE;
	public static File leaderboardFile;
	public static FileWriter writer;
	public static PrintWriter print;
	public static FileReader reader;
	public static int data, fileWriteIndex;
	public static Boolean leaderboardExit, updateLeaderboard, displayLeaderboardPanel, leaderboardAppear, inputNameStart, enteredOkButton, pressedOkButton, deleteChar, displayLeaderboard, enteredLeaderboardExitButton, pressedLeaderboardExitButton;
	public static String name;
	
	public static int inputNameHeight, inputNameWidth, inputNameSpeed, inputNameX, inputNameY, leaderboardX, leaderboardY, leaderboardHeight, leaderboardWidth, leaderboardSpeed, movementCounter;
	public static String inputChar, playerScoreString, dataString, dataString1;
	public char char1, char2, char3, char4, char5, char6, char7, char8;
	public static Stack<String> playerScore, resultStack;
}
