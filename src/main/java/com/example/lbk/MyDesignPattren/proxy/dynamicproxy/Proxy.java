package com.example.lbk.MyDesignPattren.proxy.dynamicproxy;

import java.io.IOException;

import com.example.lbk.MyDesignPattren.proxy.staticproxy.Flyable;
import com.squareup.javapoet.TypeSpec;

public class Proxy {
	
	public static Object newProxyInstance() throws IOException {
		TypeSpec.Builder typeSepcBuilder = TypeSpec.classBuilder("TimeProxy")
				.addSuperinterface(Flyable.class);
		
		return null;
	}

}
