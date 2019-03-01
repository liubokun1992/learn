package com.example.lbk.MyDesignPattren.proxy.staticproxy;

public class BirdTimeProxy implements Flyable{
	private Flyable flyable;
	
	public BirdTimeProxy(Flyable flyable) {
		this.flyable = flyable;
	}

	@Override
	public void fly() {
		long startTime = System.currentTimeMillis();
		flyable.fly();
		long endTime = System.currentTimeMillis();
		System.out.println("Bird3 Fly Time = " + (endTime - startTime));
	}
}
