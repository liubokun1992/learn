package com.example.lbk.MyDesignPattren.proxy.staticproxy;

public class BirdLogProxy implements Flyable{
	
	private Flyable flyable;
	
	public BirdLogProxy(Flyable flyable) {
		this.flyable = flyable;
	}

	@Override
	public void fly() {
		System.out.println("Bird fly start...");
		
		flyable.fly();
		
		System.out.println("Bird fly end...");
	}

}
