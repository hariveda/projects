package com.hari.interviewprep.designpatterns.factorypattern;

/**
 * @author hariharan
 * 
 */

public abstract class Games {
	private String strPlayerName;
	private double totalScore;

	public String getStrPlayerName() {
		return strPlayerName;
	}

	public void setStrPlayerName(String strPlayerName) {
		this.strPlayerName = strPlayerName;
	}

	public double getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(double totalScore) {
		this.totalScore = totalScore;
	}

	public void dispHighScore() {
		System.out.println(getStrPlayerName() + "'s total score is: "
				+ getTotalScore());
	}

	public abstract void totalPlayers();
}
