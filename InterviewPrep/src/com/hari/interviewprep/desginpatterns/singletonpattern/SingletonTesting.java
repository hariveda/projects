package com.hari.interviewprep.desginpatterns.singletonpattern;

public class SingletonTesting {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton.getSingletonInstance().print();
		Singleton.getSingletonInstance().print();
		Singleton.getSingletonInstance().print();
	}
}
