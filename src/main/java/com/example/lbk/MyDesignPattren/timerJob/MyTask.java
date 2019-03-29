package com.example.lbk.MyDesignPattren.timerJob;

import java.util.Timer;
import java.util.TimerTask;

public class MyTask extends TimerTask{

	@Override
	public void run() {
		System.out.println("hello world!");
	}
	
	public void testNewTread() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				
			}
		}).start();
	}
	
	public static void main(String[] args) {
		//创建定时器对象
		Timer timer = new Timer();
		timer.schedule(new MyTask(), 3000, 10000);
	}

}
