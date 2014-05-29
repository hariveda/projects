package com.hari.interviewprep.designpatterns.abstractfactorypattern;

public class MensWearFactory extends DressWearFactory {

	public Dress getDress(String dressType) {
		Dress dress = null;
		if (dressType.equals("Pant")) {
			dress = new Pant();
		} else if (dressType.equals("Shirt")) {
			dress = new Shirt();
		}
		return dress;
	}
}
