package com.hari.interviewprep.designpatterns.factorypattern;

import java.util.Scanner;

public class GamesTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputStr = "";
		Games game = null;
		GamesFactory gamesFactory = null;

		/* Get User Input for games selection */
		Scanner in = new Scanner(System.in);
		System.out.println("What type of Game? :");
		if (in.hasNextLine()) {
			inputStr = in.nextLine();
			gamesFactory = new GamesFactory();
			game = gamesFactory.playGames(inputStr);
		}
		if (game != null) {
			performGameOperation(game);
		} else
			System.out.println("Please Enter one of the Game types!");
		in.close();
		game = null;
		gamesFactory = null;
	}

	public static void performGameOperation(Games game) {
		game.dispHighScore();
	}

}
