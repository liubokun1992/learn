package com.example.lbk.MyDesignPattren.testDesignPattern.singleton;

public class LazySingleton {
	
	private static LazySingleton lazy = null;
	private LazySingleton() {};
	public synchronized LazySingleton getLazy() {
		if(lazy == null) {
			lazy = new LazySingleton();
		}
		return lazy;
	}

}
