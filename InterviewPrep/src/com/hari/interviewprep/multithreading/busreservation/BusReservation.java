package com.hari.interviewprep.multithreading.busreservation;

public class BusReservation implements Runnable {
	private int totalNoOfSeatsAvail = 2;

	public void run() {
		PassengerThread pt = (PassengerThread) Thread.currentThread();
		boolean isTicketsBooked = this.bookBusTickets(pt.getNoOfSeatsReqd(),
				pt.getName());
		if (isTicketsBooked) {
			System.out.println("Congrats " + pt.getName()
					+ "! You have purchased " + pt.getNoOfSeatsReqd()
					+ " tickets");
		} else {
			System.out.println("Sorry " + pt.getName()
					+ "! The no of seats required(" + pt.getNoOfSeatsReqd()
					+ ") are not available");
		}
	}

	private boolean bookBusTickets(int noOfSeatsReqd, String buyername) {
		System.out.println("Welcome " + buyername
				+ "! The tickets available are " + getTotalNoOfSeatsAvail());
		synchronized (this) {
			if (noOfSeatsReqd <= getTotalNoOfSeatsAvail()) {
				try {
					Thread.sleep(100000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				setTotalNoOfSeatsAvail(totalNoOfSeatsAvail - noOfSeatsReqd);
				return true;
			} else {
				return false;
			}
		}
	}

	/**
	 * @return the totalNoOfSeatsAvail
	 */
	public int getTotalNoOfSeatsAvail() {
		return totalNoOfSeatsAvail;
	}

	/**
	 * @param totalNoOfSeatsAvail
	 *            the totalNoOfSeatsAvail to set
	 */
	public void setTotalNoOfSeatsAvail(int totalNoOfSeatsAvail) {
		this.totalNoOfSeatsAvail = totalNoOfSeatsAvail;
	}

}
