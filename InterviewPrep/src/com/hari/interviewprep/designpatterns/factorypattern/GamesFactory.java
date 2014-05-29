package com.hari.interviewprep.designpatterns.factorypattern;

/**
 * @author hariharan
 * 
 */
public class GamesFactory {
	public Games playGames(String gameType) {
		switch (gameType) {
		case "B":
			return new Blackjack();
		case "C":
			return new Crosswords();
		case "P":
			return new TexasHoldemPoker();
		default:
			return null;
		}
	}

}
