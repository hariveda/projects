package com.hari.interviewprep.designpatterns.objectpoolpattern;

public class Client {
	public static void main(String[] args) {
		/* Acquiring Objects from Reusable Pool */
		/* First Client - Client 1 acquires Reusable Object */
		Reusable resuable1 = ReusablePool.getReusablePoolInstance()
				.acquireReusablePool();

		/* Second Client - Client 2 acquires Reusable Object */
		Reusable resuable2 = ReusablePool.getReusablePoolInstance()
				.acquireReusablePool();

		/* Third Client - Client 3 acquires Reusable Object */
		Reusable resuable3 = ReusablePool.getReusablePoolInstance()
				.acquireReusablePool();

		/* Releasing object from Reusable Pool */
		Reusable reusable = new Reusable();
		ReusablePool.getReusablePoolInstance().releaseReusablePool(reusable);

		/* Fourth Client - Client 4 acquires Reusable Object */
		Reusable resuable4 = ReusablePool.getReusablePoolInstance()
				.acquireReusablePool();
	}
}
