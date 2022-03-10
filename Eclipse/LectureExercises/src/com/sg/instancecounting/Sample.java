package com.sg.instancecounting;

public class Sample {
	static int timeInstantiated;
	
	
	public Sample() {
		timeInstantiated++;
	}

	public static int getTimeInstantiated() {
		return timeInstantiated;
	}

}
