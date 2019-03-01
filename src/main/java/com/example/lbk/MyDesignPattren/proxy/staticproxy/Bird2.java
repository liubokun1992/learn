package com.example.lbk.MyDesignPattren.proxy.staticproxy;

public class Bird2 extends Bird{
	
	@Override
	public void fly() {
		
		System.out.println("Fly start!");
		long startTime = System.currentTimeMillis();
		
		super.fly();
		
		long endTime = System.currentTimeMillis();
		System.out.println("Fly Time = " + (endTime - startTime));
		System.out.println("Fly end!");
		
	}
	
}
