package com.example.lbk.MyDesignPattren.sortAlg;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class SortTimeProxy implements InvocationHandler{
	
	private Object sortAlgorithm;
	
	public SortTimeProxy(Object sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		long start = System.currentTimeMillis();
		
		System.out.println("Algorithm is " + method.getName());
		Object res = method.invoke(sortAlgorithm, args);
		
		long end = System.currentTimeMillis();
		System.out.println("Algorithm time is " + (end - start));
		
		System.out.println("Result Array is " + Arrays.toString((int[]) res));
		
		return null;
	}

}
