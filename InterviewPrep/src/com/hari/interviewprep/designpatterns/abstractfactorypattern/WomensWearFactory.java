package com.hari.interviewprep.designpatterns.abstractfactorypattern;

public class WomensWearFactory extends DressWearFactory {

	public Dress getDress(String dressType) {
		Dress dress = null;
		if (dressType.equals("Legging")) {
			dress = new Legging();
		} else if (dressType.equals("Skirt")) {
			dress = new Skirt();
		}
		return dress;
	}
}
