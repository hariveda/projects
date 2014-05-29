package com.hari.interviewprep.designpatterns.abstractfactorypattern;

public abstract class DressWearFactory {
	public abstract Dress getDress(String dressType);

	public static DressWearFactory getDressWearFactory(String factoryType) {
		DressWearFactory dressWrFact = null;
		if (factoryType.equals("Men")) {
			dressWrFact = new MensWearFactory();
		} else if (factoryType.equals("Women")) {
			dressWrFact = new WomensWearFactory();
		}
		return dressWrFact;
	}

}
