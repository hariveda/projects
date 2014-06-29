package com.hari.interviewprep.mathematicalfunctions;

public class MathFunctionsDemo {

	public static void main(String[] args) {
		double val = 10.74;

		/* Math Ceil */
		double newVal = Math.ceil(val);
		System.out.println(newVal);

		/* Math abs() function */
		double newVal1 = Math.abs(val);
		System.out.println(newVal1);

		double newVal2 = Math.asin(90);
		System.out.println(newVal2);

		double newVal3 = Math.floor(val);
		System.out.println("new Floor Value:  " + newVal3);

		double randVal = Math.random();
		System.out.println("Randon Value: " + randVal);
	}

}
