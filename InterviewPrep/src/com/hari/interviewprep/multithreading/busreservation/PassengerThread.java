package com.hari.interviewprep.multithreading.busreservation;

public class PassengerThread extends Thread {
	private int noOfSeatsReqd;
	public PassengerThread(int noOfseats, Runnable target, String name) {
		super(target, name);
		this.noOfSeatsReqd = noOfseats;
	}

	/**
	 * @return the noOfSeatsReqd
	 */
	public int getNoOfSeatsReqd() {
		return noOfSeatsReqd;
	}

	/**
	 * @param noOfSeatsReqd
	 *            the noOfSeatsReqd to set
	 */
	public void setNoOfSeatsReqd(int noOfSeatsReqd) {
		this.noOfSeatsReqd = noOfSeatsReqd;
	}
}
