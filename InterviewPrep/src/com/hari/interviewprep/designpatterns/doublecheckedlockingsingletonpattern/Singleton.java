package com.hari.interviewprep.designpatterns.doublecheckedlockingsingletonpattern;

public class Singleton {
	/* private static Singleton variable */
	private static volatile Singleton singletonInstance;

	/* private constructor */
	private Singleton() {
	}

	/* public Static Singleton getSingletonInstance */
	public static Singleton getSingletonInstance() {
		if (null == singletonInstance) {
			synchronized (Singleton.class) {
				if (null == singletonInstance) {
					singletonInstance = new Singleton();
					System.out.println("Inside Singleton Instance creation "
							+ singletonInstance.toString());
				}
			}
		}
		return singletonInstance;
	}

	public void print() {
		System.out.println("printing singleton instance");
	}
	
}
