package com.example.lbk.MyDesignPattren.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{
	
	private Object subject;
	
	public DynamicProxy(Object subject) {
		this.subject = subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("Before rent this house");
		
		System.out.println("Method:" + method);
		
		/*    当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
	          Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	          proxy:　　指代我们所代理的那个真实对象
	          method:　　指代的是我们所要调用真实对象的某个方法的Method对象
	          args:　　指代的是调用真实对象某个方法时接受的参数
	    */
		method.invoke(subject, args);
		
		System.out.println("After rent this house");
		
		return null;
	}

}
