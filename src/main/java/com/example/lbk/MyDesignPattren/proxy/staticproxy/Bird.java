package com.example.lbk.MyDesignPattren.proxy.staticproxy;

import java.util.Random;

public class Bird implements Flyable{
	
	@Override
	public void fly()  {
		System.out.println("Bird is flying……");
		try {
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	};
	
//	public static void main(String[] args) {
//		long startTime = System.currentTimeMillis();
//		Bird bird = new Bird();
//		bird.fly();
//		long endTime = System.currentTimeMillis();
//		System.out.println("Fly Time = " + (endTime - startTime));
//	}
	
}
