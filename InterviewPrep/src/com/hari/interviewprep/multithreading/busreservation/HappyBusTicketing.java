package com.hari.interviewprep.multithreading.busreservation;

public class HappyBusTicketing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BusReservation res = new BusReservation();
		PassengerThread pt1 = new PassengerThread(2, res, "Hari");
		PassengerThread pt2 = new PassengerThread(2, res, "Aasha");
		pt1.start();
		pt2.start();

	}
}
