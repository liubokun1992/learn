package com.example.lbk.MyDesignPattren.testDesignPattern.singleton;

public class HungrySingleton {
	
	private static HungrySingleton hungry = new HungrySingleton();
	private HungrySingleton() {};
	public HungrySingleton getHungrySingleton() {
		return hungry;
	}

}
