package com.hari.interviewprep.designpatterns.objectpoolpattern;

import java.util.HashMap;
import java.util.Map;

public class ReusablePool {
	private static ReusablePool reusablePoolInstance;
	private static int maxPoolSize = 2;
	private static int count = 0;
	Map<Integer, Reusable> reusableMap = new HashMap<Integer, Reusable>();
	Reusable reusable = null;

	private ReusablePool() {

	}

	public static ReusablePool getReusablePoolInstance() {
		if (null == reusablePoolInstance) {
			reusablePoolInstance = new ReusablePool();
		}
		count++;
		return reusablePoolInstance;
	}

	public Reusable acquireReusablePool() {
		/* Check the maxPoolSize before setting Reusable object */
		if (count > 0 && count < maxPoolSize) {
			reusable = new Reusable();
			reusableMap.put(count, reusable);
			return reusable;
		} else if (count == maxPoolSize) {
			System.out
					.println("Object pool is empty. Objects are in use! please wait...");
			count = 0; // Reset counter once equals max pool size
		}
		return reusable;
	}

	public void releaseReusablePool(Reusable reuse) {
		reusableMap.remove(count);
		System.out.println("An Object is released!");
	}
}
