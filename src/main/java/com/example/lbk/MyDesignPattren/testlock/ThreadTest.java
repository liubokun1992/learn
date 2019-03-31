package com.example.lbk.MyDesignPattren.testlock;

public class ThreadTest {
	
	public static void main(String[] args) {
		final Counter counter = new Counter();
		for(int i = 0; i < 1000; i ++) {
			new Thread(() ->{ 
				counter.inc();
			}).start(); 
		}
		System.out.println(counter);
	}

}
