package com.example.lbk.MyDesignPattren.proxy.dynamicproxy;

public class RealSubject implements Subject{

	@Override
	public void rent() {
		System.out.println("Rent this house!");
	}

	@Override
	public void hello(String string) {
		System.out.println(string);
	}

}
