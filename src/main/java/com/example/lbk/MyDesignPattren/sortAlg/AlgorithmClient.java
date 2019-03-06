package com.example.lbk.MyDesignPattren.sortAlg;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class AlgorithmClient {
	
	public static void main(String[] args) {
		
		SortAlgorithm sortAlgImpl = new SortAlgorithmImpl();
		
		InvocationHandler handler = new SortTimeProxy(sortAlgImpl);
		
		SortAlgorithm sortAlg = (SortAlgorithm) Proxy.newProxyInstance(handler.getClass().getClassLoader(), 
				sortAlgImpl.getClass().getInterfaces(), handler);
		
		int[] array = new int[10];
		for(int i = 0; i < array.length; i ++) {
			array[i] = (int) (Math.random() * 100);
		}
		System.out.println("Original array is " + Arrays.toString(array));
		sortAlg.insertionSort(array);
	}

}
