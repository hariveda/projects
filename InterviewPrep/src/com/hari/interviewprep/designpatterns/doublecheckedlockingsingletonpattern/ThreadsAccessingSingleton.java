package com.hari.interviewprep.designpatterns.doublecheckedlockingsingletonpattern;

public class ThreadsAccessingSingleton implements Runnable {
	@Override
	public void run() {
		Singleton.getSingletonInstance().print();
		System.out.println("The current Thread "
				+ Thread.currentThread().getName()
				+ " is executing SingletonInstance");
	}

}
