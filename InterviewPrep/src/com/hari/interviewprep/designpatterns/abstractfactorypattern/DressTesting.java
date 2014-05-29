package com.hari.interviewprep.designpatterns.abstractfactorypattern;

public class DressTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DressWearFactory drFact = null;
		/* Pant */
		drFact = DressWearFactory.getDressWearFactory("Men");
		System.out.println("Dress Type is: "
				+ drFact.getClass().getSimpleName());
		System.out.println("Pant size is: " + drFact.getDress("Pant").getSize()
				+ "\n");

		/* Shirt */
		drFact = DressWearFactory.getDressWearFactory("Men");
		System.out.println("Dress Type is: "
				+ drFact.getClass().getSimpleName());
		System.out.println("Shirt size is: "
				+ drFact.getDress("Shirt").getSize() + "\n");

		/* Legging */
		drFact = DressWearFactory.getDressWearFactory("Women");
		System.out.println("Dress Type is: "
				+ drFact.getClass().getSimpleName());
		System.out.println("Legging size is: "
				+ drFact.getDress("Legging").getSize() + "\n");

		/* Skirt */
		drFact = DressWearFactory.getDressWearFactory("Women");
		System.out.println("Dress Type is: "
				+ drFact.getClass().getSimpleName());
		System.out.println("Skirt size is: "
				+ drFact.getDress("Skirt").getSize());

	}

}
