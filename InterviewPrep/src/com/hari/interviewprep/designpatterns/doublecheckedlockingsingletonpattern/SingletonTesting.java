package com.hari.interviewprep.designpatterns.doublecheckedlockingsingletonpattern;

public class SingletonTesting {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadsAccessingSingleton singThread = new ThreadsAccessingSingleton();
		Thread t1 = new Thread(singThread);
		Thread t2 = new Thread(singThread);
		t1.start();
		t2.start();
	}
}
