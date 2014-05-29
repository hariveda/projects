package com.hari.interviewprep.designpatterns.objectpoolpattern;

public class Reusable {

	private String someObjectName;
	private int someObjectSize;

	/**
	 * @return the someObjectName
	 */
	public String getSomeObjectName() {
		return someObjectName;
	}

	/**
	 * @param someObjectName
	 *            the someObjectName to set
	 */
	public void setSomeObjectName(String someObjectName) {
		this.someObjectName = someObjectName;
	}

	/**
	 * @return the someObjectSize
	 */
	public int getSomeObjectSize() {
		return someObjectSize;
	}

	/**
	 * @param someObjectSize
	 *            the someObjectSize to set
	 */
	public void setSomeObjectSize(int someObjectSize) {
		this.someObjectSize = someObjectSize;
	}

}
